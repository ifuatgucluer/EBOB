
    import java.util.Scanner;

    public class EBOB { //en büyük ortak bölen

        public static void main(String args[]) {


            Scanner inp = new Scanner(System.in);
            System.out.print("İlk sayıyı giriniz: ");
            int sayi1 = inp.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int sayi2 = inp.nextInt();

            int kucukSayi = Math.min(sayi1,sayi2); // En büyük ortak bölen küçük sayıdan büyük olamaz
            int ebob = 0;
            for(int i = kucukSayi;i>0;i--){
                if(sayi1%i==0 && sayi2%i==0){ //her iki sayıyıda bölüyorsa
                    ebob = i;
                    break; // Her iki sayıyıda bölen ilk sayı zaten en büyük ortak bölendir. o yüzden döngüye devam etmeye gerek yoktur.

                }

            }

            System.out.println("EBOB :"+ebob);

        }

    }
