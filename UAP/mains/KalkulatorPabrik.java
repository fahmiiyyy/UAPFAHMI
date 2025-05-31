package PRAKTIKUM.UAP.mains;

import PRAKTIKUM.UAP.models.Sphere;
import PRAKTIKUM.UAP.models.Torus;
import java.util.Scanner;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("FAHMI MUHAMMAD FAYID DHINANTA");
        System.out.println("245150700111018");
        System.out.println("=============================================");
        
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double major = input.nextDouble();
        System.out.print("Isikan radius   : ");
        double minor = input.nextDouble();
        System.out.println("=============================================");

        Torus torus = new Torus(major, minor);
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = input.nextDouble();
        System.out.println("=============================================");

        Sphere sphere = new Sphere(radius);
        sphere.printInfo();
        System.out.println("=============================================");
        input.close();
    }
}

