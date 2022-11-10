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
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int nmb = in.nextInt();
        for(int i = 1; i <= nmb; i++){
            System.out.println(i + " !");
        }
        System.out.println("""
                Let's test your programming knowledge.
                Why do we use methods?
                1. To repeat a statement multiple times.
                2. To decompose a program into several small subroutines.
                3. To determine the execution time of a program.
                4. To interrupt the execution of a program.
                """);
        while (true){
            int answer = in.nextInt();
           if (answer == 2){
               System.out.println("""
                       Completed, you are a smart boi!
                       Congratulations, have a nice day!""");
               break;
           }else {
               System.out.println("Wrong you dumbass");
           }
        }
        in.close();
    }
}
