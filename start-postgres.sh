#!/usr/bin/env bash
docker run --name postgres-furniture -p 5432:5432 -e POSTGRES_PASSWORD=123456 -d postgres