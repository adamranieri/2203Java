import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Range implements Iterable<Integer>{

    private int size;
    private int location = 0;

    public Range(int size) {
        this.size = size;
    }

    @Override
    public Iterator<Integer> iterator() {

        class myIterator implements Iterator<Integer>{

            @Override
            public boolean hasNext() {
                if(size<location){
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                int spot = location++;
                return spot;
            }

            @Override
            public void remove() {
                Iterator.super.remove();
            }

            @Override
            public void forEachRemaining(Consumer<? super Integer> action) {
                Iterator.super.forEachRemaining(action);
            }
        }



        return new myIterator();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }
}
