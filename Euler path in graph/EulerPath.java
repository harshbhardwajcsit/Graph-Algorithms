/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication93;

import java.util.*;
public class EulerPath {
Map<String,Integer> map=new HashMap<String,Integer>();
int counter=0;
    void function(int graph[][]){

    for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
    if(graph[i][j]==1){counter++;}


    }
    if(counter%2==0){if(map.containsKey("even")==true){map.put("even" ,map.get("even")+1);}
    else{

    map.put("even" ,1);

    }}
    else{
    if(map.containsKey("odd")==true){map.put("odd" ,map.get("odd")+1);}
    else{

    map.put("odd" ,1);

    }}
    counter=0;
    }

    if(map.get("odd")<=2){System.out.print("Euler path exist is the graph");}
    else{System.out.print("Euler path exist is the graph");}




    }
    public static void main(String[] args) {
        EulerPath ep=new EulerPath();
        int matrix[][]={{0,1,1,1},{1,0,0,1},{1,0,0,1},{1,1,1,0}};
        ep.function(matrix);
    }


}
