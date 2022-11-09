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
        in.close();
    }
}
