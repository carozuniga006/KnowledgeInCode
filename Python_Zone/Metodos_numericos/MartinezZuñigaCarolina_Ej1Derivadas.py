# Alumno: Carolina Martinez Zuñiga
# Maestro: Fernando Rodriguez Haro
# Ejercicio 1

# Funcion: 2x⁴ + 3.5x³-0.5x²+8x+3.25

import numpy as np
import matplotlib.pyplot as plt

# Funcion
def f(x):
    return 2*(x**4) + 3.5*(x**3) - 0.5*(x**2) + 8*(x) + 3.25

# Primera derivada Oh hacia adelante
def d1_adelanteOh(x, h):
    res = (f(x+h) - f(x))/h
    return res

# Primera derivada Oh hacia atras
def d1_atrasOh(x, h):
    res = (f(x) - f(x-h))/h
    return res

# Primera derivada Oh centrales
def d1_centralesOh(x, h):
    res = (f(x+h) - f(x-h))/(2*h)
    return res

def d1_centralesOh2(x, h):
    return (-(f(x+2*h)) + 8*f(x+h) - 8*f(x-h) + f(x-2*h)) / (12*h)

def d2_centralesOh2(x, h):
    return (-(f(x+2*h)) + 16*f(x+h) - 30*f(x) + 16*f(x-h) - f(x-2*h)) / (12*h**2)

def d3_centralesOh2(x, h):
    return (-(f(x+3*h)) + 8*f(x+2*h) - 13*f(x+h) + 13*f(x-h) - 8*f(x-2*h) + f(x-3*h)) / (8*h**3)

def d4_centralesOh2(x, h):
    return (-(f(x+3*h)) + 12*f(x+2*h) - 39*f(x+h) + 56*f(x) - 39*f(x-h) + 12*f(x-2*h) - f(x-3*h)) / (6*h**4)

x= 1.5
h = 0.1

print("f(1.5) = ", f(x))
print("La primera derivada O(h) hacia adelante f'(1.5)= ", d1_adelanteOh(x, h))
print("La primera derivada O(h) hacia atras f'(1.5)= ", d1_atrasOh(x, h))
print("La primera derivada O(h) centrales f'(1.5)= ", d1_centralesOh(x, h))
print("La primera derivada O(h^2) centrales f'(1.5)= ", d1_centralesOh2(x, h))
print("La segunda derivada O(h^2) centrales f''(1.5)= ", d2_centralesOh2(x, h))
print("La tercera derivada O(h^2) centrales f'''(1.5)= ", d3_centralesOh2(x, h))
print("La cuarta derivada O(h^2) centrales f''''(1.5)= ", d4_centralesOh2(x, h))

# Rango de X
x_vals = np.linspace(-5, 5, 400)
h = 0.1

# Evaluaciones
y  = [f(x) for x in x_vals]
y1 = [d1_centralesOh2(x, h) for x in x_vals]
y2 = [d2_centralesOh2(x, h) for x in x_vals]
y3 = [d3_centralesOh2(x, h) for x in x_vals]
y4 = [d4_centralesOh2(x, h) for x in x_vals]

# Grafica
plt.figure()

plt.plot(x_vals, y,  label="f(x)")
plt.plot(x_vals, y1, label="d1")
plt.plot(x_vals, y2, label="d2")
plt.plot(x_vals, y3, label="d3")
plt.plot(x_vals, y4, label="d4")

# Etiquetas en algunos puntos
puntos = [-4, -2, 0, 2, 4]
for p in puntos:
    plt.text(p, d1_centralesOh2(p, h), "d1")
    plt.text(p, d2_centralesOh2(p, h), "d2")
    plt.text(p, d3_centralesOh2(p, h), "d3")
    plt.text(p, d4_centralesOh2(p, h), "d4")

plt.title("Funcion y derivadas numericas")
plt.legend()
plt.grid()

plt.savefig("MartinezZuñigaCarolina_Ej1Derivadas_Grafica.png")
plt.show()

# SALIDA / EJECUCION

# f(1.5) =  36.0625
# La primera derivada O(h) hacia adelante f'(1.5)=  61.507000000000005
# La primera derivada O(h) hacia atras f'(1.5)=  53.05300000000006
# La primera derivada O(h) centrales f'(1.5)=  57.28000000000003
# La primera derivada O(h^2) centrales f'(1.5)=  57.125000000000014
# La segunda derivada O(h^2) centrales f''(1.5)=  84.499999999999
# La tercera derivada O(h^2) centrales f'''(1.5)=  92.99999999997908
# La cuarta derivada O(h^2) centrales f''''(1.5)=  48.00000000026116
#
# Process finished with exit code 0

