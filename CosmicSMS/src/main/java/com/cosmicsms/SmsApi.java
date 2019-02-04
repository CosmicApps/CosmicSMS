package com.cosmicsms;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * A simple example of how to use HttpClient to send an SMS to your phone using the CosmicSMS Rest API - https://www.cosmicsms.com/developers
 */
public class SmsApi {
	
// # java SmsApi <USERNAME> <APIPASSWORD> <TARGET>
	public static void main(String[] args) throws Exception {

		String username = args[0];		// Username set when signing up to Cosmic SMS
		String apiPassword = args[1];	// API password provided by the support team
		String targetMobi = args[2];	// Your mobile number to receive the test message
		
		HttpHost target = new HttpHost("api.cosmicsms.com", 443, "https");
		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		credsProvider.setCredentials(new AuthScope(target.getHostName(), target.getPort()),
				new UsernamePasswordCredentials(username, apiPassword));
		CloseableHttpClient httpclient = HttpClients.custom().setDefaultCredentialsProvider(credsProvider).build();

		try {

			// Create Authentication Cache instance
			AuthCache authCache = new BasicAuthCache();
			// Generate BASIC scheme object and add it to the local auth cache
			BasicScheme basicAuth = new BasicScheme();
			authCache.put(target, basicAuth);

			// Add AuthCache to the execution context
			HttpClientContext localContext = HttpClientContext.create();
			localContext.setAuthCache(authCache);

			// Construct the post request using XML
			HttpPost postMethod = new HttpPost("https://api.cosmicsms.com/prod/rest/sms/send");
			postMethod.setHeader("Content-Type", "application/xml");

			StringBuffer xmlBody = new StringBuffer();
			xmlBody.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>");
			xmlBody.append("<sendsms>");
			xmlBody.append("<message>Simple API test</message>");
			xmlBody.append("<mobiles>");
			xmlBody.append("<mobile>" + targetMobi + "</mobile>");
			xmlBody.append("</mobiles>");
			xmlBody.append("<sender>CosmicSMS</sender>");
			xmlBody.append("</sendsms>");

			StringEntity xmlEntity = new StringEntity(xmlBody.toString());
			postMethod.setEntity(xmlEntity);

			// Send the SMS POST request to api.cosmicsms.com
			System.out.println("Executing " + postMethod.getRequestLine() + " request to target " + target);
			CloseableHttpResponse response = httpclient.execute(target, postMethod, localContext);
			try {
				System.out.println("----------------------------------------");
				System.out.println(response.getStatusLine());
				System.out.println(EntityUtils.toString(response.getEntity()));
			} finally {
				response.close();
			}
			
		} catch (Exception ex) {
			System.out.println("Exception trying to send API request: " + ex.getMessage());			
		} finally {
			// Good practice to explicitly close the connection when it is no longer required
			httpclient.close();
		}
	}

}
