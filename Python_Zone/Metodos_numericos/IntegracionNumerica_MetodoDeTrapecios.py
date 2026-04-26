# Integrales con Trapecios
# Carolina Martinez Zuñiga

# funcion: f(x) = 1.25 * sin(x/2) + 3  // a = 1;  b = 10;  n = 12

import numpy as np
import matplotlib.pyplot as plt

# Definir nuestra funcion
def funcion(x):
    y = 1.25 * np.sin(x/2) + 3
    return y

# Datos de intervalos a ingresar
a = float(input("Ingresa a: "))
b = float(input("Ingresa b: "))
n = int(input("Ingresa n: "))

# Validaciones
if n <= 0:
    print("ERROR. n debe ser mayor que 0")
    exit()

if a >= b:
    print("ERROR. a debe ser mayor que b")
    exit()

# Calculos de valores extra
h = (b - a) / n
fx0 = funcion(a)
fxn = funcion(b)
s = 0
i = 1
x = a

# Ciclo para la sumatoria
while(i < n):
    x = x + h
    s = s + funcion(x)
    i += 1

# Formula
sf = fx0 + fxn + (2*s)
area = (h/2) * sf

# Mostrar resultados
print('n = ', n) # = 12
print('a = ', a) # = 1
print('b = ', b) # = 10
print('h = ', h)
print('Area = ', area)

# Grafica
xig = np.linspace(a, b, 100)
fig = funcion(xig)
plt.plot(xig, fig)
xi = np.linspace(a, b, n+1)
fi = funcion(xi)
plt.fill_between(xi, 0, fi, color='purple')
for i in range (0,n+1, 1):
    plt.axvline(xi[i], color='w')
plt.plot(xi, fi, 'o', color='blue')
plt.title("Integracion: Regla de Trapecios")
plt.xlabel("x")
plt.ylabel("y")
#plt.savefig("MartinezZuñigaCarolina_IntegracionNumerica.png")
plt.show()

# EJECUCION DEL PROGRAMA
#
# Ingresa a: 1
# Ingresa b: 10
# Ingresa n: 12
# n =  12
# a =  1.0
# b =  10.0
# h =  0.75
# Area =  28.467360011737675