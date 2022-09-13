import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Qual fruta você deseja comprar hoje?");
        Scanner input = new Scanner(System.in);
        String fruit = input.next().toLowerCase();
        String resultVerify = verifyFruit(fruit);

        if(resultVerify.equals(fruit)) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        } else {
            System.out.println("Que pena :( ! Essa fruta não está em promoção hoje. ");
        }
    }
    public static String verifyFruit(String fruit) {
        String[] fruits = {"banana", "maça", "abacaxi", "melão", "mamão"};
        String sale = "";
        for (int i = 0; i < fruits.length; i++) {
            if(fruits[i].equals(fruit)) {
                sale = fruits[i];
            }
        }
        return sale;
    }
}