package com.pramode.xmlops.api.files;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pramode.util.FileUtil;

@RestController
@CrossOrigin

public class FileApi {

	@RequestMapping(value="/file/{xml-name}",method=RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	String getFile(@PathVariable("xml-name") String xmlName) {
		 
		 return null;
	}
	
	@RequestMapping(value="/file/all",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	String getFileList() {
		 
		 List<String> flist = FileUtil.getXmlFiles(".");
		 
		 StringBuilder sb = new StringBuilder();
		 int count=0  ;
		 for (String s : flist) {
		     sb.append(s).append(",");
		     count++;
		 }
		 String result = sb.substring(0,sb.length()-1);
		 		 
		 return "{count:"+count+",data:\""+result+"\"}";
	}
	
	
}
