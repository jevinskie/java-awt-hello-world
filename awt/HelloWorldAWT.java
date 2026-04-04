import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HelloWorldAWT {
    public static void main(String[] args) {
        System.getProperties().forEach((k, v) -> { System.out.printf("%s: %s\n", k, v); });
        System.out.println("");

        System.out.printf("GfxEnv.isHeadless: %b\n", GraphicsEnvironment.isHeadless());
        System.out.printf("GfxEnv.LclCtx.isHeadlessInstance: %b\n",
                          GraphicsEnvironment.getLocalGraphicsEnvironment().isHeadlessInstance());
        System.out.println("");

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
        System.out.println("visible: true");
        Runtime.getRuntime().addShutdownHook(
            new Thread(() -> { System.out.println("shutdown hook"); }));
    }
}
