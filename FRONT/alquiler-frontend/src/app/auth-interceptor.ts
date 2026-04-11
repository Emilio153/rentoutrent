import { HttpInterceptorFn } from '@angular/common/http';

export const authInterceptor: HttpInterceptorFn = (req, next) => {
  // 1. Buscamos el token en la memoria del navegador
  const token = localStorage.getItem('jwt_token');

  // 2. Si hay token, clonamos la petición y le pegamos la cabecera de Autorización
  if (token) {
    const clonedRequest = req.clone({
      setHeaders: {
        Authorization: `Bearer ${token}`
      }
    });
    // Mandamos la petición modificada hacia el backend
    return next(clonedRequest);
  }

  // 3. Si no hay token (por ejemplo, en el login), dejamos pasar la petición tal cual
  return next(req);
};