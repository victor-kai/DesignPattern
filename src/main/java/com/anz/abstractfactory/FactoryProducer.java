package com.anz.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory produce(String factoryname) {

        if (factoryname.isEmpty()) {
            return null;
        }

        if (EnumConst.COLORFACTORY.name().equals(factoryname)) {
            return new ColorFactory();
        }

        if (EnumConst.SHAPEFACTORY.name().equals(factoryname)) {
            return new ShapeFactory();
        }

        return null;
    }

}
