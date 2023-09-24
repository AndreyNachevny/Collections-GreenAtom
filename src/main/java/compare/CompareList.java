package compare;

import check.*;

public class CompareList {

    private CheckArrayList checkArrayList;

    private CheckLinkedList checkLinkedList;

    public void compareAdd(){
        int arrayAdd = checkArrayList.checkAdd(100_000_0);
        int linkedAdd= checkLinkedList.checkAdd(100_000_0);
        System.out.println("Time at millisecond add to ArrayList to end: " + arrayAdd);
        System.out.println("Time at millisecond add to LinkedList to end: " + linkedAdd);
    }

    public void compareSearch(){
        int arrayAdd = checkArrayList.checkSearch(214352);
        int linkedAdd= checkLinkedList.checkSearch(214352);
        System.out.println("Time at millisecond search from ArrayList: " + arrayAdd);
        System.out.println("Time at millisecond search from LinkedList: " + linkedAdd);
    }

    public void compareRemove(){
        int arrayAdd = checkArrayList.checkRemove(214352);
        int linkedAdd= checkLinkedList.checkRemove(214352);
        System.out.println("Time at millisecond remove from ArrayList: " + arrayAdd);
        System.out.println("Time at millisecond remove from LinkedList : " + linkedAdd);
    }

    public void compareAddMid(){
        int arrayAdd = checkArrayList.addToMid(500);
        int linkedAdd= checkLinkedList.addToMid(500);
        System.out.println("Time at millisecond add to mid to ArrayList: " + arrayAdd);
        System.out.println("Time at millisecond add to mid to LinkedList: " + linkedAdd);
    }

    public void setCheckArrayList(CheckArrayList checkArrayList) {
        this.checkArrayList = checkArrayList;
    }

    public void setCheckLinkedList(CheckLinkedList checkLinkedList) {
        this.checkLinkedList = checkLinkedList;
    }

}
