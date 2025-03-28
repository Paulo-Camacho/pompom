package pompom;

public class Main
{
    public static void main(String[] args)
    {
        // Timer example = new Timer(0);
        // example.start();
        Gui display = new Gui();
        Timer example = new Timer();
        example.menu();
        display.display();

    }
}
