Building jointware
============

Due to certain plugin dependencies, Building jointware
requires a version of Maven >= 3.2.5.

First of all, the jointware build process may need, 
more memory than the default allocated
to the maven process. Therefore, ensure to set the 
MAVEN_OPTS system property with the following settings
before starting

    > MAVEN_OPTS="-Xmx1024m -XX:MaxPermSize=512m"

Build Fabric8 and run the associated tests

    > mvn clean install

Quick Builds
==========

You can do quick builds by appending `-DskipTests`

Build jointware and skip tests

    > mvn clean install -DskipTests

Build jointware with all modules and skip tests

Test Profiles
==========

jointware tests are seperated in serveral dedicated tests profiles

* ts.all:    Includes additional testing

Examples
--------
  
Build jointware and run regular tests

    > mvn clean install

Build jointware and run all tests

    > mvn clean install -Dts.all


