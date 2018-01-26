package bridge;

public class Main {

    public static void main(String[] args) {
        DrawApi api = new OpenGlApi();

	    Shape sh = new Circle(api);
	    sh.drawShape();
    }
}
