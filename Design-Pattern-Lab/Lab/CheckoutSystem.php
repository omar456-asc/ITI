<?php

class CheckoutSystem
{
    private $cart;
    private $paymentGateway;

    public function __construct(ShoppingCart $cart, PaymentGateway $paymentGateway)
    {
        $this->cart = $cart;
        $this->paymentGateway = $paymentGateway;
    }

    public function processCheckout()
    {
        $subtotal = $this->cart->getSubtotal();
        $tax = $subtotal * 0.15;
        $total = $subtotal + $tax;

        $this->paymentGateway->charge($total);

        $this->cart->clear();
    }
}
