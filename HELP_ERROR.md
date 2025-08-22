🚨 Problemas:

SRP: PaymentService maneja múltiples métodos de pago y sus reglas.

OCP: Para agregar otro método (Bitcoin, Transferencia), hay que modificar PaymentService.

LSP: Si quisiéramos heredar Payment y agregar comportamiento, rompería la lógica.

ISP: No existen interfaces que dividan responsabilidades.

DIP: PaymentController depende de la clase concreta PaymentService, y PaymentService de implementaciones directas (if/else).