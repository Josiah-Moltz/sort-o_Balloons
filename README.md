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
* A bubble sort moves through the list comparing each element to its neighbor, and swapping elements not in the proper order. The first pass moves the largest element to the end, and it makes repeated passes in order to move the next largest element to its place.
* The number of comparisons will always be (n-1)^2 where n is the size of the list since each of the n-1 passes will involve n-1 comparisons.
### Best: Ascending order (sorted)
* Since the number of comparisons is fixed, the best case scenario boils down to minimizing swaps, which is done if the list is already sorted. In this scenario 0 swaps are made.
* The runtime complexity O(n^2).
### Worst: Descending order
* Since the number of comparisons is fixed, the worst case scenario boils down to maximizing swaps, which is doen if the list is "anti-sorted", or placed in largest to smallest order. In this scenario (n^2-n)/2 swaps are made.
* The runtime complexity is O(n^2).

## Selection Sort

### Best and Worst: None
* There is always only one swap per pass and n-1 passes on a list with n elements. This is because when the elements are swapped, one of the elements is being put in its correct position.
* The runtime complexity is n

## Insertion Sort

### Best: Ascending order
* When the list of n elements is already sorted in ascending order, there are no swaps as n-1 passes happen.
* The runtime complexity is one.
### Worst: Descending order
* When the list of n elements is in descending order, the number of swaps grow quadratically when sorting. The term that grows the fastest is n^2.  
* The runtime complexity is n^2.

# Song of the Week
Words by F. R. David
