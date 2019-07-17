import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> inputArr = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr7 = new ArrayList<>();
        ArrayList<Integer> arr21 = new ArrayList<>();
        while(true){
            boolean notEmpty = false;
            System.out.println("Введите команду:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if(input.contains("init")){
                input = input.replace("init ", "");
                String[] arr = input.split(" ", 0);
                for(int i = 0; i < arr.length; i++){
                    inputArr.add(Integer.parseInt(arr[i]));
                }
                for (int i = 0; i < inputArr.size(); i++) {
                    if (inputArr.get(i) % 3 == 0) {
                        arr3.add(inputArr.get(i));
                        Collections.sort(arr3);
                        Collections.reverse(arr3);
                    }
                    if (inputArr.get(i) % 7 == 0) {
                        arr7.add(inputArr.get(i));
                        Collections.sort(arr7);
                        Collections.reverse(arr7);
                    }
                    if (inputArr.get(i) % 21 == 0) {
                        arr21.add(inputArr.get(i));
                        Collections.sort(arr21);
                        Collections.reverse(arr21);
                    }
                }
            } else if(input.contains("print")){
                if(input.contains("X")){
                    for (int i = 0; i < arr3.size(); i++){
                        System.out.print(arr3.get(i) + " ");
                    }
                    System.out.println();
                } else if(input.contains("S")){
                    for (int i = 0; i < arr7.size(); i++){
                        System.out.print(arr7.get(i) + " ");
                    }
                    System.out.println();
                } else if(input.contains("M")){
                    for (int i = 0; i < arr21.size(); i++){
                        System.out.print(arr21.get(i) + " ");
                    }
                    System.out.println();
                } else{
                    for (int i = 0; i < arr3.size(); i++){
                        System.out.print(arr3.get(i) + " ");
                    }
                    System.out.println();
                    for (int i = 0; i < arr7.size(); i++){
                        System.out.print(arr7.get(i) + " ");
                    }
                    System.out.println();
                    for (int i = 0; i < arr21.size(); i++){
                        System.out.print(arr21.get(i) + " ");
                    }
                    System.out.println();
                }
            } else if(input.contains("anyMore")){
                for (int i = 0; i < inputArr.size(); i++){
                    if ((!(inputArr.get(i) % 3 == 0)) && (!(inputArr.get(i) % 7 == 0)) && (!(inputArr.get(i) % 21 == 0))){
                        notEmpty = true;
                    }
                }
                System.out.println(notEmpty);
            } else if(input.contains("clear")){
                if(input.contains("X")){
                    arr3.clear();
                    System.out.println("Список X очишен");
                } else if(input.contains("S")){
                    arr7.clear();
                    System.out.println("Список S очишен");
                } else if(input.contains("M")){
                    arr21.clear();
                    System.out.println("Список M очишен");
                }
            } else if(input.contains("merge")){
                Collections.sort(inputArr);
                Collections.reverse(inputArr);
                for (int i = 0; i < inputArr.size(); i++){
                    System.out.print(inputArr.get(i) + " ");
                }
                arr3.clear();
                arr7.clear();
                arr21.clear();
                inputArr.clear();
                System.out.println("Все списки очишены");
            } else if(input.contains("help")){
                System.out.println("init array	- инициализация списков набором значений array");
                System.out.println("print 		- печать всех списков ");
                System.out.println("print type 	- печать конкретного списка, где type принимает значения X,S,M");
                System.out.println("anyMore		- выводит на экран были ли значения не вошедшие ни в один список, возможные значения true, false");
                System.out.println("clear type	- чистка списка , где type принимает значения X,S,M");
                System.out.println("merge		- слить все списки в один вывести на экран и очистить все списки");
                System.out.println("help		- вывод справки по командам ");
            } else {
                System.out.println("Неизвестная команда, напишите help для справки.");
            }
            System.out.println();
        }
    }
}
