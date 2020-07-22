package com.hiberus;

public class Cuadrado {

    private int x;
    private int y;
    private int y1;
    private int x1;
    private int width;
    private int height;
    private int area;
    private int perimetro;



    public Cuadrado(int x,int y,int x1,int y1){
        this.setX(x);
        this.setY(y);
        this.setX1(x1);
        this.setY1(y1);
        this.width=Math.abs(x-x1);
        this.height=Math.abs(y-y1);
    }

    public int calcularArea(){
        this.setArea(this.getHeight()*this.getWidth());
        return this.getArea();
    }

    public int calcularPerimetro(){
        this.setPerimetro(this.getHeight()*2 + this.getWidth()*2);
        return this.getPerimetro();
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
}
