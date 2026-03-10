---
icon: code-branch
---

# Releases

## Software Releases

When the newest version of the software is distributed, it is referred to as a “**release**.”&#x20;

### Release stages (typical lifecycle)

* **`Pre-alpha`**: Early development — features incomplete; unstable. Internal only.
* **`Alpha`**: Early testing builds; features added and changing frequently.
* **`Beta`**: Feature-complete for the targeted release; broader testing for bugs and UX issues.
* **`Release Candidate (RC)`**: Candidate for final release; only critical bug fixes expected.
* **`Stable / General Availability (GA)`**: Production-ready release for all users.
* **`Patch / Hotfix`**: Emergency fix released after GA to fix critical bugs/security issues.
* **`Long-Term Support (LTS)`**: Selected stable releases maintained with backported fixes for a longer period.

| 𝛂 : Alpha                               | β : Beta                          | GA : General Availability |
| ---------------------------------------- | --------------------------------- | ------------------------- |
| audience: selected group of stakeholders | audience: all stakeholders        | audience: all users       |
| preview of functioning version           | meets all functional requirements | stable                    |
| may contain errors                       | intention: user testing           |                           |
| design changes may occur                 |                                   |                           |

#### “**`alpha`**” release:&#x20;

* the first functioning version of the system released to a selected group of stakeholders
* likely contains errors &#x20;
* may not contain the full feature set but does contain most of the desired functionality
* design changes may still occur during this release stage

#### “**`beta`**” release / limited release:

* given to the stakeholders outside of the developing organization
* intents to try out the software under real conditions, test the functionality, and identify any outstanding bugs or errors
* beta release should meet all the functional requirements

#### “**`GA`**” General Availability release:

* after beta release changes are agreed upon, made, and tested, and a stable version is released



### Semantic Versioning (SemVer)&#x20;

— recommended when public API/compatibility matters —

#### Format:&#x20;

```
MAJOR.MINOR.PATCH 
e.g: 2.4.1
```

* MAJOR: incompatible API changes (breaking changes).
* MINOR: added functionality in a backwards-compatible manner.
* PATCH: backwards-compatible bug fixes.

#### Pre-release and build metadata:

* Pre-release: 2.1.0-alpha.1, 2.1.0-beta.2, 2.1.0-rc.1
* Build metadata (ignored for precedence): 2.1.0+20190304

#### SemVer rules:

* Increment MAJOR when you remove or change public API incompatibly.
* Increment MINOR when you add backwards-compatible functionality.
* Increment PATCH for backwards-compatible bug fixes.
* Pre-release versions sort before the associated normal version.

