1. When to use ? 
    - Memory is limited.
    - Data can be shared.
    - Creation object is costlier.
2. How to implement ? 
    - Determine Intrinsic and Extresic Sharing data. 
        - Intrensic - Data cannot be changed once the object is created. 
        - Extransic - Data can be changed. 
    - Remove extrinsic object which will make object immutable and object will be called as FLYWEIGHT Object.
    - Create a cache to create an Flyweight Object. this object should implement an interface which can update extrensic data. 
3. Usage - Wherever Memory is constraint. ex. Word processor, Game Development.   