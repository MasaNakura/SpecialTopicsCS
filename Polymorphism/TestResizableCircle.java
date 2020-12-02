package polymorphism;

public class TestResizableCircle {
	public static void main(String[] args) {
		ResizableCircle c = new ResizableCircle(4);
		System.out.println(c);
		c.resize(5);
		System.out.println(c);

	}
}
