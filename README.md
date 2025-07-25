# <center> 🤖 AI Photo Server </center>

<p align="center">
    <img src="https://camo.githubusercontent.com/aea507bdf89d723fcce240f0af95e47c1c158acc85496e9f54d10f174066eddf/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f56657273696f6e2d312e302e302d626c75652e737667" alt="Version" data-canonical-src="https://img.shields.io/badge/Version-1.0.0-blue.svg" style="max-width: 100%;">
    <img alt="Static Badge" src="https://img.shields.io/badge/License-AGPL3.0-green">
    <img alt="Static Badge" src="https://img.shields.io/badge/JDK-17-green">
    <img alt="Static Badge" src="https://img.shields.io/badge/Spring%20Boot-3.4.7-red">
</p>

[<center><img src="https://github.githubassets.com/images/icons/emoji/octocat.png" style="width: 20px;height: 20px;"> **Github**</center>](https://github.com/LXReaper/ai-photo-service)


### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.7/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.7/maven-plugin/build-image.html)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/3.4.7/reference/data/nosql.html#data.nosql.redis)
* [Docker Compose Support](https://docs.spring.io/spring-boot/3.4.7/reference/features/dev-services.html#features.dev-services.docker-compose)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
* [Spring Session for Spring Data Redis](https://docs.spring.io/spring-session/reference/)
* [Markdown Document Reader](https://docs.spring.io/spring-ai/reference/api/etl-pipeline.html#_markdown)
* [OpenAI](https://docs.spring.io/spring-ai/reference/api/chat/openai-chat.html)
* [PDF Document Reader](https://docs.spring.io/spring-ai/reference/api/etl-pipeline.html#_pdf_page)
* [Elasticsearch Vector Database](https://docs.spring.io/spring-ai/reference/api/vectordbs/elasticsearch.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.7/reference/web/servlet.html)

### Guides

The following guides illustrate how to use some features concretely:

* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Docker Compose support

This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

*

elasticsearch: [`docker.elastic.co/elasticsearch/elasticsearch:7.17.10`](https://www.docker.elastic.co/r/elasticsearch)

* mysql: [`mysql:latest`](https://hub.docker.com/_/mysql)
* redis: [`redis:latest`](https://hub.docker.com/_/redis)

Please review the tags of the used images and set them to the same as you're running in production.

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the
parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

