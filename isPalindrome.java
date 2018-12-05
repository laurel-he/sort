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
            result = result * 10 + x % 10; // ÿһ�ζ���ԭ������Ļ����ϱ��10�����ټ�������
            x = x / 10; // ��x��ͣ��10
        }
        return result;
    }
}
