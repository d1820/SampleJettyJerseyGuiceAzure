# SampleJettyJerseyGuiceAzure

This project servers as an example of how to create a java rest api that uses dependency injection and is able to be deployed to Azure from Eclipse.

### Required Installs
+ [Eclipse Mars.1 Release (4.5.1)](http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/mars1)
+ [Apache Maven 3.3.9](https://maven.apache.org/download.cgi)
+ [JRE 1.8.0_74](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
+ [JDK 1.8.0_74](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
+ [Azure Toolkit for  Eclipse](https://azure.microsoft.com/en-us/documentation/articles/azure-toolkit-for-eclipse-installation/)
+ Windows Azure SDK (through web installer)

### Frameworks and Plugins
+ [Jetty 9.1.5.v20140505](https://eclipse.org/jetty/)
+ [Jersey 1.19](https://jersey.java.net/): Jersey 2.x does NOT work with the current implementation of Guice 3.0.
+ [Guice 3.0](https://github.com/google/guice/wiki/Motivation): Guice 4.0 has issues currently and is not stable in my opinion.
+ [Log4j 1.2.17](http://logging.apache.org/log4j/2.x/)
+ [Jackson 1.9.6](https://github.com/FasterXML/jackson)
+ [maven-war-plugin 2.6](https://maven.apache.org/plugins/maven-war-plugin/): This allows you to create a .WAR file on a maven build, which could be useful if deploying only though FTP to Azure.

I tried newer versions of the above frameworks, and kept running into errors and issues. This ended up being the combination I found that got everything working correctly.

These can all be installed from the pom.xml


### Project Configuration
+ Need to set the JDK as the default definition.
  + To do this in Eclipse go to Windows>preferences>java>Installed JRE's
  + Click Add and locate the directory you installed the JDK and select that folder.
  + Check the checkbox for the JDK
  + Click OK
+ Create a new Azure Deployment project
  + Select "New Azure Deployment Project" icon
  + JDk tab of Wizard
  ![Wizard Step 1](/readmeImages/AzureDeployment1.png)
  + Server tab of wizard
  ![Wizard Step 1](/readmeImages/AzureDeployment2.png)
  + Applications tab of wizard
    + Add a new application and point it to your current workspace
  ![Wizard Step 1](/readmeImages/AzureDeployment3.png)
  + Click Finish

  This will allow you to now deploy to Azure as a classic cloud server project. All the necessary files are created for you and when you "Build Cloud Project For Azure" the Azure package(.cspkg) is created in the deploy folder which you can use to manually deploy out to. For more information visit https://azure.microsoft.com/en-us/documentation/articles/azure-toolkit-for-eclipse/

  ### Points of Interest
  + *ServletContextListener*: This file is important because this is what allows the Azure worker role to spin up the Java rest api using dependency injection and server up requests/responses
  + *Main*: This file handles spinning up a local instance of Jetty Server so you can debug the project.
  + *RegistrationsModule*:  This file handles all dependency injection registrations for the application
  + *ApiServletModule*: This is what handles the main wiring up of the Guice dependency injection container. This file is where any new resources/controller registrations would go. Another option would be to use dynamic resource loading for all classes in project, but I tend to keep things explicit for registrations.
  + *Web.xml*: This file needs to contain the defined filter and listener nodes as seen in the sample. This file is what is used by the Azure Jettyb instance to kick off the rest api.

  ### Summary
  I hope this helps others overcome the challenges faced when trying to find a fully working example of using all these frameworks, components and environments together.
