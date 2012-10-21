(function (lib) {
    function Chain(scope) {
        if( arguments.length > 1) {
            for(var i=1; i<arguments.length; i++) {
                var chain = arguments[i];

            }
        }
    }
    Lib.MyClass = function () {
        var instance = new lib();
        log('The Augmenter Constructor');
        enhance(instance);
        return instance;
    };
    function enhance(instance) {
        log('enhancing');
        instance.printName = function () {
            instance.printName();
            log('augmented printName: ' + this.name);
        }
    }
})(Lib.MyClass);