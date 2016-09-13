#!/bin/bash
# With never bash, this could be achieved with {1..99..2}
for i in {1..99}
do
    if [ ! $(( $i % 2 )) == 0 ]
    then echo $i
    fi
done
