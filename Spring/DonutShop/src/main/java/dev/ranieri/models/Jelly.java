package dev.ranieri.models;

public class Jelly {

    private String flavor;

    public Jelly(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Jelly{" +
                "flavor='" + flavor + '\'' +
                '}';
    }
}
