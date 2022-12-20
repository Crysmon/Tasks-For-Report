n = int(input())
m = int(input())

checks = [] #список, хранящий Cn

for i in range(0, n):
    checks.append(int(input()))
    
checksSum = sum(checks)
minPay = 0
maxPay = checksSum // m
midPay = 0

if (maxPay == 1 or maxPay == 0):
    print(maxPay)
else:
    #используем бинарный поиск для нахождения нужной суммы (O(log(n));
    #проверяем каждую сумму отдельно (O(n));
    #таким образом, сложность алгоритма - O(log(n) * n)
    while (minPay < maxPay):
        midPay = (minPay + maxPay) // 2
        workersPaid = 0
        for check in checks:
            workersPaid = workersPaid + check // midPay
        if (workersPaid < m):
            maxPay = midPay - 1
        else:
            minPay = midPay + 1
        
    #из-за специфики данной задачи бинарный поиск может промахнуться на 1 вверх
    #сделаем проверку
    workersPaid = 0
    for check in checks:
        workersPaid = workersPaid + check // minPay
    if (workersPaid < m):
        minPay = minPay - 1
    print(minPay)