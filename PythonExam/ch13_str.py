#문자열
d="파이썬은 즐거워"
print(d)
print(len(d))
print(d[2])
print(d[3:])
print(d[-5:-1])
print(d[1::2])
print(d*3)
print(d.count("파"))
print(d.index("썬"))

if '파' in d:
    print("'파'는 있다")
else:
    print("'파'는 없다")

for i in d: 
    print(i)
