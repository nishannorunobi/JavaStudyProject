#!/bin/bash

set -e

# Run from dockerfile, not using docker-compose.yml
DOCKERFILE="src/main/java/jep506/Dockerfile"
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
echo "✅ App running done."

echo ""
echo ""

echo "✅ Removing Image."
for RUN in 1 2; do
    COUNT=$(docker images -q $IMAGE_NAME | wc -l)

    if [ "$COUNT" -eq 0 ]; then
        echo "✅No images Left."
        break;
    else
        echo "🗑️  Removing $COUNT image(s)..."
        docker rmi -f $IMAGE_NAME
    fi
done

echo ""
echo ""
echo "✅ Removing Containers."
for RUN in 1 2; do
    COUNT=$(docker ps -q| wc -l)

    if [ "$COUNT" -eq 0 ]; then
        echo "✅No running container left."
        break;
    else
        echo "🗑️  Removing $COUNT image(s)..."
        docker container prune -f
    fi
done

#Use following command, and comment the top one, to remove every cache in docker, next time docker build takes time
#docker system prune -af