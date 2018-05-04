def flip_em( s ):
  spot=s.find(" ")
  num1= s[0:spot+1]
  num2=s[spot:]
  return "%s, %s" % (num2, num1)

print ( flip_em("aplus comp") )
print ( flip_em("comp aplus") )
print ( flip_em("ben sam") )
print ( flip_em("sally sue") )
print ( flip_em("big man") )
print ( flip_em("fat head") )
