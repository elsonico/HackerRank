#!/bin/bash
read countries

declare -a $countries

i=1

while read -r line
  do
    countries[$i]=$line
    let i=i+1
done

j=0

for (( i=0 ; $i < ${#countries[@]}; i++ ))
  do
    if  ! `echo ${countries[$i]} | grep -qi a`
      then
        ocountries[j]=${countries[$i]}
        let j=j+1
    fi
done

echo ${ocountries[@]}
