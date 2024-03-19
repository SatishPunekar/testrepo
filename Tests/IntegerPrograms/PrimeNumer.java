public class PrimeNumer {
    public static void main(String[] args) {
        System.out.print("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(isPrime());

    }
    public static boolean isPrime(int num){
        boolean flag=true;
        if (num<=1){
            flag=false;
        }
        else if (num %2==0){
            flag=false;
        }
        else{
            for (int i=3;i<num;i++){
                if (num%i==0){
                    flag=false;
                }
            }
        }
        return flag;


    }
}