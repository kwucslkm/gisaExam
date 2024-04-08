num1 = int(input("짝수 입력> "))
num2 = int(input("홀수 입력> "))
match num1 % 2, num2 % 2:
    case 0,1 :
        print("num1짝수 num2홀수")
    case 0, _:
        print("num2짝수")
    case _, 1 :
        print("num2홀수")
    case _:
        print("둘 다 다름")
