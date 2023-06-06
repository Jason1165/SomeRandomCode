# M = 1000
# D = 500
# C = 100
# L = 50
# X = 10
# V = 5
# I = 1

def toRoman(num):
    str = ""
    if (num > 5000):
        return "Number is greater than 5000 so no result."
    while (num > 0):
        if (num >= 1000):
            str += "M"*(num//1000)
            num %= 1000
        elif (num >= 500 and num < 1000):
            str += "D"
            num %= 500
        elif (num >= 100 and num < 500):
            str += "C"*(num//100)
            num = num % 100
        elif (num >= 50 and num < 100):
            str += "L"
            num %= 50
        elif (num >= 10 and num < 50):
            str += "X"*(num//10)
            num %= 10
        elif (num >= 5 and num < 10):
            str += "V"
            num %= 5
        elif (num >= 0 and num < 5):
            str += "I"*(num//1)
            num = 0
    return str

for i in range(0, 5002):
    print(toRoman(i))