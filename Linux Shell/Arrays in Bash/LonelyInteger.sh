#!bin/bash

read n
read array
k=0
l=0

for number in $array
  do
    numbers[$i]=$number
    let i=i+1
done

for (( i=0 ; i < ${#numbers[@]}; i++ ))
  do
    for (( j=0 ; j < ${#numbers[@]}; j++ ))
      do
        if (( ${numbers[i]} == ${numbers[j]} )) && (( i != j))
          then
            mindex[k]=$i
            let k=k+1
        fi
    done

done

printnum="true"

for (( i=0 ; i < ${#numbers[@]} ; i++))
  do
    for (( j=0 ; j < ${#mindex[@]} ; j++ ))
      do
        if (( $i == ${mindex[$j]} ))
          then
            printnum="false"
         fi
      done
     if [ $printnum == "true" ]
       then
         ones[$k]=${numbers[$i]}
         let k=k+1
     else
       printnum="true"
     fi
done

echo ${ones[@]}
