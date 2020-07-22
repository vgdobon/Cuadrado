package com.hiberus;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Cuadrado [PENDIENTE]
//Crear una clase Cuadrado que tenga:
//- Constructor
//- Constructor (width, height)
//- Constructor (x, y, x1, y1)
//- Accesores
//- getPerimeter()
//- getArea()
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es la coordenada x inicial");
        int x=sc.nextInt();

        System.out.println("Cual es la coordenada y inicial");
        int y=sc.nextInt();

        System.out.println("Cual es la coordenada x final");
        int x1=sc.nextInt();

        System.out.println("Cual es la coordenada y final");
        int y1=sc.nextInt();

        Cuadrado cuadrado=new Cuadrado(x,y,x1,y1);
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        System.out.println("El área del cuadrado es: "+cuadrado.getArea());
        System.out.println("El périmetro del cuadrado es:"+cuadrado.getPerimetro());


    }


}
