import csv

#En este espacio podrás programar las funciones que deseas usar en la función solución (ES OPCIONAL)
def evaluate(age, state):
    if age < 18:
        if state == "FALLECIDO":
            return 'Infante fallecido'
        return 'Infante sobreviviente'
    if state == "FALLECIDO":
        return 'Adulto fallecido'
    return 'Adulto sobreviviente'
    
def convert_age(value, unit):
    if unit == 2:
        value /=12
    if unit == 3:
        value /= 365
    return value

def convert_age2(value, unit):
    if unit == 2:
        value *=12
    if unit == 3:
        value *= 365
    return value

"""Fin espacio para programar funciones propias"""
    
def solucion():
    #ESTA ES LA FUNCIÓN A LA QUE LE DEBES GARANTIZAR LOS RETORNOS REQUERIDOS EN EL ENUNCIADO.
    woman_youngest = 100
    unit_youngest = 0
    mean_alive_y = 0
    cont = 0
    text = 'ID de caso;Estado;Concepto'
    
    with open('COVCOLIII.csv') as read:
        reader = csv.DictReader(read)
        for row in reader:
            unit = int(row['Unidad de medida de edad'])
            age = convert_age(int(row['Edad']), unit)
            gender = row['Sexo'].upper()
            state = row['Estado'].upper()
            
            if gender == 'F' and age < woman_youngest:
                woman_youngest = age
                unit_youngest = unit
            if age < 18 and state != 'FALLECIDO':
                mean_alive_y += age
                cont += 1
            text += "\n{0};{1};{2}".format(row['ID de caso'], state, evaluate(age, state))
            
        f = open("analisis_covcol3.csv", "w+")
        f.write(text)
        f.close()
    
    return convert_age2(woman_youngest, unit_youngest), unit_youngest, mean_alive_y/cont

