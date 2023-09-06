/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

/**
 *
 * @author Asus
 */
public class Sort extends Menu<String> {

    static String[] mc = {"Sort", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public Sort(Element element) {
        super("Sort", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSizeArray();
        array = element.getArray();
    }

    public void execute(int s) {
        switch (s) {
            case 1:
                sort();
                break;
            case 2:
                System.exit(0);
        }
    }

    public void sort() {
        final String[] mcSort = {"Buddle Sort", "Quick Sort", "Exit"};
        class SortMenu extends Menu<String> {

            public SortMenu() {
                super("Sort Option", mcSort);
            }

            @Override
            public void execute(int n) {
                System.out.println("Unsorted array: ");
                library.display(array);
                switch (n) {
                    case 1:
                        algorithm.buddleSort(array);
                        System.out.println("\nSorted array by Buddle Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 2:
                        algorithm.quickSort(array, 0, size_array - 1);
                        System.out.println("\nSorted array by Quick Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }
        }
        SortMenu sm = new SortMenu();
        sm.run();
    }
}
