public class rectangle implements shape {
    
    float rectangleArea, rectanglePerimeter, length, breadth;

    public rectangle (float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    //Override annotation is used to ensure that you are overriding method of your parent class
    @Override
    public float calculateArea() {
        rectangleArea = length * breadth;
        return rectangleArea;
    }
    
    @Override
    public float calculatePerimeter() {
        rectanglePerimeter = 2 * (length + breadth);
        return rectanglePerimeter;
    }

    public String toString(){
        return "length: " + length + "\nbreadth: " + length + " \nArea: " + rectangleArea + " \nPerimeter: " + rectanglePerimeter;
    }
}
