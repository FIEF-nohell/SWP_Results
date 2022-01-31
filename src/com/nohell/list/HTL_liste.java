package com.nohell.list;

public class HTL_liste implements Lists{

    private Node root = null;

    @Override
    public void add(int value) {
        if(root == null){
            Node node = new Node(value);
            this.root = node;
            return;
        }

        Node pointer = this.root;
        while(pointer.getNext()!=null){
            pointer = pointer.getNext();
        }

        Node node = new Node(value);
        pointer.setNext(node);


    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int get(int index) {
        for(int i = 0; i < index; i++){
            root.getNext();
        }
        return root.getValue(index);
    }
}
