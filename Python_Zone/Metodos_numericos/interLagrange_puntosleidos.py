# Alumno: Carolina Martinez Zuñiga
# Metodos Numericos: Interpolacion Lagrange

import math
import numpy as np
import matplotlib.pyplot as plt

#creamos una lista vacia para guardar los puntos
puntos = []

#captura de puntos
k = int(input("Ingresa el numero de puntos: "))

#guardar en tuplas
for i in range(k):
    x = float(input("Ingresa el valor de x del punto: " + str(i) + ": "))
    y = float(input("Ingresa el valor de y del punto: " + str(i) + ": "))
    puntos.append((x,y))

#organizamos y separamos los puntos
equis = []
ye = []
for n in range(k):
    equis.append(puntos[n][0])
    ye.append(puntos[n][1])

#confirmación de datos
print("Numero de puntos: ", k)
print("Variable puntos: ", puntos)
print("Valores de x: ", equis)
print("Valores de y: ", ye)

#definiendo L para la formula sumatoria (funcion del polinomio)
def L(x):
    s = 0
    for j in range (k):
        s = s + ye[j]*l(j,x)
    return s

#definimos l para la formula del producto (polinomio base)
def l(j,x):
    p = 1
    for i in range (k):
        if i!=j:
            p = p*((x-equis[i])/(equis[j]-equis[i]))
    return p

#prueba de verificacion
print("prueba L(1.5) => ", L(1.5))

#evaluar en puntos medios
print("\nEvaluacion en puntos medios: ")
for i in range(k-1):
    xm = (equis[i]+equis[i+1])/2
    print("x medio: ", xm, " -> y = ", L(xm))

#creando la grafica
def grafica():
    plt.figure(num= "Int Lagrange")
    plt.plot(equis, ye, 'g^', label="puntos")
    x = np.linspace(-1, 7, 100)
    plt.plot(x, L(x), color='black')
    plt.grid('on')
    plt.savefig("IntLagrange.png")
    plt.show()

#graficando
grafica()