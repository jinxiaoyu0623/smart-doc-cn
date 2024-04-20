<h1 align="center">Smart-Doc-CN Project</h1>

![maven](https://img.shields.io/maven-central/v/com.github.shalousun/smart-doc)
[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)
![number of issues closed](https://img.shields.io/github/issues-closed-raw/shalousun/smart-doc)
![closed pull requests](https://img.shields.io/github/issues-pr-closed/shalousun/smart-doc)
![java version](https://img.shields.io/badge/JAVA-1.8+-green.svg)
[![chinese](https://img.shields.io/badge/chinese-中文文档-brightgreen)](https://smart-doc-group.github.io/#/zh-cn/)

## Introduce

smart-doc is a tool that supports both JAVA REST API and Apache Dubbo RPC interface document generation. Smart-doc is
based on interface source code analysis to generate interface documents, and zero annotation intrusion. You only need to
write Javadoc comments when developing, smart-doc can help you generate Markdown or HTML5 document. smart-doc does not
need to inject annotations into the code like Swagger.

[quick start](https://smart-doc-group.github.io/#/)
## Features

- Zero annotation, zero learning cost, only need to write standard JAVA document comments.
- Automatic derivation based on source code interface definition, powerful return structure derivation support.
- Support Spring MVC, Spring Boot, Spring Boot Web Flux (Not support endpoint), Feign.
- Supports the derivation of asynchronous interface returns such as Callable, Future, CompletableFuture.
- Support JSR-303 parameter verification specification.
- Support for automatic generation of request examples based on request parameters.
- Support for generating JSON return value examples.
- Support for loading source code from outside the project to generate field comments (including the sources jar
  package).
- Support for generating multiple formats of documents: Markdown,HTML5,Asciidoctor,Postman Collection 2.0+,OpenAPI 3.0.
- Support for exporting error codes and data dictionary codes to API documentation.
- The debug html5 page fully supports file upload and download testing.
- Support Apache Dubbo RPC.
- Html docs support zh_CN

## Best Practice

smart-doc + [Torna](http://torna.cn) form an industry-leading document generation and management solution, using
smart-doc to complete Java source code analysis and extract annotations to generate API documents without intrusion, and
automatically push the documents to the Torna enterprise-level interface document management platform.

![smart-doc+torna](https://raw.githubusercontent.com/shalousun/smart-doc/master/images/smart-doc-torna-en.png)

## Building

You could build with the following commands. (Java 1.8 is required to build the master branch)

```
mvn clean install -Dmaven.test.skip=true
```

## TODO

- Jakarta RS-API 2.x



