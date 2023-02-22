"use strict"

const elementP  = document.getElementById('pword');
const elementPR = document.getElementById("pwordRep");

class FORMController {

    sjekkRepPassord(event) {
        const word = elementPR;
        const currentPword = elementP.value;

        if (word.value.length > 0 && currentPword === word.value) {
            elementPR.classList.remove("pwordMatch")
            elementPR.classList.add("pwordMatch")
        } else {
            elementPR.classList.remove("pwordMatch")
            event.target.setCustomValidity("Repetert passord er feil!")
        }
    }
    sjekkPassordStyrke(event) {
        const word = elementP.value;
        const validity = event.target.validity;
        if (validity.valid) {
            if (word.length > 15) {
                elementP.classList.remove("mediumPassword", "weakPassword")
                elementP.classList.add("strongPassword")// = "strongPassword"
            }
            else if (word.length > 12) {
                elementP.classList.remove("strongPassword", "weakPassword")
                elementP.classList.add("mediumPassword")// = "mediumPassword"
            }
            else {
                elementP.classList.remove("mediumPassword", "strongPassword");
                elementP.classList.add("weakPassword");


            }
        }
    }
}

function init () {
    const test = new FORMController();

    elementP.addEventListener('keyup', test.sjekkPassordStyrke);
    elementPR.addEventListener('keyup', test.sjekkRepPassord);

    console.log("Running")

}
document.addEventListener('DOMContentLoaded',init);