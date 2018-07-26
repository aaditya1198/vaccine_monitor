<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function validate()
    {
             if(document.child_reg.metabolic_screening.value == '') 
             {      
            alert("Please fill Details!");
              document.child_reg.metabolic_screening.focus();
            return false;       
            }
             else if(document.child_reg.tg.value == '')
             {      
            alert("Please fill details!");
              document.child_reg.tg.focus();
            return false;       
            }
			else if(document.child_reg.address.value == '')
             {      
            alert("Please fill details!");
              document.child_reg.address.focus();
            return false;       
            }
             else
               return true;
    }
	</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="child_register" name="child_reg" onsubmit="return validate();">
<fieldset>
<legend align="center">Register your Child</legend> 
Name            : <input type="text" name="name"><br>
<br>
Date-of-Birth   : <input type="date" name="dob" required><br>
<br>
Time-of-Birth   : <input type="time" name="tob" required><br>
<br>
Gender          : <input type="radio" name="sex" value="male" required>Male
                  <input type="radio" name="sex" value="female" required>Female
	              <input type="radio" name="sex" value="other" required>Other<br>
<br>
Blood Group     : <select name="bg">
		<option value="A+">A+</option>
		<option value="A-">A-</option>
		<option value="B+">B+</option>
		<option value="B-">B-</option>
		<option value="AB+">AB+</option>
		<option value="AB-">AB-</option>
		<option value="O+">O+</option>
		<option value="O-">O-</option>
              </select><br>
<br>
Height(in cms)  : <input type="text" name="height" required><br>
<br>
Weight-on-Birth : <input type="text" name="wob" required><br>
<br>
Weight-on-Discharge : <input type="text" name="wod" required><br>
<br>
Delivery            : <select name="delivery">
		<option value="Normal">Normal</option>
		<option value="Forceps">Forceps</option>
		<option value="Vacuum">vacuum</option>
		<option value="Cesarean">Cesarean</option>
	   </select><br>
<br>
Identifiers         : <textarea name="identifiers" rows="2" cols="30"></textarea><br>
<br>
Metabolic Screening : <textarea name="metabolic_screening" rows="3" cols="30"></textarea><br>
<br>
Treatment Given     : <textarea name="tg" rows="2" cols="30"></textarea><br>
<br>
Treatment Advised   : <textarea name="ta" rows="2" cols="30"></textarea><br>
<br>
Obstetrician/Gynecologist : <input type="text" name="gyne" required><br>
<br>
Hospital                  : <input type="text" name="hospital" required><br>
<br>
<hr>
<br>
Mother Name               : <input type="text" name="mname" required><br>
<br>
Mother's Mobile No.       : <input type="text" name="mmob"><br>
<br>
Father Name               : <input type="text" name="fname" required><br>
<br>
Father's Mobile no.       : <input type="text" name="fmob" required><br>
<br>
Address                   : <textarea name="address" rows="2" cols="30"></textarea><br>
<br>
<br>
<input type="submit" value="Register">
<br>
<br>
<input type="reset" value="Reset">
<br>
</fieldset>
</form>

</body>
</html>