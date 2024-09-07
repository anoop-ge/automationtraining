package com.jsoneg;

import java.io.FileOutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class WriteJsonEg2 {

	public static void main(String[] args) throws Exception {

		ObjectMapper om = new ObjectMapper();

		ObjectNode on = om.createObjectNode();

		on.put("name", "test");

		on.put("age", 44);

		FileOutputStream fos = new FileOutputStream("./person1.json");

		om.writeValue(fos, on);

	}

}
