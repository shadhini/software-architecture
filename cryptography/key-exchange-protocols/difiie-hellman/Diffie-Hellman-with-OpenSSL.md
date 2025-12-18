# Diffie-Hellman using OpenSSL

Generate a DH parameter file 
```shell
openssl dhparam -out dhparam.pem 2048
```

Simulate two parties (Alice and Bob) by generating private keys and public keys for each party
```shell
openssl genpkey -paramfile dhparam.pem -out alice_private.pem
openssl pkey -in alice_private.pem -pubout -out alice_public.pem
openssl genpkey -paramfile dhparam.pem -out bob_private.pem
openssl pkey -in bob_private.pem -pubout -out bob_public.pem
```

Derive the shared secret on both sides and confirm they match
Alice's side:
```shell
openssl pkeyutl -derive -inkey alice_private.pem -peerkey bob_public.pem -out alice_shared_secret.bin
```
Bob's side:
```shell
openssl pkeyutl -derive -inkey bob_private.pem -peerkey alice_public.pem -out bob_shared_secret.bin
```

```shell
diff alice_shared_secret.bin bob_shared_secret.bin
```

## Step 1: Generate Diffie-Hellman Parameters

    openssl dhparam -out dhparam.pem 2048

Command breakdown:
- `openssl dhparam`: Generates DH parameters
- `-out dhparam.pem`: Specifies the output file for the parameters
- `2048`: Indicates the size of the DH parameters in bits

## Step 2: Generate a Private Key for Party 1

    openssl genpkey -paramfile dhparam.pem -out private1.pem

Command breakdown:
- `genpkey`: Generates a private key
- `-paramfile dhparam.pem`: Specifies the DH parameter file
- `-out private1.pem`: Saves the private key to a file

## Step 3: Extract the Public Key for Party 1

    openssl pkey -in private1.pem -pubout -out public1.pem

Command breakdown:
- `pkey`: Manages private and public keys
- `-in private1.pem`: Specifies the private key file
- `-pubout`: Extracts the public key
- `-out public1.pem`: Saves the public key to a file

## Step 4: Generate a Private Key for Party 2

    openssl genpkey -paramfile dhparam.pem -out private2.pem  
    openssl pkey -in private2.pem -pubout -out public2.pem

## Step 5: Derive the Shared Secret Key

### Step A: Party 1 derives the shared secret
To derive the shared secret, Party 1 uses their private key and Party 2's public key 

    openssl pkeyutl -derive -inkey private1.pem -peerkey public2.pem -out shared_secret1.bin


### Step B: Party 2 derives the shared secret
To derive the shared secret, Party 2 uses their private key and Party 1's public key 

    openssl pkeyutl -derive -inkey private2.pem -peerkey public1.pem -out shared_secret2.bin


Command breakdown:
- `openssl pkeyutl -derive`: Derives a shared secret using private and peer public keys
- `-inkey`: Specifies the private key file 
- `-peerkey`: Specifies the peer's public key file
- `-out`: Specifies the output file for the shared secret

## Step 6: Verify the Shared Secret

    diff shared_secret1.bin shared_secret2.bin

If the files are identical, the Diffie-Hellman key exchange was successful.

# Simulate a Man-in-the-Middle (MITM) Attack

## Step 1: Generate DH parameters

    openssl dhparam -out dhparam.pem 2048

### Step 2: Generate keys for Alice, Bob, and Eve

    openssl genpkey -paramfile dhparam.pem -out alice_private.pem
    openssl pkey -in alice_private.pem -pubout -out alice_public.pem

    openssl genpkey -paramfile dhparam.pem -out bob_private.pem
    openssl pkey -in bob_private.pem -pubout -out bob_public.pem

    openssl genpkey -paramfile dhparam.pem -out eve_private.pem
    openssl pkey -in eve_private.pem -pubout -out eve_public.pem


## Step 3: Intercept and derive shared secrets

### Case 1: Alice → Eve (Intercepted):
Eve intercepts Alice's public key (alice_public.pem) and used it to derive a shared secret with her own private key (eve_private.pem).

Eve derived a shared secret with Alice:

    openssl pkeyutl -derive -inkey eve_private.pem -peerkey alice_public.pem -out shared_secret_eve_alice.bin

### Case 2: Bob → Eve (Intercepted):
Eve intercepts Bob's public key (bob_public.pem) and used it to derive a shared secret with her own private key (eve_private.pem).

Eve derives a shared secret with Bob:

    openssl pkeyutl -derive -inkey eve_private.pem -peerkey bob_public.pem -out shared_secret_eve_bob.bin


## Step 4: Verify shared secrets

    openssl dgst -sha256 shared_secret_eve_alice.bin
    openssl dgst -sha256 shared_secret_eve_bob.bin


- Notice that the shared secret between Eve and Alice is different from the one between Eve and Bob. 
- However, Alice and Bob do not share a common secret, breaking the intended secure communication.

## Step 5: Observe the MITM attack

- Eve can decrypt messages from Alice using her shared secret (`shared_secret_eve_alice.bin`) and 
re-encrypt them for Bob using her shared secret with Bob (`shared_secret_eve_bob.bin`)

This demonstrates how Eve can relay and manipulate communication without either Alice or Bob realizing.

