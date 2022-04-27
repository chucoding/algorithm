num = input().split(" ")
a = []
for i in range(int(num[0])) :
    l = []
    for j, s in enumerate(input()) :
        l.append(0) if j > 0 and before == s else l.append(1)
        before = s
    a.append(l)
print(a)