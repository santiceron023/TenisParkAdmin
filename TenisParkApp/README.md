### app-angular-base

para configurar el repositorio de ceiba como registry de node ejecutar el siguiente comando

```npm config set @ceiba:registry=https://binary.ceiba.com.co/repository/temp-npm/```

Este bloque contiene la estructura necesaria para construir un proyecto en angular siguiendo la guia de estilos de angular.

[https://angular.io/guide/styleguide#style-guide](https://angular.io/guide/styleguide#style-guide)

Las características principales son
- Soporte de enrutamiento
- Manejo de seguridad
- Soporte lazy loading
- Arquitectura core-shared-feature

#### Estructura del proyecto

Los archivos de la aplicación se encuentran en la subcarpeta src. Las pruebas iniciales correspondientes de extremo a extremo se encuentran en la subcarpeta e2e.

El proyecto base está estructurado en los módulos feature, shared y core. Asegurando una separación adecuada de las preocupaciones, lo que facilitará la escalabilidad a medida que su aplicación crezca. Lo siguiente describe brevemente cada tipo de módulo.

##### Módulo core
Deben estar lo transversal y de una sola instancia en la aplicación. Por ejemplo: NavBar o interceptor.

##### Módulo feature
Deben estar los componentes que implementan funcionalidades especificas de la aplicación. Por ejemplo, el componente datos de contacto el cual es el componente que implementa la feature de contacto. Es posible tener compartidos dentro de esta feature.

##### Módulo shared
Deben estar componentes o utilidades comunes a las diferentes feature. Por ejemplo, un componente de un botón azul que usted desea repetir en varios lugares. Un filtro para ser utilizado en todos los componentes.


Después de importar el proyecto se muestra de la siguiente manera


![enter image description here](https://drive.google.com/uc?export=download&id=1Kp5uXDxH42HE-1y1qkgx5nzUeeYnCq7A)

