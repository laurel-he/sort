package an.solution.com;

public class isPalindrome {
    public static void main(String[] args) {
        int x = 1221;
        boolean res = isPalind(x);
        System.out.println(res);
    }
    public static boolean isPalind(int x)
    {
        if(x == 0)
        {
            return true;
        }
        if(x < 0 || x % 10 == 0)
        {
            return false;
        }
        else
        {
            int reverse =  reverse(x);
            if(x == reverse)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10; // 每一次都在原来结果的基础上变大10倍，再加上余数
            x = x / 10; // 对x不停除10
        }
        return result;
    }
}
