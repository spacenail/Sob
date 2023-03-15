angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8080/api/';
    $scope.loadStudents = function () {
        $http.get(contextPath)
            .then(function (response) {
                $scope.studentList = response.data;
            });
    };

    $scope.deleteStudent = function(student){
    $http({
        method: 'DELETE',
        url: contextPath,
        data: student,
        headers: {
            'Content-type': 'application/json'
        }
        });
        $timeout(function() { $scope.loadStudents()}, 200);
        };


    $scope.addStudent = function(newStudent){
        $http({
            method: 'POST',
            url: contextPath,
            data: newStudent,
            headers: {
                'Content-type': 'application/json'
            }
        });
        $timeout(function() { $scope.loadStudents()}, 200);
        };

    $scope.loadStudents();
});