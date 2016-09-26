function validate() {
			clean();

			var fname = document.kidform.fname.value;
			var lname = document.kidform.lname.value;
			var dateofreport = document.kidform.dateofreport.value;
			var pat = /(0?[1-9]|1[012])\/(0?[1-9]|[12][0-9]|3[01])\/((19|20)\\d\\d)/;


			var a = true;
			var b = true;
			
			

			if (!fname.match(/^[a-zA-Z]+$/) || !(fname.length > 2)) {

				fErr.innerHTML = "Invalid First Name.No special characters.Please re-enter";

				a = false;
			} else {
				a = true;
			}

			if (!lname.match(/^[a-zA-Z]+$/) || !(lname.length > 2)) {
				lErr.innerHTML = "Invalid last name. Please re-enter";
				b = false;

			} else {
				b = true;
			}
			

			var c = pat.test(dateofreport);
			if (c ==false){
				dErr.innerHTML = "Invalid date";
			}
			
			

			if (a == false || b == false || c == false) {

				return false;
			} else {
				return true;
			}
		}

		function clean() {
			fErr.innerHTML = "";
			lErr.innerHTML = "";
			dErr.innerHTML = "";
			

		}