def decorador(funcion):
    '''
Creamos una funcion 
'''
    def funcion_modificada():
        print("Antes de llamar a la funcion")
        funcion()
        print("Despues de llamar a la funcion")
        
    return funcion_modificada
        
# def saludo():
#     print("Hola Dalto")
#     '''
# Creamos una funcion 
# '''

# saludo_modificado = decorador(saludo)
# saludo_modificado()

@decorador
def saludo():
    print("Hola Dalto como andas")

saludo()
