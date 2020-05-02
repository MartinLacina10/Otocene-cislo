import java.util.Scanner;
class ReverseNumber{
  public static void main(String args[]){
    int a , obracene = 0;

    System.out.println("Zadejte cisla, ktere chcete prevratit");
    Scanner in = new Scanner(System.in);
    a = in.nextInt();

    while(a != 0){

      obracene = obracene * 10;
      obracene = obracene + a%10;
      a = a/10;
    }

    System.out.println("Obracene cislo je: " + obracene);
  }
}