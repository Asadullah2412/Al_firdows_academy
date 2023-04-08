import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var title = "Al Firdows Academy";
        System.out.println(title);

        Scanner nameScanner = new Scanner(System.in);
        System.out.print("NAME >>>");
        var name = nameScanner.nextLine();

        System.out.println("  ");
        System.out.println("-------------");

        System.out.println("sample question");
        Quetions.quetions("what is your name ?");

        Scanner userAnswerscanner = new Scanner(System.in);
        System.out.print("Your answer >>> ");
        var userAnswer = userAnswerscanner.nextLine();

        Evalutor.evalutor(userAnswer, "asad");

        System.out.println("Thank you " + name.toUpperCase());

        userAnswerscanner.close();
        nameScanner.close();

    }

}