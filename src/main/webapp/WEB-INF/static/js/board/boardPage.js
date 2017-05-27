$(function () {
    var myApp = angular.module('boardPage',['ui.grid']);

    myApp.controller('boardPageCtrl', function($scope, $http){
        // 초기화
        $scope.init = function (){
            $scope.message = "EdgarJo";
            $scope.http_selectBoard();
        };


        // http select board data
        $scope.http_selectBoard = function () {

            $http({
                method: 'post',
                url:'/selectBoard.do',
                data: "",
                headers: {'Content-Type': 'application/json; charset=utf-8'} //헤더
            }).then(function(res){
                console.log("###success: " + JSON.stringify(res));

                    $scope.gridData = res.data.BOARD_DATA;

                    $scope.gridOptions = {
                        data: 'gridData',
                        enableCellSelection: true,
                        enableRowSelection: false,
                        enableCellEdit: true,
                        columnDefs: [
                            {field: 'bno', displayName: 'bno', enableCellEdit: false},
                            {field: 'title', displayName:'title', enableCellEdit: false},
                            {field: 'writer', displayName: 'writer', enableCellEdit: false},
                            {field: 'viewcnt', displayName: 'viewcnt', enableCellEdit: false},
                            {field: 'regdate', displayName: 'regdate', enableCellEdit: false}
                        ]
                    };


            }, function(res){
                    console.log("####error");
                }
            );




            /*var res = $http.post("/selectBoard.do");
            res.then(function(json, textStatus, jqXHR, frm){ // success
                    // console.log("##json: " + JSON.stringify(json));
                    // $scope.gridOptions = json.data.BOARD_DATA;
                    $scope.fn_makeGrid(json.data.BOARD_DATA);
                },function (json, textStatus, jqXHR, frm) { // error
                    console.log("###error $http");
               }
            ); // end res*/
        };

        $scope.init();
    });
}());


