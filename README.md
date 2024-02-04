# Step 1: Pull the Docker Image
docker pull aagezai/aagezaidocker:0.0.1

# Step 2: Run a Container from the Image
docker run -d -p 8080:8080 --name my-container aagezai/aagezaidocker:0.0.1

# Step 3: View Running Containers
docker ps

# (Optional) Step 4: Enter a Running Container (Interactive Mode)
docker exec -it my-container /bin/bash

# (Optional) Step 5: Stop and Remove the Container
docker stop my-container
docker rm my-container

# (Optional) Step 6: Remove the Docker Image
docker rmi aagezai/aagezaidocker:0.0.1

# Remove a Specific Docker Volume
docker volume rm myvolume

# Remove All Docker Images
docker rmi $(docker images -q)

# Remove All Docker Volumes
docker volume rm $(docker volume ls -q)

# Remove All Docker Containers
docker rm $(docker ps -a -q)

# Remove All Docker Containers and Volumes
docker rm -v $(docker ps -a -q)

# Docker Compose Up (Silent)
docker-compose up -d

# Docker Compose Down (Silent)
docker-compose down
