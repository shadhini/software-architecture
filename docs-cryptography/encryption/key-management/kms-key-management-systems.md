---
icon: key
---

# KMS: Key Management Systems

## `KMS`: Key Management Systems

#### Core functions of KMS

1. **Key generation**:&#x20;
   * uses `RNG`s: strong random number generators — make keys unpredictable
2. **Key distribution**:&#x20;
   * distribution to authorized systems/users
   * use encrypted communication channels —  prevent interception
3. **Key storage**:&#x20;
   * use encryption, access control mechanisms&#x20;
   * ensure keys are only accessible to authorized entities
4. **Key rotation and expiry**:&#x20;
   * automated key rotation based on defined policies
     * &#x20;reduce the risk of compromise from long-term key usage.
   * expiry dates —  ensure old keys are no longer used
5. **Key backup and recovery**:&#x20;
   * prevent key loss &#x20;
   * ensure quick recovery in case of corruption or accidental deletion
6. **Key revocation**:&#x20;
   * immediate revocation of compromised keys &#x20;
   * ensures all dependent systems are notified of the revocation
7. **Audit and monitoring**:&#x20;
   * logs all key-related activities
   * allow detailed audits and continuous monitoring to detect anomalies or unauthorized access



#### Types of KMS deployments

* **On-premises KMS**:&#x20;
  * hosted within an organization's infrastructure,
  * offers greater control and customization &#x20;
  * requires significant management resources
* **Cloud-based KMS**:&#x20;
  * managed by cloud service providers (e.g: `AWS KMS`, `Azure Key Vault`, `Google Cloud KMS`)
  * provide scalability and ease of use &#x20;
  * maintains strong security practices
* **Hybrid KMS**:&#x20;
  * combines on-premises and cloud-based solutions to balance control, flexibility, cost



