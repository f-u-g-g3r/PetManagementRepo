# Pet Management Application


## Development documentation

[File with all notes and thoughts about the solutions.](doc.md)


## Deployment
### Back-end project deployment
[Download Petmanagement-1.jar](https://1drv.ms/u/s!AvuwRw-ytGNpgyXPo_8pRzKBt59v?e=KiM6zW) (Link to oneDrive due to file size limit on github)

**You must have installed at least JDK version 18!**

1. Download file `PetManagement-1.jar`.
2. You can start this file through a command prompt or terminal by command `java -jar PetManagement-1.jar`. 
**Make sure that you are in the same directory in the command prompt or terminal as the file!**
3. After these steps, the server should start.


### Front-end project deployment

**You must have installed Node js!**

1. Download folder `petManagementFront`.
2. Open a command prompt or terminal and change your directory to the `petManagementFront` folder path.
2. Run `npm install` to install node modules.
3. Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`.

## Usage
### Users
There are 3 user accounts that were created when the back-end application started.
1. login: **_User1_**; password: **_1234512345_**
2. login: **_User2_**; password: **_5432154321_**
3. login: **_User3_**; password: **_123123123_**

You can log in as one of these users and create pets which will only belong to the user you choose. Other users will not be able to see these pets.

You can create, edit and delete pets.

## Versions
- Java SE 19
- Spring Boot 3.0.6
- Angular 15.2.7
- Bootstrap 5
- Maven 3.8.8
