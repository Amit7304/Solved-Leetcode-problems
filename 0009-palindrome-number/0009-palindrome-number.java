class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int original = x;
        while(x>0){
            int lastdigit = x%10;
            reverse = reverse *10 + lastdigit;
            x= x/10;
        }

        return reverse == original;
    }
}