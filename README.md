[Java serialization 🥣](https://www.youtube.com/watch?v=DfbFTVNfkeI)
https://www.youtube.com/watch?v=DfbFTVNfkeI

![](Pasted%20image%2020250306155312.png)

- static fields are not serialised 
- class definition is not recorded
	- only cast as object type

**Java serialization** is a mechanism in Java that allows an object to be converted into a byte stream, which can then be reverted back into a copy of the object. This process is known as **serialization** (converting an object to a byte stream) and **deserialization** (reconstructing the object from the byte stream).

### Uses of Java Serialization:

1. **Persistence**: Saving the state of an object to a file or database.
2. **Communication**: Sending objects over a network, such as in Remote Method Invocation (RMI).
3. **Caching**: Storing objects in memory for quick retrieval.
4. **Deep Copy**: Creating a deep copy of an object by serializing and then deserializing it.

### Advantages:

- **Ease of Use**: Simplifies the process of saving and retrieving object states.
- **Built-in Support**: Java provides built-in support for serialization with the `Serializable` interface.
- **Flexibility**: Can serialize complex object graphs, including objects that reference other objects.

### Disadvantages:

- **Performance Overhead**: Serialization can be slow and resource-intensive.
- **Security Risks**: Serialized data can be tampered with, leading to security vulnerabilities.
- **Versioning Issues**: Changes to the class structure can cause compatibility problems with previously serialized objects.
- **Lack of Control**: Limited control over the serialization process, which can lead to issues with transient fields and custom serialization logic.