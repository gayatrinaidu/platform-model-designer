/**
 * Copyright © Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.framework.model.designer.rest;

import com.platform.bom.domain.User;
import com.platform.framework.rest.client.RestClient;
import com.platform.framework.rest.factory.RestClientFactory;

/**
 * RepositoryAccessor Class.
 * @author Harish Mangala
 *
 */
public class RepositoryAccessor {

	public static void main(String[] args) {
		RestClient restClient = RestClientFactory.instantiate(RestClientFactory.CLIENT_JSON);
		restClient.getEntity(User.class, "http://localhost:8080/model-repository/user/0");
	}

	/**
	 * Get Repository URL.
	 * @return String
	 */
	public String getURI() {
		return "http://localhost:8080/model-repository";
	}

}
