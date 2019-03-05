package com.company;
import java.io.IOException;
import java.util.*;

import static java.lang.Math.abs;

//tablice, arrayList, Stosy, kolejki, zbiory, iteracja

public class Main{
    private static void printList(ArrayList <String> List){
        for (String element : List){
            System.out.println(element);
        }
    }
    public static void main(String[] args)throws IOException{

        //tablice
        int[] Array = new int[10];
        Random generator = new Random();
        for (int i = 0; i < Array.length; i++) {

            Array[i] = generator.nextInt() % 100;
        }

        int max = Array[0];
        for (int i = 1; i <= 10; i++) {     //celowy błąd
            try {
                if (max < Array[i]) {
                    max = Array[i];
                }
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        System.out.println("Największa wartość: " + max);
        int[] InitializedIntArray = new int[]{7, 13, 5, 10, 28};
        int total = 0;
        for (int value : InitializedIntArray) {     //enhanced for

            total += value;
        }

        System.out.println("Suma: " + total);

        int[][] TriangleArray = new int[5][];
        for (int i = 0; i<5; i++){
            TriangleArray[i] = new int [i];
        }
        System.in.read();

        ArrayList <String> List = new ArrayList<>();
        List.add("Kasia");
        List.add("ma");
        List.add("owieczki");
        List.add("dwie");
        printList(List);
        System.in.read();
        List.remove(1);
        printList(List);
        System.in.read();
        List.remove("dwie");
        printList(List);
        System.out.println('\n');
        Stack <Integer> Stos = new Stack<>();
        for (int i=0; i<10; i++){
            Stos.push(i+4);
        }
        System.out.println("Stos:" + Stos);
        System.out.println("Wartość na szczycie stosu:" + Stos.peek());
        System.out.println("10 znajduje się na pozycji: " + Stos.search(10));
        while (!Stos.empty()){
            System.out.println("Zdejmowana wartość: " + Stos.pop());
        }
        System.in.read();

        Set setA = new HashSet();       //bez gwarancji zachowania kolejności
        Set setB = new LinkedHashSet(); //bez gwarancji zachowania kolejności
        Set setC = new TreeSet();       //według kolejności sortowania
        for (int i=0; i<20; i++){
            setA.add(i%5);
            setB.add( 'a' + (i%('f'-'a')));
            setC.add(abs(generator.nextInt()%20));
        }

        Iterator iteratorA = setA.iterator();
        System.out.println("HashSet:");
        while (iteratorA.hasNext()){
            System.out.println(iteratorA.next());
        }
        System.in.read();
        System.out.println("LinkedHashSet:");
        Iterator iteratorB = setB.iterator();
        while (iteratorB.hasNext()){
            System.out.println(iteratorB.next());
        }
        System.in.read();
        System.out.println("TreeSet:");
        Iterator iteratorC = setC.iterator();
        while (iteratorC.hasNext()){
            System.out.println(iteratorC.next());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nazwij obiekt klasy:");
        String Name = scanner.nextLine();
        SecondClass TestClass = new SecondClass(Name);
        TestClass.print();

    }
}