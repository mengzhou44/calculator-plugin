var exec = require('cordova/exec');

var PLUGIN_NAME = 'CalculatorPlugin';

var Calculator = {
    add: function (a, b, cb) {
        exec(cb, null, PLUGIN_NAME, 'add', [a, b]);
    }
};

module.exports = Calculator;
