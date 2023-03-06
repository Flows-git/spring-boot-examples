# Spring Boot Examples

> An example how to start Spring Boot in Docker with hot reload and debug mode

# Setup


## With Docker Compose
```sh
docker compose up
```

## With Docker
```sh
# build a docker image
docker build -t spring-examples .
# start the image
docker run -d -p 8080:8080 -p 5005:5005 spring-examples
```

# Enable Debugging in VSCode
- Create .vscode/launch.json with: 
  ```JSON
  {
    "configurations": [
      {
        "type": "java",
        "name": "Docker Spring Boot-ApiApplication",
        "request": "attach",
        "projectName": "api",
        "hostName": "localhost",
        "port": 5005
      },
    ]
  }
  ```
- start the app - `docker compose up`
- in VSCode - click `Run and Debug` -> `Start Debugging`