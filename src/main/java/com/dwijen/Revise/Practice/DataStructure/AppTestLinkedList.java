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
        sl.deleteNode(1);
        System.out.println();
        sl.printAllNodes();

        System.out.println("----------------");
        sl.deleteTop();
        sl.deleteTop();


        sl.printAllNodes();

    }

    @Test
    public void testCircularLinkedList(){

    }

    @Test
    public void testStack(){
        Stack st = new Stack(4);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.printAll();
        st.pop();
        st.printAll();
    }

}
