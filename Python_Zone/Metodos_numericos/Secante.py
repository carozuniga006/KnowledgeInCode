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

# SALIDA/EJECUCIÓN
#
# x     f(x)
# -10 -21916.465794806718
# -9.0 -8013.083927575384
# -8.0 -2908.9579870417283
# -7.0 -1040.6331584284585
# -6.0 -361.4287934927351
# -5.0 -118.4131591025766
# -4.0 -34.598150033144236
# -3.0 -8.085536923187668
# -2.0 -1.3890560989306504
# -1.0 -0.7182818284590451
# 0.0 -1.0
# 1.0 -0.36787944117144233
# 2.0 1.8646647167633872
# 3.0 5.950212931632136
# 4.0 11.981684361111267
# 5.0 19.993262053000915
# 6.0 29.997521247823332
# 7.0 41.99908811803444
# 8.0 55.9996645373721
# 9.0 71.99987659019591
# 10.0 89.99995460007024
# Ingrese el valor de x0: 1
# Valor de f(x0)= -0.36787944117144233
# Ingrese el valor de x1: 2
#
# Valor de f(x1)= 1.8646647167633872
# n     x0      x1       Xn      f(x0)      f(x1)      f(xn)
#  0  1.0000  2.0000  1.1648  -0.3678794  1.8646647  -0.1200582
#  1  2.0000  1.1648  1.2153  1.8646647  -0.1200582  -0.0349604
#  2  1.1648  1.2153  1.2361  -0.1200582  -0.0349604  0.0012579
#  3  1.2153  1.2361  1.2353  -0.0349604  0.0012579  -0.0000123
#
# La raiz es: 1.2353392335281135 f(x)= -1.2329832252966355e-05
#
# Process finished with exit code 0