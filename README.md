# Producer-Consumer Problem

This code implements the classic Producer-Consumer problem using Java. The problem involves two threads, a producer and a consumer, that share a common buffer or queue. The producer is responsible for producing items and putting them into the buffer, while the consumer consumes items from the buffer.

## Q Class

The `Q` class represents the shared buffer or queue. It contains an `int` variable `num` to store the value of the item and a `boolean` variable `valueSet` to indicate if the buffer is empty or full.

The `put` method is used by the producer to put items into the buffer. It uses synchronization and a `while` loop to ensure that the producer waits when the buffer is full (`valueSet` is `true`). Once the buffer is available, the item is stored in `num`, the message is printed, `valueSet` is set to `true`, and the `notify` method is called to wake up the waiting consumer.

The `get` method is used by the consumer to retrieve items from the buffer. It also uses synchronization and a `while` loop to wait when the buffer is empty (`valueSet` is `false`). Once an item is available, the message is printed, `valueSet` is set to `false`, and the `notify` method is called to wake up the waiting producer.

## Producer Class

The `producer` class implements the `Runnable` interface and represents the producer thread. It takes an instance of the `Q` class in its constructor and starts a new thread. In the `run` method, it continuously puts items into the buffer using the `put` method and sleeps for 1 second between each put.

## Consumer Class

The `consumer` class also implements the `Runnable` interface and represents the consumer thread. It takes an instance of the `Q` class in its constructor and starts a new thread. In the `run` method, it continuously retrieves items from the buffer using the `get` method and sleeps for 1 second between each get.

## Main Class

The `producerConsumer` class is the main class that creates an instance of the `Q` class and starts both the producer and consumer threads.

## Note

You can customize the code by modifying the sleep duration, adding additional functionality, or integrating it into your existing project.

---

Enjoy using the Producer-Consumer solution!
