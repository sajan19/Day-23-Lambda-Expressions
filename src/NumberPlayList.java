import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class NumberPlayList {
    public static void main(String[] args) {
        //Creating Sample Collection
        List<Integer> myNumberList =  new ArrayList<Integer>();
        for (int i =0; i<5; i++)myNumberList.add(i);
        //Method 1: Traversing using Iterator
        Iterator<Integer>it = myNumberList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Method1: Iterator Value:: "+i);
        }
        //Method 2: Traversing with Explicit Consumer interface implementation
        class MyConsumer implements Consumer<Integer> {
            public void accept(Integer t){
                System.out.println("Method2: Consumer impl Value: "+t);
            }
        }
        MyConsumer action = new MyConsumer();
        myNumberList.forEach(action);
        //Method 3: Traversing with Anonymous Consumer interface Implementations
        myNumberList.forEach(new Consumer<Integer>() {
            public void accept(Integer t){
                System.out.println("method3: forEach anonymous class Value:: "+t);
            }
        });
        //Method 4: Explicit Lambda Function
        Consumer<Integer> myListAction = n -> {
            System.out.println("Method4: forEach Lambda impl Value: "+ n);
        };
        myNumberList.forEach(myListAction);
        //Method 5: Implicit Lambda Function
        myNumberList.forEach(n ->{
            System.out.println("Mehtod5: forEach Lambda impl Value:: "+n);
        });
    }
}
