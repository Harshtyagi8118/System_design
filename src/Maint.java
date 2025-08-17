import singleResponsibility.Names;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Maint {
    public static void main(String[] args){
        List<Names> list = new ArrayList<>();
        list.add(new Names("Rohit","Mishra"));
        list.add(new Names("Harsh","Mishra"));
        list.add(new Names("Pulkit","Mishra"));
        list.add(new Names("Rohit","abc"));
        list.add(new Names("Rohit","pqr"));
        list.add(new Names("Pulkit","Sharma"));

        list.sort(Comparator.comparing(Names::getFirstName));

        int i=0;
        while(i<list.size()-1){
            if(list.get(i).getFirstName().equalsIgnoreCase(list.get(i+1).getFirstName())){
                System.out.println(list.stream().findFirst());
            }
            while(list.get(i).getFirstName().equalsIgnoreCase(list.get(i+1).getFirstName()));
        }



    }
}
