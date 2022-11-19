import java.util.Scanner;

public class abba {
    public static void main(String[] args) {
        Scanner fox   =  new Scanner(System.in);
        String bear   =   fox.nextLine();
        String dog    =    bear.replace("A","X") ;
        String cat    =    dog.replace("B" ,"Z");
        String mouse  =  cat.replace("X","B" );
        String answer = mouse.replace("Z","A");
        System.out.println(answer);
    }
}
