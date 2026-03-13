# Alumno: Carolina Martinez Zuñiga
# Metodos Numericos: Interpolacion Lagrange Ejemplo profesor

import math
import numpy as np
import matplotlib.pyplot as plt

puntos = [(2, 5), (3, 8), (4, 13)]

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

# Int Lineal y = (((y1-y0)/(x1-x0))*(x-x0)) + y0

def L(x):
    S = 0
    for j in range (k):
        S = S + ye[j]*l(j, x)
    return S

def l(j, x):
    p=1
    for i in range (k):
        if i!=j:
            p = p*((x-equis[i])/(equis[j]-equis[i]))
    return p

print("Prueba L(1.5) => ", L(1.5))

print("\nEvaluación en puntos medios:")
for i in range(k-1):
    xm = (equis[i] + equis[i+1]) / 2
    print("x medio =", xm, "-> y =", L(xm))

def grafica():
    plt.figure(num="Int Lagrange")
    plt.plot(equis, ye, 'g^', label="puntos")

    x = np.linspace(-5, 5, 100) # Generar rangos de valores de x para pares de puntos
    plt.plot(x, L(x), color='black')

    plt.grid('on')
    plt.savefig("MartinezZuñigaCarolina_IntLagrangeEjemplo1.png")
    plt.show()

grafica()