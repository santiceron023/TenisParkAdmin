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
  it("Cancha CREATE", () => {
    page.navigateTo("/cancha/crear");
    element(by.formControlName("numeroFormCtrl")).sendKeys("2");
    element(by.formControlName("administradorFormCtrl")).sendKeys(
      "Juan Santos"
    );
    element(by.formControlName("telefonoFormCtrl")).sendKeys("571 2589");
    browser.sleep(2500);
    element(by.id("canchaGuardarBtn")).click();
  // max t response
  expect(element(by.xpath("//p[@id='dialogMensaje']")).getText()).toEqual("Creación éxitosa");
    browser.sleep(5000);
  });

  //RESERVAR
  it("Reserva crear", () => {
    page.navigateTo("/reserva/crear");
    element(by.formControlName("canchaFormCtrl")).sendKeys("1");

    element(by.formControlName("usuarioFormCtrl")).click();
    element(by.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]")).click();

    element(by.xpath("//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']")).click();
    element(by.xpath("//div[contains(text(),'27')]")).click();


    element(by.formControlName("cantidadFormCtrl")).sendKeys("4");
    element(by.formControlName("horaFinFormCtrl")).sendKeys("12");

    element(by.formControlName("horaInicioFormCtrl")).sendKeys("10");
    browser.sleep(2000);
    element(by.xpath("//button[@id='reservaGuardarBtn']")).click();
    browser.sleep(5000);
    //max t response
    expect(element(by.xpath("//p[@id='dialogMensaje']")).getText()).toEqual("Creación éxitosa");
  });

  //button[@id='reservaGuardarBtn'
  //RESERVAR
  it("cambiar tarifa", () => {
    page.navigateTo("/tarifa");
    element(
      by.xpath("//mat-row[1]//mat-cell[3]//button[1]")
    ).click();
    element(by.formControlName("tarifaFormCtrl")).sendKeys("8000");
    browser.sleep(2000);
    element(by.id("tarifaActualizarBtn")).click();
    //max t response
    browser.sleep(5000);
    expect(element(by.xpath("//p[@id='dialogMensaje']")).getText()).toEqual("Creación éxitosa");
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
