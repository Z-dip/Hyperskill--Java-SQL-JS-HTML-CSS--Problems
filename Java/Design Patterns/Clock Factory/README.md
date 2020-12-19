******SINCE THIS PROBLEM NO LONGER EXISTS ON THE WEBSITE, I INCLUDED THE PROBLEM ITSELF********


Clock factoryOpen on JetBrains Academy

There is a hierarchy of clocks with the base interface Clock and the class ClockFactory to produces instances.

Implement the method produce of the factory. It should return a clock according to the specified type string:

"SAND" is for SandClock;
"DIGITAL" is for DigitalClock;
"MECH" is for MechanicalClock.
The single constructor of the factory takes the boolean parameter produceToyClock. It determines what the factory does when an unsuitable type of clock is passed. If it is true, the factory should produce an instance of ToyClock, otherwise, return null.

Do not change the provided code of the clock classes.



Memory limit: 256 MB
Time limit: 8 seconds
