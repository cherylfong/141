# Linked List Cycle #141

## What is a Cycle in a Linked List?

A cycle in a linked list is where there's a node in the list that can also be reached again by continuously following
the `next` pointer.

## What is the Problem?

How would a cycle in a linked list be detected? See problem [#141 on
Leetcode](https://leetcode.com/problems/linked-list-cycle/).

## Runtime and Space Complexity

The methods:

```java
public int cycle(ListNode head){...}

public boolean hasCycle(ListNode head){...}
```

finds the cycle using a `HashMap`.

The bulk of the solution is in `whereCycle()`; `hasCycle()` simply calls `whereCycle()` to determine if a cycle exists.

### Runtime

The runtime of this solution is `O(N)`.

Quite simply, the solution needs to iterate through the entire linked list to find the existence of a cycle.

When considering the upper bound of time needed to run the program, `HashMap` operations in this solution are insignificant/negligible.
Since to search, look-up and insert in a `HashMap` is `O(1)`.

Thus, the runtime is `O(N)`.

### Space

The space complexity of the solution requires `N` space that is, the number of nodes in the linked list.

There are instances where the cycle may be found midway or even on the very first node.

However, the entire iteration through the linked list would end up filling the `HashMap` with the same number of elements as there are nodes until it reaches the tail i.e. when the node's `next` pointer points to `null`.

Hence, the upper bound of space needed for this solution is `O(N)`.

### Assumptions/Constrains

1. This solution works with linked lists that has the following node attributes:

```java
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
         next = null;
     }
}
```

2. Nodes may have the same value, `val`.