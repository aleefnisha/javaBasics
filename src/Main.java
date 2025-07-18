public class Main {
    public static void main(String[] args) {
        int n1=10;
        int n2=20;
        while(n2!=0){
            int temp = n2;
            n2= n1%n2;
            n1=temp;
        }

        System.out.println(n1);
    }
}