#!/bin/python

import sys


n = int(raw_input().strip())

wrote="false"
for i in range(n):
    x = n-i
    y = n - x
    while x > 1:
        sys.stdout.write(' ')
        wrote="true"
        x = x -1
    while y >= 0:
        sys.stdout.write('#')
        y = y -1
    if wrote == "true":
        sys.stdout.write('\n')
