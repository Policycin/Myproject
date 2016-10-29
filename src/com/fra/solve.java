package com.fra;
import java.util.*;
public class solve {

	/**
	 * @param args
	 */
	public static int MaxSubstring(String str){
		int Mlength=0;
		if(str.length()==0||str.length()==1){
			Mlength=str.length();
			return Mlength;
		}
		return Mlength;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a";
		System.out.print("最大不重复字符串的长度是：");
		System.out.println(MaxSubstring(str));

	}
}
