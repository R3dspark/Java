import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("""
                            Hello my name is Amogus
                            I was created in 2022""");
        System.out.print("Please, remind me your name: ");
        String name = in.nextLine();
        System.out.printf("What a great name you have! %s", name);
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7. ");
        int remainder3 = in.nextInt();
        int remainder5 = in.nextInt();
        int remainder7 = in.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is" + age + "that's a good time to start programming!");
        in.close();
    }
}
