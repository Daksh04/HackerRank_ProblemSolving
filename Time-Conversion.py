#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'timeConversion' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def timeConversion(s):
    # Write your code here
    n=len(s)
    time=s[n-2:]
    if(time=='AM'):
        if(s[:2]=='12'):
            s='00'+s[2:n-2]
        else:
            s=s[:n-2]
    elif(time=='PM'):
        if(s[:2]=='01'):
            s='13'+s[2:n-2]
        elif(s[:2]=='02'):
            s='14'+s[2:n-2]
        elif(s[:2]=='03'):
            s='15'+s[2:n-2]
        elif(s[:2]=='04'):
            s='16'+s[2:n-2]
        elif(s[:2]=='05'):
            s='17'+s[2:n-2]
        elif(s[:2]=='06'):
            s='18'+s[2:n-2]
        elif(s[:2]=='07'):
            s='19'+s[2:n-2]
        elif(s[:2]=='08'):
            s='20'+s[2:n-2]
        elif(s[:2]=='09'):
            s='21'+s[2:n-2]
        elif(s[:2]=='10'):
            s='22'+s[2:n-2]
        elif(s[:2]=='11'):
            s='23'+s[2:n-2]
        else:
            s=s[:n-2]
    return s
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    fptr.write(result + '\n')

    fptr.close()
