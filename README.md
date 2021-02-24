# Android Navigation Architecture Component 
The Navigation Architecture Component provides 2 techniques for passing data between destinations.
One approach involves placing the data into a Bundle object that is passed to the destination during an action where it is then unbundled and the arguments extracted.
The main drawback - it is not “type safe”. -problems at runtime.

A better option is to make use of safeargs.
Safeargs is a plugin for the Android Studio Gradle build system which automatically generates special classes that allow arguments to be passed in a type safe way.