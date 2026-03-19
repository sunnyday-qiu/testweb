# AGENTS.md

## Cursor Cloud specific instructions

### Project overview

This is a Java 17 Spring Boot 2.4.3 web application (`testweb`) providing REST CRUD endpoints for a `Student` entity at `/test/student`. The DAO layer is stubbed (returns null/0); no actual database queries run.

### System dependencies

- **JDK 17** (`openjdk-17-jdk`)
- **Maven 3.x** (`maven`)
- **PostgreSQL 16** — required because `spring-boot-starter-jdbc` auto-configures a `DataSource`

Set `JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64` before running Maven commands, and ensure Java 17 is the default via `update-alternatives`.

### PostgreSQL setup

The app expects PostgreSQL at `localhost:5432` with database `test`, user `postgres`, password `admin` (configured in `src/main/resources/application.yml`). Start PostgreSQL with:

```bash
sudo pg_ctlcluster 16 main start
```

If the `test` database doesn't exist yet:

```bash
sudo -u postgres psql -c "ALTER USER postgres WITH PASSWORD 'admin';"
sudo -u postgres psql -c "CREATE DATABASE test;"
```

### Known pom.xml configuration issues

The original `pom.xml` has `<packaging>pom</packaging>` (should be `jar`) and uses Lombok 1.18.18 (managed by Spring Boot 2.4.3 parent), which is incompatible with JDK 17. The PR fixes these: packaging changed to `jar` and `<lombok.version>1.18.30</lombok.version>` added to properties.

### Build and run

```bash
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
mvn clean compile          # compile only
mvn test                   # run tests (none exist currently)
mvn spring-boot:run        # start the dev server on port 8080
```

The app serves at `http://localhost:8080/test/student`. The `GET /test/student` endpoint returns `"Hello world"`.

### Lint / static analysis

No dedicated linter is configured. Maven compile warnings (unchecked operations) are the primary signal.

### No automated tests

There are no test files (`src/test` doesn't exist). `mvn test` runs the surefire plugin but finds nothing to execute.
