define([], function () {
    return {
        defaultRoutePath: '/web/notFound',
        routes: {
            '/': {
                templateUrl: '/index.html',
                dependencies: [
                    'controller/indexCtrl'
                ]
            },
            '/login': {
                templateUrl: '/view/login.html',
                dependencies: [
                    'controller/loginCtrl'
                ]
            }
        }
    };
});