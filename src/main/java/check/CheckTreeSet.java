package check;

import java.util.TreeSet;

public class CheckTreeSet implements Checkable {

    private TreeSet<Integer> treeSetToCheck;

    public CheckTreeSet(TreeSet<Integer> treeSetToCheck) {
        this.treeSetToCheck = treeSetToCheck;
    }

    public int checkAdd(int valueToAdd) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < valueToAdd; i ++){
            treeSetToCheck.add(i);
        }
        long end = System.currentTimeMillis();
        return (int)(end - start);
    }

    @Override
    public int checkSearch(int valueToSearch) {
        long start = System.currentTimeMillis();
        boolean searchedValue = treeSetToCheck.contains(valueToSearch);
        long end = System.currentTimeMillis();
        return (int)(end - start);
    }

    @Override
    public int checkRemove(int valueToRemove) {
        long start = System.currentTimeMillis();
        treeSetToCheck.remove(valueToRemove);
        long end = System.currentTimeMillis();
        return (int)(end - start);
    }
}
