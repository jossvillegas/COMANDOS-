# class Ave:
#     def volar(self):
#         return "Estoy volando"
    
# class Pinguino(Ave):
#     def volar(self):
#         return "No puedo volar "
    
#     def hacer_volar(ave= Ave):
#         return ave.volar()
    
#     print (hacer_volar(Pinguino()))

class Ave:

    def __str__(self) :
        return "Soy una ave"

class AveVoladora(Ave):
    def volar(self):
        return "Estoy volando"
    def __str__(self):
        return f" {self.volar()}"

class AveNoVoladora(Ave):
    def __str__(self):
        return "Soy una ave no voladora "
    

ave =Ave()
print(ave)

ave_voladora =AveVoladora()
print(ave_voladora)

ave_no_voladora =AveNoVoladora()
print(ave_no_voladora)