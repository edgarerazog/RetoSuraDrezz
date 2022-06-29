Feature: Customer Service
  As a customer, I want to make a complaint about a product found on the "DREZZ" page.

  @register1
  Scenario: Contact customer service on the DREZZ website
    Given Edgar needs to register a petition on the website DREZZ
      | reference         | message                 |
      | Camiseta talla xl | No hay talla disponible |
    When Fill in the required fields in the message

    Then  The DREZZ page shows that your message was sent successfully
