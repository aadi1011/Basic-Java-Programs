package ShapesInterface;

public class square implements shape {
    
    float squareArea, squarePerimeter, side;

    public square (float side) {
        this.side = side;
    }

    //Override annotation is used to ensure that you are overriding method of your parent class
    @Override
    public float calculateArea() {
        squareArea = side * side;
        return squareArea;
    }
    
    @Override
    public float calculatePerimeter() {
        squarePerimeter = 4 * side;
        return squarePerimeter;
    }

    public String toString(){
        return "side: " + side + " \nArea: " + squareArea + " \nPerimeter: " + squarePerimeter;
    }
}
