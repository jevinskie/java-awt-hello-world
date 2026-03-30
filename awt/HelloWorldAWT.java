import java.awt.Frame;
import java.awt.Label;

public class HelloWorldAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("Hello, World!");
        Label label = new Label("Hello, World!", Label.CENTER);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
