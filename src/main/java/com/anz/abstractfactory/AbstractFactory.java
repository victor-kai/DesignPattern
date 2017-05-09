package com.anz.abstractfactory;

public abstract class AbstractFactory {

    abstract Shape shapeProduce(String shape);

    abstract Color colorProducer(String color);
}
