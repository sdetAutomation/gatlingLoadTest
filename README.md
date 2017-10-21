```
#             .___      __     _____          __                         __  .__
#    ______ __| _/_____/  |_  /  _  \  __ ___/  |_  ____   _____ _____ _/  |_|__| ____   ____
#   /  ___// __ |/ __ \   __\/  /_\  \|  |  \   __\/  _ \ /     \\__  \\   __\  |/  _ \ /    \
#   \___ \/ /_/ \  ___/|  | /    |    \  |  /|  | (  <_> )  Y Y  \/ __ \|  | |  (  <_> )   |  \
#  /____  >____ |\___  >__| \____|__  /____/ |__|  \____/|__|_|  (____  /__| |__|\____/|___|  /
#       \/     \/    \/             \/                         \/     \/                    \/
```
# gatlingLoadTest
Load Test / Performance testing Startup Project.


Introduction
------------
This project is made for anyone who is looking for a starting point for running load test / performance test against a Rest Api endpoint.

This project was written using IntelliJ IDEA Community Edition.


Getting Started
-----
This project was created using Gatling's Maven Archetype via IntelliJ IDE.


1) IntelliJ 

            Go to File > select New > select Project > select Maven as project type > check "Create from archetype" >
            click "Add Archetype..." button > GroupId: io.gatling.highcharts > ArtifactId: gatling-highcharts-maven-archetype >
            Version: 2.3.0 > do not need to enter Repository > next complete the normal project creation steps. 
            
            Once all your creation steps are complete IntelliJ will begin to pull down the neccesary dependenies and help you 
            structure your project.

For more information: http://gatling.io/docs/current/extensions/maven_archetype/

    
2) Apache Maven is required for test execution.  

        For Maven installation instructions:  https://maven.apache.org/install.html
    
    
Test Api Urls
-----
    http://computer-database.gatling.io
    http://jsonplaceholder.typicode.com


Running Tests
-----
To execute a test, open your favorite terminal:

    Exectute BasicSimulation: mvn gatling:execute -Dgatling.simulationClass=computerdatabase.BasicSimulation

    For more information: https://gatling.io/docs/current/quickstart/
    ______ 

    Execute GetExample: mvn -DnumOfUser=20  gatling:execute -Dgatling.simulationClass=jsonPlaceholder.GetExample
    _____
    
    Execute PostExample: mvn -DnumOfUser=20  gatling:execute -Dgatling.simulationClass=jsonPlaceholder.PostExample


Viewing Test Results
-----
    Navigate to your project root > target folder > gatling > you will see a folder named for example: getexample-1508610759280 > 
    in this folder you will see 2 .html files.  > open any of the 2 files with your favorite web browser > you will see
    a detailed test results report.
    

Continuous Integration(CI)
------------
A web hook has been setup with Travis CI for all Push and Pull Requests.
