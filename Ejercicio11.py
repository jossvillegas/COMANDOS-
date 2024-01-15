class Persona:
    def __init__(self,nombre,edad):
        self.__nombre= nombre
        self.__edad=edad

    def get_nombre(self):
        return self.__nombre
'''
Creamos al objecto
'''
dalto = Persona("Lucas",21)


nombre = dalto.get_nombre()
print(nombre)

