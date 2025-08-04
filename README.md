# 🔐 Java Servlet CRUD Web Application

A simple Java-based web application that supports user ```**registration**```, **login/logout**, and full **CRUD operations**. Built using **Servlets**, **JSP**, and **JDBC**, following the MVC + DAO architecture.

---

## 🚀 Features

- ✅ User Registration & Login
- ✅ Logout with session handling
- ✅ Create, Read, Update, Delete operations
- ✅ Clean MVC structure (Servlet → DAO → DB)
- ✅ Styled using basic CSS

---

## 💡 Tech Stack

- Java Servlets & JSP  
- JDBC  
- HTML/CSS  
- MySQL(database)  
- Apache Tomcat (server)

---

## 📁 Project Structure (Main Files Only)

<pre>
src/
└── main/
├── java/com/company/
│ ├── servlet/
│ │ ├── LoginServlet.java
│ │ ├── LogoutServlet.java
│ │ ├── RegisterServlet.java
│ │ ├── UpdateServlet.java
│ │ └── DeleteServlet.java
│ ├── dao/
│ │ ├── UserDao.java
│ │ ├── UserDaoImpl.java
│ │ └── User.java
│ └── util/
│ └── DBUtils.java
├── webapp/
│ ├── login.jsp
│ ├── register.jsp
│ ├── home.jsp
│ ├── update.jsp
│ ├── login.css
│ └── WEB-INF/web.xml
</pre>


---

## 🏁 Getting Started

1. **Clone** the repo or download the ZIP  
2. **Import** into Eclipse/IntelliJ as a Dynamic Web Project  
3. **Configure** DB credentials in `DBUtils.java`  
4. **Run** on Apache Tomcat  
5. Open in browser:  
   `http://localhost:8080/YourAppName/`

---

## 🛠 Database Table

```sql
CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(100),
  email VARCHAR(100) UNIQUE,
  password VARCHAR(100),
);
```

### 🔧 Future Improvements 
- Add password hashing (e.g., BCrypt)
- Use JSTL & Expression Language in JSP
- Input validations (client + server side)
- Add pagination and sorting
- Connect to a PostgreSQL DB (optional)

### Thank you ❤️
