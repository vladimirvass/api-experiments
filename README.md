# Standalone containers

Playground for experimenting with Selenium Grid 4

## Table of content

* [Getting Started](#getting-started)
    * [Technologies](#technologies)
    * [Prerequisites](#prerequisites)
    * [Installing](#installing)
    * [Debugging](#debugging)
      * [Using VNC client](#using-vnc-client)
      * [Using your browser](#using-your-browser)
    * [Project structure](#project-structure)
* [Build](#build)
* [Tests and Risk Assessment](#tests-and-risk-assessment)
* [Deploy](#deploy)
* [Versioning](#versioning)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Technologies

The tech stack core of the project:

* [Selenium 4](<https://github.com/SeleniumHQ/docker-selenium/blob/trunk/README.md>) - Docker images for the Selenium Grid Server
* [TestNG](<https://testng.org/doc/>) - Test framework in Java
* [Maven](<https://maven.apache.org/what-is-maven.html>) - Build tool

### Prerequisites

Already installed Docker, up & running on your PC.

```shell
docker info
```

### Installing


```shell
docker run -d -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:4.0.0-rc-1-prerelease-20210618
```

Running this command (for the first time) into the terminal will print next info message:

```log
Unable to find image 'selenium/standalone-chrome:4.0.0-rc-1-prerelease-20210618' locally

4.0.0-rc-1-prerelease-20210618: Pulling from selenium/standalone-chrome
```

then starts process of downloading & extracting this image.

Check the status:
```shell
docker ps
```

### Debugging

This project uses x11vnc as VNC server to allow users inspect what is happening inside the container. 
Users can connect to this server in two ways:


### Using VNC client
   The VNC server is listening to port 5900, you can use a VNC client and connect to it. 
   Feel free to map port 5900 to any free external port that you wish.
   The internal 5900 port remains the same because that is the configured port for the VNC server running inside the container. 
   You can override it with the VNC_PORT environment variable in case you want to use --net=host.

```shell
docker run -d -p 4444:4444 -p 5900:5900 -v /dev/shm:/dev/shm selenium/standalone-chrome:4.0.0-rc-1-prerelease-20210618
```
Then, you would use in your VNC client:
Port 5900 to connect to the Chrome container

If you get a prompt asking for a password, it is: secret. If you wish to change this, 
you should either change it in the /NodeBase/Dockerfile and build the images yourself, 
or you can define a Docker image that derives from the posted ones which reconfigures it:


### Using your browser 
(no needs of VNC client)

This might come handy if you cannot install a VNC client on your machine. 
Port 7900 is used to start noVNC, so you will need to connect to that port with your browser.
Similarly to the previous section, feel free to map port 7900 to any free external port that you wish.


```shell
$ docker run -d -p 4444:4444 -p 7900:7900 -v /dev/shm:/dev/shm selenium/standalone-chrome:4.0.0-rc-1-prerelease-20210618
```

Then, you would use in your browser:

http://localhost:7900/ to connect to the Chrome container

If you get a prompt asking for a password, it is: secret.

# api-experiments
