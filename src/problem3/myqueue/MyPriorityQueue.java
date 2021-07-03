/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

import java.util.*;

public class MyPriorityQueue {
    private Node front;
    private Node rear;
    private int size;

    public MyPriorityQueue(){
        front=null;
        rear=null;
        size=0;
    }
    public boolean isEmpty(){
        boolean response=false;
        if(front!=null || size!=0){
            response=true;
        }
        return response;
    }

    public Node dequeue(){
        Node response=null;
        if(isEmpty()){
            if(front.getNext()!=null){
                response=new Node(front.getRoll());
                front=front.getNext();
                rear.setNext(front);
                size--;
            }
            else {
                response=new Node(front.getRoll());
                front=null;
                rear=null;
                size--;
            }
        }
        return response;
    }

    public void  enqueue(int data){
        Node node=new Node(data);
        if(front==null){
            front=node;
            rear=node;
            size++;
            System.out.println("Roll Entered successfully!");
        }
        else if(data<=front.getRoll()){
            node.setNext(front);
            front=node;
            size++;
            System.out.println("Roll Entered successfully");
        }
        else if(data>=rear.getRoll()){
            node.setNext(front);
            rear.setNext(node);
            rear=node;
            System.out.println("Roll Entered successfully");
            size++;
        }
        else {
            Node temp = front;
            Node previous=temp;
            while(temp.getNext().getNext()!=null){

                if(data<=temp.getRoll()){
                    previous.setNext(node);
                    node.setNext(temp);
                    size++;
                    System.out.println("Roll Entered successfully");
                    break;
                }
                previous=temp;
                temp=temp.getNext();
            }
        }
    }

    //Traversing
    public void traversing(){
        if(front!=null) {
            Node temp = front;
            int temp1=size;
            while (temp1!=0) {
                System.out.print(temp.getRoll() + " ");
                temp = temp.getNext();
                temp1--;
            }
            System.out.println();
        }
        else {
            System.out.println("sorry! Queue is empty.");
        }
    }

    public int getSize() {
        return size;
    }

    }


