---
icon: face-clouds
---

# Obfuscation Techniques

## Obfuscation

> **Obfuscation**:
>
> **— method of concealing certain details while still enabling identification —**&#x20;

* designed to protect sensitive data by partially hiding it&#x20;
  * accessible only to authorized users&#x20;

**Role of Obfuscation**

* protect privacy&#x20;
* minimize the risk of fraud&#x20;
* secure sensitive information in transactions



## Obfuscation Techniques

### Steganography

> **practice of hiding information within ordinary data** like images, audio, video files&#x20;
>
> &#x20;   without making it detectable&#x20;
>
>
>
> **works by altering digital file's least significant bits** undetectable to the human eye/ear
>
> * these tiny changes are so subtle that they go unnoticed, keeping the hidden information safe&#x20;



**Example:**

* changing the last bit of a pixel's RGB value in an image&#x20;
* hidden data can be embedded without visibly altering the image&#x20;

#### Applications

* private communication
  * useful under strict governments that censor information
* digital watermarking:&#x20;
  * where creators embed ownership details in images/videos to protect their intellectual property&#x20;
* information concealment:&#x20;
  * hides sensitive data within files&#x20;
  * makes unauthorized finding/access difficult



### Tokenization

> **replaces sensitive information with unique identifiers or tokens**&#x20;
>
> &#x20;    which resembled the original data,&#x20;
>
> &#x20;    but do not reveal its real content&#x20;

* real number/data is safely stored in a **secure token vault**
* the **token** can be used for transactions without exposing the actual data&#x20;
* reduce the risk of data being stolen or misused&#x20;



<figure><img src="../.gitbook/assets/tokenization.svg" alt=""><figcaption></figcaption></figure>

Example:

* a credit card number might be replaced with a token like X12A34BC56



#### Applications

* Payment processing
  * protect cardholder data
  * ensure secure transactions without exposing credit card numbers&#x20;
* Privacy regulations
  * protects sensitive information
* reduces risk across industries by replacing sensitive data with meaningless tokens, which can't be used without access to a secure vault



### Data Masking

> **masks or changes sensitive information for testing or analysis without exposing the data**

2 types of masking

* Static Data Masking
  * replaces real data with fake, but realistic random data&#x20;
  * e.g: replacing real names in a database with random ones&#x20;
* Dynamic Data Masking
  * hides sensitive dat in real time&#x20;
  * makes data visible to authorized users, but keep it hidden from others&#x20;

#### Applications

* Software development & testing&#x20;
  * provides developers with realistic data without exposing real information
    * reduce privacy risks&#x20;
* Data analytics&#x20;
  * allow analysts to work without accessing sensitive data&#x20;
  * helps meet privacy rules&#x20;
* Outsources services
  * let third-party vendors handle data safely, protecting sensitive information from unauthorized access





