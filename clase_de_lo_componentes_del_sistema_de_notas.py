#generacion de la clase persona como clase padre a la que pertenecen las demas
class Persona:
    def __init__(self, nombre, documento_de_identidad, area_de_estudio):
        self.nombre = nombre
        self.documento_de_identidad = documento_de_identidad
        self.area_de_estudio = area_de_estudio
#generacion de la clase estudiante como clase hija de la clase persona
class alumno(Persona):
    def __init__(self, nombre, documento_de_identidad, area_de_estudio, asistencia_a_clases):
        super().__init__(nombre, documento_de_identidad, area_de_estudio)
        self.asistencia_a_clases = asistencia_a_clases
#generacion de la clase maestro como clase hija de la clase persona
class maestro(Persona):
    def __init__(self, nombre, documento_de_identidad, area_de_estudio, materia_que_enseña):
        super().__init__(nombre, documento_de_identidad, area_de_estudio)
        self.materia_que_enseña = materia_que_enseña

class materia:
    def __init__(self, nombre_de_la_materia, codigo_de_la_materia,profe,estudiante,minimo_de_asistencia):
        self.nombre_de_la_materia = nombre_de_la_materia
        self.codigo_de_la_materia = codigo_de_la_materia
        self.profe = profe #una vez en la creacion de los opjetos la variable "profe" debe contener el objeto maestro
        self.estudiante = estudiante #una vez en la creacion de los opjetos la variable "estudiante" debe contener el objeto alumno
        self.minimo_de_asistencia = minimo_de_asistencia

class administrador(Persona):
    def __init__(self, nombre, documento_de_identidad, area_de_estudio, materia):
        super().__init__(nombre, documento_de_identidad, area_de_estudio)
        self.materia = materia  #una vez en la creacion de los opjetos la variable "materia" debe contener el objeto materia

    def verificar_asistencia(self):
        estudiante_asistencia = self.materia.estudiante
        if estudiante_asistencia.asistencia_a_clases < self.materia.minimo_de_asistencia:
            return True  #en caso tal la afirmacion de que el alumno asistio menos de lo devido este sera reprobado
        else:
            return False  #en caso contrario abra aprobado

class reporte:
    def __init__(self, administrador):
        self.administrador = administrador
    def generar(self):
        estado = self.administrador.verificar_asistencia()
        estudiante = self.administrador.materia.estudiante
        if estado == True :  # True
            print(f"El estudiante {estudiante.nombre} está REPROBADO por inasistencia.")
        else:
            print(f"El estudiante {estudiante.nombre} está APROBADO.")