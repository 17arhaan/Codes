public class breaktest {
    public static void main(String[]args)
    {
        for (int i = 0 ; i <= 1 ; i++)
        {
            System.out.println("PASS"+i+":");
            for ( int j = 0 ; j <= 10 ; j++)
            {
                if (j==20) break;
                System.out.println(j + " ");
            } 
        }
        System.out.println("Loops Complete");
    }
}
