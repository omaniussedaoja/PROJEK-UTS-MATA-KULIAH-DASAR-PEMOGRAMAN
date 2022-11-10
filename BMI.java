
package BMI;

import java.util.Scanner;
public class BMI {
    
    //definisikan variabel 
    public static void main(String[] args){
       Scanner input = new Scanner (System.in);
        int berat;
        float tinggi;
        float jenisKelamin;
        double BMI;
        
        
        // menu utama
        System.out.println("PROGRAM PERHITUNGAN BERAT BADAN");
        System.out.println("...............................");
        System.out.println("JENIS KELAMIN:");
        System.out.println("1.PRIA:");
        System.out.println("2.WANITA:");
        
     //menampilkan variable dan memberi rumus 
     System.out.println(" MASUKKAN JENIS KELAMIN:");
     jenisKelamin = input.nextFloat();
              
     System.out.println("UKURAN BERAT BADAN:");
     berat = input.nextInt();
     
      System.out.println("UKURAN TINGGI BADAN :");
     tinggi = input.nextFloat();
     tinggi/=100;
     BMI = berat/(tinggi*tinggi);
      System.out.println("HASIL BMI YANG DI TAMPILKAN ADALAH: " +BMI);
      
      
    if (BMI > 27){
         System.out.println("GENDUT:");
     
    }
    else if(BMI > 24){
          System.out.println("GEMUK:");
     
    }    
      else if(BMI > 18.8){
          System.out.println("NORMAL:");
     
    }    
      else{
          System.out.println("KURUS ATAU BERAT BADAN KURANG:");
     
    }    
      
    }
}
