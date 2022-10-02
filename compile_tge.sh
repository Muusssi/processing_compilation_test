#!/bin/bash -ex

PROCESSING_VERSION=5.3.4

# Create a temporary library for the class files
mkdir -p tmp
# Compile the jave code
javac $(find src/tge -name '**.java') \
      -d tmp/ \
      -cp core-${PROCESSING_VERSION}.jar

# Ensure the output folder exists
mkdir -p jars-${PROCESSING_VERSION}

# Collect to jar
cd tmp
jar cf ../jars-${PROCESSING_VERSION}/tge.jar ./
cd ..

# Remove temp file
#rm -r tmp
