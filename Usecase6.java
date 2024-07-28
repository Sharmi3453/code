import java.util.ArrayList;
import java.util.List;

interface Graphic {
    void draw();
}

class Circle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Graphic {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class CompositeGraphic implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();

    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }

    @Override
    public void draw() {
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}

public class Usecase6 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Square square1 = new Square();

        CompositeGraphic composite1 = new CompositeGraphic();
        composite1.add(circle1);
        composite1.add(square1);

        CompositeGraphic composite2 = new CompositeGraphic();
        composite2.add(circle2);
        composite2.add(composite1);

        composite2.draw();
    }
}
