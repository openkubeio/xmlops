package com.pramode.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtil {
	
	public static List<String> getXmlFiles(String path ){
		
	
		File f = new File(path);	
		List<File> flist = Arrays.asList(f.listFiles());
		List<String> slist = new ArrayList<String>();
		
		for(File a : flist) {
			if (a.isFile() && a.getName().trim().toLowerCase().endsWith(".xml"))
				slist.add(a.getName());
		}
		
		return slist;		
	}

}
