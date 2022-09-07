package com.democompany;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
/**
 * @author Kamaraj
 * @description Used to Perform DELETE operation 
 * @date 04/09/2022
 */
public class PerformDELETE {

	public static void main(String[] args) {

	RequestSpecification reqSpec;
	
	//1.Initialize the rest assured
	reqSpec = RestAssured.given();
	
	//2.Pass path parameter
	reqSpec = reqSpec.pathParam("page", "3");
	
	//3.method type and endpoint
	Response response = reqSpec.delete("https://reqres.in/api/users/{page}");
	
	//4.Status Code
	int statusCode = response.getStatusCode();
	System.out.println(statusCode);
	
	StatusCodeVerifier.verify(statusCode);
	
	//5.Pretty String
	String asPrettyString = response.asPrettyString();
	System.out.println(asPrettyString);
	}
}
