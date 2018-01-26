package bridge;

public class Circle extends Shape
{
    public Circle(DrawApi drawApi)
    {
        super(drawApi);
    }

    @Override
    public void drawShape()
    {
        drawApi.drawCirle();
    }
}
