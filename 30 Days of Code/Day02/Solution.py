# Enter your code here. Read input from STDIN. Print output to STDOUT
from __future__ import division

meal=float(raw_input())
tip=int(raw_input())
tax=int(raw_input())

tip=meal*(tip/100)
tax=meal*(tax/100)
total=meal+tax+tip

print 'The total meal cost is %.0f dollars.' % total
