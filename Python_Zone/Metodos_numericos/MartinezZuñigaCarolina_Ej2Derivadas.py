# Alumno: Carolina Martinez Zuñiga
# Maestro: Fernando Rodriguez Haro
# Ejercicio 2

# Funcion: 6.4x³+6.45x²+20.358x-31.752

import numpy as np
import matplotlib.pyplot as plt

# Funcion
def f(x):
    return 6.4*(x**3) + 6.45*(x**2) + 20.358*(x) - 31.752

def d1_adelanteOh2(x, h):
    return (-f(x + 2*h) + 4*f(x + h) - 3*f(x)) / (2*h)

def d1_atrasOh2(x, h):
    return (3*(f(x)) - 4*f(x-h) + f(x-2*h)) / (2*h)

def d1_centralesOh2(x, h):
    return (-(f(x+2*h)) + 8*f(x+h) - 8*f(x-h) + f(x-2*h)) / (12*h)

def d2_centralesOh2(x, h):
    return (-(f(x+2*h)) + 16*f(x+h) - 30*f(x) + 16*f(x-h) - f(x-2*h)) / (12*h**2)

def d3_centralesOh2(x, h):
    return (-(f(x+3*h)) + 8*f(x+2*h) - 13*f(x+h) + 13*f(x-h) - 8*f(x-2*h) + f(x-3*h)) / (8*h**3)

def d4_centralesOh2(x, h):
    return (-(f(x+3*h)) + 12*f(x+2*h) - 39*f(x+h) + 56*f(x) - 39*f(x-h) + 12*f(x-2*h) - f(x-3*h)) / (6*h**4)

x= 2.75
h = 0.1

print("f(2.75) = ", f(x))
print("La primera derivada O(h^2) hacia adelante f'(2.75)= ", d1_adelanteOh2(x, h))
print("La primera derivada O(h^2) hacia atras f'(2.75)= ", d1_atrasOh2(x, h))
print("La primera derivada O(h^2) centrales f'(2.75)= ", d1_centralesOh2(x, h))
print("La segunda derivada O(h^2) centrales f''(2.75)= ", d2_centralesOh2(x, h))
print("La tercera derivada O(h^2) centrales f'''(2.75)= ", d3_centralesOh2(x, h))
print("La cuarta derivada O(h^2) centrales f''''(2.75)= ", d4_centralesOh2(x, h))

x_vals = np.linspace(-5, 5, 400)
h = 0.1

# Evaluaciones
y  = [f(x) for x in x_vals]
y1 = [d1_centralesOh2(x, h) for x in x_vals]
y2 = [d2_centralesOh2(x, h) for x in x_vals]
y3 = [d3_centralesOh2(x, h) for x in x_vals]
y4 = [d4_centralesOh2(x, h) for x in x_vals]

# Crear gráfica
plt.figure()

plt.plot(x_vals, y,  label="f(x)")
plt.plot(x_vals, y1, label="d1")
plt.plot(x_vals, y2, label="d2")
plt.plot(x_vals, y3, label="d3")
plt.plot(x_vals, y4, label="d4")

# Etiquetas tipo d1, d2...
puntos = [-4, -2, 0, 2, 4]
for p in puntos:
    plt.text(p, d1_centralesOh2(p, h), "d1")
    plt.text(p, d2_centralesOh2(p, h), "d2")
    plt.text(p, d3_centralesOh2(p, h), "d3")
    plt.text(p, d4_centralesOh2(p, h), "d4")

plt.title("Funcion y derivadas numericas")
plt.legend()
plt.grid()

plt.savefig("MartinezZuñigaCarolina_Ej2Derivadas_Grafica.png")
plt.show()

# SALIDA / EJECUCION
#
# f(2.75) =  206.110625
# La primera derivada O(h^2) hacia adelante f'(2.75)=  200.90500000000077
# La primera derivada O(h^2) hacia atras f'(2.75)=  200.90499999999977
# La primera derivada O(h^2) centrales f'(2.75)=  201.0330000000002
# La segunda derivada O(h^2) centrales f''(2.75)=  118.50000000000091
# La tercera derivada O(h^2) centrales f'''(2.75)=  38.40000000000287
# La cuarta derivada O(h^2) centrales f''''(2.75)=  -1.2316074086508402e-09
#
# Process finished with exit code 0


