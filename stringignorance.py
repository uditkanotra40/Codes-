Given a string of both uppercase and lowercase alphabets, the task is to print the string with alternate occurrences of any character dropped(including space and consider upper and lowercase as same).

Input:
First line consists of T test cases. First line of every test case consists of String S.

Output:
Single line output, print the updated string.

Constraints:
1<=T<=100
1<=|String|<=10000

Example:
Input:
2
It is a long day dear.
Geeks for geeks

code:

t=int(input())
while t>0:
    txt=input()
    ls=[]
    for x in txt:
        s=x.lower()
        if s in ls:
            ls.remove(s)
            continue
        else:
            ls.append(s)
        print(x,end="")
    print()
        
    
    t-=1
