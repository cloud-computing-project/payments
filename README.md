# RSO: Payments microservice

## Prerequisites

```bash
docker run -d --name payments -e POSTGRES_USER=dbuser -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=order -p 5433:5432 postgres:latest
```

## Run application in Docker

```bash
docker run -p 8083:8083 bozen/payments
```

## Travis status 
[![Build Status](https://travis-ci.org/cloud-computing-project/payments.svg?branch=master)](https://travis-ci.org/cloud-computing-project/payments)
