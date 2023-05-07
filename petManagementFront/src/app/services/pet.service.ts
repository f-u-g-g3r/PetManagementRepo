import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Pet } from '../interfaces/pet';
import { environment } from 'src/environments/environment';
import { PetTypes } from '../interfaces/petTypes';
import { FurColors } from '../interfaces/furColors';
import { Country } from '../interfaces/countries';

@Injectable({
  providedIn: 'root'
})

export class PetService {
  private serverUrl = environment.serverUrl;

  constructor(private http: HttpClient) { }

  public getUserPets(userID: number | undefined): Observable<Pet[]> {
    return this.http.get<Pet[]>(`${this.serverUrl}/pets/findUserPets/${userID}`)
  }

  public addPet(pet: Pet): Observable<Pet> {
    return this.http.post<Pet>(`${this.serverUrl}/pets/new`, pet)
  }

  public updatePet(pet: Pet): Observable<Pet> {
    return this.http.put<Pet>(`${this.serverUrl}/pets/update`, pet)
  }

  public deletePet(petID: number): Observable<void> {
    return this.http.delete<void>(`${this.serverUrl}/pets/delete/${petID}`)
  }

  public getPetTypes(): Observable<PetTypes[]> {
    return this.http.get<PetTypes[]>(`${this.serverUrl}/petTypes/all`)
  }

  public getFurColors(): Observable<FurColors[]> {
    return this.http.get<FurColors[]>(`${this.serverUrl}/furColors/all`)
  }

  public getCountries(): Observable<Country[]> {
    return this.http.get<Country[]>(`${this.serverUrl}/countries/all`)
  }
}
