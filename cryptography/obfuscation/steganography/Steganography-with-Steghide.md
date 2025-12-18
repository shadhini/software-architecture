# Steganography with Steghide

Install

- Linux 

      sudo apt update
      sudo apt install steghide


Sample image

    sample.jpg

image source: Photo by <a href="https://unsplash.com/@flowerclubau?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">flower club</a> on <a href="https://unsplash.com/photos/a-bouquet-of-flowers-sitting-on-top-of-a-table-f2TScMFFzfY?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Unsplash</a>

Secret text file

    echo "This is a secret file" > secret.txt

Check File Compatibility: verify whether a file is compatible for steganography with `steghide`

    steghide info sample.jpg

- Expected output: information about the file's suitability for embedding data, such as available capacity

Embed a secret message into the carrier file

    steghide embed -cf sample.jpg -ef secret.txt

- Command breakdown:
  - `embed`: specifies embedding mode
  - `-cf sample.jpg`: indicates the carrier file
  - `-ef secret.txt`: specifies the file containing the secret message

Retrieve the hidden message from the carrier file

    steghide extract -sf sample.jpg

- Command breakdown:
  - `extract`: extracts the hidden file
  - `-sf sample.jpg`: indicates the steganographic file to extract from

- Expected output: the extracted file will appear in the current directory

Verify carrier file size changes

```text
~/Downloads via 💎 v3.1.3
❯ ls -lh sample.jpg
-rw-r--r--@ 1 ...  ...   2.5M Dec 12 14:26 sample.jpg

~/Downloads via 💎 v3.1.3
❯ ls -lh sample\ \(1\).jpg
-rw-r--r--@ 1 ...  ...   2.7M Dec 12 18:03 sample (1).jpg
```
