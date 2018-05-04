def count_pairs( s ):
    cnt=0
    pair=0
    while (cnt < (len(s)) - 1):
        x = s[cnt]
        y = s[cnt+1]
        if x == y:
            pair += 1
        cnt += 1
    return pair

print ( count_pairs("ddogccatppig") )
print ( count_pairs("dogcatpig") )
print ( count_pairs("xxyyzz") )
print ( count_pairs("a") )
print ( count_pairs("abc") )
print ( count_pairs("aabb") )
print ( count_pairs("dogcatpigaabbcc") )
print ( count_pairs("aabbccdogcatpig") )
print ( count_pairs("dogabbcccatpig") )
print ( count_pairs("aaaa") )
print ( count_pairs("AAAAAAAAA") )
