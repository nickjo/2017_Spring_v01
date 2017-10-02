(function(){
    "use strict";

    agGrid.initialiseAgGridWithAngular1(angular);
    var myApp = angular.module('boardPage',['agGrid']);

    myApp.controller('boardPageCtrl', function($scope, $http) {
        // 초기화
        $scope.init = function () {
            $scope.message = "board001R1";
            $scope.gridOptions = {};
            $scope.select_board();
            $scope.makeGrid();

        };

        // grid init
        $scope.makeGrid = function(){
            var columnDefs = [
                {headerName: "bno", field: "bno"},
                {headerName: "title", field: "title"},
                {headerName: "content", field: "content"},
                {headerName: "writer", field: "writer"},
                {headerName: "viewcnt", field: "viewcnt"}
            ];

            $scope.gridOptions = {
                // set rowData to null or undefined to show loading panel by default
                rowData: null,
                columnDefs: columnDefs,
                enableColResize: true,
                enableSorting: true,
                enableFilter: true,
                // custom loading template. the class ag-overlay-loading-center is part of the grid,
                // it gives a white background and rounded border
                overlayLoadingTemplate: '<span class="ag-overlay-loading-center">Please wait while your rows are loading</span>',
                overlayNoRowsTemplate: '<span style="padding: 10px; border: 2px solid #444; background: lightgoldenrodyellow;">This is a custom \'no rows\' overlay</span>',
                onRowDoubleClicked: onSelectionChanged,
                rowSelection: 'single'

            };
        };

        // move to readBoard page
        function onSelectionChanged(){
            var selectedRows = $scope.gridOptions.api.getSelectedRows();
            console.log("##param: " + JSON.stringify(selectedRows));
            console.log("##param: " + selectedRows[0]["bno"]);

            var f = document.createElement('form');
            f.action='mv_readBoardpage.do';
            f.method='POST';
            f.target='_blank';

            f.submit();
        }

        // select board
        $scope.select_board = function(){
            $http({
                method: 'post',
                url:'/selectBoard.do',
                data: "",
                headers: {'Content-Type': 'application/json; charset=utf-8'} //헤더
            }).then(function(json){
                $scope.resData = json.data.BOARD_DATA;
                $scope.gridOptions.api.setRowData($scope.resData);
            }, function(json){
                console.log("###error: " + JSON.stringify(json));
            });
        };

        $scope.init();
    });
})();