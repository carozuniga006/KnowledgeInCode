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

# SALIDA/EJECUCION
#
# Ingresa cantidad de puntos a capturar: 7
# Ingresa valor de x del punto 0: 0
# Ingresa valor de y del punto 0: 0
# Ingresa valor de x del punto 1: 1
# Ingresa valor de y del punto 1: 0.8415
# Ingresa valor de x del punto 2: 2
# Ingresa valor de y del punto 2: 0.9093
# Ingresa valor de x del punto 3: 3
# Ingresa valor de y del punto 3: 0.1411
# Ingresa valor de x del punto 4: 4
# Ingresa valor de y del punto 4: -0.7568
# Ingresa valor de x del punto 5: 5
# Ingresa valor de y del punto 5: -0.9589
# Ingresa valor de x del punto 6: 6
# Ingresa valor de y del punto 6: -0.2794
# Número de puntos 7
# Variable puntos: [(0.0, 0.0), (1.0, 0.8415), (2.0, 0.9093), (3.0, 0.1411), (4.0, -0.7568), (5.0, -0.9589), (6.0, -0.2794)]
# Valores de x: [0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0]
# Valores de y: [0.0, 0.8415, 0.9093, 0.1411, -0.7568, -0.9589, -0.2794]
# Evaluar con x = 0.5 resultado y = 0.42075
# Evaluar con x = 1.5 resultado y = 0.8754
# Evaluar con x = 2.5 resultado y = 0.5252
# Evaluar con x = 3.5 resultado y = -0.30785
# Evaluar con x = 4.5 resultado y = -0.85785
# Evaluar con x = 5.5 resultado y = -0.61915
#
# Process finished with exit code 0
