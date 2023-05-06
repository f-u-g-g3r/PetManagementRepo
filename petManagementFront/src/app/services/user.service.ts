import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { environment } from "src/environments/environment";
import { User }  from '../interfaces/user';
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root',
})

export class UserService {
    private serverUrl = environment.serverUrl;

    constructor(private http: HttpClient) { }

    public getUsers(): Observable<User[]> {
        return this.http.get<User[]>(`${this.serverUrl}/users/all`);
    }
}