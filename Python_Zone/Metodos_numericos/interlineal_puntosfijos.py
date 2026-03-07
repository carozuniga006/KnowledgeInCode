# Alumno: Carolina Martinez Zuñiga
# Metodos Numericos: Interpolacion lineal Ej2

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

# SALIDA/EJECUCION
# C:\Users\seooj\PycharmProjects\PythonProject5\.venv\Scripts\python.exe C:\Users\seooj\PycharmProjects\PythonProject5\MartinezZuñigaCarolina_InterLineal_Ejercicio2.py
#
# Número de puntos 7
# Variable puntos: [(-3, 9), (-2, 4), (-1, 1), (0, 0), (1, 1), (2, 4), (3, 9)]
# Valores de x: [-3, -2, -1, 0, 1, 2, 3]
# Valores de y: [9, 4, 1, 0, 1, 4, 9]
# Evaluar con x = -2.5 resultado y = 6.5
# Evaluar con x = -1.5 resultado y = 2.5
# Evaluar con x = -0.5 resultado y = 0.5
# Evaluar con x = 0.5 resultado y = 0.5
# Evaluar con x = 1.5 resultado y = 2.5
# Evaluar con x = 2.5 resultado y = 6.5
#
# Process finished with exit code 0