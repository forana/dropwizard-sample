# Dropwizard Sample
A little sample project containing gradle basics I find myself needing occasionally, and a bit of Dropwizard basics to show a basic REST API server.

[Dropwizard Docs](https://dropwizard.github.io/dropwizard/manual/index.html)

## Simple Run
1. Install `gradle`
2. Clone this repo
3. `gradle run`
4. `curl localhost:8080/hello` - you should get this (application/json) response:
    
    ```
    {"greeting":"Hello","who":"world"}
    ```

## JAR Building
```
gradle fatJar
```
Result will be in $/build/libs.

`java -jar build/libs/dropwizard-sample-1.0.0.jar server config.yml`

## IDE Setup
Eclipse:

```
gradle eclipse
```

IntelliJ:

```
gradle idea
```

To run from an IDE, you'll need to pass `server config.yml` as arguments to the main class (`SampleApplication`).

## Routes Included

* `GET /hello`
    * Returns a greeting to "world"
* `GET /hello/{who}`
    * Returns a greeting to the name specified (e.g. `/hello/Alex` -> `{"greeting":"Hello","who":"Alex"}`)

