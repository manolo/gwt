## How to build GWT:

 - You need `java` and `ant` installed in your system.

 - Optional: if you want to compile elemental you need
   `python` and `g++`

 - You need the `gwt-tools` downloaded, and by default they
   should be in the folder `../tools` unless you define
   the environment variable `GWT_TOOLS`

 - To create the SDK distribution files run:

  `$ ant clean elemental dist-dev`

   or if you dont have phyton and g++

  `$ ant clean dist-dev`

   Then you will get all .jar files in the folder build/lib and
   the redistributable file `build/dist/gwt-0.0.0.zip`

   Tip: if you want to specify a different version number run:

```
$ export GWT_VERSION=x.x.x
$ ant elemental clean dist-dev
```

  ``

  ``
