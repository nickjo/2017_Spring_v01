$(function(){
    var myApp = angular.module('joinApp',[]);

    myApp
        .controller('joinPageCtrl', function($scope) {
            init();

            function init(){
                $scope.name = "";
                $scope.email = "";
                $scope.textPw = "";
                $scope.title = "Memeber Information";
                $("#textPw").val("");

                //alert("Member Submit!\n" + " name:" + $scope.name + ", email: " + $scope.email + "\n , password: " + $scope.textPw);
            }

            $("#textPw").click(function(){
                $("#textPw").val("");
            });

            $scope.subMemInfo = function(){
                //alert("Member Submit!\n" + " name:" + $scope.name + ", email: " + $scope.email + "\n , password: " + $scope.textPw);
                if(!fn_validCheck()){
                    return;
                }

               $("#frm").attr("method", "post");
               $("#frm").attr("action", "join.do");
               $("#frm").submit();
            }

            // valid check
            function fn_validCheck(){
                if($scope.name == ""){
                    alert("please input name");
                    $scope.name.focus;
                    return false;
                }

                if($scope.email == ""){
                    alert("please input email");
                    $scope.email.focus;
                    return false;
                }

                if($scope.textPw == ""){
                    alert("please input password");
                    $scope.textPw.focus;
                    return false;
                }

                return true;
            }
        });
}());