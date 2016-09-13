#!/bin/bash
i=0

while read -r line
do
    countries[$i]=$line
    let i=i+1
done


for (( i=0 ; $i < ${#countries[@]}; i++ ))
do
    ocountries[i]=`echo ${countries[$i]} | sed "s/^[A-Z]/\./g"`
done

echo ${ocountries[@]}
