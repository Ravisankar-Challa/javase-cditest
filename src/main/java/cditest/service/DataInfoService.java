package cditest.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import cditest.config.RestClient;
import cditest.model.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@ApplicationScoped
public class DataInfoService {

	protected static final String url = "https://raw.githubusercontent.com/Ravisankar-Challa/tomee_embedded/master/src/main/resources/miscellaneousinfo.js";
	
	private RestClientService restClientService;
	
	@Inject
	public DataInfoService(@RestClient(connectTimeout = 3000, readTimeout = 10000, useProxy = false)
	        RestClientService restClientService) {
	    this.restClientService = restClientService;
	}
	
	public Data fetchMiscellaneousInfo() {
		//return httpClientService.doGet(url, new HashMap<>() {{ put("param","param1"); }}, new HashMap<>() {{ put("param","param1"); }}, MiscellaneousInfo.class);
		return restClientService.doGet(url, null, null, Data.class);
	}

}
