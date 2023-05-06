import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { BrowserModule } from '@angular/platform-browser';

import { PetService } from './services/pet.service';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { Routes, RouterModule } from '@angular/router';

import { ShowPetComponent } from './pages/showPets/showPets.component';
import { AddPetComponent } from './pages/addPet/addPet.component';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './pages/login/login.component';
import { UserService } from './services/user.service';

const routes: Routes = [
  { path: 'show-pets', component: ShowPetComponent },
  { path: 'add-pet', component: AddPetComponent },
  { path: 'login', component: LoginComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    ShowPetComponent,
    AddPetComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    NgbModule,
    RouterModule.forRoot(routes),
    
  ],
  providers: [PetService, UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
