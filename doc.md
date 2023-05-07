# Development documentation

## Back-end development

I started development from the back-end. It is my first experience in creating a real application on Spring and Java, 
so I spent two weeks to everyday practise and learn something new.

First, I started searching about what I need to create a RESTful application on Java & Spring.

1. Model, service, resource, repository. This is what I needed to do.
    - Model should store all the data logic.
    - Service contains all the CRUD methods.
    - Controller receives requests and sends responses.
    - Repository extends JpaRepository to save new pets

So, first I created all this for the `Pet` entity.

### Database
Then, I started to search information about `H2 databases` and `Liquibase`. I have never used them before, so I found some guides about how to configure them to work.

I found 2 useful videos on youtube about this:
1. [Liquibase](https://youtu.be/lf6Mxb9rVng)
2. [H2 database](https://youtu.be/PSrHcCwvfVQ)

There was a problem for me with `hibernate_sequence` for the liquibase, I can't fully understand what is that and if I don't configure this, my database won't work.

### Testing

I was using Postman to test my API.

## Front-end development

I created an Angular project by using `Angular CLI`.

I have never used TypeScript, nevertheless I quickly figured out with it, because I know basics of `JavaScript`.

I decided to make a list of tasks for myself to make front-end step by step.

1. Learn how angular can communicate with back-end server.
    - I found information about service in the [official angular documentation](https://angular.io/guide/http). 
2. Create interface for `Pet` entity.
3. Create `service` for sending requests to the server.
4. Learn about how angular project works and what I need. I learned about components and routing and for the start it was enough.
5. Download bootstrap into my angular project by using [that guide](https://www.freecodecamp.org/news/how-to-add-bootstrap-css-framework-to-an-angular-application/).
    - I already have experience with bootstrap, so it was the easiest to use.
6. Create component to show created pets.
7. Create component to add pets.
8. Create the functionality to make it all works.
    - I have learned some angular attributes, so it became more easier to make it works.
9. At this stage, I have working creating pet mechanism, and displaying these pets, but the values of select lists are not getting populated from the database.
10. Create model, service, controller and repository for `pet type`, `fur color`, `country of origin`.
    
    






