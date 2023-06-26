<?php

class ShoppingCart
{
    private $items = [];

    public function addItem(Item $item)
    {
        $this->items[] = $item;
    }

    public function removeItem(Item $item)
    {
        $key = array_search($item, $this->items, true);
        if ($key !== false) {
            unset($this->items[$key]);
        }
    }


    public function getItems()
    {
        return $this->items;
    }

    public function getSubtotal()
    {
        $subtotal = 0;
        foreach ($this->items as $item) {
            $subtotal += $item->getPrice();
        }
        return $subtotal;
    }
}
