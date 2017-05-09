package com.anz.abstractfactory;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape shapeProduce(String shape) {

        return null;
    }

    @Override
    public Color colorProducer(String color) {

        if (color.isEmpty()) {
            return null;
        }

        if (EnumConst.BLACK.name().equals(color)) {
            return new Black();
        }
        if (EnumConst.BLUE.name().equals(color)) {
            return new Blue();
        }
        if (EnumConst.RED.name().equals(color)) {
            return new Red();
        }

        return null;
    }
}
