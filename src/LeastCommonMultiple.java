public class LeastCommonMultiple {
    public static void main (String args[]){
        int n1 =10;
        int n2 =20;
        int hcf=0;
        int lcm=(n1*n2);
        while(n2!=0){
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        hcf=n1;
        System.out.println("hcf of the number is" +hcf);
        lcm = lcm/n1;
        System.out.println("lcm of the number is"+lcm);
    }
}
