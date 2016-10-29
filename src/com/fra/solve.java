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
		int[] mp=new int[40];
		Arrays.fill(mp, -1);
//		for(int i=0;i<30;i++)
//			System.out.println(mp[i]);
		for(int i=0;i<str.length();i++){
			int tmp=str.charAt(i)-'a';
			if(mp[tmp]==-1){
				mp[tmp]=i;
			}
			else{
				Mlength=Math.max(Mlength, i-mp[tmp]);
				mp[tmp]=i;
			}
		}
		return Mlength;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ababb";
		System.out.print("最大不重复字符串的长度是：");
		System.out.println(MaxSubstring(str));

	}
}
