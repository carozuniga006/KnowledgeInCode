# Nombre: Carolina Martinez Z
# MN: Newton
# Encontrar raiz o raices de la funcion: f(x) = (4.7 + 2.2*x - 0.4*x**2)

import math
import numpy as np
import matplotlib.pyplot as plt

def fun(x):
    y = (4.7 + 2.2*x - 0.4*x**2)
    return y

def dfun(x):
    y = (2.2 - 0.8*x)
    return y

def tabular():
    print("x     f(x)")
    x=-10
    while(x<10):
        print(x, fun(x))
        x+=1.0

def graficar():
    x = np.linspace(-10,10,100)
    plt.figure(num="Newton")
    plt.plot(x, fun(x))
    plt.grid('on')
    plt.show()

def newton(x0):
    n = 0
    s = 0
    print("n     Xn      f(x)      df(x)")
    while(n < 100):
        epsilon= 0.001
        x = x0 - fun(x0)/dfun(x0)
        txt = "%2d  %6.4f  %9.7f  %9.7f" % (n, x0, fun(x0), dfun(x0))
        print(txt)

        if abs(fun(x)) < epsilon:
            s = x
            break

        x0 = x
        n+=1

    print("\nLa raiz es: " + str(s)+ " f(x)= "+ str(fun(s)))

graficar()
tabular()

x0 = float(input("Ingrese el valor inicial x0: "))
print("Valor de f(x0)= " + str(fun(x0)))

newton(x0)

# SALUDA/EJECUCION
#
# x     f(x)
# -10 -57.3
# -9.0 -47.5
# -8.0 -38.5
# -7.0 -30.300000000000004
# -6.0 -22.9
# -5.0 -16.3
# -4.0 -10.5
# -3.0 -5.5
# -2.0 -1.3000000000000003
# -1.0 2.1
# 0.0 4.7
# 1.0 6.5
# 2.0 7.500000000000002
# 3.0 7.700000000000001
# 4.0 7.1
# 5.0 5.699999999999999
# 6.0 3.5000000000000018
# 7.0 0.5
# 8.0 -3.3000000000000007
# 9.0 -7.899999999999999
# Ingrese el valor inicial x0: -2
# Valor de f(x0)= -1.3000000000000003
# n     Xn      f(x)      df(x)
#  0  -2.0000  -1.3000000  3.8000000
#  1  -1.6579  -0.0468144  3.5263158
#
# La raiz es: -1.6446190102120974 f(x)= -7.049796702207622e-05
#
# Process finished with exit code 0