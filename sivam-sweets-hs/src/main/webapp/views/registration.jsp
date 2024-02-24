<%@ page language="java"%>

<html>
<head>
    <meta charset="UTF-8">
    <title> SIVAM SWEETS </title>
    <link rel = "icon" href ="/img/logo.png">
    <link rel="stylesheet" type="text/css" href="registration.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Sivam Sweets</h1>
    <h2>Delicious greetings from us !</h2>
    <form action="@{/login}">
    //<form action="#" th:action="@{/login}" th:object="${user}" method="post">
      <h2>Register</h2>
      <h3>World of Home-made and Healthy sweets</h3>
      <div class="input-container">
        <i class="fa fa-user icon"></i>
        <input class="input-field" type="text" placeholder="Username" name="usrnm">
      </div>

      <div class="input-container">
        <i class="fa fa-envelope icon"></i>
        <input class="input-field" type="text" placeholder="Email" name="email">
      </div>

      <div class="input-container">
        <i class="fa fa-phone icon"></i>
        <input class="input-field" type="text" placeholder="Phone Number" name="mobile">
      </div>

      <div class="input-container">
          <i class="fa fa-map-marker icon"></i>
          <input class="input-field" type="text" placeholder="Place" name="place">
      </div>

      <div class="input-container">
          <i class="fa fa-lock icon"></i>
          <input class="input-field" type="password" placeholder="Password" name="password">
      </div>

      <button type="submit" class="btn">Register</button>
      <p>Already registered with us ?<a href="http://localhost:9191/login">Login here</a></p>
    </form>
</body>
</html>