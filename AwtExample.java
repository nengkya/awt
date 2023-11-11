import java.awt.Frame;
import java.awt.Button;

public class AwtExample extends Frame {

    AwtExample(){
	Button button = new Button("HaGa");
	add(button);
	setVisible(true);
    }

    public static void main(String[] arguments) {
	AwtExample frame = new AwtExample();

    }
}
