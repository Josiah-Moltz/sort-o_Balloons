# sort-o_Balloons
\~Sophia Eiden\~\
\~Weichen Liu\~\
\~Josiah Moltz\~

# Best and Worst Cases

## Bubble Sort

### Best: Ascending order
* Since the list of n elements is already sorted in ascending order, there will be no swaps as we go through n-1 passes. 
* The runtime complexity is one. 
### Worst: Descending order
* When the list of n elements is in descending order, the number of swaps grow quadratically when sorting. The term that grows the fastest is n^2.  
* The runtime complexity is n^2. 

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
