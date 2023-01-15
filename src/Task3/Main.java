package Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyDictionary myDict =  new MyDictionary();
        myDict.dictionary = new int[][]{{1, 2}, {2, 3}, {8, 3}, {12, 23}, {44, 7}};

        for (int[] elem: myDict.dictionary) {
            System.out.println(Arrays.toString(elem));
        }

        System.out.println("Результат додавання пар елементів: " + Arrays.toString(myDict.ADD()));

        int index = 2;
        System.out.println("По індексу " + index +
                " знаходиться наступна пара елементів: " +
                Arrays.toString(myDict.Indexer(index)));

        System.out.println("Загальна кількість пар елементів: " + myDict.NumberAllElements());
    }
}
