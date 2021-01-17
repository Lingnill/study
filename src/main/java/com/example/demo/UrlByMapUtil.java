package com.example.demo;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lingnill
 */
public class UrlByMapUtil {
    //将URL转换成Map param aa=11&bb=22&cc==33
    public static Map<String,Object> getUrlParam(String param)throws Exception{
        Map<String,Object> map = new HashMap<>();
        if (StringUtils.isEmpty(param)){
            return map;
        }
        String[] params = param.split("&");
        for (int i=0;i<params.length;i++){
            String[] p =params[i].split("=");
            if (p.length==2){
                map.put(p[0],p[1]);
            }
        }
        return map;
    }
    //将Map转换为URL
    public static String getUrlParamByMap(Map<String,Object> map)throws Exception{
        if (map.isEmpty()){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (Map.Entry entry:map.entrySet()){
            sb.append(entry.getKey()+"="+entry.getValue());
            sb.append("&");
        }
        String s = sb.toString();
        //if (s.endsWith("&")){
        //    s=StringUtils.substringBeforeLast(s,"&");
        //}
        return s;
    }
}

