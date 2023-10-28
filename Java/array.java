public class array {
    public static void main (String[]args)
    {
        int[] arr2 = new int[30];

        //bubble sort

        for ( int i = 1 ; i < 30 ; i++)
        {
            for ( int j = 29 ; j >= i ; j--)
            {
                if(arr2[j-1] > arr2[j])
                {
                    int temp = arr2[j-1];
                    arr2[j-1]=arr2[j];
                    temp = arr2[j];
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}
