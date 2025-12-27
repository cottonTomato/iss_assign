function validateForm() {
  var name = document.forms[0]["name"].value;
  var email = document.forms[0]["email"].value;
  var age = document.forms[0]["age"].value;
  var gender = document.forms[0]["gender"];

  if (name === "") {
    alert("Name must be filled out");
    return false;
  }

  if (email === "") {
    alert("Email must be filled out");
    return false;
  }

  if (age === "" || age < 18) {
    alert("Age must be 18 or above");
    return false;
  }

  var genderSelected = false;
  for (var i = 0; i < gender.length; i++) {
    if (gender[i].checked) {
      genderSelected = true;
      break;
    }
  }

  if (!genderSelected) {
    alert("Please select gender");
    return false;
  }

  alert("Form submitted successfully");
  return true;
}
