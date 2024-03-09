# Configuration  and Environment Spring Boot
Demonstrates various use cases of extracting information from external configuration files in YAML format,

## References
- [Spring Boot Reference Documentation.Configuration Classes](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.configuration-classes)
- [Spring Boot Reference Documentation.Features.Externalized Configuration](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.external-config)
- [Spring Expression Language](https://docs.spring.io/spring-framework/reference/core/expressions.html)
- [Baeldung - Guide to @ConfigurationProperties in Spring Boot](https://www.baeldung.com/configuration-properties-in-spring-boot)
- [Baeldung - Properties with Spring and Spring Boot](https://www.baeldung.com/properties-with-spring )
- [Access a File from the Classpath in a Spring Application](https://www.baeldung.com/spring-classpath-file-access)

## Use Cases
1. Class populated from application.properties using @ConfigurationProperties in: com.foo.config.ConfigDemoProperties
2. Equivalent functionality as (1) using @Value in: com.foo.config.RawDemoProperties
3. Read using @ConfigurationProperties properties from an alternative file in: com.foo.config.EuropeCapitalProperties
4. Use of Custom Converter in com.foo.config.converter.LocalDateFormatddMMyyyyConverter  com.foo.config.model.LocalDateFormatddMMyyyy 

## TODO 

- Improve test readability by using `@DisplayName` and `@ParameterizedTest` see [Baeldung - JUnit 5 Parameterized Tests](https://www.baeldung.com/parameterized-tests-junit-5)

## Feature improvements
1. i18n, l10n see [
   - [Spring Boot Reference Documentation. Internationalization](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.i18n)
   - [Baeldung - Internationalization in Spring Boot](https://www.baeldung.com/spring-boot-internationalization)
   - [Reflectoring - Internationalization in Spring Boot](https://reflectoring.io/spring-boot-internationalization/)