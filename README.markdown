Add Search to Legacy Application
================================

Introduction
------------

This is a demo project to show how to combine elasticsearch with mongodb, using ETL.

Installation
------------


Run it!
-------

Compile and restart the application

```
mvn clean package jetty:run

# Inject 10000 docs
curl http://127.0.0.1:8080/api/1/person/_init?size=10000
```

You can then access the application using your browser: [http://127.0.0.1:8080/](http://127.0.0.1:8080/).

Next step
---------

