#숫자를 5개 입력 받고 가장 큰 숫자를 출력
i = 0
maxNum = 0
for i in range(1,6):
    num = int(input("숫자입력> "))
    if num>maxNum :
        maxNum = num

print(maxNum)