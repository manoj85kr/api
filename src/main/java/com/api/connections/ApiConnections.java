package com.api.connections;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.api.configuration.Configuration;

public class ApiConnections {

	public static String getMakeConnections() throws IOException {
		String responseReader = "";
		URL url = new URL(Configuration.pro.getProperty("url"));
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod(Configuration.pro.getProperty("Method"));
		con.addRequestProperty("Content-Type", Configuration.pro.getProperty("Content-Type"));
		con.connect();
		if (con.getResponseCode() == 200) {
			String reader = "";
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while ((reader = br.readLine()) != null) {
				responseReader = reader.toString();
			}
			br.close();
		} else {
			System.out.println(con.getErrorStream());
		}
		return responseReader;
	}
}
