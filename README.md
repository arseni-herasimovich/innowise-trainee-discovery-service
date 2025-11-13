# Internship Discovery Service

This is a Discovery Service for the internship project.

## Prerequirements

Before starting the services, you need to create a Docker network for inter-container communication.

### Create Docker Network

Run the following command to create the required Docker network:

```bash
docker network create backend-net
```

This creates a network named `backend-net` which is used by the services defined in the [compose.yaml](./compose.yaml) file.

## Starting Services

After creating the network, start all services with:

```bash
docker-compose up
```

or to run in detached mode:

```bash
docker-compose up -d
```

## Verification

To verify that the network was created successfully, list the available networks:

```bash
docker network ls
```

You should see `backend-net` in the output.

## Cleanup

To stop services and remove containers:

```bash
docker-compose down
```

To remove the network (after stopping all containers):

```bash
docker network rm backend-net
```