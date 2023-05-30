package Lecture.Graph.Lecture;
import java.util.*;

public class Graph<T extends Comparable<T>, N extends Comparable<N>> {
    Vertex<T,N> head;
    int size;

    public Graph(){
        head = null;
        size =0;
    }

    //get number of vertices
    public int getSize(){
        return size;
    }

    // has vertex - check whether the vertex are in a graph or not
    public boolean hasVertex(T v){
        if(head==null)
            return false;
        Vertex<T,N> temp = head;
        while(temp!=null){
            if( temp.vertexInfo.compareTo(v)==0)
                return true;
        temp = temp.nextVertex;
        }
    return false;
    }

    //
    public int getIndeg(T v){
        if (hasVertex(v)== true){
            Vertex<T,N> temp = head;
            while(temp!=null){
                if(temp.vertexInfo.compareTo(v)==0){
                    return temp.indeg;
                }
                temp=temp.nextVertex;
            }
        }
        return -1;
    }

    //adding vertex to the graph
    public boolean addVertex(T v){
        if(hasVertex(v)==false)  {
            Vertex<T,N> temp=head;
            Vertex<T,N> newVertex = new Vertex<>(v, null);
            if(head==null)
                head=newVertex;
            else{
                Vertex<T,N> previous = head;;
                while(temp!=null){
                    previous=temp;
                    temp=temp.nextVertex;
                }
                previous.nextVertex=newVertex;
            }
            size++;
            return true;
        }
        else
        return false;
    }
    
    //getting the index of the vertex
    public int getIndex(T v){
        Vertex<T,N> temp = head;
        int pos =0;
        while(temp!=null){
            if(temp.vertexInfo.compareTo(v)==0)
                return pos;
                temp=temp.nextVertex;
                pos+=1;
        }
        return -1;
    }

    //return all vertex as an arraylist
    public ArrayList<T> getAllVertexObjects(){
        ArrayList<T> list = new ArrayList<>();
        Vertex<T,N> temp = head;
        while(temp!=null){
            list.add(temp.vertexInfo);
            temp = temp.nextVertex;
        }
        return list;
    }

     //get vertex at a specific position of the index
    public T getVertex(int pos) {
        if(pos>size-1 || pos<0)
            return null;
        Vertex<T,N> temp = head;
        for (int i=0; i<pos; i++){
            temp= temp.nextVertex;
        }
        return temp.vertexInfo;
    }

    //check whether the vertex has an edge or not
    public boolean hasEdge(T source, T destination){
        if(head==null)
            return false;
        if(!hasVertex(source)|| !hasVertex(destination))
            return false;
        Vertex<T,N> sourceVertex = head;
        while(sourceVertex!=null){
            if(sourceVertex.vertexInfo.compareTo(source)==0)    {
                //Reached source vertex, look for destination now
                Edge<T,N> currentEdge = sourceVertex.firstEdge;
                while(currentEdge != null){
                    if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0)
                    //destination vertex found
                        return true;
                    currentEdge = currentEdge.nextEdge;
                }
            }
            sourceVertex  = sourceVertex.nextVertex;
        }
        return false;
    }

    //adding new edge from a source destination with a weight
    public boolean addEdge(T source, T destination, N w)    {
        if(head==null)
            return false;
        if(!hasVertex(source)|| !hasVertex(destination))
            return false;
        Vertex<T,N> sourceVertex = head;
        while( sourceVertex!=null){
            if( sourceVertex.vertexInfo.compareTo(source)==0)   {
                //reached source vertex, look for destination now
                Vertex<T,N> destinationVertex = head;
                while(destinationVertex!=null){
                    if(destinationVertex.vertexInfo.compareTo(destination) == 0)    {
                        //reached destination vertex, add edge here
                        Edge<T,N> currentEdge = sourceVertex.firstEdge;
                        Edge<T,N> newEdge = new Edge<>(destinationVertex, w, currentEdge);
                        sourceVertex.firstEdge=newEdge;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        return true;
                    }
                    destinationVertex = destinationVertex.nextVertex;
                }
            }
            sourceVertex=sourceVertex.nextVertex;
        }
        return false;
    }

    //retrieveing the weight of an edge
    public N getEdgeWeight(T source, T destination) {
        N notFound=null;
        if(head==null)
            return notFound;
        if(!hasVertex(source)||!hasVertex(destination))
            return notFound;
        Vertex<T,N> sourceVertex = head;
        while (sourceVertex!=null){
            if(sourceVertex.vertexInfo.compareTo(source)==0)    {
                //Reached source vertex, look for destination now
                Edge<T,N> currentEdge = sourceVertex.firstEdge;
                while(currentEdge != null)  {
                    if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0)
                    //destination vertex found
                    return currentEdge.weight;
                currentEdge = currentEdge.nextEdge;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return notFound;
    }

    //printing the graph
    public void printEdges()    {
        Vertex<T,N> temp = head;
        while (temp!=null) {
            System.out.print("# " + temp.vertexInfo  + " : ");
            Edge<T,N> currentEdge = temp.firstEdge;
            while(currentEdge !=null)   {
                System.out.print("[" + temp.vertexInfo + ","
                    + currentEdge.toVertex.vertexInfo + "] ");
                currentEdge = currentEdge.nextEdge;
            }
            System.out.println();
            temp=temp.nextVertex;
        }
    }
    
}
