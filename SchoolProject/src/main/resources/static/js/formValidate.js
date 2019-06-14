function validateForm() {
  var x = document.forms["RegistrationForm"]["firstName"].value;
  var lastName = document.forms["RegistrationForm"]["lastName"].value;
  var dob = document.forms["RegistrationForm"]["birthdate"].value;
  var classNumber = document.forms["RegistrationForm"]["classYear"].value;
  if (x == "") {
    alert("First Name is required");
    return false;
  }
  if (lastName == "") {
	    alert("Last Name is required");
	    return false;
	  }
/*  if (dob == "") {
	    alert("Student date of birth is required");
	    return false;
	  }*/
  if (classNumber == "") {
	    alert("which class he is in ?");
	    return false;
	  }
}