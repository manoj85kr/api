package com.api.connections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.api.configuration.Configuration;
import com.api.requestbodystruct.constructUrl;

public class gitHubApiConnection {
	public static String postMakeConnection(String question) throws IOException, InterruptedException {
		StringBuilder sb = new StringBuilder();
		String apiKey = System.getenv("GITHUB_API_KEY");
		String reader = "";
		URL url = new URL(Configuration.pro.getProperty("url"));
		System.out.println("Url : " + url);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", Configuration.pro.getProperty("Content-Type"));
		try {
			if (apiKey == null || apiKey.isEmpty()) {
				throw new RuntimeException("github is not set");
			}
			con.setRequestProperty("Authorization", "Bearer " + apiKey);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con.setDoOutput(true);

		try (OutputStream os = con.getOutputStream()) {
			System.out.println(constructUrl.githubConstructUrl(question));
			byte[] inputs = constructUrl.githubConstructUrl(question).getBytes("UTF-8");
			os.write(inputs);
			os.flush();
		}
		con.connect();
		Thread.sleep(2000);
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
}
