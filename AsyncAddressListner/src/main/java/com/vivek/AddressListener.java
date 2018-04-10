package com.vivek;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AddressListener {
	private ObjectMapper mapper;
	private Map<Long, Address> addressMap;
	
	public AddressListener() {
		mapper = new ObjectMapper();
	}

	public void receiveMessage(Address message) throws JsonProcessingException {
		addressMap = new HashMap<Long, Address>();
		convertListToMap(getCurrentAddressesFromFile());

		putAddress(message);
		persistAddresses();
		
		System.out.println(mapper.writeValueAsString(message));
		
	    System.out.println("Addresses have been updated.");
	}
	
	private List<Address> getCurrentAddressesFromFile() {
		List<Address> addresses = null;
		try {
			addresses = Arrays.asList(mapper.readValue(new File("/Users/vkumar/Desktop/microservice_project/myProject/addresses.json"), Address[].class));
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
		return addresses;
	}
	
	private void convertListToMap(List<Address> addresses) {
		for (Address address : addresses) {
			putAddress(address);
		}
	}
	
	private void putAddress(Address p) {
		addressMap.put(p.getId(), p);
	}
	
	private void persistAddresses() {
		try {
			mapper.writeValue(new File("/Users/vkumar/Desktop/microservice_project/myProject/addresses.json"), new ArrayList<Address>(addressMap.values()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
