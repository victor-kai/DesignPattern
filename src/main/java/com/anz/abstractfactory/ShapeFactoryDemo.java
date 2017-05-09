package com.anz.abstractfactory;

public class ShapeFactoryDemo {

    public static void main(String[] args) {

        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory shapeFactory = FactoryProducer.produce(EnumConst.SHAPEFACTORY.name());
        AbstractFactory colorFactory = FactoryProducer.produce(EnumConst.COLORFACTORY.name());
        Shape shape = shapeFactory.shapeProduce(EnumConst.TRIANGLE.name());
        shape.draw();
        shape = shapeFactory.shapeProduce(EnumConst.RECTANGLE.name());
        shape.draw();
        shape = shapeFactory.shapeProduce(EnumConst.CIRCLE.name());
        shape.draw();

        Color color = colorFactory.colorProducer(EnumConst.BLACK.name());
        color.fill();
        color = colorFactory.colorProducer(EnumConst.BLUE.name());
        color.fill();
        color = colorFactory.colorProducer(EnumConst.RED.name());
        color.fill();
    }

}
