---
icon: nfc-lock
---

# Protocol Level Vulnerabilities

## Protocol Level Vulnerabilities

### **PoS Block Forger Attack**

#### **Attack on Block Forger**

* on Proof of Stake network, a Block Forger Attack can occur where we front run the selection logic to see who the next validator is going to be&#x20;
* If \`**A**\` is an attacker, know who the next block validator is going to be, before that validator has been selected by the network, \`**A**\` could flood that validating node with traffic&#x20;
* launching a denial of service attack against that node will prevent if from responding in a timely fashion, thus slowing down the overall network and making it easier for \`**A**\` to introduce a divergent or alternate version of the ledger



### **DDoS against Centralized Components on a Permissioned blockchain**

Denial of Service attack against certain centralized components on a hybrid/permissioned blockchain like `Hyperledger`&#x20;

* permissioned blockchains are not client-server systems, but not quite peer-to-peer systems either — they are bit more centralized than permissionless blockchains like `Ethereum`

#### **DDoS MSP on Hyperledger**

* e.g: `MSP` (`Membership Service Provider`) on `Hyperledger`&#x20;
  * By launching a denial of service attack against this key centralized component, an attacker could potentially bring down the entire network&#x20;



