## Toplyvo Automation Project


* Getting started. ENV
 
 1. Maven (see https://maven.apache.org/download.cgi) or download intelij idea
 2. JDK (see https://www.oracle.com/ru/java/technologies/javase-jdk15-downloads.html)
 3. Appium (see info about how to set up appium on MacOS - https://ivantay2003.medium.com/setting-up-appium-in-os-x-ecd9e7108a9c)
 
* Run suit 
 
```
mvn clean test -PSmokeSuite
```

* Serve result test

```
allure serve {allure results dir path}
```
