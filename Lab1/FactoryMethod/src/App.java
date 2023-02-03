import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String args[])throws IOException {
        ButtonFactory buttonFactory = new ButtonFactory();

        System.out.print("Enter the name of OS for which the button will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String buttonType=br.readLine();

        Button newButton= buttonFactory.getButton(buttonType);
        int buttonID=newButton.buttonID;
        System.out.print("Button ID is:   "+buttonType+ " ");

        newButton.getButtonID(0);
    }
}
