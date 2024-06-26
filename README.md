[![verify](https://github.com/bootique-examples/bootique-jdbc-examples/actions/workflows/verify.yml/badge.svg)](https://github.com/bootique-examples/bootique-jdbc-examples/actions/workflows/verify.yml)

# Bootique 3.x JDBC Examples

This is an example [Bootique](http://bootique.io) JDBC app. It shows how to define and use a named DataSource,
and how to write DB-aware unit tests with Bootique and Testcontainers.

Different Git branches contain example code for different versions of Bootique:

* [3.x](https://github.com/bootique-examples/bootique-jdbc-examples/tree/3.x)
* [2.x](https://github.com/bootique-examples/bootique-jdbc-examples/tree/2.x)
* [1.x](https://github.com/bootique-examples/bootique-jdbc-examples/tree/1.x)

## Prerequisites

To build and run the project, ensure you have the following installed on your machine:

* Docker
* Java 11 or newer 
* Maven

and then follow these steps:

## Checkout
```
git clone git@github.com:bootique-examples/bootique-jdbc-examples.git
cd bootique-jdbc-examples
```

## Start Postgres DB Locally

This starts a Postgres instance listening on port 15432, with login credentials of `postgres` / `test`, and 
creates a simple test schema:

```bash
docker-compose -f docker-compose.yml up -d
```

## Build, test and package

Run the following command to build the code, run the tests and package the app:
```
mvn clean package
```

## Run

The following command prints a help message with supported options:
```bash  
java -jar target/bootique-jdbc-examples-3.0.jar
```

```  
NAME
      bootique-jdbc-examples-3.0.jar

OPTIONS
      -c yaml_location, --config=yaml_location
           Specifies YAML config location, which can be a file path or a URL.

      -h, --help
           Prints this message.

      -H, --help-config
           Prints information about application modules and their configuration options.

      -i, --insert
           Inserts sample data to a DB

      -s, --select
           Selects data from a DB
```

Run the `-i` (or `--insert`) command to create some sample data in the DB. DB location and login credential are 
specified in the provided `config.yml`.
```bash
java -jar target/bootique-jdbc-examples-3.0.jar -c config.yml -i
```

Run the `-s` (or `--select`) command to display the data inserted in the previous step:

```bash    
java -jar target/bootique-jdbc-examples-3.0.jar -c config.yml -s
```
