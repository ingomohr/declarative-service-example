# declarative-service-example
Example of PDE based OSGi DS with Annotations (Neon)

# Idea
* An OSGi Declarative Service that uses @Component annotation to generate component XML and update MANIFEST.MF
* There is the service interface, the service impl and a command (consumer)
* Note: Service impl should be in extra bundle so it can be exchanged later on.

# How to Run
* Clone Git repo and import into Eclipse Neon (RCP Bundle should do)
* Run launch config **DS_Test.launch** (stored in declarative-service-example-command)
* In OSGi Console enter e.g.:

```
osgi> calculator:calc "1" "41"
1 + 41 = 42
```

# Links
http://blog.vogella.com/2016/06/21/getting-started-with-osgi-declarative-services/
https://www.eclipse.org/eclipse/news/4.6/pde.php (with entry regarding new DS annotation mechanism)


# Further Things to Check
Use DS as replacement for extension points. (could be useful to get rid of problems with registration restrictions and stuff)

