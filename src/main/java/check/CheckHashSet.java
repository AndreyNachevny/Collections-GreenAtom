package check;

import java.util.HashSet;

public class CheckHashSet implements Checkable {

    private HashSet<Integer> hashSetToCheck;

    public CheckHashSet(HashSet<Integer> hashSetToCheck) {
        this.hashSetToCheck = hashSetToCheck;
    }

    public int checkAdd(int valueToAdd) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < valueToAdd; i ++){
            hashSetToCheck.add(i);
        }
        long end = System.currentTimeMillis();
        return (int)(end - start);
    }

    @Override
    public int checkSearch(int valueToSearch) {
        long start = System.currentTimeMillis();
        boolean searchedValue = hashSetToCheck.contains(valueToSearch);
        long end = System.currentTimeMillis();
        return (int)(end - start);
    }

    @Override
    public int checkRemove(int valueToRemove) {
        long start = System.currentTimeMillis();
        hashSetToCheck.remove(valueToRemove);
        long end = System.currentTimeMillis();
        return (int)(end - start);
    }
}
