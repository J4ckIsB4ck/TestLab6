import java.util.LinkedList;

public class Count extends LinkedList<Integer> {
    private int totalCount = 0;
    @Override
    public void addFirst(Integer integer) {
        totalCount++;
        super.addFirst(integer);
    }
    @Override
    public void addLast(Integer integer) {
        totalCount++;
        super.addLast(integer);
    }
    @Override
    public boolean add(Integer integer) {
        totalCount++;
        return super.add(integer);
    }
    @Override
    public boolean addAll(java.util.Collection<? extends Integer> c) {
        totalCount += c.size();
        return super.addAll(c);
    }
    public int getTotalCount() {
        return totalCount;
    }
}