<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Bootstrap Admin</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css">
    
    <link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">

    <script src="lib/js/jquery-1.7.2.min.js" type="text/javascript"></script>
    <script src="lib/js/jquery-min.js" type="text/javascript"></script>
    <!-- Demo page code -->

    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .brand { font-family: georgia, serif; }
        .brand .first {
            color: #ccc;
            font-style: italic;
        }
        .brand .second {
            color: #fff;
            font-weight: bold;
        }
    </style>

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
    
<script type="text/javascript">

    var defaults = {
        s1: 'Agency1',
        s2: 'Agency2',
        s3: 'Agency3',
        v1: 120000,
        v2: 120200,
        v3: 120224
    };
    //传入jsonStr
    var threeSelectData = <s:property value="#request.jsonStr" escape="false"/>;
    
    $(function () {
        /*
        //get json from action
        var jsonStr;
        $.getJSON("employeeRegisterAction.action", jsonStr, function (data, textStatus){
            if(textStatus == 'success'){
                threeSelectData = data;
                System.out.println("JSON.parse(jsonStr)");
            }
        });
        
        $("#Agency");*/
        threeSelect(defaults);
    });
    function threeSelect(config) {
        var $s1 = $("#" + config.s1);
        var $s2 = $("#" + config.s2);
        var $s3 = $("#" + config.s3);
        var v1 = config.v1 ? config.v1 : null;
        var v2 = config.v2 ? config.v2 : null;
        var v3 = config.v3 ? config.v3 : null;
        $.each(threeSelectData, function (index) {
            appendOptionTo($s1, threeSelectData[index].name, threeSelectData[index].name, v1);
        });
        $s1.change(function () {
            $s2.html("");
            $s3.html("");
            if (this.selectedIndex === -1)
                return;
            var the_array = threeSelectData[this.selectedIndex].value;
            if (the_array) {
                $.each(the_array, function (index) {
                    appendOptionTo($s2, the_array[index].name, the_array[index].name, v2);
                });
            }
            if ($s2[0].options.length === 0) {
                appendOptionTo($s2, "...", "", v2);
            }
            $s2.change();
        }).change();
        $s2.change(function () {
            $s3.html("");
            if (this.selectedIndex === -1)
                return;
            var the_array = threeSelectData[$s1[0].selectedIndex].value[this.selectedIndex].value;
            if (the_array) {
                $.each(the_array, function (index) {
                    appendOptionTo($s3, the_array[index].name, the_array[index].name, v3);
                });
            }
        }).change();
        function appendOptionTo($o, k, v, d) {
            var $opt = $("<option>").text(k).val(v);
            if (v === d) {
                $opt.attr("selected", "selected");
            }
            $opt.appendTo($o);
        }
    }
</script> 
<style type="text/css" media="screen"> 
    select{width:80px;} 
</style> 
  </head>

  <!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
  <!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
  <!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
  <!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
  <!--[if (gt IE 9)|!(IE)]><!--> 
  <body class=""> 
  <!--<![endif]-->
    
    <div class="navbar">
        <div class="navbar-inner">
                <ul class="nav pull-right">
                    
                    
                    <li id="fat-menu" class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">
                            
                        </a>


                    </li>
                    
                </ul>
                <a class="brand" href="index.html"><span class="first">人力资源管理系统</span></a>
        </div>
    </div>
    


    
    <div class="sidebar-nav">
        <a href="#dashboard-menu" class="nav-header" data-toggle="collapse"><i class="icon-dashboard"></i>Dashboard</a>
        <ul id="dashboard-menu" class="nav nav-list collapse in">
            <li><a href="index.html">主页</a></li>
            <li><a href="employeeRegist.jsp">员工登记</a></li>
        </ul>
    </div>
    

    
    <div class="content">
        
        <div class="header">
            
            <h1 class="page-title">Edit User</h1>
        </div>
        

        <div class="container-fluid">
            <div class="row-fluid">
                    
