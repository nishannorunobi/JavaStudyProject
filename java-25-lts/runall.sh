# Build all
docker compose -f docker-compose.yml build

docker compose up

# Run all together — stops when all containers finish
#docker compose up --abort-on-container-exit

# Run all + remove containers after done
#docker compose up --abort-on-container-exit --remove-orphans
echo "✅ Apps running done"


source ./cleanall.sh
