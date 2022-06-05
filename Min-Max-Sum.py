#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'miniMaxSum' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def miniMaxSum(arr):
    # Write your code here
    mini=float('inf')
    maxi=float('-inf')
    for i in arr:
        val=arr[0]
        arr.pop(0)
        add=sum(arr)
        if(maxi<add):
            maxi=add
        if(mini>add):
            mini=add
        arr.append(val)
    print(mini,maxi)
# In python, no need of long and short as we have only 'int' for that purpose 

if __name__ == '__main__':

    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
