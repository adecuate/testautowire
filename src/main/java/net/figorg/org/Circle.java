package net.figorg.org;

public class Circle implements Figure {

    String name;
    String params;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Circle(String name,String params) {
        System.out.println("inside Circle");
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
        System.out.println(" calculating Square of Circle");
    }
}
