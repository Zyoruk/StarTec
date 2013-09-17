package edu.itcr.startec.datastructs.doublelist;

class DoubleListNode<K> {
    
    protected K elem;
    protected DoubleListNode<K> next;
    protected DoubleListNode<K> previous;
    
    public DoubleListNode(K elem) {
        this.elem = elem;
        this.next = null;
        this.previous = null;
    }
    public DoubleListNode(K elem, DoubleListNode<K> next) {
        this.elem = elem;
        this.next = next;
        this.previous = null;
    }
    
    public void setNext(DoubleListNode<K> next) {
        this.next = next;
    }
    
    public void setPrevious(DoubleListNode<K> previous) {
        this.previous = previous;
    }

    public DoubleListNode<K> getNext() {
        return this.next;
    }
    
    public DoubleListNode<K> getPrevious() {
        return this.previous;
    }
    
    public K getElem() {
        return this.elem;
    }
}