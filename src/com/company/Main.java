package com.company;


// AUTHOR : SAMRIDH SINGH
// ENROLLMENT NUMBER : E21CSEU0553
import java.util.Scanner;

class genrePrediction{
    int actionScenes;
    int comedyScenes;
    static Scanner sc = new Scanner(System.in);
    public genrePrediction(){
        actionScenes = sc.nextInt();
        comedyScenes = sc.nextInt();
        System.out.println("Number of action scenes: "+actionScenes);
        System.out.println("Number of comedy scenes: "+comedyScenes);
    }
    double calcutateDistance(int n_action, int n_comedy){
        return Math.sqrt(Math.pow(actionScenes-n_action, 2)+Math.pow(comedyScenes-n_comedy, 2));
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("samridh singh E21CSEU0553");
        for(int i=0; i<3; i++) {
            genrePrediction obj = new genrePrediction();
            double dist1 = obj.calcutateDistance(100, 0);
            double dist2 = obj.calcutateDistance(90, 17);
            double dist3 = obj.calcutateDistance(0, 100);
            double dist4 = obj.calcutateDistance(21, 80);
            if (dist1 < dist3 || dist1 < dist4 || dist2 < dist3 || dist2 < dist4) {
                System.out.println("Genre: Action");
            } else {
                System.out.println("Genre: Comedy");
            }
        }
    }
}