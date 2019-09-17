import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo{
    public static void main(String[] arg){
        ArrayList<String> al=new ArrayList<String>();
        al.add("111");
        al.add("def");
        Iterator<String> it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}