# Задача
Для заданной строки s найти длину самой длинной подстроки без дублирующих символов.

# Constraints
s.length>=0
s.length <=10000
char s - english letters, digits, symbol and spaces
32<=(int)s<=126

# Tests
## Test1
```
Input: s = "abcabcbb"
Output: 3
"abc".length = 3
```

## Test2
```
Input: s = "bbbbb"
Output: 1
"b".length = 1
```

## Test3
```
Input: s = "pwwkew"
Output: 3
wke.length = 3
```

## Test4
Input: s = ""
Output: 0

# Test5
Если Output == 126 то дальше не парсим

## Решение
res = 0
abcabcbb
ti=0 a - ok 
ti=1 b - ok
ti=2 c - ok
ti=3 a - no res = ti;
bi++
ti=bi
ti=0 a - ok
ti=1 b - ok
ti=2 c - ok
ti=3 b - no if (ti>res) {res = ti;}
bi++


   
