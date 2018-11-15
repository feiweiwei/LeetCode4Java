package com.monkey01.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: feiweiwei
 * @description:
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
	示例 1:
	输入: s = "anagram", t = "nagaram"
	输出: true
 * @created Date: 09:36 2018/10/30.
 * @modify by:
 */
public class ValidAnagram_242 {

	//通过hashmap来完成字母计数
	public boolean isAnagram(String s, String t) {
		Map<Character, Integer> strMap1 = new HashMap<Character, Integer>(s.length());
		Map<Character, Integer> strMap2 = new HashMap<Character, Integer>(t.length());
		for(int i=0;i<s.length();i++){
			Character subStr1 = s.charAt(i);
			if(strMap1.containsKey(subStr1)){
				strMap1.put(subStr1, strMap1.get(subStr1)+1);
			}else{
				strMap1.put(subStr1, 1);
			}
		}

		for(int i=0;i<t.length();i++){
			Character subStr2 = t.charAt(i);
			if(strMap2.containsKey(subStr2)){
				strMap2.put(subStr2, strMap2.get(subStr2)+1);
			}else{
				strMap2.put(subStr2, 1);
			}
		}
		return strMap1.equals(strMap2);
	}
}
