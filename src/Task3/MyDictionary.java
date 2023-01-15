package Task3;

public class MyDictionary implements IMyDictionary{

    int[][] dictionary;

    public MyDictionary() {
    }

    public MyDictionary(int[][] dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public int[] ADD() {
       if(this.dictionary == null)
           return null;
       int[] sumDictionary = new int[dictionary.length];
       for (int i = 0; i < sumDictionary.length; i++) {
           sumDictionary[i] = dictionary[i][0] +  dictionary[i][1];
       }
       return sumDictionary;
    }

    @Override
    public int NumberAllElements() {
        if(dictionary == null)
            return 0;
        return dictionary.length;
    }

    @Override
    public int[] Indexer(int index) {
        if(dictionary == null || index >= dictionary.length)
            return null;
        return dictionary[index];
    }
}
