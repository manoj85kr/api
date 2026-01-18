package com.api.connections;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.BeforeTest;

import com.api.configuration.Configuration;
import com.api.requestbodystruct.constructUrl;

public class ApiConnections {
	public static String getMakeConnections() throws IOException {
		StringBuilder sb = new StringBuilder();
		URL url = new URL(Configuration.pro.getProperty("url"));
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.addRequestProperty("Content-Type", Configuration.pro.getProperty("Content-Type"));
		con.connect();
		if (con.getResponseCode() == 200) {
			String reader = "";
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while ((reader = br.readLine()) != null) {
				sb.append(reader);
			}
			br.close();
		} else {
			System.out.println(con.getErrorStream());
		}
		return sb.toString();
	}

	public static String postMakeConnection() throws IOException {
		StringBuilder sb = new StringBuilder();
		String reader = "";
		URL url = new URL(Configuration.pro.getProperty("url"));
		System.out.println("-------------------------------------------------");
		System.out.println("Url : " + url);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", Configuration.pro.getProperty("Content-Type"));
		con.setDoOutput(true);

		try (OutputStream os = con.getOutputStream()) {
			System.out.println(constructUrl.postBodyUrlConstructor());
			byte[] input = constructUrl.postBodyUrlConstructor().getBytes("UTF-8");
			os.write(input);
			os.flush();
		}
		con.connect();
		if (con.getResponseCode() == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while ((reader = br.readLine()) != null) {
				sb.append(reader);
			}
			br.close();
		} else {
			System.out.println(con.getResponseCode());
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			while ((reader = br.readLine()) != null) {
				sb.append(reader);
			}
			br.close();
		}
		System.out.println("Post Call Response : " + sb.toString());
		return sb.toString();
	}

	public static String putMakeConnection(String id) throws IOException {
		StringBuilder sb = new StringBuilder();
		String reader = "";
		URL url = new URL(Configuration.pro.getProperty("url") + "/" + id);
		System.out.println("-------------------------------------------------");
		System.out.println("Url : " + url);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		con.setRequestMethod("PUT");
		con.setRequestProperty("Content-Type", Configuration.pro.getProperty("Content-Type"));
		con.setDoOutput(true);

		try (OutputStream os = con.getOutputStream()) {
			System.out.println(constructUrl.putBodyUrlConstructor());
			byte[] input = constructUrl.putBodyUrlConstructor().getBytes("UTF-8");
			os.write(input);
			os.flush();
		}
		con.connect();
		if (con.getResponseCode() == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while ((reader = br.readLine()) != null) {
				sb.append(reader);
			}
			br.close();
		} else {
			System.out.println(con.getResponseCode());
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			while ((reader = br.readLine()) != null) {
				sb.append(reader);
			}
			br.close();
		}
		System.out.println("Put Call Response : " + sb.toString());
		return sb.toString();
	}

	public static String patchMakeConnection(String id) throws IOException {
		StringBuilder sb = new StringBuilder();
		String reader = "";
		URL url = new URL(Configuration.pro.getProperty("url") + "/" + id);
		System.out.println("-------------------------------------------------");
		System.out.println("Url : " + url);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		con.setRequestMethod("PATCH");
		// con.setRequestProperty("X-HTTP-Method-Override", "PATCH");
		con.setRequestProperty("Content-Type", Configuration.pro.getProperty("Content-Type"));
		con.setDoOutput(true);

		try (OutputStream os = con.getOutputStream()) {
			System.out.println(constructUrl.patchBodyUrlConstructor());
			byte[] input = constructUrl.patchBodyUrlConstructor().getBytes("UTF-8");
			os.write(input);
			os.flush();
		}
		con.connect();
		if (con.getResponseCode() == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while ((reader = br.readLine()) != null) {
				sb.append(reader);
			}
			br.close();
		} else {
			System.out.println(con.getResponseCode());
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			while ((reader = br.readLine()) != null) {
				sb.append(reader);
			}
			br.close();
		}
		System.out.println("Patch Call Response : " + sb.toString());
		return sb.toString();
	}

	public static String deleteMakeConnection(String id) throws IOException {
		StringBuilder sb = new StringBuilder();
		String reader = "";
		URL url = new URL(Configuration.pro.getProperty("url") + "/" + id);
		System.out.println("-------------------------------------------------");
		System.out.println("Url : " + url);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		con.setRequestMethod("DELETE");
		con.setRequestProperty("Content-Type", Configuration.pro.getProperty("Content-Type"));
		con.setDoOutput(true);

		con.connect();
		if (con.getResponseCode() == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while ((reader = br.readLine()) != null) {
				sb.append(reader);
			}
			br.close();
		} else {
			System.out.println(con.getResponseCode());
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			while ((reader = br.readLine()) != null) {
				sb.append(reader);
			}
			br.close();
		}
		System.out.println("Delete Call Response : " + sb.toString());
		return sb.toString();
	}
}
