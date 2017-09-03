function monkey() {
    function callback() {
        gremlins.createHorde().unleash({ nb: 10000 });
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