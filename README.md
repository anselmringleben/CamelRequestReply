# CamelRequestReply
An example how to implement Apache Camel's EIP RequestReply pattern with Spring.

## Project setup
producer <-> queue <-> consumer

### Project producer
* Reads file input, splits by line break and sends each line to activeMQ (consumer), processes replies from consumer

### Project queue
* ActiveMQ instance

### Project consumer
* Reads messages (lines) from activeMQ (producer), calculates word count of message and sends reply to producer
