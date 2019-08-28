**Docker:**

Using Docker we can package our applications into smaller deployable units. Docker containers run on top of Docker engine.

Docker engine is the runtime for docker containers that let's the developers build the images once and run anywhere which makes it a platform independent.

Unlike Virtual machines Docker does not need an entire guest OS to run the applications, but instead will package only those dependencies or libraries that are required to run the application

To dockerize our applications we first need to build a docker image. A docker image is packaged application with all the bare minimum dependencies it needs.

Docker image can be built using a docker file. A docker file contains instructions to build a docker image, the instructions typically include which base image to use, exposing a port on which the container will be running, a command to run the application, etc.

The docker file is fed to Docker deamon to build the image. The command used to build the docker image is:

`docker build -t app-name . `  --> This command generates a docker image and stores it in a local registry.

We can look for all the images that exist on the local machine by running the command `docker images ls`.

Docker container is a running instance of a docker image. We can run a container using the command `docker run <image_name>`. If the image does not exist on local machine, docker makes a request to docker registry (DockerHub) to download the image and run it.

The applications we typically build are multi tiered or can be based on microservice architecture. Each component here may need to communicate other components.

For example, a web app may communicate to Database, or in microservices one service may invoke other microservice. To automate handling of multiple containers, we can make use of docker compose. With docker-compose we can run multipse containers with a command as simple as `docker-compose up`.

Docker compose works by applying the rules defined in a Yaml configuration file.  A sample docker compose yaml file can be:
```
version: '2'

services:
  web:
    build: .
    ports:
     - "5000:5000"
  redis:
    image: redis
```
services in this yaml file specify all the images that needs to up and running.



**Kubernetes:**

Kubernetes is a container orchestration platform that automates the container deployment, Scales containers and manages them.

Kubernetes Architecture:

Kubernetes manages a cluster of nodes. In Kubernetes there is a Master node and a cluster of worker nodes. These node can be physical machines or virtual machines. Ecah of these nodes run a set of services.

Master Node receives all the commands from a client, the commands can be to deploy containers, scale them or can be about defining services. In Kubernetes, kubectl is the client that communicates with Master node.
This communication is doen via a set of Yaml configuration files.

The Master node typically contains:
  - API Server - that listens for commands from kubectl.
  - Scheduling controller -
  - Replication Controller - Maintains a desired state of pods
  - etcd - a key value pair storage server that stores the cluster status, metadata of any objects
