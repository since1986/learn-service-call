# learn-service-call
---

## 简介
这是我的文章[「Spring Cloud与微服务学习笔记-服务调用（上）」](https://since1986.github.io/blog/fe76b270.html)，对应的工程，工程主要是演示了Spring Cloud中做服务调用的方式。

## 结构
```
.
├── build.gradle
├── eureka-server
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── github
│       │   │           └── since1986
│       │   │               └── learn
│       │   │                   └── cloud
│       │   │                       └── eureka
│       │   │                           └── server
│       │   │                               ├── App.java
│       │   │                               └── AppConfig.java
│       │   └── resources
│       │       └── application.yml
│       └── test
│           ├── java
│           └── resources
├── service-a
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── github
│       │   │           └── since1986
│       │   │               └── learn
│       │   │                   └── cloud
│       │   │                       └── service
│       │   │                           └── a
│       │   │                               ├── App.java
│       │   │                               ├── AppConfig.java
│       │   │                               ├── B.java
│       │   │                               ├── CallServiceBController.java
│       │   │                               └── Echo.java
│       │   └── resources
│       │       └── application.yml
│       └── test
│           ├── java
│           └── resources
├── service-b
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── github
│       │   │           └── since1986
│       │   │               └── learn
│       │   │                   └── cloud
│       │   │                       └── service
│       │   │                           └── b
│       │   │                               ├── App.java
│       │   │                               ├── AppConfig.java
│       │   │                               ├── Echo.java
│       │   │                               ├── EchoController.java
│       │   │                               ├── EchoService.java
│       │   │                               └── EchoServiceImpl.java
│       │   └── resources
│       │       └── application.yml
│       └── test
│           ├── java
│           └── resources
└── settings.gradle

```

