function log(msg) {
    document.getElementById("log").innerHTML += msg + "<br/>";
}
var Lib = {};

Lib.MyClass = function() {
    this.name = "Hello World";
}
Lib.MyClass.prototype.printName = function() {
    log(this.name);
}