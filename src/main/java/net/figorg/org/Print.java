package net.figorg.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Print {

    Figure figure;

    public Print() {
        System.out.println("inside Print");
    }

    public void setFigure(Figure figure){
        System.out.println("inside setFigure");
        this.figure = figure;
    };

    void print(){
        System.out.println(this.figure);
    };

}
