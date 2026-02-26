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

# SALIDA EJECUCIÓN:
# x     f(x)
# -10 -548.0211108893698
# -9.0 -304.43437574124056
# -8.0 -510.5514222711715
# -7.0 -229.34640336054466
# -6.0 -64.35374761096799
# -5.0 -123.86553433289231
# -4.0 -52.435359699707405
# -3.0 -7.810240217616415
# -2.0 -11.274379414605454
# -1.0 -4.841470984807897
# 0.0 -4.0
# 1.0 -3.1585290151921033
# 2.0 3.2743794146054537
# 3.0 -0.18975978238358504
# 4.0 44.435359699707405
# 5.0 115.86553433289231
# 6.0 56.353747610967986
# 7.0 221.34640336054466
# 8.0 502.5514222711715
# 9.0 296.43437574124056
# Ingrese el valor de a: 1
# Valor de f(a)= -3.1585290151921033
# Ingrese el valor de b: 2
# Valor de f(b)= 3.2743794146054537
#
# n     a      b       Xn      f(a)      f(b)      f(x)        f(a)*f(x)         cambio
#  0  1.0000  2.0000  1.4910  -3.1585290  3.2743794  -0.6959646, + , a = x
#  1  1.4910  2.0000  1.5802  -0.6959646  3.2743794  -0.0542207, + , a = x
#  2  1.5802  2.0000  1.5871  -0.0542207  3.2743794  -0.0031270, + , a = x
#
# La raiz es: 1.5874512161554577 f(x)= -0.0001755809738885894