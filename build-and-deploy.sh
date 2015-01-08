#!/bin/bash


# build
mvn clean package


# deploy
cp ./datastore/target/uk.ac.ucl.cmic.tig.gift-surg-datastore-1.0-SNAPSHOT.jar ~/Workspace/XNAT-Builder/modules/