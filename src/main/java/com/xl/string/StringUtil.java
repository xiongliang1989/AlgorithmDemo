package com.xl.string;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

public class StringUtil {

	public String reverse(String orgiStr) {
		char[] chars = orgiStr.toCharArray();
		int len = chars.length;
		for (int i = 0; i < len / 2; i++) {
			char temp = chars[i];
			chars[i] = chars[len - 1 - i];
			chars[len - 1 - i] = temp;
		}

		return new String(chars);
	}

	// orgStr为
	public boolean contain(String orgStr, String objectStr) {
		char[] orgChars = orgStr.toCharArray();
		char[] objectChars = objectStr.toCharArray();

		if (orgChars.length - objectChars.length < 0) {
			return false;
		}

		for (int i = 0; i <= orgChars.length - objectChars.length; i++) {
			for (int j = 0; j < objectChars.length; j++) {
				if (orgChars[i + j] != objectChars[j]) {
					break;
				}
				if (j == objectChars.length - 1) {
					return true;
				}
			}
		}

		return false;
	}

	public List<String> splitWord(String orgStr) {
		char[] orgChars = orgStr.toCharArray();
		List<String> list = new ArrayList<String>();
		int start =0;
		int len = 0;
		for (int i = 0; i < orgChars.length; i++) {
			if(orgChars[i] == ' '){
				if(start< i){
					len = i-start;
					char[] wordChars = new char[len];
					for (int j = 0; j < len; j++) {
						wordChars[j] = orgChars[start+j];
						list.add(new String(wordChars));
					}
				}
				start = i;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(new StringUtil().contain("xiongliang", "liang"));
		System.out.println(new StringUtil().splitWord("xiong liang"));		
		System.out.println(' ');		
	}

}
