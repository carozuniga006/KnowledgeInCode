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

# SALIDA DE EJECUCION
# C:\Users\seooj\PycharmProjects\PythonProject\.venv\Scripts\python.exe C:\Users\seooj\PycharmProjects\PythonProject\MartinezZuñigaBiseccion.py
#
# x     f(x)
# -5.0 -35.0
# -4.5 -20.125
# -4.0 -10.0
# -3.5 -3.875
# -3.0 -1.0
# -2.5 -0.625
# -2.0 -2.0
# -1.5 -4.375
# -1.0 -7.0
# -0.5 -9.125
# 0.0 -10.0
# 0.5 -8.875
# 1.0 -5.0
# 1.5 2.375
# 2.0 14.0
# 2.5 30.625
# 3.0 53.0
# 3.5 81.875
# 4.0 118.0
# 4.5 162.125
#
# Ingrese el valor de a: 1
# Valor de f(a)= -5.0
# Ingrese el valor de b: 1.5
# Valor de f(b)= 2.375
#
# n     a      b       Xn      f(x)    f(a)*f(x)  cambio
#  0 +1.0000 +1.5000 1.2500 -1.7968750, + , a = x
#  1 +1.2500 +1.5000 1.3750 +0.1621094, - , b = x
#  2 +1.2500 +1.3750 1.3125 -0.8483887, + , a = x
#  3 +1.3125 +1.3750 1.3438 -0.3509827, + , a = x
#  4 +1.3438 +1.3750 1.3594 -0.0964088, + , a = x
#  5 +1.3594 +1.3750 1.3672 +0.0323558, - , b = x
#  6 +1.3594 +1.3672 1.3633 -0.0321500, + , a = x
#  7 +1.3633 +1.3672 1.3652 +0.0000720, - , b = x
#  8 +1.3633 +1.3652 1.3643 -0.0160467, + , a = x
#  9 +1.3643 +1.3652 1.3647 -0.0079893, + , a = x
# 10 +1.3647 +1.3652 1.3650 -0.0039591, + , a = x
# 11 +1.3650 +1.3652 1.3651 -0.0019437, + , a = x
# 12 +1.3651 +1.3652 1.3652 -0.0009358, + , a = x
# 13 +1.3652 +1.3652 1.3652 -0.0004319, + , a = x
# 14 +1.3652 +1.3652 1.3652 -0.0001799, + , a = x
# 15 +1.3652 +1.3652 1.3652 -0.0000540, + , a = x
# 16 +1.3652 +1.3652 1.3652 +0.0000090, - , b = x
# 17 +1.3652 +1.3652 1.3652 -0.0000225, + , a = x
# 18 +1.3652 +1.3652 1.3652 -0.0000067, + , a = x
# 19 +1.3652 +1.3652 1.3652 +0.0000012, - , b = x
# 20 +1.3652 +1.3652 1.3652 -0.0000028, + , a = x
# 21 +1.3652 +1.3652 1.3652 -0.0000008, + , a = x
# 22 +1.3652 +1.3652 1.3652 +0.0000002, - , b = x
# 23 +1.3652 +1.3652 1.3652 -0.0000003, + , a = x
#
# La raiz es: 1.3652300089597702 f(x)= -7.355607323233926e-08
#
# Process finished with exit code 0