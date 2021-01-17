package com.example.demo;

import java.io.*;

/**
 * @author lingnill
 */
public class JsonFileUtil {
    public static String getJsonFromFile(String file)throws Exception{
        InputStream is = JsonFileUtil.class.getClassLoader().getResourceAsStream(file);
        is.close();
        String response = string2Stream(is);
        return response;
    }
    public static String string2Stream(InputStream is)throws Exception{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int i;
        while((i=is.read()) !=-1){
            baos.write(i);
        }
        baos.close();
        return baos.toString();
    }

}
