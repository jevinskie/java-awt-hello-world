import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HelloWorldAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("Hello, World title");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.out.println("window close hook");
                System.exit(0);
            }
        });
        Label label = new Label("Hello, World! label", Label.CENTER);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
        Runtime.getRuntime().addShutdownHook(
            new Thread(() -> { System.out.println("shutdown hook"); }));
    }
}
