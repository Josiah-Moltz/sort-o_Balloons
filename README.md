# sort-o_Balloons
\~Sophia Eiden\~\
\~Weichen Liu\~\
\~Josiah Moltz\~

# Best and Worst Cases
* In order to calculate Big Oh, we sum swaps and comparisons. \
\
The logic behind this is that a swap will likely have a constant time of completion, lets say `s`, and a comparison will likely have a constant time of completion, lets say `c`. \
Thus, an estimation of the total time would be `s(swaps) + c(comparisons)` and so Big Oh of the total process would be Big Oh of `swaps + comparison`. \
\*\*Constants are NOT included in Big Oh, because Big Oh cares only about the *order* of the function, not the constants attatched to that order.

## Bubble Sort
* A bubble sort moves through the list comparing each element to its neighbor, and swapping elements not in the proper order. The first pass moves the largest element to the end, and additional passes ar made in order to move the next largest elements into their respective place.
* The number of comparisons will always be (n-1)^2 where n is the size of the list since each of the n-1 passes will involve n-1 comparisons.
### Best: Ascending order (sorted)
* Since the number of comparisons is fixed, the best case scenario boils down to minimizing swaps, which is done if the list is already sorted. In this scenario 0 swaps are made.
* The runtime complexity O(n^2).
### Worst: Descending order
* Since the number of comparisons is fixed, the worst case scenario boils down to maximizing swaps, which is done if the list is "anti-sorted", or placed in largest to smallest order. In this scenario, the largest element has to swap with all n-1 smaller elements after it, the second largest element has to swap will all n-2 smaller elements after it, and so on. Thus there are (n-1)+(n-2)+...+1 = (n^2-n)/2 total swaps required in this scenario.
* The runtime complexity is O(n^2).

## Selection Sort
* A selection sort selects the largest element not previously selected and moves that element to its proper position. A swap is always made, even if the element is already in place.
* On the pth pass, it takes n-p comparisons to find the largest remaining element, after which a swap will always be made. Thus there are (n^2-n)/2 comparisons, and n-1 swaps since there are n-1 passes.
### Best and Worst: None
* Since swaps and comparisons are constant, every case is equivalent!! Thus there are no best/worst cases.
* Time complexity is O(n^2).

## Insertion Sort
* An insertion sort looks through a list from left to right, determines the first point where the list ceases to be sorted, and moves the offending element until the previously searched section is sorted.
* In a certain pass, if the mth element is the first unsorted element (from left to right), we have to make n-1-m comparisons to discover this. It would then take us at most n-m-1 swaps to move the mth element into its proper place.
### Best: Ascending order (sorted)
* To minimize the number of swaps and comparisons, we would want no element to be unsorted (the list would be sorted). This would result in n-1 comparisons, and 0 swaps.
* The runtime complexity of this is O(n).
### Worst: Descending order
* To maximize the number of swaps and comparisons, we would want every element to be unsorted (the list would be in descending order). This would result in p comparisons on the pth pass, accompanied by p swaps, resulting in (n^2-n)/2 comparisons and (n^2-n)/2 swaps.
* The runtime complexity is O(n^2).

# Song of the Week
Words by F. R. David
