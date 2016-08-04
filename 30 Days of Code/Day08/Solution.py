# Enter your code here. Read input from STDIN. Print output to STDOUT
t=int(raw_input())
phoneBook = {}
nameNumber=[2]
    
# Read to the Dictionary{}
for i in range(t):
    nameNumber = raw_input().strip().split()
    phoneBook[str(nameNumber[0])] = int(nameNumber[1])
        
# Print from Dictionary{}}
for i in range(t):
    name = raw_input()
    if phoneBook.has_key(name):
        print name+'='+str(phoneBook[name])
    else:
        print ("Not found")
