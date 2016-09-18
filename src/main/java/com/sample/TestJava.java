package com.sample;

import java.util.regex.Matcher;  
import java.util.regex.Pattern; 

public class TestJava {
	
	 public static void main(String args[]) {
		 compareStr4();
	 }
	
	/*static public void compareStr(){
		Pattern p = Pattern.compile("([\u4E00-\u9FA5]*)(省|自治区|市)([\u4E00-\u9FA5]*)(市|县|自治县|区)");
		//Matcher m = p.matcher("浙江省杭州市");
		//String addr = "浙江省杭州市某街道118号";
		//Matcher m = p.matcher("广西壮族自治区桂林市");
		//String addr = "广西壮族自治区桂林市某街道118号";
		Matcher m = p.matcher("河南省萍乡县");
		String addr = "河南省郑州市萍乡县某街道118号";
		//Matcher m = p.matcher("上海市长宁区");
		//String addr = "上海市上海市长宁区某街道118号";
		
		while (m.find()) {
			System.out.println(m.group(1));
			System.out.println(m.group(3));
			String subAddr = m.group(3);
			if(addr.contains(subAddr))
				System.out.println("地址匹配成功，户籍在"+subAddr);
			else
				System.out.println("地址匹配失败，户籍在"+subAddr);
		}
	}*/
	 static public void compareStr(){
			Pattern p = Pattern.compile("([\u4E00-\u9FA5]*)(省|自治区|市)([\u4E00-\u9FA5]*)(市|县|自治县|区)");
			Matcher m = p.matcher("河南省萍乡县");
			String addr = "河南省郑州市萍乡县某街道118号";
			
			while (m.find()) {
				String subAddr = m.group(3);
				if(addr.contains(subAddr))
					System.out.println("地址匹配成功，户籍在"+subAddr);
				else
					System.out.println("地址匹配失败，户籍在"+subAddr);
			}
		}
	 
	 static public void compareStr2(){
			String name1 = "**磊";
			String name2 = "杨涛";
			
			String subName1 = name1.substring(name1.length()-1);
			String subName2 = name2.substring(name2.length()-1);
			if (subName1.equals(subName2))
				System.out.println("名字匹配成功，最后一个文字是"+subName1);
			else
				System.out.println("名字匹配失败，name1最后一个文字是"+subName1+", name2最后一个字是"+subName2);
		}
	 
	 	static public void compareStr4(){
		 	Pattern p = Pattern.compile("([\u4E00-\u9FA5]*)(\\**)([\u4E00-\u9FA5]*)");
			Matcher m = p.matcher("*科");
			String name = "邓登科";
			
			while (m.find()) {
				String subName1 = m.group(1);
				String subName2 = m.group(2);
				String subName3 = m.group(3);
				System.out.println("姓名为："+name);
				System.out.println("-------------第一组的值为："+subName1+",长度为："+subName1.length());
				System.out.println("-------------第二组的值为："+subName2+",长度为："+subName2.length());
				System.out.println("-------------第三组的值为："+subName3+",长度为："+subName3.length());
				if(subName1 != null)
					System.out.println("姓为空值");
				if((subName1 != "" && name.contains(subName1)) ||
					(subName3 != "" && name.contains(subName3))){
					System.out.println("姓名匹配成功");
				}
				else{
					System.out.println("姓名匹配失败");
				}
			}
		}
	 
	 //比较短信号码
	 static public void compareStr3(){
			String str1 = "106902379523896299035";
			String str2 = "10690#9035";
			
			Pattern p = Pattern.compile("(\\d)(#)(\\d)");
			Matcher m = p.matcher(str2);
			while (m.find()) {
				String subStr1 = m.group(1);
				String subStr2 = m.group(3);
				int subStr1Length = subStr1.length();
				int subStr2Length = subStr2.length();
				int str1Length = str1.length();
				String subStr3 = str1.substring(subStr1Length);
				String subStr4 = str1.substring(str1Length - subStr2Length, str1Length);
				System.out.println("subStr1="+subStr1+";subStr2="+subStr2+";subStr3="+subStr3+";subStr4="+subStr4);
				if (subStr3.equals(subStr1) && subStr4.equals(subStr2))
					System.out.println("查询的字符串是一致的");
				else
					System.out.println("查询的字符串不一致");
			}
		}
}

