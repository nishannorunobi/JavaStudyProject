package com.nishan.java.behavioral.strategy.pattern;

public class ProtocolFactory {

	public static ProtocolStrategy create(String url){
		ProtocolStrategy ps = null;
		if(url.startsWith("ftp")){
			ps = new FtpProtocol();
		}else if(url.startsWith("http")){
			ps = new HTTPProtocol();
		}
		return ps;
	}

}
