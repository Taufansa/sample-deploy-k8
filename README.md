# Sample Deploy Kubernetes

This repository demonstrates how to containerize a Spring Boot application, push it to Docker Hub, and deploy it to a Kubernetes cluster.

## Prerequisites

Ensure you have the following installed:
- [Docker](https://www.docker.com/get-started)
- [Kubectl](https://kubernetes.io/docs/tasks/tools/)
- [Minikube](https://minikube.sigs.k8s.io/docs/start/) or a Kubernetes cluster
- [Maven](https://maven.apache.org/download.cgi)

## 1. Build the Docker Image

Run the following command to build the Docker image:
```sh
mvn clean package
```

Then, build the Docker image:
```sh
docker build -t <your-dockerhub-username>/sample-deploy-k8 .
```

## 2. Push to Docker Hub

First, log in to Docker Hub:
```sh
docker login
```

Push the image to Docker Hub:
```sh
docker push <your-dockerhub-username>/sample-deploy-k8
```

## 3. Deploy to Kubernetes

Apply the Kubernetes deployment and service configuration:
```sh
kubectl apply -f k8s-deployment.yaml
kubectl apply -f k8s-service.yaml
```

Check if the pods are running:
```sh
kubectl get pods
```

Check the service:
```sh
kubectl get services
```

To access the service in Minikube:
```sh
minikube service sample-deploy-k8-service
```

## 4. Clean Up
To delete the deployment and service:
```sh
kubectl delete -f k8s-deployment.yaml
kubectl delete -f k8s-service.yaml
```

## Conclusion
This setup helps you containerize, push, and deploy a Spring Boot application to Kubernetes. Modify the YAML files as needed for production use.

---
