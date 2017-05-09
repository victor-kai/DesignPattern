package com.anz.factory;

public class ShapeFactoryDemo {

    private static ShapeFactory shapeFactory = new ShapeFactoryImpl();

    public static void main(String[] args) {

        Shape shape = shapeFactory.produce(ShapeConst.CIRCLE.name());
        shape.draw();
        shape = shapeFactory.produce(ShapeConst.RECTANGLE.name());
        shape.draw();
        shape = shapeFactory.produce(ShapeConst.TRIANGLE.name());
        shape.draw();
    }

}
