package collections_course;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listInt;

    public SomaNumeros() {
        this.listInt =  new ArrayList<>();
    }

    public void addNumber(int number){
        listInt.add(number);
    }

    public Integer calcSum(){
        Integer sum =0;
        if (!listInt.isEmpty()){
            for (Integer n : listInt){
                sum += n;
            }
        }

        return sum;
    }

    public int findLargestNumber(){
        int largestNumber = Integer.MIN_VALUE;
        if(!listInt.isEmpty()){
            for (Integer n : listInt){
                if(n >= largestNumber){
                    largestNumber = n;
                }
            }
            return largestNumber;
        }else {
            throw new RuntimeException("List is empty!");
        }
    }

    public int findSmallestNumber(){
        int largestNumber = Integer.MAX_VALUE;
        if(!listInt.isEmpty()){
            for (Integer n : listInt){
                if(n <= largestNumber){
                    largestNumber = n;
                }
            }
            return largestNumber;
        }else {
            throw new RuntimeException("List is empty!");
        }
    }

    public void displayNumber(){
        if(!listInt.isEmpty()){
            System.out.println(this.listInt);
        }else {
            System.out.println("List is empty!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.addNumber(8);
        somaNumeros.addNumber(25);
        somaNumeros.addNumber(87);
        somaNumeros.addNumber(32);

        System.out.println("Sun of numbers: "+somaNumeros.calcSum());
        System.out.println("Largest Number: "+somaNumeros.findLargestNumber());
        System.out.println("Smallest Number: "+somaNumeros.findSmallestNumber());
        somaNumeros.displayNumber();

    }


}
