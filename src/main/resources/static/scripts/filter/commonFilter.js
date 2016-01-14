define(['../rental','jquery','angular'],function(module,$,angular){


    module.filter('genderType',function(){
        return function(input) {
            var genderType = "";
            if (input == 0) genderType = "男";
            else if (input == 1) genderType = "女";
            return genderType;
        }
    });

    module.filter('activated',function(){
        return function(input) {
            var activated = "";
            if (input == 0) activated = "未激活";
            else if (input == 1) activated = "激活";
            return activated;
        }
    });

    module.filter('reservationStatus',function(){
        return function(input) {
            var reservationStatus = "";
            if (input == 1) reservationStatus = "未受理";
            else if (input == 2) reservationStatus = "预约成功";
            else if (input == 3) reservationStatus = "拒绝预约";
            else if (input == 4) reservationStatus = "用户取消预约";
            return reservationStatus;
        }
    });

    module.filter('flag',function(){
        return function(input) {
            var flag = "";
            if (input == 0) flag = "是";
            else if (input == 1) flag = "否";
            return flag;
        }
    });

    module.filter('organisationType',function(){
        return function(input) {
            var organisationType = "";
            if (input == 1) organisationType = "华晨汽车";
            else if (input == 2) organisationType = "经销商";
            else if (input == 3) organisationType = "车友群";
            else if (input == 4) organisationType = "公共群";
            return organisationType;
        }
    });

    module.filter('authorityType',function(){
        return function(input) {
            var authorityType = "";
            if (input == "Admin") authorityType = "管理员";
            else if (input == "Login") authorityType = "登陆";
            else if (input == "ImportVehicle") authorityType = "添加车辆";
            else if (input == "CreateSalesOrg") authorityType = "创建经销商组";
            else if (input == "Read") authorityType = "读取";
            else if (input == "UpdateVehicleInfo") authorityType = "修改车辆";
            return authorityType;
        }
    });

    module.filter('pattern',function(){
        return function(input) {
            var pattern = "";
            if (input) pattern = "调试模式";
            else  pattern = "用户模式";
            return pattern;
        }
    });

    module.filter('marking',function(){
        return function(input) {
            var flag = "";
            if (input == 0) flag = "正常";
            else if (input == 1) flag = "异常";
            return flag;
        }
    });

    module.filter('windowInfo',function(){
        return function(input) {
            var flag = "";
            if (input == 0) flag = "开";
            else if (input == 1) flag = "半开";
            else if (input == 2) flag = "关";
            else if (input == 3) flag = "信号异常";
            return flag;
        }
    });

    module.filter('doorInfo',function(){
        return function(input) {
            var flag = "";
            if (input == 0) flag = "开";
            else if (input == 1) flag = "关";
            else if (input == 2) flag = "预留";
            else if (input == 3) flag = "信号异常";
            return flag;
        }
    });

    module.filter('northSouthFlag',function(){
        return function(input) {
            var flag = "";
            if (input == "N") flag = "北纬";
            else if (input == "S") flag = "南纬";
            return flag;
        }
    });

    module.filter('eastWestFlag',function(){
        return function(input) {
            var flag = "";
            if (input == "E") flag = "东经";
            else if (input == "W") flag = "西经";
            return flag;
        }
    });




});