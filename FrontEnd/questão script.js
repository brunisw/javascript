/*O programa deve:
->Registrar 5 usuários -> por prompt() num array
->Permitir buscar o nome usuário para saber se ele existe e onde ele está no array*/

function registrarNomes(listaNames){
    var listaNames = [];
    for(i=0; i<5; i++){
        listaNames[i] = prompt("Registre o nome: ")
    }
    return listaNames
}
function buscarNaLista(names, nameForSearch){
    var countNotFound =0;
    for(i=0; i<5; i++){
        if(names[i] == nameForSearch){
            document.write("Nome encontrado! Está na posição "+i)
            break
        }else{
            countNotFound++
        }
    }
    if(countNotFound==5){
        document.write("Nome não encontrado")
    }
}

var names = registrarNomes(names)
var nameSearch = prompt("Qual nome deseja procurar: ")
buscarNaLista(names,nameSearch)