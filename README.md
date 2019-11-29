# Cosmic API's
## Cosmic SMS
**CosmicSMS** repo includes code snippets for sending SMS messages using a REST API.

The code snippets demonstrate a simple Java API request using Apache HTTPClient library.
Basic Authorization header is included for authenticating the username and API password.
pom.xml - includes a Maven dependency for the Apache HTTPClient library

### Authentication
All Web API requests must be authenticated using Basic Access authentication. The account username and API password are concatenated with a colon ‘:’ separator to produce an authentication string. For example, if your user name is ‘Geoffrey’ and your password is ‘AbC123DeF456’, then your authentication string is: Geoffrey:AbC123DeF456
The authentication string is required to be Base64 encoded. Online tools are available to help, one example can be found at https://www.base64encode.org/. The encoded authentication string is then added to the HTTP header for all API requests. 
The example HTTP header below shows the encoded authentication string:

POST * HTTP/1.1
From: www.myserver.co.uk
Host: api.cosmicsms.com
Authorization: Basic R2VvZmZyZXk6QWJDMTIzRGVGNDU2
Content-Type: application/xml
Content-Length: 247


### Steps for running the SMS API
1. Sign up to Cosmic SMS to set username and get a few free credits.
2. Request API password from Cosmic support team - https://www.cosmicsms.com/contact
3. Clone the repo and compile the project
4. Call the Java main method passing in username, API password, and your mobile number (international format, e.g. 447712345670)

> java SmsApi USERNAME APIPASSWORD TARGET

### Useful links -
- Cosmic developer page - https://www.cosmicsms.com/developers
- SMS API doc - https://www.cosmicsms.com/uploads/CosmicSMS-REST-API.pdf
- Send SMS endpoint - https://api.cosmicsms.com/prod/rest/sms/send
- Maven repo for HTTPClient - https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient
- Basic authentication wiki - https://en.wikipedia.org/wiki/Basic_access_authentication


## SDK's
Auto-generated send SMS SDK's are included for:
- Android
- Java
- JavaScript
- iOS Objective C
- iOS Swift
- Ruby
