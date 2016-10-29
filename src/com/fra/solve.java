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
		int cur=0;
//		int[] mp=new int[40];
//		Arrays.fill(mp, -1);
//		for(int i=0;i<30;i++)
//			System.out.println(mp[i]);
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			if(map.containsKey(str.charAt(i))){
				cur=Math.max(map.get(str.charAt(i))+1, cur);
				if(i-cur+1>Mlength){
					Mlength=i-cur+1;
				}
			}
			else{
				if(i-cur+1>Mlength)
					Mlength=i-cur+1;
			}
			map.put(str.charAt(i), i);
		}
		return Mlength;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcde123123";
		System.out.print("最大不重复字符串的长度是：");
		System.out.println(MaxSubstring(str));

	}
}
