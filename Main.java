
public class Main {

    private static long calculateFaktöriyel(long number) {




            if (number == 0 || number == 1) {
                System.out.println(1);
                return 1;
            } else if (number < 0) {
                System.out.println("Pozitif rakam giriniz ");

            } else {
                long result = 1;
                for (int i = 2; i <= number; i++) {
                    result *= i;
                }
                System.out.println("Sonucumuz :" + result);
                return result;
            }
    return number;
    }


        public static void main (String[]args){

           calculateFaktöriyel(-1);

        }
    }
