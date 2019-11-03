function login() {
	document.getElementById("spanmsg1").innerHTML = "";
	document.getElementById("spanmsg2").innerHTML = "";
	var e = document.getElementById("inputEmail").value;// 取得有效的邮箱
	var p = document.getElementById("inputPassword").value;// 取得有效的密码
	if (e == "") {
		document.getElementById("spanmsg1").innerHTML = "请输入有效邮箱账号!";
		return;
	} else {
		document.getElementById("spanmsg1").innerHTML = "";
	}
	if (p == "") {
		document.getElementById("spanmsg2").innerHTML = "请输入有效邮箱密码!";
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