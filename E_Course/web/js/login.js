$(document).ready(function() {
    //login.jsp页面中表单验证
  
    //页面表单验证
    $("#loginform").validate({
        success: "checked",
        errorClass: "error",
        rules: {
            username: {required: true, 
                 remote: {
                    url: "login/checkUser",
                    type: "post",
                    dataType: "json",
                    data: {
                         
                        username: function() {
                            return $("#username").val();
                        }
                    }
                }
            },
            password: {required: true,
                remote:{
                    url:"login/checkPSW",
                    type:"post",
                    dataType:"json",
                    data: {
                            password:function(){
                                return $("#username").val();
                           }
                    }
                    
                }
                        
            },
           
            randomCode: {required: true, maxlength: 4, minlength: 4,
                 remote: {
                    url: "CheckCode",
                    type: "post",
                    dataType: "json",
                    data: {
                        randomCode: function() {
                            return $("#randomCode").val();
                        }
                    }
                }
            }
        
        },
        messages: {
            username: {required: '用户名不为空', remote: '用户名不存在'},
            password: {required: '密码不为空',  remote: '密码错误'},
            randomCode:{required: '密码不为空',  maxlength: '验证码为4位', minlength: '验证码为4位',remote:'验证码输入不正确'}
            
        },
        errorPlacement: function(error, element) {
            //error.appendTo(element.parent().next());
          // error.appendTo(element.next());
          error.appendTo(element.next());
        }
    });
});
