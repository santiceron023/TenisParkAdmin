import { Injectable } from "@angular/core";
import {
  HttpInterceptor,
  HttpHandler,
  HttpRequest,
  HttpEvent
} from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { Router } from "@angular/router";
import { catchError } from "rxjs/operators";
import { MatDialog } from "@angular/material";
import { AlertDialogComponent } from "../../shared/alert/alert-dialog/alert-dialog.component";

@Injectable()
export class ResponseCodeInterceptor implements HttpInterceptor {
  private NO_CONECTION = 0;
  private ERR_SERVER = 500;
  private ERR_CLIENT = 500;

  constructor(public dialog: MatDialog) {}

  intercept(
    req: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {
    return next.handle(req).pipe(
      catchError(e => {
        if (e.status === this.NO_CONECTION) {
          this.dialog.open(AlertDialogComponent);
        }

        if (e.status === this.ERR_SERVER) {
          this.dialog.open(AlertDialogComponent);
        }

        if (e.status === this.ERR_CLIENT) {
          this.dialog.open(AlertDialogComponent);
        }

        return throwError(e);
      })
    );
  }
}
