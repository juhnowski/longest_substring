package org.example;

import java.util.HashSet;

class Solution {
  static int MAX = 95;
	public int lengthOfLongestSubstring(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		
		int len = s.length();
		
		if (len == 1) {
			return 1;
		}

		int res = 0;

		int bi = 0; //begin index
		int endIndex = len - 1;  
		int ti = 0; // temporary end index
		
    while (bi<endIndex) {
			
		  int idx = bi + ti;
		
      HashSet<Character> chars = new HashSet<>();
			
      while(idx<=endIndex) {
        Character c = s.charAt(idx);
        if (!chars.contains(c)) {
          chars.add(c);
          idx++;
			  }	else {
          break;
        }
		  }

      ti = idx-bi;
      if (res<ti) {
        res = ti;
        if (ti == MAX) {
          return MAX;
        }
      }
      ti = 0;
      bi++;
    }

		return res;	
	}
}
