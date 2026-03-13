# Alumno: Carolina Martinez Zuñiga
# Metodos Numericos: Interpolacion lineal

import math
import numpy as np
import matplotlib.pyplot as plt

puntos=[(-3,9),(-2,4),(-1,1),(0,0),(1,1),(2,4),(3,9)]
#puntos= x0,y0  x1,y1    x2,y2

k = len(puntos)

equis = []
ye = []

for n in range (k):
    equis.append(puntos[n][0])
    ye.append(puntos[n][1])

print("Número de puntos", k)
print("Variable puntos:", puntos)
print("Valores de x:", equis)
print("Valores de y:", ye)

def fun(x, x0, y0, x1, y1):
    y = (((y1-y0)/(x1-x0))*(x-x0)) + y0
    return y

# evaluar punto medio entre cada pareja
for n in range(k-1):
    xm = (equis[n] + equis[n+1]) / 2
    ym = fun(xm, equis[n], ye[n], equis[n+1], ye[n+1])
    print("Evaluar con x =", xm, "resultado y =", ym)


def grafica():
    plt.figure(num="Int Lin")
    plt.plot(equis, ye, 'g^', label="puntos")
    for n in range(k-1):
        x = np.linspace(equis[n], equis[n+1], 100) # Generar rangos de valores de x para pares de puntos
        plt.plot(x, fun(x, equis[n], ye[n], equis[n+1], ye[n+1]), color='black')

    plt.grid('on')
    plt.savefig("MartinezZuñigaCarolina_IntLinEjercicio2.png")
    plt.show()

grafica()