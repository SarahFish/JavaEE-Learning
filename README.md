# JavaEE-Learning
Simple codes of JavaEE, including grammer and algorithm.  
Provide more details in [Sarah's blog](https://blog.csdn.net/Sarah_Qu).

---

## main function
- **Format** of main function.
- How to get **parameters** by "String[] **args**".  (see [demo](https://github.com/SarahFish/JavaEE-Learning/blob/master/ChangeValuesProb.java) )

More details and code results are shown in [blog](http://blog.csdn.net/Sarah_Qu/article/details/79559531).

## Problem: Exchange values of 2 variables
- **Method 1**: Using an **intermediate variable**.(recommended in develpment)
- **Method 2**: Without an intermediate varible.(see [demo](https://github.com/SarahFish/JavaEE-Learning/blob/master/ChangeValuesProb.java))
    1. **Add and subtract**.
    2. **XOR**.
    
More details and code results are shown in [blog](https://blog.csdn.net/sarah_qu/article/details/79681496).

## Nested Loop
- **Concept**：A loop in another loop.
- **Problems**: Print a trangle, print 9*9 multiplication table...

## Dedinition of arrays(1-d & 2-d)
All methods are listed as follows.
- Define a 1-d array(4 kinds of codes)
  - Only defining: 
    - **int[] a = new int[length];**
  - Defining & assigning:
    - **int[] a = new int[]{n1,n2};** is complete;
    - **int[] a= {n1,n2};** for short;
  - Via intermediate varible
    - Use variable name of an array which stands for its address.
- Define a 2-d array(5 kinds of codes)
  - Only defining:
    - **int[][] b = new int[length_1][length_2];**
      - length_1 and length_2 can be *different*.
    - **int[][] b = new int[length][];** 
      - The *second* dimention can be *ignored*;
      - Then b[0] and b[1] are assgned *null*, because it's not assigned an address.
  - Defining & assigning:
    - **int[][] b = new int[][]{{n1,n2},{n3,n4}};** is complete;
    - **int[][] b ={{n1,n2},{n3,n4}};** for short;
  - Via intermediate varible
    - Use variable name of an array which stands for its address.
  
  
**What does array name stands for?**
  - Memory address of the array which is a hash code. 
  - Array name **a** and **b** ,and **b[0]** and **b[1]** of the 2-d array.
  
  
More details in [demo](https://github.com/SarahFish/JavaEE-Learning/blob/master/ArrayDemo.java) and [blog](https://mp.csdn.net/postedit/80329117).
