
package com.jsoneg;

import java.io.FileInputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ReadJsonEg2 {

	public static void main(String[] args) throws Exception {

		ObjectMapper om = new ObjectMapper();

		FileInputStream fis = new FileInputStream("./person1.json");

		ObjectNode on = (ObjectNode) om.readTree(fis);

		String output = om.writeValueAsString(on);

		System.out.println(output);

	}


}
