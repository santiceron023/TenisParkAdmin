import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpHandler, HttpRequest, HttpEvent } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { Router } from '@angular/router';
import { catchError } from 'rxjs/operators';


@Injectable()
export class AuthInterceptor implements HttpInterceptor {
  private UNAUTHORIZED = 401;
  private FORBIDDEN = 403;

  constructor(private router: Router) { }

  intercept(req: HttpRequest<any>, next: HttpHandler):
    Observable<HttpEvent<any>> {


    return next.handle(req).pipe(
      catchError(e => {
        if (e.status === this.UNAUTHORIZED) {
          this.router.navigate(['/login']);
        }

        if (e.status === this.FORBIDDEN) {
          this.router.navigate(['/home']);
        }
        return throwError(e);
      })
    );
  }
}
