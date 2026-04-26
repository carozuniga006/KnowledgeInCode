# Integrales con Simpson 1/3
# Carolina Martinez Zuñiga

import numpy as np
import matplotlib.pyplot as plt

def funcion(x):
    y = np.sin(x) * x
    return (y)

a = float(input("Ingresa a: "))
b = float(input("Ingresa b: "))
n = int(input("Ingresa n: "))

if n <= 0:
    print("Error: n debe ser mayor que 0")
    exit()

if a >= b:
    print("Error: a debe ser menor que b")
    exit()

if n % 2 != 0:
    print("Error: n debe ser PAR para Simpson 1/3")
    exit()

h = (b-a)/n
fx0 = funcion(a)
fxn = funcion(b)

s_impares = 0
s_pares = 0

i = 1
x = a

while(i < n):
    x = x + h
    if i % 2 == 0:
        s_pares = s_pares + funcion(x)
    else:
        s_impares = s_impares + funcion(x)
    i += 1

sf = fx0 + fxn + (4 * s_impares) + (2 * s_pares)
area = (h/3) * sf

print('n = ', n)
print('a = ', a)
print('b = ', b)
print('h = ', h)
print('Area = ', area)

# Graficar
xig = np.linspace(a, b, 100)
fig = funcion(xig)
plt.plot(xig, fig)

xi = np.linspace(a, b, n+1)
fi = funcion(xi)

plt.fill_between(xi, 0, fi, color='purple')

for i in range(0, n+1, 1):
    plt.axvline(xi[i], color='w')

plt.plot(xi, fi, 'o', color='blue')

plt.title("Integracion: Simpson 1/3")
plt.xlabel("x")
plt.ylabel("y")

plt.savefig("Simpson1Tercio.png")
plt.show()

# SALIDA EJECUCION
#
# Ingresa a: 1
# Ingresa b: 10
# Ingresa n: 12
# n =  12
# a =  1.0
# b =  10.0
# h =  0.75
# Area =  7.056092865983402