<div class="well">
    <ul class="nav nav-tabs">
      <li class="active"><a href="#home" data-toggle="tab">Profile</a></li>
      <li><a href="#profile" data-toggle="tab">Password</a></li>
    </ul>
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
    <s:form id="tab" action="EmployeeRegistAction">

        <div id="Agency">
        <label>一级机构</label>
        <s:select name="employee.Agency1" id="Agency1" class="input-xlarge" list="headerValue" listKey="test"/>
                
        <label>二级机构</label>
        <s:select name="employee.Agency2" id="Agency2" class="input-xlarge" list="headerValue"listKey="test"/>

        <label>三级机构</label>
        <s:select name="employee.Agency3" id="Agency3" class="input-xlarge" list="headerValue"listKey="test"/>

        </div>
        <label>职位分类</label>
        <s:select name="employee.position_class"  class="input-xlarge" list="headerValue"/>
            <option value="职位分类A">职位分类A</option>
            <option value="职位分类B">职位分类B</option>
            <option value="职位分类C">职位分类C</option>
        
        <label>职位名称</label>
        <s:select name="employee.position_name" class="input-xlarge" list="headerValue"/>
            <option value="职位名称A">职位名称A</option>
            <option value="职位名称B">职位名称B</option>
            <option value="职位名称C">职位名称C</option>
            
        <label>职称</label>
        <s:select name="employee.position_title"  class="input-xlarge" list="headerValue"/>
            <option value="职位名称A">职位名称A</option>
            <option value="职位名称B">职位名称B</option>
            <option value="职位名称C">职位名称C</option>
        
        <label>姓名</label>
        <s:textfield name="employee.name" type="text" class="input-xlarge"/>
        
        <label>性别</label>
        <s:select name="employee.sex" id="" class="input-xlarge" list="headerValue"/>
            <option value="男">职位名称A</option>
            <option value="女">职位名称B</option>
        
        <label>电子邮箱</label>
        <s:textfield name="employee.email" type="text" class="input-xlarge"/>
        
        <label>电话号码</label>
        <s:textfield name="employee.tel" type="text" class="input-xlarge"/>
        
        <label>QQ</label>
        <s:textfield name="employee.QQ" type="text" class="input-xlarge"/>
        
        <label>手机</label>
        <s:textfield name="employee.mobile" type="text" class="input-xlarge"/>
        
        <label>住址</label>
        <s:textfield name="employee.address" type="text" class="input-xlarge"/>
        
        <label>邮编</label>
        <s:textfield name="employee.zip_code" type="text" class="input-xlarge"/>
        
        <label>国籍</label>
        <s:select name="employee.country" id="" class="input-xlarge" list="headerValue"/>
            <option value="男">职位名称A</option>
            <option value="女">职位名称B</option>
        
        
        <label>出生地</label>
        <s:textfield name="employee.birthplace" type="text" class="input-xlarge"/>
        
        <label>政治面貌</label>
        <s:select class="form-control" name="employee.political" list="headerValue"/>
                   <option value="群众">群众</option>
                   <option value="中共党员">中共党员</option>
                   <option value="中共预备党员">中共预备党员</option>
                   <option value="共青团员">共青团员</option>
                   <option value="民革党员">民革党员</option>
                   <option value="民盟盟员">民盟盟员</option>
                   <option value="民建会员">民建会员</option>
                   <option value="民进会员">民进会员</option>
                   <option value="农工党党员">农工党党员</option>
                   <option value="致公党党员">致公党党员</option>
                   <option value="九三学社社员">九三学社社员</option>
                   <option value="台盟盟员">台盟盟员</option>
                   <option value="无党派民主人士">无党派民主人士</option>
        <label>政治面貌</label>
        <s:select class="form-control" name="employee.religious" list="headerValue"/>
                    <option value="无">无</option>
                    <option value="佛教">佛教</option>
                    <option value="道教">道教</option>
                    <option value="基督教">基督教</option>
                    <option value="伊斯兰教">伊斯兰教</option>
                    <option value="其他">其他</option>
        
        
        <label>身份证号码</label>
        <s:textfield name="employee.id_card" type="text" class="input-xlarge"/>
        
        <label>社保卡号码</label>
        <s:textfield name="employee.SScard" type="text" class="input-xlarge"/>
        
        <label>年龄</label>
        <s:textfield name="employee.age" type="text" class="input-xlarge"/>
        
        <label>学历</label>
        <s:select class="form-control" name="employee.educational" list="headerValue"/>
            <option value="本科">本科</option>
            <option value="研究生">研究生</option>
            <option value="大专">大专</option>
            <option value="高中">高中</option>
            <option value="初中">初中</option>
            <option value="小学">小学</option>
        
        
        <label>专业</label>
        <s:textfield name="employee.major" type="text" class="input-xlarge"/>
        
        <label>教育年限</label>
        <s:textfield name="employee.age" type="text" class="input-xlarge"/>
        
        <label>薪酬标准</label>
        <s:select name="employee.salaryTyep" id="Agency2" class="input-xlarge" list="headerValue"/>
        
        <label>开户行</label>
        <s:textfield name="employee.bank" type="text" class="input-xlarge" />
        
        <label>账号</label>
        <s:textfield name="employee.bank_card_num" type="text" class="input-xlarge"/>
        
        <label>登记人</label>
        <s:textfield name="employee.registrant" type="text" class="input-xlarge"/>
        
        <label>建档时间</label>
        <s:textfield name="employee.fileTime" type="text" class="input-xlarge"/>
        
        <label>特长</label>
        <s:textfield name="employee.advantage" type="text" class="input-xlarge"/>
        
        <label>爱好</label>
        <s:textfield name="employee.hobby" type="text" class="input-xlarge"/></
        
        <label>个人履历</label>
        <s:textarea name="employee.curriculum-vitae" rows="3" class="input-xlarge"></s:textarea>
                
        <label>家庭关系信息</label>
        <s:textarea name="employee.familyInfo" rows="3" class="input-xlarge"></s:textarea>
                        
        <label>备注</label>
        
        <s:textarea name="employee.ps" rows="3" class="input-xlarge"></s:textarea>
        <s:submit  value="提交"></s:submit>
        </s:form>

  </div>

</div>

<div class="modal small hide fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="myModalLabel">Delete Confirmation</h3>
  </div>
  <div class="modal-body">
    
    <p class="error-text"><i class="icon-warning-sign modal-icon"></i>Are you sure you want to delete the user?</p>
  </div>
  <div class="modal-footer">
    <button class="btn" data-dismiss="modal" aria-hidden="true">Cancel</button>
    <button class="btn btn-danger" data-dismiss="modal">Delete</button>
  </div>
</div>


                    
                    <footer>
                        <hr>

                        
                    </footer>
                    
            </div>
        </div>
    </div>
    


    <script src="lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
    
  </body>
</html>


