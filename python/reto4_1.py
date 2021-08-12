
def actualizar_estado_pestana(operaciones_usuario, pagina_default):
    #ESTA ES LA FUNCIÓN A LA QUE LE DEBES GARANTIZAR LOS RETORNOS REQUERIDOS EN EL ENUNCIADO.
    pila_atras, pagina_actual, pila_adelante = [], pagina_default, []
    for action in operaciones_usuario:
        if action == "atras":
            pila_adelante.append(pagina_actual)
            pagina_actual = pila_atras.pop()
        elif action == "adelante":
            pila_atras.append(pagina_actual)
            pagina_actual = pila_adelante.pop()
        else:
            if pagina_actual != action:
                pila_atras.append(pagina_actual)
                pagina_actual = action
                pila_adelante=[]
    return pila_atras, pagina_actual, pila_adelante

