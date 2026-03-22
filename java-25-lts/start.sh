#!/bin/bash

set -e

# ── Config — change these to switch JEP ──
DOCKERFILE="src/main/java/jep511/Dockerfile"
IMAGE_NAME="myjavatest"

echo ""
echo "╔══════════════════════════════════════════╗"
echo "║       Java 25 LTS — JEP Demo Runner      ║"
echo "╚══════════════════════════════════════════╝"
echo ""
echo "  📄 Dockerfile : $DOCKERFILE"
echo "  🏷️  Image      : $IMAGE_NAME"
echo ""

# ── Build ──
echo "🔨 Building image..."
docker build -f $DOCKERFILE -t $IMAGE_NAME .
echo "✅ Build complete."
echo ""

# ── Run ──
echo "🚀 Running $IMAGE_NAME ..."
echo "──────────────────────────────────────────"
docker run --rm $IMAGE_NAME
echo ""
echo "✅ Done."