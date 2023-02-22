"use strict"

const validity = document.getElementById("pword")
    validity.addEventListener('input', sjekkPassordStyrke);

function sjekkPassordStyrke() {
    if (validity.valid) {
       if( validity.length <12) {
           skru på mediumpassord
       }
    }
}