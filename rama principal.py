import clase_de_lo_componentes_del_sistema_de_notas
from clase_de_lo_componentes_del_sistema_de_notas import maestro, alumno, materia, administrador, reporte
# Pedir datos para crear un maestro
nombre_maestro = input("Ingrese el nombre del maestro: ")
doc_maestro = int(input("Ingrese el documento del maestro: "))
area_maestro = input("Ingrese el área de estudio del maestro: ")
materia_que_ensena = input("Ingrese la materia que enseña: ")
maestro1 = maestro(nombre_maestro, doc_maestro, area_maestro, materia_que_ensena)

# Pedir datos para crear un alumno
nombre_alumno = input("Ingrese el nombre del alumno: ")
doc_alumno = int(input("Ingrese el documento del alumno: "))
area_alumno = input("Ingrese el área de estudio del alumno: ")
asistencias = int(input("Ingrese el número de asistencias del alumno: "))
alumno1 = alumno(nombre_alumno, doc_alumno, area_alumno, asistencias)

# Pedir datos de la materia
nombre_materia = input("Ingrese el nombre de la materia: ")
codigo_materia = int(input("Ingrese el código de la materia: "))
min_asistencia = int(input("Ingrese el mínimo de asistencia requerido: "))
materia1 = materia(nombre_materia, codigo_materia, maestro1, alumno1, min_asistencia)

# Crear administrador
# Crear administrador
admin1 = administrador("Luis", 232546, "Administración", materia1)

# Crear reporte
reporte1 = reporte(admin1)
reporte1.generar()
