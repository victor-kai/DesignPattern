package com.anz.factory;

public class ShapeFactoryImpl implements ShapeFactory {

    @Override
    public Shape produce(String shape) {

        if (shape.isEmpty()) {
            return null;
        }

        if (ShapeConst.TRIANGLE.name().equals(shape)) {
            return new Triangle();
        }
        if (ShapeConst.RECTANGLE.name().equals(shape)) {
            return new Rectangle();
        }
        if (ShapeConst.CIRCLE.name().equals(shape)) {
            return new Circle();
        }

        return null;

    }
}
