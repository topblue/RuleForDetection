package org.iii.SaaSSEC.function;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

public class ElasticsearchTool {

	public Client client;
	public Client getElasticsearchClinent(){
		return this.client;
	}
	@SuppressWarnings("resource")
	public void setElasticsearchClinent() {
		Settings settings = ImmutableSettings.settingsBuilder().put("cluster.name", "MaokaoToCHU_google").build();
		// Client client = new TransportClient(settings);
		this.client = new TransportClient(settings)
				.addTransportAddress(new InetSocketTransportAddress("localhost", 9300));
		// client.close();// on shutdown
	}
	
	/**
	 * @author Yu-Feng_Chu
	 * @param geoip_countryCode
	 * @return 
	 * ****/
	
	
}
