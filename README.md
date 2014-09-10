# DL2 #
REST API for managingscuba dives and related information.

![Build Status](https://travis-ci.org/bsaunder/dl2.svg?branch=master)

## Documentation ##
REST API: [http://docs.dl2.apiary.io/](http://docs.dl2.apiary.io/)

## Build ##
The DL2 API and Application can be built using the following maven command:

    mvn clean install

Running the package goal will also generate JavaDoc and Source jars.

## Test ##
DL2 has a full suite of automated unit and integration tests. Running the standard build will also run all of the automated tests, as well as CheckStyle, Findbugs, and PMD.

No manual testing is needed.

## Deploy Locally ##
Install JBoss AS7 or one of the JBoss AS7 based Enterprise Servers such as EAP 6.x or FSW 6.x and start the server using the standard ports.

Run the maven build with the "deploy" profile enabled and upon completed the application will be deployed to your local JBoss installation at [http://localhost:8080/dl2](http://localhost:8080/dl2)

    mvn clean install -Pdeploy

## Check Status ##
Check the status of the application by visiting the URL [http://localhost:8080/dl2/api/](http://localhost:8080/dl2/api/)info to get the information on the currently deployed application. If everything is running ok then this will return valid JSON. If it returns anything other than an HTTP 200 status then something has gone wrong with the deployment.



