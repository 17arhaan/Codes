public class strings {
    public static void main(String[] args) {
        System.out.println("hey hello".substring(0, 3));
        String arr[]={"this","is","a","test"};
        System.out.println("original Array: -");
        for(String s1 : arr)
            System.out.print(s1+" ");;
        System.out.println(" ");
        arr[1]="was";
        arr[3]="pratice";
        System.out.println("Modified Array: -");
        for(String s2 : arr)
            System.out.print(s2+" ");
    }
}
