# Assignment 4

## Project Overview

This project demonstrates graph traversal algorithms using an adjacency list representation in Java.

The graph consists of:
- Vertices (nodes)
- Edges (connections between vertices)

The project implements:
- Breadth-First Search (BFS)
- Depth-First Search (DFS)

The graph is represented using a HashMap adjacency list structure.

---

# Graph Structure

A graph is a data structure consisting of:
- Vertices
- Edges

Vertices represent nodes in the graph.

Edges represent connections between nodes.

Example:

0 -> [1,2]
1 -> [0,3]
2 -> [0]
3 -> [1]

---

# Class Descriptions

## Vertex Class

The Vertex class represents a single node in the graph.

Fields:
- int id

Methods:
- getId()
- toString()

---

## Edge Class

The Edge class represents a connection between two vertices.

Fields:
- source vertex
- destination vertex

Methods:
- getSource()
- getDestination()

---

## Graph Class

The Graph class manages:
- vertices
- edges
- adjacency list
- BFS traversal
- DFS traversal

The adjacency list is implemented using:

Map<Integer, List<Integer>>

This representation is memory efficient for sparse graphs.

---

# Algorithm Descriptions

## BFS (Breadth-First Search)

BFS explores the graph level by level.

Steps:
1. Start from source vertex
2. Add source to queue
3. Mark source as visited
4. Remove vertex from queue
5. Visit neighbors
6. Repeat until queue is empty

Data Structure Used:
- Queue

Time Complexity:
O(V + E)

Use Cases:
- Shortest path
- Social networks
- GPS systems

---

## DFS (Depth-First Search)

DFS explores as deep as possible before backtracking.

Steps:
1. Start from source vertex
2. Mark as visited
3. Visit neighbor recursively
4. Continue until no neighbors remain
5. Backtrack

Data Structure Used:
- Recursion / Stack

Time Complexity:
O(V + E)

Use Cases:
- Maze solving
- Cycle detection
- Topological sorting

---

# Experimental Results

| Graph Size | BFS Time (ns) | DFS Time (ns) |
|------------|---------------|---------------|
| 10         | 343100        | 415400        |
| 30         | 1790300       | 1745000       |
| 100        | 7212800       | 5837200       |

---

# Analysis Questions

## How does graph size affect BFS and DFS performance?

As graph size increases, traversal time increases because more vertices and edges must be visited.

---

## Which traversal is faster in your experiments?

DFS was slightly faster in some tests, but performance was generally similar.

---

## Do results match the expected complexity O(V + E)?

Yes. Both algorithms scale linearly with the number of vertices and edges.

---

## How does graph structure affect traversal order?

Traversal order depends on how vertices are connected in the adjacency list.

BFS visits level-by-level.

DFS visits depth-first.

---

## When is BFS preferred over DFS?

BFS is preferred when shortest paths are needed.

---

## What are the limitations of DFS?

DFS may:
- use deep recursion
- cause stack overflow
- fail to find shortest paths

---

# Screenshots
<img width="2542" height="1510" alt="image" src="https://github.com/user-attachments/assets/d54d0828-0c39-4b89-bb2f-0563a39bde59" />
<img width="2458" height="1309" alt="image" src="https://github.com/user-attachments/assets/23f91e0d-690d-4b92-85e4-508535394193" />


---

# Reflection

This project helped me understand graph traversal algorithms and graph data structures.

I learned the differences between BFS and DFS, including how BFS uses a queue while DFS uses recursion.

One challenge during implementation was understanding traversal order and preventing revisiting vertices using a visited set.
