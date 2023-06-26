<?php

class NotificationSystem
{
    private $subscribers = [];

    public function subscribe(callable $subscriber)
    {
        $this->subscribers[] = $subscriber;
    }

    public function notify()
    {
        foreach ($this->subscribers as $subscriber) {
            call_user_func($subscriber);
        }
    }
}
