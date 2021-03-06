package com.phantomhunter;

public class Stack {
    private int mSize;
    private int [] stackArray;
    private int top;

    public Stack(int mSize) {
        this.mSize = mSize;
        stackArray = new int[mSize];
        top = -1;
    }
    public void addElement(int element){
        stackArray[++top] = element;
    }
    public int deleteElement(){
        return stackArray[top--];
    }
    public int readTop(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == mSize-1);
    }
}

