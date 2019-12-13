import { Injectable } from '@angular/core';
import {
  HttpInterceptor,
  HttpHandler,
  HttpRequest,
  HttpEvent,
  HttpErrorResponse
} from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { MatDialog } from '@angular/material';
import { AlertDialogComponent } from '../../shared/alert/alert-dialog/alert-dialog.component';
import {
  ERR_CONECTION,
  ERR_SERVER,
  ERR_CLIENT
} from 'src/app/shared/var.const';

@Injectable()
export class ResponseCodeInterceptor implements HttpInterceptor {
  private CODE_NO_CONECTION = 0;
  private CODE_ERR_SERVER = 500;
  private CODE_ERR_CLIENT = 400;

  constructor(public dialog: MatDialog) {}

  intercept(
    req: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {
    return next.handle(req).pipe(
      catchError((e: HttpErrorResponse) => {
        if (e.status === this.CODE_NO_CONECTION) {
          this.dialog.open(AlertDialogComponent, { data: ERR_CONECTION });
        }

        if (e.status === this.CODE_ERR_SERVER) {
          this.dialog.open(AlertDialogComponent, {
            data: ERR_SERVER + e.error.mensaje
          });
        }

        if (e.status === this.CODE_ERR_CLIENT) {
          this.dialog.open(AlertDialogComponent, {
            data: ERR_CLIENT + e.error.mensaje
          });
        }

        return throwError(e);
      })
    );
  }
}
