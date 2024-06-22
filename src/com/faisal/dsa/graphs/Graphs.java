package com.faisal.dsa.graphs;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Implementation of  bi-directional graphs
 */
public class Graphs {
    ArrayList<ArrayList<Integer>> graphs;
    int noOfNodes;

    Graphs(int nodes){
        noOfNodes=nodes;
        graphs=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<nodes;i++){
            graphs.add(new ArrayList<>());
        }

    }
    public void addVertex(int u,int v){
        graphs.get(u).add(v);
        graphs.get(v).add(u);
    }
    public void printGraphs(){
        for(int i=1;i<noOfNodes;i++){
            System.out.print("The nodes is "+i);
            for(int x:graphs.get(i)){
                System.out.print("-->"+x);
            }
            System.out.println();
        }
    }
}

class GraphsTest{
    public static void main(String args[]){
        Graphs graph=new Graphs(8);
        graph.addVertex(4,3);
        graph.addVertex(3,1);
        graph.addVertex(2,6);
        graph.printGraphs();
    }
}


