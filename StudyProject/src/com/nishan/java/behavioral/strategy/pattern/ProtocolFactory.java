package com.nishan.java.behavioral.strategy.pattern;

public class ProtocolFactory {

	public static ProtocolStrategy create(String url){
		ProtocolStrategy ps;
		if(url.startsWith("ftp")){
			return new FtpProtocol();
		}else if(url.startsWith("http")){
			return new HTTPProtocol();
		}
		return null;
	}

}
