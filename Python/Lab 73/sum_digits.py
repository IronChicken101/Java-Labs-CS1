
spot=0
while ( spot<8 ):
    num = int(input("Enter a number :: "))

    sum = 0
    while num:
        sum+=num%10
        num/=10
    print sum
    spot+=1
    
    
