/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accountprogram;
/*
 * Patika dev koşullu ifaeler bölümündeki hesap makinesi ödevi 
 */
import java.util.Scanner;

/**
 *
 * @author alimdursun
 */
public class AccountProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        String metin="    Hesap Makinesi     \n"
                + "(+) toplama,\n"
                + "(-) çıkarma,\n"
                + "(*) çarpma,\n"
                + "(/) bölme\n";
        System.out.println(metin);
        String operator=scanner.nextLine();
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();
        switch(operator){
            case "+":
                System.out.println(sayi1+" + "+sayi2+" = "+ (sayi1+sayi2));
                break;
            case "-":
                System.out.println(sayi1+" - "+sayi2+" = "+ (sayi1-sayi2));
                break;
            case "*":
                System.out.println(sayi1+" * "+sayi2+" = "+ (sayi1*sayi2));
                break;
            case "/":
                System.out.println(sayi1+" / "+sayi2+" = "+ (sayi1/sayi2));
                break;
            default:
                System.out.println("operator secimi veya veri tipi yanlış");
        }
    }
    
}
