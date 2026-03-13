# Nombre: Carolina Martinez Z
# MN: Bisección
# Encontrar raiz o raices de la funcion: X^3 + 4X^2 -10

import math, numpy as np
import matplotlib.pyplot as plt

def fun(x):
    y = x**3 + 4*x**2 - 10
    return y

def tabular():
    print("x     f(x)")
    x=-5.0
    while(x<5):
        print(x, fun(x))
        x+=0.5

def graficar():
    x = np.linspace(-2,2,100)
    plt.figure(num="Biseccion")
    plt.plot(x, fun(x))
    plt.grid('on')
    plt.show()

def biseccion(a, b):
    # x = (a+b)/2 Sacar punto medio
    n = 0
    s = 0
    print("n     a      b       Xn      f(x)    f(a)*f(x)         cambio")
    while(1): # ciclo infinito
        x = (a + b) / 2
        # print(n, a, b, x, fun(x), fun(a)*fun(x))
        txt= "%2d %+6.4f %+6.4f %6.4f %+9.7f" % (n, a, b, x, fun(x))
        # condiciones del metodo
        if(fun(a)*fun(x)<0):
            b =  x
            txt += ", - , b = x"
        if(fun(a)*fun(x)>0):
            a = x
            txt += ", + , a = x"
        if(fun(a)*fun(x)==0):
            s = x
            break
        if(abs(fun(x)) < 0.0000001):
            s = x
            break
        print (txt)
        n+=1
    print("\nLa raiz es: " + str(s)+ " f(x)= "+ str(fun(x)))
# Ver la funcion
graficar()

# Tabularmente determinar a y b
tabular()

# Seleccionar valores de a y b para una de las soluciones
a = float(input("Ingrese el valor de a: "))
print("Valor de f(a)= " + str(fun(a)))
b = float(input("Ingrese el valor de b: "))
print("Valor de f(b)= " + str(fun(b)))

biseccion(a, b)