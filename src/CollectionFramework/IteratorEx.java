package CollectionFramework;

import com.sun.management.UnixOperatingSystemMXBean;

import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("James");
        names.add("Joe");
        names.add("Sara");
        names.add("Ben");
        names.add("Adam");
        System.out.println(names);
        Iterator<String> it = names.iterator();
//        it.next();//James
//        it.next();//Sara
        while( it.hasNext()){
            String name = it.next();
            System.out.println(name);
            if(name.equals("Ben")){
                it.remove();

            }
        }
        System.out.println(names);

    }

}
