---
description: >-
  Static Content Hosting: Deployment/Operational Pattern; Web Architecture
  Pattern
icon: images
---

# Static Content Hosting

## Static Content Hosting

<kbd>Serve It Fast</kbd>&#x20;

> **Host** static files&#x20;
>
> * web content that doesn't change dynamically per user or request
>   * images, CSS, JS, HTML, videos
>
> on **separate servers** or `CDN`s&#x20;
>
> to **offload** dynamic servers,&#x20;
>
> reducing latency and load.

<figure><img src="../../.gitbook/assets/software-architecture_static-content-hosting_CDN.svg" alt=""><figcaption></figcaption></figure>



* `CDNs` **cache** content at **edge** **locations** worldwide.

## Benefits

* reduce latency and load on dynamic servers
* accelerate page loads
* scales independently of application logic

## Implementation

### Frameworks

* `AWS S3` with `CloudFront`
* `Google Cloud Storage` with `CDN`



### Tips

* configure `TTL`(**time-to-live**) for freshness
* enable compression&#x20;
  * e.g: Gzip
* set cache-control headers



## Use-cases

* A media site hosting images and videos on a CDN for global users.





