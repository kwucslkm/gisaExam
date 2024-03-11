class Lotto:
    cnt = 0

    def __init__(self):
        self.number = []
        Lotto.cnt += 1 # 인스턴스 변수 접근 예) lotto1.number
        self.turningTrain = Lotto.cnt
    def numberSelect(self):
        import random
        numbers = set()
        while True : 
            number = random.randint(1, 45)
            numbers.add(number)
            if len(numbers) == 6:
                break
        self.number.extend(list(numbers))
    def allPrint(self):
        print(f"{self.turningTrain}회차 당첨번호 : {self.number}")
# 미완성 코드
lottoBuyCnt = int(input("몇개의 로또를 구매하시겠어요?> "))
lottol = [lottoBuyCnt]
for i in range(0,lottoBuyCnt):
    lottol[i].__add__(Lotto())
    lottol[i].self.numberSelect()
    lottol[i].self.allPrint()   


# lotto1 = Lotto()
# lotto1.numberSelect()
# lotto1.allPrint()
# lotto2 = Lotto()
# lotto2.numberSelect()
# lotto2.allPrint()
# lotto3 = Lotto()
# lotto3.numberSelect()
# lotto3.allPrint()
# lotto4 = Lotto()
# lotto4.numberSelect()
# lotto4.allPrint()


