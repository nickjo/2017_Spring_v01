(function() {
    "use strict";

    agGrid.initialiseAgGridWithAngular1(angular);
    var myApp = angular.module('restBoard001R1', ['agGrid']);

    myApp.controller("restBoard001R1C1", function ($scope) {
        $scope.init = function(){
            console.log("####restBoard001R1C1 init");
            $scope.initMessage = "restBoard001R1C1";
        };

        $scope.init();
    });
})();