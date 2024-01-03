

public class Main {

    private static   long calculatefaktöriyel( long number ){

   if (number < 0){
       System.out.println("Enter a positive number. ");
       System.exit(1);
   }

    if (number==0||number==1){
        System.out.println(1);
        return 1 ;

    }else {
        long result =1;
        for (int i = 2;i<=number;i++){
                   result*=i;
        }
        System.out.println("sonucumuz :"+result);
        return result;
    }




    }








    public static void main(String[] args) {

calculatefaktöriyel(100);

    }
}
