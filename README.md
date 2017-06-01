# salesforce-oauth
OAuth login for SalesForce using spring security framework
@Before
1) Create connected-app in one of salesforce org
	a) While creating connected app the callback url to be https://<server-url>/login
	b) Replace the generated consumer key and consumer secret in application.yml file
2) Enable HTTPS by generating keystore file
3) Gradle to be installed

@Test
1) Run the app
2) Launch https://localhost:8443, which will navigate to salesforce oauth login page
3) Once the login is validated, navigates to index.html
