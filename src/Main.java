import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int investitie = input.nextInt();
        input.nextLine();
        int nrAni = input.nextInt();
        input.nextLine();
        double dobanda = input.nextInt();
        input.nextLine();

        double sumaDobandaSimpla = calculeazaDobandaSimpla(investitie,nrAni,dobanda);
        double sumaDobandaCompusa = calculeazaDobandaCompusa(investitie,nrAni,dobanda);
        System.out.println("Diferenta: %.2f " , (sumaDobandaSimpla-sumaDobandaCompusa));
    }

    public static double calculeazaDobandaCompusa(double investitie, int nrAni, double dobanda){
        for(int i=0;<nrAni;i++){
            investitie*=(1+dobanda/100);
    }
        System.out.println("Dobanda compusa: %.2f", investitie);
        return investitie;
    }

    public static double calculeazaDobandaSimpla(double investitie, int nrAni, double dobanda){
        investitie=investitie*(1+nrAni*dobanda/100);
        System.out.println("Dobanda simpla: %.2f ",investitie);
        return investitie;
    }

}
