company = "대한복권협회"

def numberSelect():
    import random
    numbers = set()
    while True : 
        number = random.randint(1, 45)
        numbers.add(number)
        if len(numbers) == 6:
            break
    return list(numbers)

print('로또모듈 print실행 :', numberSelect())

#print('__name__', __name__)

#if(__name__ == '__main__'):
#   print('로또모듈 print실행 : ', numberSelect())

            