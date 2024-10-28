function ab() {
    var msg = document.getElementsByClassName("ip");
    var txt = '';
    for (var i = 0; i < msg.length; i++) {
        txt += msg[i].value + "<br><br>";
    }
    document.getElementById("dispaly_msg").innerHTML = txt;
    return false;
}