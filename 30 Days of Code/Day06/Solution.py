# Enter your code here. Read input from STDIN. Print output to STDOUT
from __future__ import print_function
import sys

if __name__ == '__main__':
    S=[]
    T=int(raw_input())
    for words in range(T):
        S.append(str(raw_input()))
                        
    for words in range(T):        
        for i in range(0,len(S[words]),2):
            sys.stdout.write(S[words][i])
        print (' ',end='')
        for i in range(1,len(S[words]),2):
            sys.stdout.write(S[words][i])
        print (' ',end='\n')
