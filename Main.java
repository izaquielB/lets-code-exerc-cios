import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Qual fruta você deseja comprar hoje?");
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        boolean resultVerify = verifyFruit(fruit);

        if(resultVerify) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        } else {
            System.out.println("Que pena :( ! Essa fruta não está em promoção hoje. ");
        }
    }
    public static Boolean verifyFruit(String fruit) {
        String[] fruits = {"banana", "maça", "abacaxi", "melão", "mamão"};
        boolean sale = false;
        for (String s : fruits) {
            if (s.equalsIgnoreCase(fruit)) {
                sale = true;
                break;
            }
        }
        return sale;
    }
}