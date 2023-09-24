package compare;

import check.CheckHashSet;
import check.CheckTreeSet;

public class CompareSet {

    private CheckHashSet checkHashSet;

    private CheckTreeSet checkTreeSet;


    public void compareAdd() {
        int arrayAdd = checkHashSet.checkAdd(100_000_0);
        int linkedAdd = checkTreeSet.checkAdd(100_000_0);
        System.out.println("Time at millisecond add to HashSet to end: " + arrayAdd);
        System.out.println("Time at millisecond add to TreeSet to end: " + linkedAdd);
    }

    public void compareSearch() {
        int arrayAdd = checkHashSet.checkSearch(55567);
        int linkedAdd = checkTreeSet.checkSearch(55567);
        System.out.println("Time at millisecond search from HashSet: " + arrayAdd);
        System.out.println("Time at millisecond search from TreeSet: " + linkedAdd);
    }

    public void compareRemoveMid() {
        int arrayAdd = checkHashSet.checkRemove(55567);
        int linkedAdd = checkTreeSet.checkRemove(55567);
        System.out.println("Time at millisecond remove from HashSet: " + arrayAdd);
        System.out.println("Time at millisecond remove from TreeSet : " + linkedAdd);
    }

    public void setCheckHashSet(CheckHashSet checkHashSet) {
        this.checkHashSet = checkHashSet;
    }

    public void setCheckTreeSet(CheckTreeSet checkTreeSet) {
        this.checkTreeSet = checkTreeSet;
    }
}
