# Alumno : Carolina Martinez Zuñiga
# Grado y Grupo: 2.E
# Materia: Métodos Numéricos (Metodo de Runge Kutta)(ejercicio b)
# Maestro: Fernando Rodriguez Haro

import numpy as np
import matplotlib.pyplot as plt

# EDO 1
def f1(x,y):
    s = 1/(x+y)
    return s

# EDO 2
def f2(x,y):
    s = 2*y - 2*x - 1
    return s

# EDO 3
def f3(x,y):
    s = ((x**2)-(3*y))/(x + 1)
    return s

# Solucion exacta EDO 1
def sol1(x):
    return np.sqrt(2*x + 4)

# Solucion exacta EDO 2
def sol2(x):
    return x + 1 + np.exp(2*x)

def graficar(equis, ye, x_fin, opcion):

    x = np.linspace(0, x_fin, 100)

    plt.figure(num = "RK")

    # Puntos Runge Kutta
    plt.plot(equis, ye, 'g^', label = "RK")

    # Solucion exacta segun la opcion
    if opcion == 1:
        plt.plot(x, sol1(x), "b-", label = "solucion exacta")

    elif opcion == 2:
        plt.plot(x, sol2(x), "b-", label = "solucion exacta")

    # La EDO 3 solo muestra RK

    plt.grid(True)
    plt.legend()
    plt.show()


def runge_kutta(f, x, y, h, x_fin, opcion):

    equis = []
    ye = []

    print("   x       y       k1       k2       k3       k4")

    while x < x_fin:

        equis.append(x)
        ye.append(y)

        k1 = f(x, y)
        k2 = f(x+h/2, y+h*k1/2)
        k3 = f(x+h/2, y+h*k2/2)
        k4 = f(x+h, y+h*k3)

        yn = y +(h/6)*(k1 + 2*k2 + 2*k3 + k4)

        print("%.02f %+.08f %+.08f %+.08f %+.08f %+.08f"
              %(x, y, k1, k2, k3, k4))

        print("Valor de yn:", yn)

        y = yn
        x = x + h

    equis.append(x)
    ye.append(y)

    print("\nResultado final:")
    print("y(%.02f) = %.08f"%(x_fin, y))

    # Mostrar grafica
    graficar(equis, ye, x_fin, opcion)


opcion = 0

while opcion != 4:

    print("\n--- MENU ---")
    print("Resolver EDO 1...... [1]")
    print("Resolver EDO 2...... [2]")
    print("Resolver EDO 3...... [3]")
    print("Salir............... [4]")

    opcion = int(input("Selecciona una opcion: "))

    if opcion == 1:

        x = 0
        y = 2
        h = 0.25
        x_fin = 1

        runge_kutta(f1, x, y, h, x_fin, opcion)

    elif opcion == 2:

        x = 0
        y = 2
        h = 0.25
        x_fin = 1

        runge_kutta(f2, x, y, h, x_fin, opcion)

    elif opcion == 3:

        x = float(input("Ingresa x inicial: "))
        y = float(input("Ingresa y inicial: "))
        h = float(input("Ingresa incremento h: "))
        x_fin = float(input("Ingresa x final: "))

        runge_kutta(f3, x, y, h, x_fin, opcion)

    elif opcion == 4:

        print("Programa finalizado")

    else:

        print("Opcion no valida")



# SALIDAS / EJECUCIÓN DEL PROGRAMA:

