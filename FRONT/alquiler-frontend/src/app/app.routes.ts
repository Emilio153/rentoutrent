import { Routes } from '@angular/router';

import { LoginComponent } from './login/login'; 

export const routes: Routes = [
  // Si la ruta está vacía (localhost:4200), lo redirigimos a /login
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  
  // Cuando la ruta sea /login, cargamos el componente
  { path: 'login', component: LoginComponent }
];