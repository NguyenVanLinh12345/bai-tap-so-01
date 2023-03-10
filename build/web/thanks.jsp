<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>

<body>
    <h1>Thanks for joining our email list</h1>

    <p>Here is the information that you entered:</p>

    <label>Email:</label>
    <span>${user.email}</span><br>
    <label>First Name:</label>
    <span>${user.getFirstName()}</span><br>
    <label>Last Name:</label>
    <span>${user.lastName}</span><br>
    <p>We'll use this email to notify you whenever we have new releases for these types of music:</p>
    <span>${user.getListTypeOfMusic()}</span><br>

<p>To enter another email address, click on the Back button in your browser or the Return button shown below.</p>

    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>

</body>
</html>
