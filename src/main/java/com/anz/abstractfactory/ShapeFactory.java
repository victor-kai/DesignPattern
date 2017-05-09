package com.anz.abstractfactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape shapeProduce(String shape) {

        if (shape.isEmpty()) {
            return null;
        }

        if (EnumConst.TRIANGLE.name().equals(shape)) {
            return new Triangle();
        }
        if (EnumConst.RECTANGLE.name().equals(shape)) {
            return new Rectangle();
        }
        if (EnumConst.CIRCLE.name().equals(shape)) {
            return new Circle();
        }

        return null;

    }

    @Override
    Color colorProducer(String color) {
        return null;
    }
}
