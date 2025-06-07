# 🧪 Automation Framework — `com.ngenuity.automation`

A robust Java-based automation testing framework leveraging **TestNG**, **Selenium 4**, **Apache POI**, and **Log4j 2**. Designed for extensibility and clarity in web automation testing and reporting.

---

## 📦 Project Info

- **Group ID:** `com.ngenuity`
- **Artifact ID:** `automation`
- **Version:** `2.0-SNAPSHOT`
- **Packaging:** `jar`
- **Java Version:** 17

---

## ⚙️ Features

- ✅ Selenium WebDriver (Chrome)
- ✅ TestNG XML Suite Support
- ✅ Logging via SLF4J and Log4j2
- ✅ Excel data-driven testing via Apache POI
- ✅ UTF-8 resource filtering and configuration
- ✅ Maven-based build with custom JAR manifest

---

## 📁 Project Structure

```
automation/
├── src/
│   ├── main/
│   │   └── java/
│   │   └── resources/
│   └── test/
│       └── java/
│       └── resources/
│           └── testng.xml
└── pom.xml
```

---

## 🔧 Build & Run

### 🛠️ Build the Project

```bash
mvn clean install
```

### ▶️ Run Tests

Make sure `testng.xml` is configured in `src/test/resources`, then:

```bash
mvn test
```

---

## 📚 Dependencies

### Core

- **Java 17**
- **TestNG** `7.9.0`
- **Selenium 4** (`api`, `java`, `chrome-driver`)
- **Apache POI** `5.4.0` (`poi`, `poi-ooxml`)
- **SLF4J** `2.0.17` and `2.1.0-alpha1`
- **Log4j 2** `2.24.3`

---

## 🧪 Testing Setup

The framework uses TestNG's XML suite configuration:

```xml
<suite name="AutomationSuite">
    <test name="SampleTests">
        <classes>
            <class name="com.ngenuity.tests.YourTestClass"/>
        </classes>
    </test>
</suite>
```

Place this in:  
`src/test/resources/testng.xml`

---

## 🔒 Notes

- Excludes `.xlsx` files from resource bundling
- Supports filtered resource injection via `src/main/resources`
- JVM memory args: `-Xmx2048m -XX:MaxPermSize=512m`

---

## ✍️ Author

**Everett Aknowledge**  
Built with precision, purpose, and the spirit of clean code.

---

## 🛡 License

This project is licensed under your preferred open license. *(MIT, Apache 2.0, etc.)*  
_You can add it to the `LICENSE` file manually._

---

> _“Quality control from the source to my soul. Bring the light everywhere we go.”_ – Homeliss Derilex
