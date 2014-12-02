package com.nishan.java.behavioral.strategy.pattern;

import java.io.File;

public class Downloader {
	ProtocolStrategy ps;
	public Downloader() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	public void download(String url,String destination){
		ps = ProtocolFactory.create(url);
		File file = ps.getFile(url, destination);
		//}
	}

}
