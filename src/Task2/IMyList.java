package Task2;

public interface IMyList<T> {

   T[] Add(Object item);

   int NumberAllElements();

   T Indexer(int index);
}
