<html>
<body>
<h2>Hello World!</h2>

	<h3>Dispatcher</h3>
	<form action="getUser">
		<input type="text" name="username"/>
		<input type="submit" value="Submit"/>
	</form>
	<br>
	<br>
	<br>
	<h3>Redirect</h3>
	<form action="getUser">
		<input type="hidden" name="byredirect" value="true"  />
		<input type="text" name="username"/>
		<input type="submit" value="Submit"/>
	</form>
	
</body>
</html>
