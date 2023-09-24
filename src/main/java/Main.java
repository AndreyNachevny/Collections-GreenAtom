import check.CheckArrayList;
import check.CheckHashSet;
import check.CheckLinkedList;
import check.CheckTreeSet;
import compare.CompareList;
import compare.CompareSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CompareList compareList = new CompareList();
        CompareSet compareSet =  new CompareSet();
        compareList.setCheckArrayList(new CheckArrayList(new ArrayList<>()));
        compareList.setCheckLinkedList(new CheckLinkedList(new LinkedList<>()));


        compareList.compareAdd();
        compareList.compareSearch();
        compareList.compareAddMid();
        compareList.compareRemove();

        System.out.println();

        compareSet.setCheckHashSet(new CheckHashSet(new HashSet<>()));
        compareSet.setCheckTreeSet(new CheckTreeSet(new TreeSet<>()));

        compareSet.compareAdd();
        compareSet.compareSearch();
        compareSet.compareRemoveMid();

        SwitchKeyValue switchKeyValue = new SwitchKeyValue();
        HashMap<Object,Object> map = new HashMap<>();
        map.put(3,10);
        map.put(25,8);
        switchKeyValue.switchKey(map,3);
        switchKeyValue.switchKey(map,25);
        System.out.println(map);
    }
}
