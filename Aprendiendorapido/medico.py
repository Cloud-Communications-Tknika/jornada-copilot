class Medico:
    def __init__(self, nombre, especialidad):
        self.nombre = nombre
        self.especialidad = especialidad

    def presentarse(self):
        return f"Soy el doctor {self.nombre} y mi especialidad es {self.especialidad}"