# --- MENU ---
# Resolver EDO 1...... [1]
# Resolver EDO 2...... [2]
# Resolver EDO 3...... [3]
# Salir............... [4]
# Selecciona una opcion: 1
#    x       y       k1       k2       k3       k4
# 0.00 +2.00000000 +0.50000000 +0.45714286 +0.45826514 +0.42291054
# Valor de yn: 2.1147386054447295
# 0.25 +2.11473861 +0.42287972 +0.39329842 +0.39387122 +0.36856761
# Valor de yn: 2.21331304755417
# 0.50 +2.21331305 +0.36855312 +0.34669469 +0.34702342 +0.32786145
# Valor de yn: 2.300140164178203
# 0.75 +2.30014016 +0.32785379 +0.31093349 +0.31113810 +0.29603976
# Valor de yn: 2.377975027895928
#
# Resultado final:
# y(1.00) = 2.37797503
#
# --- MENU ---
# Resolver EDO 1...... [1]
# Resolver EDO 2...... [2]
# Resolver EDO 3...... [3]
# Salir............... [4]
# Selecciona una opcion: 2
#    x       y       k1       k2       k3       k4
# 0.00 +2.00000000 +3.00000000 +3.50000000 +3.62500000 +4.31250000
# Valor de yn: 2.8984375
# 0.25 +2.89843750 +4.29687500 +5.12109375 +5.32714844 +6.46044922
# Valor de yn: 4.21734619140625
# 0.50 +4.21734619 +6.43469238 +7.79336548 +8.13303375 +10.00120926
# Valor de yn: 6.22937536239624
# 0.75 +6.22937536 +9.95875072 +12.19843841 +12.75836033 +15.83793089
# Valor de yn: 9.383970323950052
#
# Resultado final:
# y(1.00) = 9.38397032
#
# --- MENU ---
# Resolver EDO 1...... [1]
# Resolver EDO 2...... [2]
# Resolver EDO 3...... [3]
# Salir............... [4]
# Selecciona una opcion: 3
# Ingresa x inicial: 0
# Ingresa y inicial: 1
# Ingresa incremento h: 0.2
# Ingresa x final: 4
#    x       y       k1       k2       k3       k4
# 0.00 +1.00000000 -3.00000000 -1.90000000 -2.20000000 -1.36666667
# Valor de yn: 0.5811111111111111
# 0.20 +0.58111111 -1.41944444 -0.94423077 -1.05389546 -0.67928290
# Valor de yn: 0.3779451175605022
# 0.40 +0.37794512 -0.69559668 -0.45010423 -0.49920272 -0.29644607
# Valor de yn: 0.28158989543220314
# 0.60 +0.28158990 -0.30298105 -0.15522081 -0.18129614 -0.05332889
# Valor de yn: 0.24727843401936672
# 0.80 +0.24727843 -0.05657517 +0.04480908 +0.02880104 +0.12044204
# Valor de yn: 0.25431467081715564
# 1.00 +0.25431467 +0.11852799 +0.19595123 +0.18489077 +0.25732797
# Valor de yn: 0.29223266970259476
# 1.20 +0.29223267 +0.25604636 +0.32021221 +0.31184275 +0.37341514
# Valor de yn: 0.35535171716155545
# 1.40 +0.35535172 +0.37247702 +0.42888070 +0.42211226 +0.47718365
# Valor de yn: 0.44040660308343454
# 1.60 +0.44040660 +0.47645392 +0.52809038 +0.52235299 +0.57334586
# Valor de yn: 0.5454294867691196
# 1.80 +0.54542949 +0.57275412 +0.62133976 +0.61631366 +0.66464111
# Valor de yn: 0.669186222569492
# 2.00 +0.66918622 +0.66414711 +0.71070877 +0.70620281 +0.75272489
# Valor de yn: 0.810876061291268
# 2.20 +0.81087606 +0.75230369 +0.79747900 +0.79337216 +0.83863192
# Valor de yn: 0.9699639922349832
# 2.40 +0.96996399 +0.83826707 +0.88246512 +0.87867671 +0.92302833
# Valor de yn: 1.1460832939289871
# 2.60 +1.14608329 +0.92270837 +0.96619935 +0.96267306 +1.00635429
# Valor de yn: 1.3389768763713787
# 2.80 +1.33897688 +1.00607089 +1.04903798 +1.04573281 +1.08890742
# Valor de yn: 1.5484608726570666
# 3.00 +1.54846087 +1.08865435 +1.13122465 +1.12810975 +1.17089322
# Valor de yn: 1.7744014186220416
# 3.20 +1.77440142 +1.17066565 +1.21292931 +1.20998069 +1.25245621
# Valor de yn: 2.016699480770711
# 3.40 +2.01669948 +1.25225035 +1.29427254 +1.29147107 +1.33369976
# Valor de yn: 2.2752807254116796
# 3.60 +2.27528073 +1.33351257 +1.37534129 +1.37267137 +1.41469896
# Valor de yn: 2.550088620213424
# 3.80 +2.55008862 +1.41452795 +1.45619913 +1.45364784 +1.49550909
# Valor de yn: 2.8410796526782636
#
# Resultado final:
# y(4.00) = 2.84107965
#
# --- MENU ---
# Resolver EDO 1...... [1]
# Resolver EDO 2...... [2]
# Resolver EDO 3...... [3]
# Salir............... [4]
# Selecciona una opcion: 4
# Programa finalizado
#
# Process finished with exit code 0
#