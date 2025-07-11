#!/bin/bash
echo "🔧 Setting up environment for CoopsOS build in Termux..."

# Install dependencies
pkg install -y openjdk-17 dx ecj unzip zip git wget

# Set environment
export JAVA_HOME=/data/data/com.termux/files/usr/lib/jvm/java-17
export PATH=$JAVA_HOME/bin:$PATH

# Make Gradle executable
chmod +x ./gradlew

# Build all APKs
./gradlew assembleDebug

echo "✅ APKs built. Check app/build/outputs/apk/debug/"
