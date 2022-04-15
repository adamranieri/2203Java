package dev.ranieri.exceptions;

public class ResourceNotFound extends RuntimeException{

    public ResourceNotFound(int id){
        super("The resource with id " + id+ "was not found");
    }
}
