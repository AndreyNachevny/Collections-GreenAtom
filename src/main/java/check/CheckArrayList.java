package check;

import java.util.ArrayList;

public class CheckArrayList implements Checkable, AddToMid {

    private ArrayList<Integer> arrayToCheck;

    public CheckArrayList(ArrayList<Integer> arrayToCheck) {
        this.arrayToCheck = arrayToCheck;
    }

    @Override
    public int checkAdd(int valueToAdd) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < valueToAdd; i ++){
            arrayToCheck.add(i);
        }
        long end = System.currentTimeMillis();
        return  (int)(end - start);
    }

    @Override
    public int checkSearch(int valueToSearch) {
        long start = System.currentTimeMillis();
        boolean searchedValue = arrayToCheck.contains(valueToSearch);
        long end = System.currentTimeMillis();
        return (int)(end - start);
    }

    @Override
    public int checkRemove(int valueToRemove) {
        long start = System.currentTimeMillis();
        arrayToCheck.remove(valueToRemove);
        long end = System.currentTimeMillis();
        return (int)(end - start);
    }

    @Override
    public int addToMid(int valueToAdd) {
        int mid;
        long start = System.currentTimeMillis();
        for(int i = 0; i < valueToAdd; i ++){
            mid = arrayToCheck.size()/2;
            arrayToCheck.add(mid,i);
        }
        long end = System.currentTimeMillis();
        return (int )(end - start);
    }

}
