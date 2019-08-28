Code Modularity + Maintainability

Why:
- Code written as independent modules are best suited for porting, which enables us to plug in/out different implementations for the same functionality. 
- Modular code also lets us develop code using various technologies that best suits any particular module.
- Easy to reuse across the applications. The lesser the code is dependent on other code easier it will be make changes.
- Keeping the code modular also helps in easily scaling any particular module.
- With modularity the number of lines/files in the code will be reduced so it will be easier to understand, debug, test and even refactor.
- Keeping the code modular helps new developers to quickly get up to speed with the development.

How:
- Any repeating code shoud be moved to util/helper classes. Large pieces of code should be broken down into smaller functions/methods.
- Development should be started after clearly boiling down all the requirements, that helps in writing independent modular code from the beginning.
- Encapsulate the code of a module and expose only the interfaces to outside world, with this the clients can stay uneffected if any changes are made in the module.

     In Java, Modularity can be achieved by making use of Java 9 modules.

     With Java 9 modular development:
     1. The internals of any modules are encapsulated
     2. To work with the encapsulated code, a set of well defined interfaces are exposed to the outside world. The encapsulated code can changed with effecting the clients that are dependent on the module.
     3. Dependencies are defined explicitly.

Code quality:
- High quality code gives the better performance of the application, making use of the right programming constructs for any given functionality.
- Code readablity is important in maintaining a good quality code. Following the naming conventions, coding standards and right indentation is imprortant.
- Providing proper comments in the code, documentating the design helps new developers understand code easily and quickly.
- Making use of the right desing patterns also helps us lower the code complexity.
- To maintain the quality of code we can make use of:
  Static code analysis tool: These tools scans the code and find potential bugs/vulnerabilities in the code. PMD is one such example.
  Code reviews: reviewing the code over a PR or using tools like Code collaborator helps the reviewers inspect the code before the code gets merged.
  For documenting the REST services tools like Swagger can be used.
