import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListADT {
    //operator add
    public static void addElement(LinkedList<String> linkedList){
        linkedList.add("Mouse");
        linkedList.add("Cat");
        linkedList.add("Dog");
        System.out.println("LinkedList: " + linkedList);
    }
    public static void addElementWithIndex(LinkedList<String> linkedList, int index, String valueElement){
        linkedList.add(index, valueElement);
        System.out.println("LinkedList: " + linkedList);
    }

    //operator get
    public static void getElementByIndex(LinkedList<String> object, int index){
        String element = object.get(index);
        System.out.println("Get Element: " + element);
        System.out.println("LinkedList: " + object);
    }

    //operator set
    public static void  setElementValueByIndex(LinkedList<String> object, int index, String value){
        object.set(index, value);
        System.out.println("LinkedList: " + object);
    }

    //operator iterator(a method to iterate through each element in LinkedList)
    public static void listIteratorElement(ListIterator<String> animalIter){
        while (animalIter.hasNext()){
            System.out.print("Element value: " + animalIter.next());
            System.out.println();
        }
    }

    //remove
    public static void removeElementByIndex(LinkedList<String> object, int index){
        object.remove(index);
        System.out.println("LinkedList: " + object);
    }

    //contains
    public static void containsElementByValue(LinkedList<String> object, String value){
        boolean check = object.contains(value);
        System.out.println("Check: " + check);
    }

    //indexOf
    public static void indexOfElement(LinkedList<String> object, String value){
        int position = object.indexOf(value);
        System.out.println("Position of Element: " + position);
    }

    //lastIndexOf
    public static void lastIndexOfElement(LinkedList<String> object, String value){
        int position = object.indexOf(value);
        System.out.println("Position of Element: " + position);
    }

    //clear
    public static void clearElement(LinkedList<String> object){
        object.clear();
        System.out.println("LinkedList: " + object);
    }
}
