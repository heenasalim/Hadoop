package exercise1;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Apple {
	final class Edge {
	    private final Node node1, node2;
	    private final int distance;

	    public Edge (Node node1, Node node2, int distance) {
	        this.node1 = node1;
	        this.node2 = node2;
	        this.distance = distance;
	    }

	    public Node getAdjacentNode (Node node) {
	        return node.getValue() != node1.getValue() ? node1 : node2; 
	    }

	    public int getDistance() {
	        return distance;
	    }
	}

	class Node {
	    private final int v;
	    private int distance = Integer.MAX_VALUE;

	    public Node (int v) {
	        this.v = v;
	    }

	    public int getValue() {
	        return v;
	    }
	    public int getDistance() {
	        return distance;
	    }

	    public void setDistance(int distance) {
	        this.distance = distance;
	    }

	    @Override
	    public boolean equals(Object o) {
	        Node node = (Node) o;
	        return node.getValue() == v;
	    }

	    @Override
	    public int hashCode() {
	        return v;
	    }
	}


	class Graphs {

	    private final Map<Node, ArrayList<Edge>> map;
	    private final int numberOfVertices; 

	    Graphs(int numberOfVertices) {
	        if (numberOfVertices < 0) {
	            throw new IllegalArgumentException("A vertex cannot be less than zero");
	        }
	        this.numberOfVertices = numberOfVertices;
	        this.map = new HashMap<Node, ArrayList<Edge>>();
	    }

	    public void addEdge (Node node1, Node node2, int distance) {
	        // necessary to throw null ptr exceptions explicitly since, null can get propagated and saved in edge
	        if (node1 == null || node2 == null) {
	            throw new NullPointerException("Either of the 2 nodes is null.");
	        }
	        if (distance < 0) {
	            throw new IllegalArgumentException(" The distance cannot be negative. ");
	        }

	        Edge edge = new Edge(node1, node2, distance);

	        addToMap(node1, edge);
	        addToMap(node2, edge);
	    }

	    private void addToMap (Node node, Edge edge) {
	        if (map.containsKey(node)) {
	            List<Edge> l = map.get(node);
	            l.add(edge);
	        } else  {
	            List<Edge> l = new ArrayList<Edge>();
	            l.add(edge);
	            map.put(node, (ArrayList<Edge>) l);
	        }  
	    }

	    public List<Edge> getAdj(Node node) {
	        return map.get(node);
	    }

	    public Map<Node, ArrayList<Edge>> getGraph() {
	        return map;
	    }


	    public int getNumVertices() {
	        return numberOfVertices;
	    }
	}

	public class Dijkstra {

	    private final Graphs graph;

	    public Dijkstra(Graphs graph) {
	        if (graph == null) {
	            throw new NullPointerException("The input graph cannot be null.");
	        }
	        this.graph = graph;
	    }

	    /**
	     * http://stackoverflow.com/questions/2266827/when-to-use-comparable-and-comparator
	     */
	    public class NodeCompator implements Comparator<Node>  {
	        @Override
	        public int compare(Node n1, Node n2) {
	            if (n1.getDistance() > n2.getDistance()) {
	                return 1;
	            } else {
	                return -1;
	            }
	        }
	    };

	    public Set<Node> findShortest(int source) {
	        final Queue<Node> queue = new PriorityQueue<Node>(10, new NodeCompator());

	        for (java.util.Map.Entry<Node, ArrayList<Edge>> entry :  graph.getGraph().entrySet()) {
	            Node currNode = entry.getKey();
	            if (currNode.getValue() == source) {
	                currNode.setDistance(0);
	                queue.add(currNode);
	            } 
	        }

	        final Set<Node> doneSet = new HashSet<Node>();

	        while (!queue.isEmpty()) {
	            Node src = queue.poll();
	            doneSet.add(src);

	            for (Edge edge : graph.getAdj(src)) {
	                Node currentNode = edge.getAdjacentNode(src);

	                if (!doneSet.contains(currentNode)) {
	                    int newDistance = src.getDistance() + edge.getDistance();
	                    if (newDistance < currentNode.getDistance()) {
	                        currentNode.setDistance(newDistance);
	                        queue.add(currentNode);
	                    } 
	                }
	            }
	        }

	        return graph.getGraph().keySet();
	    }

	}

}
