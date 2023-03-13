angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8080/api/';
    $scope.loadStudents = function () {
        $http.get(contextPath)
            .then(function (response) {
                $scope.studentList = response.data;
            });
    };


    $scope.loadStudents();
});