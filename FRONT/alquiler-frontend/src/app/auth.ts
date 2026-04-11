import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  // ¡La misma URL que usábamos en Postman!
  private apiUrl = 'http://localhost:8092/api/auth/login';

  // Inyectamos el HttpClient para poder hacer peticiones
  constructor(private http: HttpClient) { }

  // Método que recibe los datos y devuelve la respuesta del backend
  login(email: string, password: string): Observable<any> {
    const body = { email, password };
    return this.http.post(this.apiUrl, body);
  }
}