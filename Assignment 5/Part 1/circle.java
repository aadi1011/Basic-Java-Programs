public class circle implements shape {
    
    float circleArea, circlePerimeter, radius;

    public circle (float radius) {
        this.radius = radius;
    }
    //Override annotation is used to ensure that you are overriding method of your parent class
    @Override
    public float calculateArea() {
        circleArea = pi * radius * radius;
        return circleArea;
    }
    
    @Override
    public float calculatePerimeter() {
        circlePerimeter = 2 * pi * radius;
        return circlePerimeter;
    }

    public String toString(){
        return "Radius: " + radius + " \nArea: " + circleArea + " \nPerimeter: " + circlePerimeter;
    }
}


