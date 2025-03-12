import java.awt.Frame;
import java.awt.Button;


class MyButton {

    MyButton() {

	Frame frame = new Frame("HaGa");
	Button button1 = new Button("Ok");

	frame.add(button1);

	frame.setSize(500, 500);
	frame.setVisible(true);

    }

    public static void main(String[] arguments) {

	new MyButton();

    }

}
