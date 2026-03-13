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