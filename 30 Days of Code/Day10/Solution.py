#!/bin/python

import sys

def decBin(D):
    bins = []
    n = int(D)
    b = bin(n)
    counter = 0
    for i in range(2,len(b)):
        if (b[i] == '1'):
            counter = counter + 1
        else:
            bins.append(counter)
            counter = 0
    if (len(bins) > 0 ):
        bins.append(counter)
        print (str(max(bins)))
    else:
        print (str(counter))

if __name__ == '__main__':
    n = int(raw_input().strip())
    decBin(n)
