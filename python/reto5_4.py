import csv


def evaluate(prom):
    if prom < 239:
        return 'MUY BAJO'
    elif prom >= 239 and prom < 265:
        return 'BAJO'
    elif prom >= 265 and prom < 291:
        return 'MEDIO'
    elif prom >= 291 and prom < 317:
        return 'ALTO'
    elif prom >= 317:
        return 'MUY ALTO'
    

def solucion():
    #ESTA ES LA FUNCIÓN A LA QUE LE DEBES GARANTIZAR LOS RETORNOS REQUERIDOS EN EL ENUNCIADO.
    
    with open('FB.csv') as file:
        reader = csv.DictReader(file)
        data=[]
        for row in reader:
            prom = (float(row['High'])+float(row['Low']))/2
            obj = {}
            obj['Fecha'] = row['Date']
            obj['Mean-Min-Max'] = prom
            obj['Concepto'] = evaluate(prom) 
            data.append(obj)
        writeFile('analisis_archivo.csv', data, '\t')
        high = max(data, key=lambda x:x['Mean-Min-Max'])
        low = min(data, key=lambda x:x['Mean-Min-Max'])
        
    return low['Fecha'], low['Mean-Min-Max'], high['Fecha'], high['Mean-Min-Max']

def writeFile(name_file, data, delimiter):
    dialect = csv.excel
    dialect.delimiter = delimiter
    with open(name_file, 'w') as file:
        writer = csv.DictWriter(file, fieldnames=data[0].keys(), dialect = dialect)
        writer.writeheader()
        writer.writerows(data)
    
