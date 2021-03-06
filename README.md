# declarative-service-example
Example of PDE based OSGi DS with Annotations (Neon)

# Idea 1
* An OSGi Declarative Service that uses @Component annotation to generate component XML and update MANIFEST.MF
* There is the service interface, the service impl and a command (consumer)
* Note: Service impl should be in extra bundle so it can be exchanged later on.

# Idea 2
* Add additional service implementations and bind them all
* => could serve as replacement for some scenarios that are usually solved using Eclipse extension mechanism.

# How to Run
* Clone Git repo and import into Eclipse Neon (RCP Bundle should do)
* Run launch config **DS_Test.launch** (stored in declarative-service-example-command)
* In OSGi Console enter e.g.:

```
osgi> calc "5" "8" // or: calculator:calc "5" "8"
5 + 8 = 13
5 * 8 = 40
```

# Links
http://blog.vogella.com/2016/06/21/getting-started-with-osgi-declarative-services/
https://www.eclipse.org/eclipse/news/4.6/pde.php (with entry regarding new DS annotation mechanism)



