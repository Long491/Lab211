/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Common.Library;
import Controller.Sort;
import Model.Element;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setSizeArray(library.getNumber("Enter number of array", 1, 100));
        //2. Create array by generate random integer in range
        element.setArray(library.createArray(element.getSizeArray()));
        new Sort(element).run();
    }
}
