---
icon: v
---

# Voting-based consensus vs Lottery-based consensus

## Voting-based consensus vs Lottery-based consensus



| Voting-based (BFT) consensus                                                                                                                                                                                                             | Lottery-based consensus                                                                                                                                                                     |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| a group of **known/registered validators** run rounds of authenticated voting (prepare/commit phases) to agree on a value with deterministic finality under a **Byzantine-tolerance bound** (typically <1/3 malicious)                   | **participants** are **pseudo-randomly selected** (**lottery**, **VRF**, **beacon**, **stake-weighted**) to be proposer(s) or committee members for a slot/round                            |
| <p>Examples: <code>PBFT</code>, <code>Tendermint</code>, <code>HotStuff</code></p><ul><li>these are pure voting protocols — leader election can be <em>round-robin</em> or <em>deterministic</em>, <strong>not random</strong></li></ul> | <p>Examples: <code>Algorand</code>, <code>Ouroboros Praos</code>, many <code>PoS</code> designs</p><ul><li>selection provides Sybil resistance and scales to large validator sets</li></ul> |
| <p>Properties: </p><ul><li>deterministic/fast finality</li><li>requires O(n^2) or O(n) messaging depending on protocol</li><li>assumptions about validator set size and identity</li></ul>                                               |                                                                                                                                                                                             |
