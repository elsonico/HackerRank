# Your code here
def prime?(number)
    isprime=true
    if (number==1||number==4)
        isprime=false
    end
    n=3
    while n<number
        if ( number%n == 0 )
            isprime=false
        end
        n=n+1
    end
    return isprime
end
