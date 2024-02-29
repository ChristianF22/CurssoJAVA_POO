package POO_Exemplo3.entities;

public class Retangulo {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
       double p = 2 * (width + height) ;
        return p;
    }

    public double diagonal(){
        return Math.sqrt(width * width + height * height);
    }
}
