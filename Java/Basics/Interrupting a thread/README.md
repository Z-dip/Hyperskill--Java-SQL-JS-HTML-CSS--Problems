******SINCE PROBLEMS GONE FROM HYPERSKILLS, I INCLUDE IT HERE******

Interrupting a threadOpen on JetBrains Academy

You are dealing with the class Worker that extends Thread . The class overrides the method run to do something useful. You need to start an instance of this class (in a new thread), wait for it a little (2000-3000 milliseconds) and interrupt this new thread.

If you do not interrupt the thread after starting, something bad will happen.



Memory limit: 256 MB
Time limit: 8 seconds
