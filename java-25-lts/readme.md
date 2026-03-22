
# to build docker image with a tag name, docker build -t <image tag name>

docker build -t <image tag> .


# to see docker images list

docker images

# to run docker terminal from docker image

docker run -it <image> /bin/bash

# to remove docker image
docker rmi -f <image id>


# to run docker image with entry point
docker run --rm -it <image tag>
