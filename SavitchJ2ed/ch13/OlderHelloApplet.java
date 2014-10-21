
import java.awt.*;
import java.applet.*;

public class OlderHelloApplet extends Applet
{
    public void init()
    {
        setLayout(new FlowLayout());
        Label friendlyLabel = new Label("Hello out there!");
        add(friendlyLabel);
    }
}