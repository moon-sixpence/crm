function login() {
	document.getElementById("spanmsg1").innerHTML = "";
	document.getElementById("spanmsg2").innerHTML = "";
	var e = document.getElementById("inputEmail").value;// ȡ����Ч������
	var p = document.getElementById("inputPassword").value;// ȡ����Ч������
	if (e == "") {
		document.getElementById("spanmsg1").innerHTML = "��������Ч�����˺�!";
		return;
	} else {
		document.getElementById("spanmsg1").innerHTML = "";
	}
	if (p == "") {
		document.getElementById("spanmsg2").innerHTML = "��������Ч��������!";
		return;
	} else {
		document.getElementById("spanmsg2").innerHTML = "";
	}
	with (document.getElementById("userForm")) {
		method = "get";
		action = "UserAction";
		submit();
	}
}