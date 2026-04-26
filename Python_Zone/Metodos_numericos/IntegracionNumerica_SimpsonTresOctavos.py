# Integrales con Simpson 3/8
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

# Validación Simpson 3/8
if n % 3 != 0:
    print("Error: n debe ser MULTIPLO de 3 para Simpson 3/8")
    exit()

h = (b-a)/n
fx0 = funcion(a)
fxn = funcion(b)

s_multiplos3 = 0
s_otros = 0

i = 1
x = a

while(i < n):
    x = x + h
    if i % 3 == 0:
        s_multiplos3 = s_multiplos3 + funcion(x)
    else:
        s_otros = s_otros + funcion(x)
    i += 1

sf = fx0 + fxn + (2 * s_multiplos3) + (3 * s_otros)
area = (3*h/8) * sf

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

plt.title("Integracion: Simpson 3/8")
plt.xlabel("x")
plt.ylabel("y")

plt.savefig("Simpson3Octavos.png")
plt.show()