### Spring Boot Demo 3A Rest Service Producer

**Steps:**
<ol>
<li>To setup IDE for Spring project, follow steps in https://github.com/worldpeacez0991/SpringBoot_demo1</li>

<br/>

<li>Start Spring Boot App
<ul>
<li>Via Spring IDE, open 'RestServiceApplication.java', press 'Alt+Shift+X, B', to start 'Spring Boot App'</li>
<li>Via browser, type 'http://localhost:8090/greeting', to test</li>
<kbd><img src="Pic1.PNG" width="500" /></kbd><br/>
<li>Via browser, type 'http://localhost:8090/greeting?name=User1', to test</li>
<kbd><img src="Pic2.PNG" width="500" /></kbd><br/>

<li>You may notice that port 8090 is used and not 8080, why?<br/>Because we need to differentiate between Producer and Consumer project with different ports.<br/>In next project, Consumer will call the Producer with this unique port number.</li>

<kbd><img src="Pic2B.PNG" width="500" /></kbd><br/>

</ul>
</li>

<br/>

<br/>
<li>For running JUnit Test</li>
<ul>
<li>Via Spring IDE, open 'GreetingControllerTests.java', press 'Alt+Shift+X, T', to start 'Junit Test'</li>
<kbd><img src="Pic3.PNG" width="500" /></kbd><br/>
</ul>
</li>

</ol>

Credits: https://spring.io/team<br/>
Source: https://spring.io/guides/gs/rest-service/



