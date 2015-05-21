# LotterySort
Extremely inefficient "Sorting" algorithm based on luck. 

This algorithm wastes lots of memory and the time complexity is probably near O(nx) where x is the largest term being sorted and n is the number of term to be sorted.

This will return a list of integers that are not sorted perfectly but semirandimized with a general trend of asscending order.

Algorithm is as follows:

1) integers are put into a list the number of times equal to the integer

2) a random index picks a number from the list and removes it and all copies of it

3) the random index should have highest chance of picking the largest integer

4) put the integers into another list by repeating until the first list is empty

5) reverse list to put into asscending order

