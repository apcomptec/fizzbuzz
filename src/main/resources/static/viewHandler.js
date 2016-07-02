/**
 * Created by brallan on 01/07/16.
 */

var random;

function createDialogBox() {
    random = random = Math.floor((Math.random() * 1000) + 1);

    var dialog = document.getElementById("dialogText");
    dialog.innerHTML = 'El número ' + random + ' es...';

    $( "#dialog-confirm" ).dialog({
        resizable: false,
        height:200,
        width:500,
        modal: true,
        buttons: {
            "Fizz": function() {
                $( this ).dialog( "close" );
                clearBoard("Fizz");
            },

            "Buzz": function() {
                $( this ).dialog( "close" );
                clearBoard("Buzz");
            },
            "FizzBuzz": function() {
                $( this ).dialog( "close" );
                clearBoard("FizzBuzz");
            },
            "Simple" : function() {
                $( this ).dialog( "close" );
                clearBoard(random + "");
            }
        }
    });
}

function httpGetNumber(pNumber)
{
    var request = new XMLHttpRequest();
    var response;
    request.onreadystatechange = function() {

        if (request.readyState === 4) {
            if (request.status === 200) {
                document.body.className = 'ok';
                response = request.responseText;
            } else {
                document.body.className = 'error';
            }
        }
    };

    request.open("GET", "http://localhost:8080/play?number=" + pNumber, false);
    request.send(null);

    return response;
}

function clearBoard(selectedOption) {
    var dialog = document.getElementById("dialogText");
    var response = httpGetNumber(random);

    dialog.innerHTML = response === selectedOption ? "¡Correcto!" : "Incorrecto :(";

    $( "#dialog-confirm" ).dialog({
        resizable: false,
        height:200,
        width:500,
        modal: true,
        buttons: {
            "Seguir jugando": function() {
                $( this ).dialog( "close" );
                createDialogBox();
            }
        }
    });
}