# Development documentation

## Back-end development

I started development from the back-end. It is my first experience in creating a real application on Spring and Java, 
so I spent two weeks to everyday practise and learn something new.

First, I started searching about what I need to create a RESTful application on Java & Spring.

Model, service, resource, repository. This is what I needed to do.
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

When I configure liquibase and h2 database, I created sql script that creates `Pets` table in the database.

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
10. Create model, service, controller and repository for `pet type`, `fur color` and `country of origin` at the back-end.
11. Execute sql scripts at server startup that will create tables  `pet_types`, `fur_colors`, `countries`and insert values into them.
12. Add methods to the `service` at front-end that will get data for pet types, fur colors and countries.
13. Bind the received data to the select lists.
14. Create modal window for editing pets.
15. Create modal window for deleting pets.
16. Create methods in the `component` to handle all pet manipulations.
17. Create validation for the mandatory fields by using ng attributes.

### Users

I decided to try to create functionality with users, it was the most difficult part of the task for me, however I managed it, but I understand that my solution is bad and if I had more time, I would redo it.

1. I created model, service, controller and repository for users at the back-end.
2. I created sql script that creates `Users` table.
3. I changed the `Pets` table in the database, I added a new `user_id` property that refer to the `Users` table to the `id` property.
4. I also created a method in the pet service that finds all pets by user id.
5. Then I started develop a component and service for user.
6. I created a login form.
7. I decided to make that if user is logged in there is a variable that stores his ID and if this variable is empty, the user is forwarded to the login page.

So, user is not allowed to see other user’s pets, only his own.

## Summary, problems & questions

**First of all, I want to say that this experience is very essential for me and the performance of this task was very interesting and useful, I really enjoyed it.**

I have faced with one problem that I didn't have time to solve and can't understand why this is happening. The problem is that when I have two pets for example and these pets have the same pet types, if I will change the type of one pet through the modal window and save changes, then when I try to change the type of the second pet, the select list of pet types will be set to the new pet type of the previous pet.

This problem appears not only when I try to change the pet type, but also the fur color and the country. I tried to solve it, but I realized that if I keep trying to solve it, I will not have time for the rest of the task.

##
I realized that I want more practise with Spring and Java, since I interested to become a backend developer I will put all my effort to learn Spring.

I spent at least 5 hours on this task every day after school, and on the weekends about 8-9 hours and there was not a day when I would be bored or tired of doing it.

I am going to make this task to the end and fix the bug that I found and may be redo the login solution.

I will be glad to answer any of questions you might have.








