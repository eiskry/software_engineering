package task4;

public interface Subject<E> {
    public void addObserver(Observer<E> o);
    public void notifyObservers();
}