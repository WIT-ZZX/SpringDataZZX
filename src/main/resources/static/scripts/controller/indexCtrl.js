define(['../rental','jquery'],function(module,$){
    module.controller("indexCtrl",function($scope, $resource,$location, $http,commonService){
        console.log("index");
    //用户登录
    var loginApi = $resource("/api/user/:id");
    $scope.user={};
    $scope.user.username=$scope.username;
    $scope.user.password=$scope.password;
    $scope.login=function(){
    console.log($scope.username+"---"+$scope.password);
        loginApi.get({id:1},{params:{username:$scope.username,password:$scope.password}},function(data){
            console.log(JSON.stringify(data.message));
            alert("访问api成功");
            window.location.href="/login";//跳转不成功，此处仍待改进
        },function (errData) {
            alert("访问出错");
            console.log(errData);
        });
    }

    });
});
