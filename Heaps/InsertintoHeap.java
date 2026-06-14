import java.util.*;

public class InsertintoHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x = arr.size() -1;
            int par = (arr.size() - 2)/2;

            while(arr.get(x) < arr.get(par)){
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1) / 2;
            }
        }
    }

    public static void main(String[] args) {
        Heap h1 = new Heap();
        h1.add(1);
        h1.add(3);
        h1.add(0);

    }
}
