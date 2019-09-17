import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //Opret LinkedList
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        System.out.println(numbers);

        //Tilføj node/element til listen
        numbers.add(1);


        System.out.println(numbers);

        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        numbers.remove(1);

        System.out.println(numbers);

        numbers.add(1, 23);
        System.out.println(numbers);

        numbers.addFirst(33);
        System.out.println(numbers);

        numbers.addLast(93993);
        System.out.println(numbers);

        int get4 = numbers.get(4);
        System.out.println("get4: " + get4);

        System.out.println(numbers.size());
// ny liste
        LinkedList<String> NewNums = new LinkedList<String>();

        NewNums.add("a");
        System.out.println(NewNums);












    }

}
