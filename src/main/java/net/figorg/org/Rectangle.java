package net.figorg.org;

public class Rectangle implements Figure {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    String params;

    public Rectangle(String name,String params) {
        System.out.println("inside Rectangle");
        this.params = params;
        this.name = name;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Override
    public void square() {
        System.out.println("calculating Square of Rectangle");
    }
}
