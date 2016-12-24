#!/usr/bin/py
# Head ends here
def pairs(a,k):
    slist = sorted(a)
    n = len(a)
    count = 0
    i = 0
    j = 1
    while j < n:
        dif = slist[j]-slist[i]
        if dif == k:
            count = count + 1
            j = j + 1
        else:
            if dif > k:
                i = i + 1
            else:
                j = j + 1
    return count


# Tail starts here
if __name__ == '__main__':
    a = map(int, raw_input().strip().split(" "))
    _a_size=a[0]
    _k=a[1]
    b = map(int, raw_input().strip().split(" "))
    print pairs(b,_k)
