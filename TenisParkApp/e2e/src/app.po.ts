import { browser, by, element } from 'protractor';

export class AppPage {
  
  navigateTo(ruta:string) {
    return browser.get(ruta) as Promise<any>;
  }

  getTitleText() {
    return element(by.css('app-root p')).getText() as Promise<string>;
  }

  clickEditbyRowIndex(rowIndex) { // rowIndex >=0
    element.all(by.css('table#table_id > tbody > tr > td > a.editClr'))
   .get(rowIndex).click();
}
}
