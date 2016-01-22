define([], function () {
    return {
        defaultRoutePath: '/web/order',
        routes: {
            '/': {
                templateUrl: './view/home.html',
                dependencies: [
                    'controller/homeCtrl'
                ]
            },
            '/web/login': {
                templateUrl: './view/login.html',
                dependencies: [
                    'controller/loginCtrl'
                ]
            }
        }
    };
});