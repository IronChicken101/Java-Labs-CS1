def get_total( ann ):
  total = 0
  for var in ann:
    total = total + var
  return total

bob = [3,5,6,33,111,7,7,15,-5,9,1,6,6,7,8,9,5,6,6,6,7,2,7,99,11,8]
print ( get_total( bob ) )
bob = [3,5,6,9,5,6,6,6,7,2,7,99,11,8]
print ( get_total( bob ) )
bob = [3,5,11,8] 
print ( get_total( bob ) )
bob = [3,5,11,8,1,1,1,11,1]
print ( get_total( bob ) )
