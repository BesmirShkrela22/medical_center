package com.example.medical_center.exeption;

public class GenericExeption extends RuntimeException{
    GenericExeption(String message){
        super(message);
    }
    public static GenericExeption idNotNull(){
        return new GenericExeption("Id is not null");
    }
    public static GenericExeption idIsNull(){
        return new GenericExeption("Id is  null");
    }

    public static GenericExeption notFound(Object id){
        return new GenericExeption(String.format("Record with %s does not exist",id));
    }
}
