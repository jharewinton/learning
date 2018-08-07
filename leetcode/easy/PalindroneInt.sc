//https://leetcode.com/problems/palindrome-number/description/

def isPalindrome(x: Int): Boolean = {
  if (x.toString() == x.toString().reverse) true else false
}

isPalindrome(10)
isPalindrome(121)
isPalindrome(-232)