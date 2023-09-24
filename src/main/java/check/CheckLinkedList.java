package check;

import java.util.LinkedList;

public class CheckLinkedList implements Checkable, AddToMid {

    private LinkedList<Integer> linkedListToCheck;

    public CheckLinkedList(LinkedList<Integer> linkedListToCheck) {
        this.linkedListToCheck = linkedListToCheck;
    }

    @Override
    public int checkAdd(int valueToAdd) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < valueToAdd; i ++){
            linkedListToCheck.add(i);
        }
        long end = System.currentTimeMillis();
        return (int)(end - start);
    }

    @Override
    public int checkSearch(int valueToSearch) {
        long start = System.currentTimeMillis();
        boolean searchedValue = linkedListToCheck.contains(valueToSearch);
        long end = System.currentTimeMillis();
        return (int)(end - start);
    }

    @Override
    public int checkRemove(int valueToRemove) {
        long start = System.currentTimeMillis();
        linkedListToCheck.remove(valueToRemove);
        long end = System.currentTimeMillis();
        return (int)(end - start);
    }

    @Override
    public int addToMid(int valueToAdd) {
        int mid;
        long start = System.currentTimeMillis();
        for(int i = 0; i < valueToAdd; i ++){
            mid = linkedListToCheck.size()/2;
            linkedListToCheck.add(mid,i);
        }
        long end = System.currentTimeMillis();
        return (int)(end - start);
    }

    public LinkedList<Integer> getLinkedListToCheck() {
        return linkedListToCheck;
    }
}

