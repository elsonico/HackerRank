# Enter your code here. Read input from STDIN. Print output to STDOUT
def factorial(n):
    if ( n > 1):
        return n * factorial(n-1)
    else:
        return 1


if __name__ == '__main__':
    N=int(raw_input())
    print factorial(N)
