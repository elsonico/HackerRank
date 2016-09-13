#!/bin/bash
sum=0
i=0

read n

while [ $i -lt $n ]
do
    read x
    let sum=sum+$x
    let i=i+1
done

printf "%.3f\n" `echo $sum/$n | bc -l`
