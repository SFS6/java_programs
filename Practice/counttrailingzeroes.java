import java.util.Scanner;
public class counttrailingzeroes {
    public static void main(String []args) {
    Scanner sc =new Scanner(System.in);
    int count=0;
    int n=sc.nextInt();
    while((n&1)!=1){
        count++;
        n>>=1;
    }
    System.out.println(count);
    }
}
