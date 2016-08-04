#!/bin/python

from __future__ import print_function

n = int(raw_input().strip())
arr = map(int,raw_input().strip().split(' '))
for i in range(len(arr)):
    print (arr[(len(arr)-1)-i],'',end='')
