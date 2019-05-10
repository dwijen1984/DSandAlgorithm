package com.dwijen.Revise.Practice.DataStructure;

import org.junit.Test;

public class AppTestLinkedList {

    @Test
    public void testSinglyLinkedList(){
        SinglyLinkedList sl = new SinglyLinkedList();

        sl.addTop(4);
        sl.addTop(3);
        sl.addTop(2);
        sl.addTop(1);
        sl.printAllNodes();

        sl.deleteTop();
        sl.deleteTop();


        sl.printAllNodes();

    }

}
