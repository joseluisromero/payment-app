✅ Principios SOLID aplicados:

SRP: Cada clase tiene una responsabilidad clara (CreditCardPayment solo maneja tarjetas, PaypalPayment solo PayPal).

OCP: Para agregar Bitcoin, basta con implementar otra clase BitcoinPayment que implemente PaymentMethod.

LSP: Todas las clases que implementan PaymentMethod se pueden usar indistintamente.

ISP: Interfaces pequeñas (PaymentMethod, IPaymentService) bien segregadas.

DIP: PaymentServiceImpl depende de la abstracción PaymentMethod, no de clases concretas.