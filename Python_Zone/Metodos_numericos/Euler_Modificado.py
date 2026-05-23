# Alumno : Carolina Martinez Zuñiga
# Grado y Grupo: 2.E
# Materia: Métodos Numéricos (Metodo de Euler Modificado)(ejercicio c)
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

    plt.figure(num = "Euler Modificado")

    # Puntos Euler
    plt.plot(equis, ye, 'g^', label = "Euler")

    # Solucion exacta
    if opcion == 1:
        plt.plot(x, sol1(x), "b-", label = "solucion exacta")

    elif opcion == 2:
        plt.plot(x, sol2(x), "b-", label = "solucion exacta")

    # EDO 3 solo muestra Euler

    plt.grid(True)
    plt.legend()
    plt.show()


def euler_modificado(f, x, y, h, x_fin, opcion):

    equis = []
    ye = []

    print("   x       y       ybarra       yn")

    while x < x_fin:

        equis.append(x)
        ye.append(y)

        # y barra
        yb = y + h * f(x, y)

        # yn
        yn = y + (h/2) * (f(x,y) + f(x+h, yb))

        print("%.02f %+.08f %+.08f %+.08f"
              %(x, y, yb, yn))

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

        euler_modificado(f1, x, y, h, x_fin, opcion)

    elif opcion == 2:

        x = 0
        y = 2
        h = 0.25
        x_fin = 1

        euler_modificado(f2, x, y, h, x_fin, opcion)

    elif opcion == 3:

        x = float(input("Ingresa x inicial: "))
        y = float(input("Ingresa y inicial: "))
        h = float(input("Ingresa incremento h: "))
        x_fin = float(input("Ingresa x final: "))

        euler_modificado(f3, x, y, h, x_fin, opcion)

    elif opcion == 4:

        print("Programa finalizado")

    else:

        print("Opcion no valida")


# SALIDAS / EJECUCION

# --- MENU ---
# Resolver EDO 1...... [1]
# Resolver EDO 2...... [2]
# Resolver EDO 3...... [3]
# Salir............... [4]
# Selecciona una opcion: 1
#    x       y       ybarra       yn
# 0.00 +2.00000000 +2.12500000 +2.11513158
# 0.25 +2.11513158 +2.22083394 +2.21392456
# 0.50 +2.21392456 +2.30604208 +2.30088590
# 0.75 +2.30088590 +2.38282931 +2.37880892
#
# Resultado final:
# y(1.00) = 2.37880892
#
# --- MENU ---
# Resolver EDO 1...... [1]
# Resolver EDO 2...... [2]
# Resolver EDO 3...... [3]
# Salir............... [4]
# Selecciona una opcion: 2
#    x       y       ybarra       yn
# 0.00 +2.00000000 +2.75000000 +2.87500000
# 0.25 +2.87500000 +3.93750000 +4.14062500
# 0.50 +4.14062500 +5.71093750 +6.04101562
# 0.75 +6.04101562 +8.43652344 +8.97290039
#
# Resultado final:
# y(1.00) = 8.97290039
#
# --- MENU ---
# Resolver EDO 1...... [1]
# Resolver EDO 2...... [2]
# Resolver EDO 3...... [3]
# Salir............... [4]
# Selecciona una opcion: 3
# Ingresa x inicial: 0
# Ingresa y inicial: 1
# Ingresa incremento h: 0.1
# Ingresa x final: 2
#    x       y       ybarra       yn
# 0.00 +1.00000000 +0.70000000 +0.75500000
# 0.10 +0.75500000 +0.55000000 +0.58541667
# 0.20 +0.58541667 +0.44239583 +0.46632212
# 0.30 +0.46632212 +0.36563240 +0.38251664
# 0.40 +0.38251664 +0.31197736 +0.32438260
# 0.50 +0.32438260 +0.27617275 +0.28563648
# 0.60 +0.28563648 +0.25457964 +0.26205691
# 0.70 +0.26205691 +0.24463510 +0.25073753
# 0.80 +0.25073753 +0.24450350 +0.24963339
# 0.90 +0.24963339 +0.25284917 +0.25727760
# 1.00 +0.25727760 +0.26868596 +0.27259945
# 1.10 +0.27259945 +0.29127572 +0.29480515
# 1.20 +0.29480515 +0.32005899 +0.32329779
# 1.30 +0.32329779 +0.35460677 +0.35762269
# 1.40 +0.35762269 +0.39458652 +0.39742941
# 1.50 +0.39742941 +0.43973788 +0.44244492
# 1.60 +0.44244492 +0.48985512 +0.49245437
# 1.70 +0.49245437 +0.54477425 +0.54728712
# 1.80 +0.54728712 +0.60436350 +0.60680651
# 1.90 +0.60680651 +0.66851618 +0.67090220
#
# Resultado final:
# y(2.00) = 0.67090220
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