import java.util.Scanner;

class LCS
{

    int findLCS(char[] s1Characters, char[] s2Characters, int m, int n )
    {
        if (m == 0 || n == 0)
            return 0;
        if (s1Characters[m-1] == s2Characters[n-1])
            return 1 + findLCS(s1Characters, s2Characters, m-1, n-1);
        else
            return max(findLCS(s1Characters, s2Characters, m, n-1), findLCS(s1Characters, s2Characters, m-1, n));
    }

    int max(int a, int b)
    {
        return (a > b)? a : b;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        LCS lcs = new LCS();
        String s1 = scanner.next();
        String s2 = scanner.next();

        char[] s1Characters=s1.toCharArray();
        char[] s2Characters=s2.toCharArray();
        int m = s1Characters.length;
        int n = s2Characters.length;

        System.out.println(lcs.findLCS( s1Characters, s2Characters, m, n ) );
    }

}