<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script type="text/javascript" src="areadata.js"></script> 
<script type="text/javascript">
    /* 
     ???????? 
     ?????????select???ID??????????????null 
     var defaults = { 
     s1:'Select1', 
     s2:'Select2', 
     s3:'Select3', 
     v1:null, 
     v2:null, 
     v3:null 
     }; 
     */
    var defaults = {
        s1: 'Select1',
        s2: 'Select2',
        s3: 'Select3',
        v1: 120000,
        v2: 120200,
        v3: 120224
    };
    var threeSelectData = {
        var threeSelectData = JSON.parse(jsonStringFromServer);
    };
    $(function () {
        $("#Paragraph").append("Hello");
        threeSelect(defaults);
    });
    function threeSelect(config) {
        var $s1 = $("#" + config.s1);
        var $s2 = $("#" + config.s2);
        var $s3 = $("#" + config.s3);
        var v1 = config.v1 ? config.v1 : null;
        var v2 = config.v2 ? config.v2 : null;
        var v3 = config.v3 ? config.v3 : null;
        $.each(threeSelectData, function (k, v) {
            appendOptionTo($s1, k, v.val, v1);
        });
        $s1.change(function () {
            $s2.html("");
            $s3.html("");
            if (this.selectedIndex === -1)
                return;
            var s1_curr_val = this.options[this.selectedIndex].value;
            $.each(threeSelectData, function (k, v) {
                if (s1_curr_val === v.val) {
                    if (v.items) {
                        $.each(v.items, function (k, v) {
                            appendOptionTo($s2, k, v.val, v2);
                        });
                    }
                }
            });
            if ($s2[0].options.length === 0) {
                appendOptionTo($s2, "...", "", v2);
            }
            $s2.change();
        }).change();
        $s2.change(function () {
            $s3.html("");
            var s1_curr_val = $s1[0].options[$s1[0].selectedIndex].value;
            if (this.selectedIndex === -1)
                return;
            var s2_curr_val = this.options[this.selectedIndex].value;
            $.each(threeSelectData, function (k, v) {
                if (s1_curr_val === v.val) {
                    if (v.items) {
                        $.each(v.items, function (k, v) {
                            if (s2_curr_val === v.val) {
                                $.each(v.items, function (k, v) {
                                    appendOptionTo($s3, k, v, v3);
                                });
                            }
                        });
                        if ($s3[0].options.length === 0) {
                            appendOptionTo($s3, "...", "", v3);
                        }
                    }
                }
            });
        }).change();
        function appendOptionTo($o, k, v, d) {
            var $opt = $("<option>").text(k).val(v);
            if (v === d) {
                $opt.attr("selected", "selected")
            }
            $opt.appendTo($o);
        }
    }
</script> 
<style type="text/css" media="screen"> 
    select{width:80px;} 
</style> 

<p id="Paragraph"></p>
<select id="Select1" name="Select1"></select> 
<select id="Select2" name="Select2"></select> 
<select id="Select3" name="Select3"></select>