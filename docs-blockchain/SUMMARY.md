# Table of contents

## Blockchain Architecture

* [Blockchain](README.md)
* [Hash](blockchain-architecture/hash.md)
* [Block & Chains](blockchain-architecture/block-and-chains.md)
* [Merkle Tree](blockchain-architecture/merkle-tree.md)
* [Public Key Cryptography & Wallets](blockchain-architecture/public-key-cryptography-and-wallets/README.md)
  * [Signing Transactions](blockchain-architecture/public-key-cryptography-and-wallets/signing-transactions.md)
* [Blockchain Transactions](blockchain-architecture/blockchain-transactions.md)
* [How Open Public Ledger works](blockchain-architecture/how-open-public-ledger-works.md)
* [Blockchain Features](blockchain-architecture/blockchain-features.md)
* [Blockchain vs Database](blockchain-architecture/blockchain-vs-database.md)
* [Types of Blockchains](blockchain-architecture/types-of-blockchains/README.md)
  * [Layer 0 Blockchain Platforms](blockchain-architecture/types-of-blockchains/layer-0-blockchain-platforms.md)
  * [Layer 1 Blockchain Platforms](blockchain-architecture/types-of-blockchains/layer-1-blockchain-platforms.md)
  * [Layer 2 Blockchain Platforms](blockchain-architecture/types-of-blockchains/layer-2-blockchain-platforms.md)
  * [Layer 3 Blockchain Platforms](blockchain-architecture/types-of-blockchains/layer-3-blockchain-platforms.md)
  * [Blockless Platforms](blockchain-architecture/types-of-blockchains/blockless-platforms.md)
* [Layers in Blockchain](blockchain-architecture/layers-in-blockchain.md)
* [Layers of Blockchain Application](blockchain-architecture/layers-of-blockchain-application.md)
* [On-Chain Data vs Off-Chain Data](blockchain-architecture/on-chain-data-vs-off-chain-data.md)
* [Web 2.5](blockchain-architecture/web-2.5/README.md)
  * [Web 2.0](blockchain-architecture/web-2.5/web-2.0.md)
  * [Web 3.0](blockchain-architecture/web-2.5/web-3.0.md)
* [Fork](blockchain-architecture/fork.md)
* [Mempool](blockchain-architecture/mempool.md)
* [ZKPs: Zero Knowledge Proofs](blockchain-architecture/zkps-zero-knowledge-proofs.md)
* [SSI: Self-Sovereign Identity](blockchain-architecture/ssi-self-sovereign-identity.md)
* [DApps: Decentralized Applications](blockchain-architecture/dapps-decentralized-applications.md)
* [Stablecoins](blockchain-architecture/stablecoins.md)
* [Blockchain Current Trend & New Frontier](blockchain-architecture/blockchain-current-trend-and-new-frontier.md)

## Consensus

