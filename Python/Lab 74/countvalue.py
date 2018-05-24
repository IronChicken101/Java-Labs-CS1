
def scan(list,num):
    count = 0
    for i in list:
        if i == num:
            count+= 1
    print count

bob = [3,5,6,33,111,7,7,15,-5,9,1,6,6,7,8,9,5,6,6,6,7,2,7,99,11,8]
scan(bob,6)
scan(bob,7)
scan(bob,5)
