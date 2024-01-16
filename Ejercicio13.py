class Persona:
    def __init__(self, nombre, edad):
        self.__nombre = nombre
        self._edad = edad
    
    '''
Decorador que accede a la propiedad
'''
    @property
    def nombre(self):
        return self.__nombre  
    '''
    Decorador que modifica la propiedad
'''
    @nombre.setter
    def nombre(self,new_nombre):
        self.__nombre = new_nombre

    @nombre.deleter
    def nombre(self):
        del self.__nombre
   
dalto = Persona("Roberto", 34)

nombre =dalto.nombre
print(nombre)

dalto.nombre="Juan"

nombre = dalto.nombre
print(nombre)

del dalto.nombre
print("que haces ")