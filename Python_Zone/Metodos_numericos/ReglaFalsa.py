# Nombre: Carolina Martinez Z
# MN: Regla Falsa
# Encontrar raiz o raices de la funcion: f(x) = (x**3 * fabs(sin(x))-4)

import math
import numpy as np
import matplotlib.pyplot as plt

def fun(x):
    y = (x**3 * np.fabs(np.sin(x)) - 4)
    return y

def tabular():
    print("x     f(x)")
    x=-10
    while(x<10):
        print(x, fun(x))
        x+=1.0

def graficar():
    x = np.linspace(-10,10,100)
    plt.figure(num="reglaFalsa")
    plt.plot(x, fun(x))
    plt.grid('on')
    plt.show()

def reglaFalsa(a, b):
    # x = (a+b)/2 Sacar punto medio
    n = 0
    s = 0
    print("n     a      b       Xn      f(a)      f(b)      f(x)        f(a)*f(x)         cambio")
    while(n < 100): # ciclo infinito
        epsilon= 0.001
        x = b - (fun(b) * (a - b)) / (fun(a) - fun(b))
        # print(n, a, b, x, fun(x), fun(a)*fun(x))
        txt= txt = "%2d  %6.4f  %6.4f  %6.4f  %9.7f  %9.7f  %9.7f" % (n, a, b, x, fun(a), fun(b), fun(x))
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
        if abs(fun(x)) < epsilon:
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

reglaFalsa(a, b)