import { AppPage } from "./app.po";
import { browser, logging, element, by } from "protractor";

describe("workspace-project App", () => {
  let page: AppPage;

  beforeEach(() => {
    page = new AppPage();
  });

  //HOME
  // it("wellcome Mesage check", () => {
  //   page.navigateTo("/");
  //   expect(page.getTitleText()).toEqual("Bienvenido Admin Tenis Park");
  // });

  //CANCHA CREAR
  // it("Cancha CREATE", () => {
  //   page.navigateTo("/cancha/crear");
  //   element(by.formControlName("numeroFormCtrl")).sendKeys("2");
  //   element(by.formControlName("administradorFormCtrl")).sendKeys(
  //     "Juan Santos"
  //   );
  //   element(by.formControlName("telefonoFormCtrl")).sendKeys("571 2589");
  //   element(by.id("canchaGuardarBtn")).click();
  //max t response
  // browser.sleep(1500);
  //   expect(element(by.id("dialogText")).getText()).toEqual("Creación éxitosa");
  //   browser.sleep(5000);
  // });

  //RESERVAR
  it("Reserva crear", () => {
    page.navigateTo("/reserva/crear");
    element(by.formControlName("canchaFormCtrl")).sendKeys("1");
    element(by.formControlName("usuarioFormCtrl")).sendKeys("Daniela Orozco");
    element(by.formControlName("cantidadFormCtrl")).sendKeys("4");
    element(by.formControlName("horaInicioFormCtrl")).sendKeys("10");
    element(by.formControlName("horaFinFormCtrl")).sendKeys("12");
    element(by.formControlName("fechaFormCtrl")).sendKeys("31/12/2019");
    element(by.css("#reservaGuardarBtn")).click();
    //max t response
    browser.sleep(1500);
    expect(element(by.id("dialogText")).getText()).toEqual("Creación éxitosa");
    browser.sleep(10000);
  });

  //RESERVAR
  it("cambiar tarifa", () => {
    page.navigateTo("/tarifa");
    element(
      by.css("#tarifasTable > mat-row[1] > mat-cell[3] > button")
    ).click();
    element(by.formControlName("tarifaFormCtrl")).sendKeys("8000");
    element(by.id("tarifaActualizarBtn")).click();
    //max t response
    browser.sleep(1500);
    expect(element(by.id("dialogText")).getText()).toEqual("Creación éxitosa");
    browser.sleep(10000);
  });

  // afterEach(async () => {
  //   // Assert that there are no errors emitted from the browser
  //   const logs = await browser
  //     .manage()
  //     .logs()
  //     .get(logging.Type.BROWSER);
  //   expect(logs).not.toContain(
  //     jasmine.objectContaining({
  //       level: logging.Level.SEVERE
  //     } as logging.Entry)
  //   );
  // });
});
