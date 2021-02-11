# AdidasSample
[![Build Status](https://travis-ci.org/aisabel/AdidasSample.svg?branch=master)](https://travis-ci.org/aisabel/AdidasSample)

<h2>Business Requirement:</h2>
<p align="justified">Create sample cucumber test for careers group page.</p>

<h2>TestFramework Description:</h2>
<p align="justified">Cucumber framework has been selected by their capability to display human readable instructions in the tests (gherking language); combined with Selenium to easy locate elements in a powerful faster headless browser, using JUnit for assertion results; getting as a result an automated report. </BR>This test suite is configured to be continuosly integrated in <a href="https://travis-ci.org/aisabel/AdidasSample">Travis</a></p>

<h2>Specifications, Frameworks and IDE tools:</h2>
<ul>
  <li>IDE:<a href="https://www.jetbrains.com/idea/download/#section=windows"> *Intelij IDEA Comunity 22020.2.4</a></li>
<li><a href="http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html"> *Java with package (JDK 1.8)</a>Baseline Programming Language</li>
<li>Main Frameworks:<ul>
  <li>*Cucumber framework 6.9.1</li>
  <li>*Selenium for 3.141.59</a></li>
  <li>*JUnit 4.13.1</li>
  <li>*Maven compiler 3.7.0</li>
  <p align="justified" >Note: Maven project will download automatically those framework external libraries based upon the dependencies in pom.xml file.</p>
</ul>
</ul>   

<h2>TestingFramework Structure:</h2>
<ul>
<p align="justified" >In order to provide a clear functional framework, the structure has been settup as below:</p>
<p align="justified" >
  <ul>
    <li> src > test > resources.features</li>
      <ul>
        <li> searchPositions.feature -> feature file with a simple position search in Adidas Careers website. </li>
        <li> theEndToEndScenario.feature --> feature file with a scenario where user applies for two positions </li>
        <li> visaRequirements.feature --> an edge case where user applies for two positions but different constraints </li>
      </ul>
     <li> src > test > java.stepDefinitions </li>
    <li> searchPositions.java </li>
    <li> Remark: other step definitions are not defined to not compromise logged in profiles and create defect applications in Adidas database </li>
    </ul>
  </ul>
 </p>
 </ul>
  
<h2>Install: How to run tests locally (Documentation steps in progress...)</h2>
<ul>
<ul>
  <li>Install Intelij </li>
  <p align="justified" >Open Intellij, Go to Settings -> Plugins,  Choose to install Cucumber for JAVA plugin, and Gherking plugin. You might need to restart the IDE.</p>
  <li>Import project folder as a Maven project</li>
  <li>Go to path src > test > resources.features > searchPositions.feature </li>
  <p align="justified" >The quickest way of running Cucumber tests is by using the icons in the gutter next to the necessary feature or scenario. </br>
  <a href="https://www.jetbrains.com/help/idea/running-cucumber-tests.html"> View steps to run here</a></p>
 </ul>
 
 <ul><li>Test can be also runned by console using maven with the following command: - mvn test -B</ili</ul>
</ul>
</ul>

<h3>External references (more info)</h3>
<ul>
  <li><a href="http://docs.seleniumhq.org/projects/webdriver/">Selenium reference page</a></li>
  <li><a href="https://cucumber.io">Cucumber reference page</a></li>
   <li><a href="https://www.jetbrains.com/help/idea/cucumber-support.html">Intelij idea cucumber support</a></li>
</ul>
