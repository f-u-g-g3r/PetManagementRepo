import { Component, OnInit } from '@angular/core';
import { Pet } from '../../interfaces/pet';
import { PetService } from '../../services/pet.service';
import { PetTypes } from 'src/app/interfaces/petTypes';
import { FurColors } from 'src/app/interfaces/furColors';
import { Country } from 'src/app/interfaces/countries';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'showPets-root',
  templateUrl: './showPets.html',
  styleUrls: ['../design.css']
})

export class ShowPetComponent implements OnInit {
  public pets: Pet[] = [];
  public petTypes: PetTypes[] = [];
  public furColors: FurColors[] = [];
  public countries: Country[] = [];
  public updatePet: Pet | undefined;
  public deletePet!: Pet;
  public uid!: number;
  public username!: string;
  
  constructor(private petService: PetService, private router: Router) { }

  public ngOnInit() {
    this.checkLogin();
    this.getUserPets(this.uid);
    this.getPetInfo();
  }

  public getUserPets(userID: number): void {
    this.petService.getUserPets(userID).subscribe({
      next: (response: Pet[]) => this.pets = response,
      error: console.error
    });
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

  public onDeletePet(petID: number): void {
    this.petService.deletePet(petID).subscribe({
      next: () => this.getUserPets(this.uid),
      error: console.error
    });
  }

  public onUpdatePet(pet: Pet, updateForm: NgForm): void {
    if (updateForm.valid) {
      this.petService.updatePet(pet).subscribe({
        next: () => this.getUserPets(this.uid),
        error: console.error
      });
    }
  }

  public onOpenModal(pet: Pet, action: string): void {
    const button = document.createElement('button');
    const container = document.getElementById('table-container');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-bs-toggle', 'modal');
    if (action === 'update') {
      this.updatePet = pet;
      button.setAttribute('data-bs-target', '#updateModal');
    }
    if (action === 'delete') {
      this.deletePet = pet;
      button.setAttribute('data-bs-target', '#deleteModal');
    }
    if (container) {
      container.appendChild(button);
    }
    button.click();
  }

  public redirectToAddPage(): void {
    this.router.navigate(['/add-pet']);
  }

  private checkLogin(): void {
    this.uid = parseInt(sessionStorage.getItem('uid') || '');
    if(Number.isNaN(this.uid)) {
      this.router.navigate(['/login']);
    }
    this.username=sessionStorage.getItem('username') || '';
  }

  public signOut(): void {
    sessionStorage.removeItem('uid');
    sessionStorage.removeItem('username');
    window.location.reload();
  }
}