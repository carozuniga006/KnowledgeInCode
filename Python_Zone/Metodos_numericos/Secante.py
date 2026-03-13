# Nombre: Carolina Martinez Zuñiga
# MN: Secante
# Encontrar raiz o raices de la funcion: f(x) = (x**2 - x - np.exp(-x))

import math
import numpy as np
import matplotlib.pyplot as plt

def fun(x):
    y = (x**2 - x - np.exp(-x))
    return y

def tabular():
    print("x     f(x)")
    x=-10
    while(x<=10):
        print(x, fun(x))
        x+=1.0

def graficar():
    x = np.linspace(-10,10,100)
    plt.figure(num="secante")
    plt.plot(x, fun(x))
    plt.grid('on')
    plt.show()

def secante(x0, x1):
    n = 0
    s = 0
    epsilon= 0.001
    print("n     x0      x1       Xn      f(x0)      f(x1)      f(xn)")

    while(n < 100):
        if(fun(x1) - fun(x0) == 0):
            print("Division entre cero")
            break

        x = x1 - (fun(x1)*(x1 - x0))/(fun(x1) - fun(x0))

        txt = "%2d  %6.4f  %6.4f  %6.4f  %9.7f  %9.7f  %9.7f" % (
            n, x0, x1, x, fun(x0), fun(x1), fun(x))

        print(txt)

        if abs(fun(x)) < epsilon:
            s = x
            break

        x0 = x1
        x1 = x
        n+=1

    print("\nLa raiz es: " + str(s)+ " f(x)= "+ str(fun(s)))

# Ver la funcion
graficar()

# Tabularmente ver valores
tabular()

# Seleccionar valores iniciales
x0 = float(input("Ingrese el valor de x0: "))
print("Valor de f(x0)= " + str(fun(x0)))
x1 = float(input("Ingrese el valor de x1: "))
print("Valor de f(x1)= " + str(fun(x1)))

secante(x0, x1)