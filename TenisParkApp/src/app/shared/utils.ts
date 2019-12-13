import { FormGroup } from '@angular/forms';
const MIN_DATE_DIGIT = 2;

export function formatDate(fecha: Date): string {
  let month = `${fecha.getMonth() + 1}`;
  let day = `${fecha.getDate()}`;
  let year = `${fecha.getFullYear()}`;

  if (month.length < MIN_DATE_DIGIT) {month = `0${month}`}
  if (day.length < MIN_DATE_DIGIT) {day = `0${day}`}

  return [year, month, day].join('-');
}

export function formatDateTime(fecha: Date, hora: number): string {
  let dateString = formatDate(fecha);
  let auxHour = hora.toString();
  let hourString =
    auxHour.length < MIN_DATE_DIGIT ? `0${auxHour}:00:00.000Z` : `${auxHour}:00:00.000Z`;
  return [dateString, hourString].join('T');
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
  let keys = (<any>Object).keys(obj);
  keys.forEach(element => {
      vals.push(obj[element]);
  });

  return vals;
}