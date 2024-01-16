from abc import ABC, abstractmethod

class Trabajador(ABC):

    @abstractmethod
    def trabajar(self):
        pass

class Comedor():

    @abstractmethod
    def comer(self):
        pass

class Durmiente():

    @abstractmethod
    def dormir (self):
        pass

class Humano (Trabajador):
    def comer(self):
        print("El humano esta  comiendo")

    def trabajar(self):
        print("El humano esta trabajando ")

    def dormir (self):
        print("El humano esta comiendo ")

class Robot (Trabajador):
    
    def trabajar(self):
        print("El Robot  esta trabajando ")


robot =  Robot()
humano = Humano()

robot.trabajar()
humano.comer()
humano.dormir()
humano.trabajar()



