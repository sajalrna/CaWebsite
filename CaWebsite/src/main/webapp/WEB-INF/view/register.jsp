<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>

<div class="text-center" style="padding: 50px 0">
	<div class="logo">REGISTER FORM</div>
	<!-- Main Form -->
	<div class="login-form-1">
		<fm:form id="register-form" class="text-left" action="registerUser">
			<div class="login-form-main-message"></div>
			<div class="main-login-form">
				<div class="login-group">
					<div class="form-group">
						<label for="reg_username" class="sr-only">Username</label> <input
							type="text" class="form-control" id="username" name="username"
							placeholder="username">
					</div>
					<div class="form-group">
						<label for="reg_password" class="sr-only">Password</label> <input
							type="password" class="form-control" id="password"
							name="password" placeholder="password">
					</div>
					<div class="form-group">
						<label for="reg_email" class="sr-only">Email</label> <input
							type="text" class="form-control" id="email" name="email"
							placeholder="email">
					</div>
				</div>
				<button type="submit" class="login-button">
					<i class="fa fa-chevron-right"></i>
				</button>
			</div>
			<div class="etc-login-form">
				<p>
					already have an account? <a href="login">login here</a>
				</p>
			</div>
		</fm:form>
	</div>
</div>
