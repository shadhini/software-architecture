---
icon: person-rifle
---

# Practical Byzantine Fault Tolerance

## `PBFT`: Practical Byzantine Fault Tolerance



* **Participants:** The system consists of a primary (leader) and multiple replicas (nodes).
* **Fault Tolerance:** PBFT can tolerate up to `f` faulty nodes in a system of `3f + 1` nodes.
* **Phases:** PBFT operates in three main phases for each client request:
  1. **Pre-Prepare:** The primary node receives a request and broadcasts a pre-prepare message to all replicas.
  2. **Prepare:** Replicas broadcast prepare messages to each other after receiving the pre-prepare.
  3. **Commit:** Once a replica collects enough prepare messages, it broadcasts a commit message. When enough commit messages are received, the request is executed.
* **Quorum:** For the system to reach consensus, at least `2f + 1` replicas must agree.



