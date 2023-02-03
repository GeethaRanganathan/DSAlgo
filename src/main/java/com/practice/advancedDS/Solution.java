package com.practice.advancedDS;
import java.util.*;

public class Solution {

    class Edge implements Comparable<Edge> {
        Integer vertex;
        Integer weight;

        Edge(Integer vertex, Integer weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj) return true;
            if(obj instanceof Edge) {
                Edge s = (Edge) obj;
                return this.vertex == s.vertex;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return vertex + weight;
        }

        @Override
        public int compareTo(Edge other)
        {
            return this.weight.compareTo(other.weight);
        }

        public String toString() {
            return "v: " + vertex + "; w: " + weight;
        }
    }

    private ArrayList<ArrayList<Edge>> initializedGraph(Integer size) {
        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i < size; i++) {
            graph.add(new ArrayList<Edge>());
        }
        return graph;
    }

    private void populateGraph(ArrayList<ArrayList<Integer>> B,ArrayList<ArrayList<Edge>> graph) {
        for (ArrayList<Integer> input: B) {
            graph.get(input.get(0)).add(new Edge(input.get(1), input.get(2)));
            // undirected graph
            graph.get(input.get(1)).add(new Edge(input.get(0), input.get(2)));
        }
    }

    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B, int C) {
        ArrayList<ArrayList<Edge>> graph = initializedGraph(A);
        populateGraph(B,graph);

        ArrayList<Integer> D = new ArrayList<>();
        Deque<Edge> queue = new ArrayDeque<>();
        HashSet<Integer> visited = new HashSet<>();

        for (int i = 0;i< A;i++) {
            if (i == C) {
                D.add(0);
            } else {
                D.add(Integer.MAX_VALUE);
            }
        }
        queue.offer(new Edge(C, 0));
        dijsktraAlgo(graph, D, queue,visited);

        for (int i = 0; i < A;i++) {
            if (D.get(i) == Integer.MAX_VALUE) D.set(i, -1);
        }

        return D;
    }

    private void dijsktraAlgo(ArrayList<ArrayList<Edge>> graph, ArrayList<Integer> D,
                              Deque<Edge> queue, HashSet<Integer> visited) {
        if (queue.isEmpty()) {
            return;
        }
        Edge c = queue.poll();
        if (visited.contains(c.vertex)) {
            dijsktraAlgo(graph, D, queue, visited);
            return;
        }
        ArrayList<Edge> edges = graph.get(c.vertex);
        //System.out.println("cn: " + c + " d " + D.get(c.vertex));
        for (Edge e: edges) {
            //System.out.println("e " + e + " " + (D.get(c.vertex) + e.weight));
            if (D.get(c.vertex) + e.weight < D.get(e.vertex)) {
                D.set(e.vertex, D.get(c.vertex) + e.weight);
                Iterator<Edge> iterator = queue.iterator();

                while (iterator.hasNext()) {
                    Edge v = iterator.next();
                    if (v.vertex == e.vertex) {
                        v.weight = D.get(e.vertex);
                    }
                }
            }
        }
        visited.add(c.vertex);
        for (Edge e: edges) {
            if (!visited.contains(e.vertex)) {
                // System.out.println("e " + e);
                queue.offer(e);
            }
        }
        dijsktraAlgo(graph, D, queue, visited);

    }
}
