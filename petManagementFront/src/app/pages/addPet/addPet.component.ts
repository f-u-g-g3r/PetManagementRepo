import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { PetService } from '../../services/pet.service';
import { PetTypes } from 'src/app/interfaces/petTypes';
import { Country } from 'src/app/interfaces/countries';
import { FurColors } from 'src/app/interfaces/furColors';
import { Router } from '@angular/router';

@Component({
    selector: 'addPet-root',
    templateUrl: './addPet.html',
    styleUrls: ['../design.css']
  })

export class AddPetComponent implements OnInit {
  public petTypes: PetTypes[] = [];
  public furColors: FurColors[] = [];
  public countries: Country[] = [];
  public uid!: number;
  public userIdInput: any;

  constructor(private petService: PetService, private router: Router) {}
  
  ngOnInit() {
    this.checkLogin();
    this.getPetInfo();
  }

  public getPetInfo(): void {
    this.petService.getPetTypes().subscribe({
      next: (response: PetTypes[]) => this.petTypes = response,
      error: console.error
    });

    this.petService.getFurColors().subscribe({
      next: (response: FurColors[]) => this.furColors = response,
      error: console.error
    });

    this.petService.getCountries().subscribe({
      next: (response: Country[]) => this.countries = response,
      error: console.error
    });
  }

  public onAddPet(addForm: NgForm): void {
    const formFields = addForm.value;
    if(addForm.valid){
      this.petService.addPet(formFields).subscribe({
        complete: () => window.location.reload(),
        error: console.error
      });
    }
  }

  public redirectToTablePage(): void {
    this.router.navigate(['/show-pets']);
  }

  private checkLogin(): void {
    this.uid = parseInt(sessionStorage.getItem('uid') || '');
    if(Number.isNaN(this.uid)) {
      this.router.navigate(['/login']);
    }
  }

  public signOut(): void {
    sessionStorage.removeItem('uid');
    sessionStorage.removeItem('username');
    window.location.reload();
  }
}