#!/bin/python

import sys

try:
    S = int(raw_input().strip())
    print S 
except ValueError:
    print ("Bad String")
