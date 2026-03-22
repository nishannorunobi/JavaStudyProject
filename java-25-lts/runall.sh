# Build all
docker compose -f docker-compose.yml build

docker compose up

# Run all together — stops when all containers finish
#docker compose up --abort-on-container-exit

# Run all + remove containers after done
#docker compose up --abort-on-container-exit --remove-orphans

echo ""
echo ""
echo "✅ Cleaning Containers"
for RUN in 1 2; do
    COUNT=$(docker ps -q| wc -l)

    if [ "$COUNT" -eq 0 ]; then
        echo "✅No running container left."
        break;
    else
        echo "🗑️  Removing $COUNT container(s)..."
        docker container prune -f
    fi
done

echo ""
echo ""
echo "✅ Cleaning Images."
for RUN in 1 2; do
    COUNT=$(docker images -q| wc -l)

    if [ "$COUNT" -eq 0 ]; then
        echo "✅No images Left."
        break;
    else
        echo "🗑️  Removing $COUNT image(s)..."
        docker rmi -f $(docker images -q)
    fi
done



#Use following command, and comment the top one, to remove every cache in docker, next time docker build takes time
#docker system prune -af

