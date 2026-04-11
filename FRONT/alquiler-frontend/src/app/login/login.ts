import { Component, inject } from '@angular/core';
import { FormsModule } from '@angular/forms'; // <-- Vital para usar ngModel
import { Router } from '@angular/router';
import { AuthService } from '../auth'; // Ajusta la ruta si está en otra carpeta

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule], // <-- Hay que declararlo aquí
  templateUrl: './login.html', // O el nombre que tenga tu HTML
  styleUrl: './login.css' // O el nombre que tenga tu CSS
})
export class LoginComponent {
  // Variables que se conectarán al HTML
  email = '';
  password = '';

  // Inyectamos el servicio y el enrutador
  private authService = inject(AuthService);
  private router = inject(Router);

  onLogin() {
    // Llamamos al backend a través del servicio
    this.authService.login(this.email, this.password).subscribe({
      next: (respuesta) => {
        console.log('¡Login exitoso!', respuesta);
        
        // 1. Guardamos el token en la memoria del navegador (como Postman)
        localStorage.setItem('jwt_token', respuesta.token);
        
        alert('¡Bienvenido! Token guardado con éxito.');
        
        // 2. Aquí más adelante le diremos que navegue a la lista de propiedades
        // this.router.navigate(['/propiedades']); 
      },
      error: (err) => {
        console.error('Error en el login', err);
        alert('Credenciales incorrectas. Revisa tu email y contraseña.');
      }
    });
  }
}