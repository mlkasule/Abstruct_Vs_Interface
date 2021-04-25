/**
 * Assume the existence of an interface, GUIComponent with the following
 * methods: - open and close—no parameters, returns boolean - move and
 * resize—accepts two int parameters and returns void.
 * 
 * Define a public class, Window, that implements the GUIComponent interface,
 * and has the following members: - int instance variables named width, height,
 * xPos, and yPos, with xPos and yPos initialized to 0 - a constructor that
 * accepts two integer variables (width followed by height) which are used to
 * initialize the width and height instance variables - an implementation of the
 * open method that sends "Window opened" to System.out, and returns true - an
 * implementation of the close method that sends "Window closed" to System.out,
 * and returns true - an implementation of the resize method that modifies the
 * width and height variables to the specified width and height - an
 * implementation of the move method that modifies xPos and yPos to reflect the
 * new position.
 * 
 * @author Mark Kasule
 *
 */

public class Window implements GUIComponent {
	private int width;
	private int height;
	private int xPos = 0;
	private int yPos = 0;

	public Window(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean open() {
		System.out.println("Window opened");
		return true;
	}

	public boolean close() {
		System.out.println("Window closed");
		return true;
	}

	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void move(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
}