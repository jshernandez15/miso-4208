function monkey() {
    function callback() {
        gremlins.createHorde()
        .before(function(done) {
            var horde = this;
            setTimeout(function(){
                horde.log('async');
                done();
            }, 500);
        })
        .before(function() {
            this.log('sync');
        })
        .gremlin(gremlins.species.formFiller())
        .mogwai(gremlins.mogwais.alert())
        .mogwai(gremlins.mogwais.gizmo().maxErrors(10))
        .unleash();
    }
    var s = document.createElement("script");
    s.src = "https://rawgithub.com/marmelab/gremlins.js/master/gremlins.min.js";
    if (s.addEventListener) {
        s.addEventListener("load", callback, false)
    } else if (s.readyState) {
        s.onreadystatechange = callback
    }
    document.body.appendChild(s);
}