import numpy as np
import matplotlib.pyplot as plt
from scipy.integrate import quad

# Definisikan fungsi yang akan dihitung integralnya
def f(x):
    return -x**2 + 3*x + 4

# Meminta input dari pengguna untuk batas bawah dan batas atas integral
lower_limit = float(input("Masukkan batas bawah integral: "))
upper_limit = float(input("Masukkan batas atas integral: "))

# Tampilkan fungsi yang akan diintegralkan
print(f"\nFungsi yang diintegralkan: f(x) = -x^2 + 3x + 4")

# 1. Integral Analitik (Langkah demi langkah)
print("\nLangkah-langkah Integral Analitik:")
print(f"Integral dari f(x) dari {lower_limit} hingga {upper_limit}: ")
print("∫(-x^2 + 3x + 4) dx")

# Hitung komponen integral satu per satu
def integral_x3(a, b):
    return (1/3)*(b**3) - (1/3)*(a**3)

def integral_x2(a, b):
    return (3/2)*(b**2) - (3/2)*(a**2)

def integral_x1(a, b):
    return 4*b - 4*a

# Tampilkan perhitungan komponen
print(f"\nKomponen pertama (-x^2):")
print(f"(1/3) * ({upper_limit}^3 - {lower_limit}^3) = {integral_x3(lower_limit, upper_limit)}")

print(f"\nKomponen kedua (3x^2):")
print(f"(3/2) * ({upper_limit}^2 - {lower_limit}^2) = {integral_x2(lower_limit, upper_limit)}")

print(f"\nKomponen ketiga (4x):")
print(f"4 * ({upper_limit} - {lower_limit}) = {integral_x1(lower_limit, upper_limit)}")

# Hitung integral total
integral_analitik = integral_x3(lower_limit, upper_limit) + integral_x2(lower_limit, upper_limit) + integral_x1(lower_limit, upper_limit)

print(f"\nHasil Integral Analitik: {integral_analitik}")

# 2. Integral Numerik (Langkah demi langkah dengan metode Trapesium)
print("\nLangkah-langkah Integral Numerik (Metode Trapesium):")

# Membuat nilai-nilai x dan y
x_vals = np.linspace(lower_limit, upper_limit, 1000)
y_vals = f(x_vals)

# Rumus Trapesium: (1/2) * (y1 + y2) * Δx
dx = x_vals[1] - x_vals[0]
print(f"\nΔx (lebar trapesium): {dx}")

# Hitung integral numerik dengan menjumlahkan setiap trapesium
integral_numerik = np.trapz(y_vals, x_vals)
print(f"\nHasil Integral Numerik (Metode Trapesium): {integral_numerik}")

# 3. Error antara analitik dan numerik
error = abs(integral_analitik - integral_numerik)
print(f"\nError antara Integral Analitik dan Numerik: {error}")

# 4. Plot Kurva
# Menghitung titik-titik pada kurva untuk plotting
x = np.linspace(lower_limit - 1, upper_limit + 1, 400)  # Nilai x lebih lebar agar grafiknya jelas
y = f(x)

# Plot kurva fungsi
plt.plot(x, y, label=r'$f(x) = -x^2 + 3x + 4$', color='black')

# Plot sumbu x dan y
plt.axhline(0, color='black', linewidth=1)
plt.axvline(0, color='black', linewidth=1)

# Plot area di bawah kurva pada selang [lower_limit, upper_limit]
x_fill = np.linspace(lower_limit, upper_limit, 400)
y_fill = f(x_fill)
plt.fill_between(x_fill, y_fill, alpha=0.3, color='orange', label="Area di bawah kurva")

# Menandai titik potong x
plt.scatter([-1, 4], [0, 0], color='red')  # Titik potong x di (-1, 0) dan (4, 0)
plt.text(-1, -1, '(-1,0)', fontsize=12, color='red')
plt.text(4, -1, '(4,0)', fontsize=12, color='red')

# Titik puncak parabola
x_puncak = 1.5
y_puncak = f(x_puncak)
plt.scatter([x_puncak], [y_puncak], color='blue')
plt.text(x_puncak, y_puncak + 0.5, f'({x_puncak}, {y_puncak})', fontsize=12, color='blue')

# Pengaturan plot
plt.title(f"Grafik Kurva $f(x) = -x^2 + 3x + 4$ dari {lower_limit} hingga {upper_limit}")
plt.xlabel("x")
plt.ylabel("f(x)")
plt.legend()
plt.grid(True)

# Tampilkan grafik
plt.show()
