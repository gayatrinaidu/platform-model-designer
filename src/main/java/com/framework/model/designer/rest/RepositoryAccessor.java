package com.framework.model.designer.rest;

import com.platform.bom.domain.User;
import com.platform.framework.rest.client.RestClient;
import com.platform.framework.rest.factory.RestClientFactory;

public class RepositoryAccessor {
	
	public static void main(String[] args) {
		RestClient restClient = RestClientFactory.instantiate(RestClientFactory.CLIENT_JSON);
		User user = restClient.getEntity(User.class, "http://localhost:8080/model-repository/user/0");
		System.out.println(user);
	}

}
