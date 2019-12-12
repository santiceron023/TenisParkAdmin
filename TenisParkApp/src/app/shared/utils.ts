import { FormGroup } from '@angular/forms';

export function formatDate(fecha: Date): string {
  let month = "" + (fecha.getMonth() + 1),
    day = "" + fecha.getDate(),
    year = fecha.getFullYear();

  if (month.length < 2) month = "0" + month;
  if (day.length < 2) day = "0" + day;

  return [year, month, day].join("-");
}

export function formatDateTime(fecha: Date, hora: number): string {
  let dateString = formatDate(fecha),
    auxHour = hora.toString();
  let hourString =
    auxHour.length < 2 ? `0${auxHour}:00:00.000Z` : `${auxHour}:00:00.000Z`;
  return [dateString, hourString].join("T");
}


export function markFormGroupTouched(formGroup: FormGroup) {
  ObjectValues(formGroup.controls).forEach(control => {

      if (control.controls) { // control is a FormGroup
          markFormGroupTouched(control);
      } else { // control is a FormControl
          control.markAsTouched();
      }
  });
}


export function ObjectValues(obj) {
   
  let vals = [];
  let keys = (<any>Object).keys(obj)
  keys.forEach(element => {
      vals.push(obj[element])
  });

  return vals;
}