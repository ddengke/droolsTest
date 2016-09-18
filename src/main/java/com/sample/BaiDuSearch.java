package com.sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import javax.net.ssl.SSLSocketFactory;

import com.sun.net.ssl.HttpsURLConnection;

public class BaiDuSearch {
	public static void main(String[] args) {
		baiduSearch();
//		String companyName = "益博睿";
//		String companyAddr = "51703588";
//        try {
//            String key = companyName + " " + companyAddr; //查询关键字
//            key = URLEncoder.encode(key, "gb2312");
//            URL u = new URL("http://www.baidu.com.cn/s?wd=" + key + "&cl=3");
//            URLConnection conn = u.openConnection();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(
//                    conn.getInputStream(), "utf8"));
//            String str = reader.readLine();
//            String str2 = str;
//            while (str != null) {
//                System.out.println(str);
//                str = reader.readLine();
//                str2 = str2 + str;
//            }
//            System.out.println("========================================");
//            if (str2.contains("<em>"+companyName+"</em>") && str2.contains("<em>"+companyAddr+"</em>"))
//        		System.out.println("查询的信息靠谱");
//            else
//            	System.out.println("查询的信息不靠谱");
//            reader.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
 
    }
	
	public static void baiduSearch() {
		String companyName = "上海木奇佑贸易有限公司";
		String companyAddr = "罗泾镇陈川西路沪樊路53号";
        try {
            String key = companyName + " " + companyAddr; //查询关键字
            key = URLEncoder.encode(key, "gb2312");
            URL u = new URL("http://www.baidu.com.cn/s?wd=" + key + "&cl=3");
            URLConnection conn = u.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    conn.getInputStream(), "utf8"));
            String str = reader.readLine();
            String str2 = str;
            while (str != null) {
                System.out.println(str);
                str = reader.readLine();
                str2 = str2 + str;
            }
            System.out.println("========================================");
            if (str2.contains("<em>"+companyName+"</em>") && str2.contains("<em>"+companyAddr+"</em>"))
        		System.out.println("查询的信息靠谱");
            else
            	System.out.println("查询的信息不靠谱");
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
 
    }
	
	public static void qihu360Search() {
		String companyName = "益博睿";
		String companyAddr = "徐家汇路555号";
        try {
            String key = companyName + "+" + companyAddr; //查询关键字
            key = URLEncoder.encode(key, "gb2312");
            URL u = new URL("http://www.so.com/s?q=" + key +
            		"&src=srp&fr=360sou_newhome&psid=7db3ae98b2fc682d5957b2bec6a1914f");
            URLConnection conn = u.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    conn.getInputStream(), "utf8"));
            String str = reader.readLine();
            String str2 = str;
            while (str != null) {
                System.out.println(str);
                str = reader.readLine();
                str2 = str2 + str;
            }
            System.out.println("========================================");
            if (str2.contains("<em>"+companyName+"</em>") && str2.contains("<em>"+companyAddr+"</em>"))
        		System.out.println("查询的信息靠谱");
            else
            	System.out.println("查询的信息不靠谱");
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
 
    }
         
}