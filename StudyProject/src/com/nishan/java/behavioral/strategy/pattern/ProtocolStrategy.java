package com.nishan.java.behavioral.strategy.pattern;

import java.io.File;

public interface ProtocolStrategy{
	File getFile(String url,String destination);
}
