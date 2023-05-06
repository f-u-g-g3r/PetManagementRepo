import { Component, OnInit } from '@angular/core';
import { User } from '../../interfaces/user';
import { UserService } from 'src/app/services/user.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'user-root',
  templateUrl: './login.component.html',
  styleUrls: ['./login.css']
})

export class LoginComponent implements OnInit{
    public users: User[] = [];
    private uid!: number;
    public loginError!: string;

    constructor(private userService: UserService,  private router: Router) {}

    ngOnInit(): void {
        this.checkLogin();
        this.getUsers();
    }

    public getUsers(): void {
        this.userService.getUsers().subscribe({
            next: (response: User[]) => this.users = response,
            error: console.error
        });
    }

    public validateUser(loginForm: NgForm): void {
        let loggined: boolean = false;
        for (let user of this.users) {
            if (loginForm.value.username == user.username && loginForm.value.password == user.password) {
                this.loginUser(user);
                loggined = true;
                break;
            }
        }
        if(!loggined) {
            this.loginError = 'Invalid username or password!';
        }
    }

    public loginUser(user: User): void {
        sessionStorage.setItem('uid', user.id.toString());
        sessionStorage.setItem('username', user.username);
        this.router.navigate(['/show-pets']);
    }

    private checkLogin(): void {
        this.uid = parseInt(sessionStorage.getItem('uid') || '');
        if(!(Number.isNaN(this.uid))) {
            this.router.navigate(['/show-pets']);
        }
    }
}