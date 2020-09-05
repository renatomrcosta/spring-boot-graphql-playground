# spring-boot-graphql-playground
Testing exposing GraphQL using Kotlin + Spring boot

Inspired by the talk @ [GOTO 2020 • Bootiful GraphQL with Kotlin • Dariusz Kuc](https://www.youtube.com/watch?v=1siPT1pTXFU)

### Running the service

Run it via an IDE or by using 

```bash
$ ./gradlew bootRun
```

It will expose the following endpoints (according to the [GraphQL-Kotlin Docs:](https://expediagroup.github.io/graphql-kotlin/docs/spring-server/spring-overview#default-routes))

- **/playground** - Prisma Labs GraphQL Playground IDE endpoint -> Use this to interact with the queries.
- **/graphql** - GraphQL server endpoint used for processing queries and mutations
- **/subscriptions** - GraphQL server endpoint used for processing subscriptions
- **/sdl** - Convenience endpoint that returns current schema in Schema Definition Language format

### Structure

The schema is defined in model / schema.kt. There we can define plain Kotlin classes to serve data to queries, mutations and subscriptions via GraphQL.
The current queries defined in model / query.kt.

The commented out code is to support live presentations, and can be switched around or played around as one wishes.

### Wanna see it being built?

Follow the [PR #001](https://github.com/renatomrcosta/spring-boot-graphql-playground/pull/1) to see the steps taken to achieve the initial repo status.
