package com.xl.string;

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
		int start = 0;
		int len = 0;
		for (int i = 0; i < orgChars.length; i++) {
			if (orgChars[i] == ' ') {
				if (start + 1 < i) {
					len = i - start;
					char[] wordChars = new char[len];
					for (int j = 0; j < len; j++) {
						wordChars[j] = orgChars[start + j];
					}
					list.add(new String(wordChars));
				}
				start = i + 1;
			}
			if (i == orgChars.length - 1 && orgChars[i] != ' ') {
				len = i - start + 1;
				char[] wordChars = new char[len];
				for (int j = 0; j < len; j++) {
					wordChars[j] = orgChars[start + j];
				}
				list.add(new String(wordChars));
			}
		}
		return list;
	}

	public List<String> split(String orgStr) {
		List<String> list = new ArrayList<String>();
		char[] orgChars = orgStr.toCharArray();
		for (int i = 0; i < orgStr.length(); i++) {
			for (int j = 0; j < orgStr.length() - i; j++) {
				int len = i+1;
				char[] arrChar = new char[len];
				for (int k = 0; k < len; k++) {
					arrChar[k] = orgChars[j+k];
				}
				list.add(new String(arrChar));
			}
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(new StringUtil().contain("xiongliang", "liang"));
		System.out.println(new StringUtil().splitWord("xiong            liang        welcome to        china"));
		System.out.println(' ');
		System.out.println(new StringUtil().split("xiongliang"));
		System.out.println(new StringUtil().split("xiongliang").size());
		System.out.println(new String("Edit Portfolio: &lt; meta HTTP-EQUIV=").substring(0, 14));
		System.out.println(new String("Edit Portfolio: @X@portfolio.name@X@").split(":")[0]);
	}

}
