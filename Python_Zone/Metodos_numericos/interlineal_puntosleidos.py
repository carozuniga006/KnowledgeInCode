# Alumno: Carolina Martinez Zuñiga (2E)
# Metodos Numericos: Interpolacion lineal Ej3

import math
import numpy as np
import matplotlib.pyplot as plt

puntos=[]

k = int(input("Ingresa cantidad de puntos a capturar: "))


while k > 10:
    print("No se permiten más de 10 puntos")
    k = int(input("Ingresa cantidad de puntos a capturar: "))

for n in range(k):
    x = float(input("Ingresa valor de x del punto " + str(n) + ": "))
    y = float(input("Ingresa valor de y del punto " + str(n) + ": "))
    puntos.append((x,y))

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
    plt.savefig("MartinezZuñigaCarolina_IntLinEjercicio3.png")
    plt.show()

grafica()
