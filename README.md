# declarative-service-example
Example of PDE based OSGi DS with Annotations (Neon)

# Idea
* An OSGi Declarative Service that uses @Component annotation to generate component XML and update MANIFEST.MF
* There is the service interface, the service impl and a command (consumer)
* Note: Service impl should be in extra bundle so it can be exchanged later on.

# How to Run
* Clone into Eclipse Neon
* Create "OSGi Framework" Run Config as decribed in tutorial below.
* Run config
* In OSGi Console enter e.g.:

```
  osgi> calc "1" "41"
  1 + 41 = 42
```

# Links
http://blog.vogella.com/2016/06/21/getting-started-with-osgi-declarative-services/

