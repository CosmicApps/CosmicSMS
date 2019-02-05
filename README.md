# Cosmic API's
## Cosmic SMS
**CosmicSMS** repo includes code snippets for sending SMS messages using a REST API.

The code snippets demonstrate a simple Java API request using Apache HTTPClient library.
Basic Authorization header is included for authenticating the username and API password.
pom.xml - includes a Maven dependency for v4.5.7 of the Apache HTTPClient library

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
