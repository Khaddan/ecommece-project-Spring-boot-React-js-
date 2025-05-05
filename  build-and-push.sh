#!/bin/bash

# Définis ton Docker Hub username ici
DOCKER_USER="zakariakhaddan"

# Liste des services
SERVICES=("notification" "customer" "product" "order" "payment" "gateway" "config-server" "discovery")

for SERVICE in "${SERVICES[@]}"
do
  echo "🔨 Building $SERVICE..."
  cd services/$SERVICE || exit
  mvn clean package -DskipTests

  echo "🐳 Building Docker image..."
  docker build -t $DOCKER_USER/$SERVICE-service:latest .

  echo "📤 Pushing image to Docker Hub..."
  docker push $DOCKER_USER/$SERVICE-service:latest

  cd - > /dev/null || exit
done
