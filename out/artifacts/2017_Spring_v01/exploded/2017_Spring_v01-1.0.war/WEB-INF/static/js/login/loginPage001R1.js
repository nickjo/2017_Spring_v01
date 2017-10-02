(function() {
    "use strict";

    var myApp = angular.module('loginPage001R1');

    myApp.controller("loginPage001R1C1", function ($scope) {
        $scope.init = function(){
            console.log("####loginPage001R1C1 init");
            $scope.initMessage = "loginPage001R1C1";
        };

        $scope.init();
    });
})();