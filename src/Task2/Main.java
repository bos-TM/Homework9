package Task2;

public class Main {
    public static void main(String[] args) {
        MyList<String> elemString = new MyList<>();
        MyList<Integer> elemNumber = new MyList<>();
        elemString.Add("Hello");
        elemString.Add("World");
        elemString.Add("Nice");
        System.out.println(elemString);
        System.out.println("Кількість елементів: " + elemString.NumberAllElements());

        elemNumber.Add(12);
        elemNumber.Add(77);
        elemNumber.Add(43);
        elemNumber.Add(4);
        System.out.println(elemNumber);


        System.out.println(elemString.Indexer(0));
        System.out.println(elemNumber.Indexer(1));
        System.out.println(elemString.Indexer(2));

        System.out.println("Кількість елементів: " + elemNumber.NumberAllElements());
    }
}
