# DL2 #
REST API for managingscuba dives and related information.

![Build Status](https://travis-ci.org/bsaunder/dl2.svg?branch=master)

## Documentation ##
REST API: [http://docs.dl2.apiary.io/](http://docs.dl2.apiary.io/)

## Build ##
TODO

## Test ##
TODO

## Deploy Locally ##
Install JBoss AS7 or one of the JBoss AS7 based Enterprise Servers such as EAP 6.x or FSW 6.x and start the server using the standard ports.

Run the maven build with the "deploy" profile enabled and upon completed the application will be deployed to your local JBoss installation at [http://localhost:8080/dl2](http://localhost:8080/dl2)

## Check Status ##
Check the status of the application by visiting the URL [http://localhost:8080/dl2/api/](http://localhost:8080/dl2/api/)info to get the information on the currently deployed application. If everything is running ok then this will return valid JSON. If it returns anything other than an HTTP 200 status then something has gone wrong with the deployment.



