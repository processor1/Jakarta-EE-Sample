# Jakarta-EE-Sample
Jakarta EE sample application development uisng Jax-rs ,JMS etc


<h2>Jakarta EE Messaing </h2>

Messaging is a method of communication between software 
components or applications. A messaging system is a peer-to-peer facility: A messaging client can send messages to, 
and receive messages from, any other client. Each client connects to a messaging agent that provides facilities for creating, sending, 
receiving, and reading messages.

<h2>Messaging</h2>
Messaging enables distributed communication that is loosely coupled. A component sends a message to a destination, and the recipient can retrieve the message from the destination. What makes the communication loosely coupled is that the destination is all that the sender and receiver have in common. The sender and the receiver do not have to be available at the same time in order to communicate. In fact, the sender does not need to know anything about the receiver; nor does the receiver need to know anything about the sender. The sender and the receiver need to know only which message format and which destination to use. In this respect, messaging differs from tightly coupled technologies, such as Remote Method Invocation (RMI), which require an application to know a remote application’s methods.
