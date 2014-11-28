UnderstadingSpringSingleton
===========================

This is a simple project which I used to actually understand what would happen in a Spring project which has a "Controller" layer 
with request scope and "Service" and "DAO" layer with singleton scope.

The aim of this experiment is to understand what would happen if a singleton class which uses an instance variable as counter, is accessed 
by two threds.
And how the same problem is fixed by a class which doesn't use instance variables.

Two classes "SingletonShouldBeClass.class" and "SingletonShouldNotBeClass.class" are used.
In SingletonShouldNotBeClass uses an instance varible. 

As I already know, 
1) Instance variables are stored in the heap. There is only one copy of the variable per instance.Since this is a singleton 
class, the change inflicted on the instance variable by a single thread will affect the other thread as well.
2) Each thread created will get its "memory frame". This memory frame has the stack memory used by the method it executes.
So all the variables used inside the method or in other words all the variables that would ideally go into the stack memory,
a copy will be created per thread.

As per the above logic, the SingletonShouldNotBeClass when executed by two threads, one thread affects the other.

Where as in SingletonShouldBeClass, since it uses only the stack memory, one thread doesn't affect the other.


The commented lines of code in SingletonShouldNotBeClass, also shows how to fix this issue using thread local variables.
