package org.example;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	/*
	# Positive Tests
	## Test1
	Input: s = "abcabcbb"
	Output: 3
	"abc".length = 3
	*/
	@org.junit.jupiter.api.Test
	void test1() {
		Solution s = new Solution();
		int res = s.lengthOfLongestSubstring("abcabcbb");
  	assertEquals(res,3);
	}
	
	/*
	## Test2
	```
	Input: s = "bbbbb"
	Output: 1
	"b".length = 1
	```
	*/
	@org.junit.jupiter.api.Test
        void test2() {
                Solution s = new Solution();
                int res = s.lengthOfLongestSubstring("bbbbb");
                assertEquals(res,1);
        }

	/*
	## Test3
	```
	Input: s = "pwwkew"
	Output: 3
	wke.length = 3
	```
	*/
	@org.junit.jupiter.api.Test
	void test3() {
                Solution s = new Solution();
                int res = s.lengthOfLongestSubstring("pwwkew");
                assertEquals(res,3);
        }

	/*
	## Test4
	Input: s = ""
	Output: 0
	*/
	@org.junit.jupiter.api.Test
        void test4() {
                Solution s = new Solution();
                int res = s.lengthOfLongestSubstring("");
                assertEquals(res,0);
        }

	/*
	# Test5
	Если Output == 126 то дальше не парсим
	*/
}