* [Byzantine General's Problem](consensus/byzantine-generals-problem.md)
* [The Consensus Problem](consensus/the-consensus-problem.md)
* [Proof of Work](consensus/proof-of-work.md)
* [Proof of Stake](consensus/proof-of-stake.md)
* [Delegated Proof of Stake](consensus/delegated-proof-of-stake.md)
* [Proof of Authority](consensus/proof-of-authority.md)
* [Proof of Space](consensus/proof-of-space.md)
* [Proof of Importance](consensus/proof-of-importance.md)
* [Proof of History](consensus/proof-of-history.md)
* [Proof of Elapsed Time](consensus/proof-of-elapsed-time.md)
* [Participant Consensus](consensus/participant-consensus.md)
* [Practical Byzantine Fault Tolerance](consensus/practical-byzantine-fault-tolerance.md)
* [Summary: Consensus Mechanisms](consensus/summary-consensus-mechanisms.md)

## Blockchain Security

* [Blockchain Security Benefits](blockchain-security/blockchain-security-benefits.md)
* [Blockchain Security Concerns](blockchain-security/blockchain-security-concerns/README.md)
  * [Smart Contract Security Concerns](blockchain-security/blockchain-security-concerns/smart-contract-security-concerns/README.md)
    * [Reentrancy Attack](blockchain-security/blockchain-security-concerns/smart-contract-security-concerns/reentrancy-attack.md)
    * [Front Running](blockchain-security/blockchain-security-concerns/smart-contract-security-concerns/front-running.md)
    * [Integer Overflow / Underflow](blockchain-security/blockchain-security-concerns/smart-contract-security-concerns/integer-overflow-underflow.md)
    * [Logic Errors](blockchain-security/blockchain-security-concerns/smart-contract-security-concerns/logic-errors.md)
    * [Block Gas Limit](blockchain-security/blockchain-security-concerns/smart-contract-security-concerns/block-gas-limit.md)
    * [Default Visibility](blockchain-security/blockchain-security-concerns/smart-contract-security-concerns/default-visibility.md)
    * [Timestamp Manipulation](blockchain-security/blockchain-security-concerns/smart-contract-security-concerns/timestamp-manipulation.md)
  * [Protocol Level Security Concerns](blockchain-security/blockchain-security-concerns/protocol-level-security-concerns/README.md)
    * [Protocol Concerns —  Proof of Work](blockchain-security/blockchain-security-concerns/protocol-level-security-concerns/protocol-concerns-proof-of-work/README.md)
      * [51% Attack](blockchain-security/blockchain-security-concerns/protocol-level-security-concerns/protocol-concerns-proof-of-work/51-attack.md)
      * [Selfish Mining](blockchain-security/blockchain-security-concerns/protocol-level-security-concerns/protocol-concerns-proof-of-work/selfish-mining.md)
      * [Physical Attacks](blockchain-security/blockchain-security-concerns/protocol-level-security-concerns/protocol-concerns-proof-of-work/physical-attacks.md)
    * [Protocol Concerns —  Proof of Stake](blockchain-security/blockchain-security-concerns/protocol-level-security-concerns/protocol-concerns-proof-of-stake/README.md)
      * [XX% Attack](blockchain-security/blockchain-security-concerns/protocol-level-security-concerns/protocol-concerns-proof-of-stake/xx-attack.md)
      * [Long-Range Attack](blockchain-security/blockchain-security-concerns/protocol-level-security-concerns/protocol-concerns-proof-of-stake/long-range-attack.md)
      * [PoS Time-bomb](blockchain-security/blockchain-security-concerns/protocol-level-security-concerns/protocol-concerns-proof-of-stake/pos-time-bomb.md)
      * [Consensus Centralization](blockchain-security/blockchain-security-concerns/protocol-level-security-concerns/protocol-concerns-proof-of-stake/consensus-centralization.md)
      * [PoS Block Forger Attacks](blockchain-security/blockchain-security-concerns/protocol-level-security-concerns/protocol-concerns-proof-of-stake/pos-block-forger-attacks.md)
  * [Network Level Security Concerns](blockchain-security/blockchain-security-concerns/network-level-security-concerns/README.md)
    * [DoS Attacks](blockchain-security/blockchain-security-concerns/network-level-security-concerns/dos-attacks/README.md)
      * [PoS Block Forger Attack — DDoS on Next Validator](blockchain-security/blockchain-security-concerns/network-level-security-concerns/dos-attacks/pos-block-forger-attack-ddos-on-next-validator.md)
      * [DDoS against Centralized Components](blockchain-security/blockchain-security-concerns/network-level-security-concerns/dos-attacks/ddos-against-centralized-components.md)
    * [Eclipse Attacks](blockchain-security/blockchain-security-concerns/network-level-security-concerns/eclipse-attacks.md)
    * [Replay Attacks](blockchain-security/blockchain-security-concerns/network-level-security-concerns/replay-attacks.md)
    * [Sybil Attacks](blockchain-security/blockchain-security-concerns/network-level-security-concerns/sybil-attacks.md)
  * [Key Management](blockchain-security/blockchain-security-concerns/key-management.md)
  * [Decentralization Security Risks](blockchain-security/blockchain-security-concerns/decentralization-security-risks.md)
  * [Privacy Violations & Regulatory Challenges](blockchain-security/blockchain-security-concerns/privacy-violations-and-regulatory-challenges.md)
  * [Scalability Issues & Security](blockchain-security/blockchain-security-concerns/scalability-issues-and-security.md)
  * [Solution Governance](blockchain-security/blockchain-security-concerns/solution-governance.md)
  * [Quantum Computing](blockchain-security/blockchain-security-concerns/quantum-computing.md)
* [Attack Vectors Based on Consensus Mechanism](blockchain-security/attack-vectors-based-on-consensus-mechanism.md)
* [Mitigating Blockchain Security Risks](blockchain-security/mitigating-blockchain-security-risks/README.md)
  * [Mitigating Security Risks in Smart Contracts](blockchain-security/mitigating-blockchain-security-risks/mitigating-security-risks-in-smart-contracts.md)
  * [Mitigating Protocol Level Security Risks](blockchain-security/mitigating-blockchain-security-risks/mitigating-protocol-level-security-risks.md)
  * [Mitigating Network Level Security Risks](blockchain-security/mitigating-blockchain-security-risks/mitigating-network-level-security-risks.md)

## Governance

* [Concerns related to Governing Shared IT Infrastructure](governance/concerns-related-to-governing-shared-it-infrastructure.md)
* [Blockchain-Specific Governance Concerns](governance/blockchain-specific-governance-concerns.md)
* [Blockchain Governance Models](governance/blockchain-governance-models.md)
* [DAOs: Decentralized Autonomous Organizations](governance/daos-decentralized-autonomous-organizations.md)

## Blockchain Solution Architecture

* [Blockchain Trilemma](blockchain-solution-architecture/blockchain-trilemma/README.md)
  * [How to address Blockchain Trilemma ?](blockchain-solution-architecture/blockchain-trilemma/how-to-address-blockchain-trilemma.md)
* [Blockchain Rope](blockchain-solution-architecture/blockchain-rope.md)
* [Lifecycle: Blockchain Solution](blockchain-solution-architecture/lifecycle-blockchain-solution/README.md)
  * [Needs Analysis](blockchain-solution-architecture/lifecycle-blockchain-solution/needs-analysis.md)
  * [Use Case Identification](blockchain-solution-architecture/lifecycle-blockchain-solution/use-case-identification/README.md)
    * [Justify a Technical Solution](blockchain-solution-architecture/lifecycle-blockchain-solution/use-case-identification/justify-a-technical-solution.md)
    * [Prioritize Use Case Development](blockchain-solution-architecture/lifecycle-blockchain-solution/use-case-identification/prioritize-use-case-development.md)
    * [Use Case Documentation](blockchain-solution-architecture/lifecycle-blockchain-solution/use-case-identification/use-case-documentation.md)
    * [Develop Product Backlog](blockchain-solution-architecture/lifecycle-blockchain-solution/use-case-identification/develop-product-backlog.md)
  * [PoC Design and Construction](blockchain-solution-architecture/lifecycle-blockchain-solution/poc-design-and-construction.md)
  * [Moving from PoC to MVP](blockchain-solution-architecture/lifecycle-blockchain-solution/moving-from-poc-to-mvp.md)
* [Blockchain Network: Building Blocks](blockchain-solution-architecture/blockchain-network-building-blocks.md)
* [Blockchain Interoperability](blockchain-solution-architecture/blockchain-interoperability.md)
* [Design Options & Considerations](blockchain-solution-architecture/design-options-and-considerations.md)
* [🌹 Blockchain Solution Architecture](blockchain-solution-architecture/blockchain-solution-architecture.md)

## Blockchain Development

* [Blockchain Development](blockchain-development/blockchain-development.md)
* [Blockchain Platforms](blockchain-development/blockchain-platforms.md)
* [Development Languages](blockchain-development/development-languages.md)
* [Toolsets](blockchain-development/toolsets.md)
* [Development Recommendations](blockchain-development/development-recommendations.md)
* [✅ \[Best Practices\] Smart Contract Development](blockchain-development/best-practices-smart-contract-development.md)

## Troubleshooting Blockchain

* [Troubleshooting Blockchain](troubleshooting-blockchain/troubleshooting-blockchain.md)
* [Troubleshooting: Things to Check](troubleshooting-blockchain/troubleshooting-things-to-check.md)
* [Possible Issues & Solutions](troubleshooting-blockchain/possible-issues-and-solutions.md)

## Regulatory Landscape

* [Blockchain Regulations](regulatory-landscape/blockchain-regulations/README.md)
  * [Types of Blockchain Regulations & Impact](regulatory-landscape/blockchain-regulations/types-of-blockchain-regulations-and-impact.md)
  * [🇺🇸 Blockchain Regulations: United States](regulatory-landscape/blockchain-regulations/blockchain-regulations-united-states.md)
  * [🇪🇺 Blockchain Regulations: European Union](regulatory-landscape/blockchain-regulations/blockchain-regulations-european-union.md)
  * [🇦🇪 Blockchain Regulations: UAE](regulatory-landscape/blockchain-regulations/blockchain-regulations-uae.md)
  * [🇨🇳 Blockchain Regulations: China](regulatory-landscape/blockchain-regulations/blockchain-regulations-china.md)
  * [🇧🇾 Blockchain Regulations: Belarus](regulatory-landscape/blockchain-regulations/blockchain-regulations-belarus.md)
  * [🇲🇹 Blockchain Regulations: Malta](regulatory-landscape/blockchain-regulations/blockchain-regulations-malta.md)
  * [🇯🇵 Blockchain Regulations: Japan](regulatory-landscape/blockchain-regulations/blockchain-regulations-japan.md)
  * [🇰🇷 Blockchain Regulations: South Korea](regulatory-landscape/blockchain-regulations/blockchain-regulations-south-korea.md)
  * [🇸🇬 Blockchain Regulations: Singapore](regulatory-landscape/blockchain-regulations/blockchain-regulations-singapore.md)
  * [🇮🇳 Blockchain Regulations: India](regulatory-landscape/blockchain-regulations/blockchain-regulations-india.md)
* [Legal Issues](regulatory-landscape/legal-issues/README.md)
  * [Data Privacy](regulatory-landscape/legal-issues/data-privacy.md)
  * [AML/KYC Compliance](regulatory-landscape/legal-issues/aml-kyc-compliance.md)
  * [Digital Asset Custody](regulatory-landscape/legal-issues/digital-asset-custody.md)
* [Looking Forward: Regulatory Landscape](regulatory-landscape/looking-forward-regulatory-landscape.md)

## Risk Management

* [Enterprise Risk](risk-management/enterprise-risk.md)
* [Geopolitical Risk](risk-management/geopolitical-risk.md)
* [Market Risk](risk-management/market-risk.md)
* [Reputational Risk](risk-management/reputational-risk.md)
* [Ethical Considerations](risk-management/ethical-considerations.md)
* [Compliance Risk](risk-management/compliance-risk.md)
* [Risk Management](risk-management/risk-management.md)

## Documentation

* [Solution Design Document](documentation/solution-design-document.md)
* [Executive Overview](documentation/executive-overview.md)
* [Problem Statement](documentation/problem-statement.md)
* [SMART Goals and the Definition of "Success"](documentation/smart-goals-and-the-definition-of-success.md)
* [Guiding Principles](documentation/guiding-principles.md)
* [Solution Design & Architecture](documentation/solution-design-and-architecture.md)
* [General Timeline of Events](documentation/general-timeline-of-events.md)
* [Potential Risks](documentation/potential-risks.md)
* [Data Dictionary](documentation/data-dictionary.md)

## Blockchain in Business

* [Global Marketplace & Blockchain Challenges](<README (1).md>)
* [Blockchain: Value Proposition](blockchain-in-business/blockchain-value-proposition.md)
* [Blockchain Benefits](blockchain-in-business/blockchain-benefits.md)
* [When to use Blockchain and avoid Blockchain?](blockchain-in-business/when-to-use-blockchain-and-avoid-blockchain/README.md)
  * [When to use Blockchain](blockchain-in-business/when-to-use-blockchain-and-avoid-blockchain/when-to-use-blockchain/README.md)
    * [Blockchain as a Shared IT Infrastructure](blockchain-in-business/when-to-use-blockchain-and-avoid-blockchain/when-to-use-blockchain/blockchain-as-a-shared-it-infrastructure.md)
    * [Blockchain to enhance Legacy Systems](blockchain-in-business/when-to-use-blockchain-and-avoid-blockchain/when-to-use-blockchain/blockchain-to-enhance-legacy-systems.md)
    * [When to use Blockchain — Process of Elimination](blockchain-in-business/when-to-use-blockchain-and-avoid-blockchain/when-to-use-blockchain/when-to-use-blockchain-process-of-elimination.md)
    * [Classic Blockchain Use Case Symptoms](blockchain-in-business/when-to-use-blockchain-and-avoid-blockchain/when-to-use-blockchain/classic-blockchain-use-case-symptoms.md)
  * [When to avoid Blockchain](blockchain-in-business/when-to-use-blockchain-and-avoid-blockchain/when-to-avoid-blockchain.md)
* [Evolution of Blockchain](blockchain-in-business/evolution-of-blockchain.md)
* [The Evolution of the Internet](blockchain-in-business/the-evolution-of-the-internet.md)
* [Blockchain Use-cases, Blockchain's Role & Real World Blockchain Projects](blockchain-in-business/blockchain-use-cases-blockchains-role-and-real-world-blockchain-projects/README.md)
  * [Blockchain-Based Supply Chain Solutions](blockchain-in-business/blockchain-use-cases-blockchains-role-and-real-world-blockchain-projects/blockchain-based-supply-chain-solutions.md)
  * [Blockchain-Based Digital Identity Solutions](blockchain-in-business/blockchain-use-cases-blockchains-role-and-real-world-blockchain-projects/blockchain-based-digital-identity-solutions.md)
  * [Blockchain-Based Cross-Border Payments Solutions](blockchain-in-business/blockchain-use-cases-blockchains-role-and-real-world-blockchain-projects/blockchain-based-cross-border-payments-solutions.md)
  * [Blockchain-Based Voting Systems](blockchain-in-business/blockchain-use-cases-blockchains-role-and-real-world-blockchain-projects/blockchain-based-voting-systems.md)
  * [Blockchain-Based Healthcare Data Sharing Platforms](blockchain-in-business/blockchain-use-cases-blockchains-role-and-real-world-blockchain-projects/blockchain-based-healthcare-data-sharing-platforms.md)
  * [Blockchain-Based Real Estate Transactions Solutions](blockchain-in-business/blockchain-use-cases-blockchains-role-and-real-world-blockchain-projects/blockchain-based-real-estate-transactions-solutions.md)
  * [Blockchain-Based Intellectual Property Protection Solutions](blockchain-in-business/blockchain-use-cases-blockchains-role-and-real-world-blockchain-projects/blockchain-based-intellectual-property-protection-solutions.md)
* [Consumer vs Enterprise Blockchain Use and Adoption](blockchain-in-business/consumer-vs-enterprise-blockchain-use-and-adoption/README.md)
  * [Blockchain Iceberg](blockchain-in-business/consumer-vs-enterprise-blockchain-use-and-adoption/blockchain-iceberg.md)
  * [Consumer Applications](blockchain-in-business/consumer-vs-enterprise-blockchain-use-and-adoption/consumer-applications.md)
  * [Enterprise Use Cases](blockchain-in-business/consumer-vs-enterprise-blockchain-use-and-adoption/enterprise-use-cases.md)

## Blockchain Sustainability

* [Blockchain Sustainability](blockchain-sustainability/blockchain-sustainability.md)
* [Carbon Footprint](blockchain-sustainability/carbon-footprint.md)
* [eWaste](blockchain-sustainability/ewaste.md)
* [Geopolitical Sustainability Issues](blockchain-sustainability/geopolitical-sustainability-issues.md)
* [Quantum Computing Threats](blockchain-sustainability/quantum-computing-threats.md)
* [Blockchain as Currency](blockchain-sustainability/blockchain-as-currency.md)

## Supporting Resources

* [Interesting Demonstrations of Blockchain](supporting-resources/interesting-demonstrations-of-blockchain.md)
* [Whitepapers](supporting-resources/whitepapers.md)
* [Development Resources, Knowledgebases, and Head-Starts](supporting-resources/development-resources-knowledgebases-and-head-starts.md)
* [SSI: Self Sovereign Identity related Resources](supporting-resources/ssi-self-sovereign-identity-related-resources.md)
* [Blockchain Explorers](supporting-resources/blockchain-explorers.md)
* [Blockchain News](supporting-resources/blockchain-news.md)

## Bitcoin

* [Bitcoin Architecture](bitcoin/bitcoin-architecture.md)

## Ethereum

* [Ethereum](ethereum/ethereum.md)
* [How to use Ethereum Network](ethereum/how-to-use-ethereum-network.md)
* [Ethereum extensions - Layer 2](ethereum/ethereum-extensions-layer-2.md)
