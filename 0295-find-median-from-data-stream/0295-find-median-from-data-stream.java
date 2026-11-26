
import java.util.*;

class MedianFinder {

    // Max Heap: stores the smaller half
    PriorityQueue<Integer> left =
        new PriorityQueue<>(Collections.reverseOrder());

    // Min Heap: stores the larger half
    PriorityQueue<Integer> right =
        new PriorityQueue<>();

    public MedianFinder() {
    }

    public void addNum(int num) {

        // First add number to max heap
        left.add(num);

        // Move the largest number from left to right
        right.add(left.poll());

        // Balance both heaps
        if (right.size() > left.size()) {
            left.add(right.poll());
        }
    }

    public double findMedian() {

        // Odd number of elements
        if (left.size() > right.size()) {
            return left.peek();
        }

        // Even number of elements
        return (left.peek() + right.peek()) / 2.0;
    }
}


/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */