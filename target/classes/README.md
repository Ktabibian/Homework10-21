Generics:
1) Used to stop runtime errors
2) Create type safety
3) Is not data type specific in its parameter
4) When called on, has data type set using ClassName<WrapperClass/DataType>
5) Bounded Generic: Can be used to accommodate parent class and its subclasses (public class Printer <T extends Animal>)
6) Can take multiple bounds using & but can only use one class (<T extends Animal & InterfaceName>)
7) Can insert generic in methods (private static <T> void methodName(T thing))
8) Can receive multiple data type by inserting more to angled brackets (<T, V>)
9) Wildcard: Used when the Type Parameters for the generic are unknown (List<?>)
10) Can Bound Wildcards (<? extends ClassName>)
11) Generics receive any data type and return them as such
12) Generic Collections List/ArrayList, Set/HashSet, Map/HashMap
13) List stores an ordered collection
14) Set stores a unique collection
15) Map has Keys, Values and stores items in a one to one relationship with them
16) Set doesn't allow duplicates of elements
17) Set can be iterated over
18) Map elements can be searched by Value
19) Map elements can be searched by Key
20) Maps add elements with map.put()
21) Generic Bounding and Comparing;
22) Comparator class can be used to compare/sort a Collection
23) Comparator is created by implementing Comparator<> interface in a class
24) Comparator can be implemented anonymously Collections.sort(madMen, new Comparator<Type>()){@Override comparator method}
25) ^^ Used for exclusive comparing
26) Comparator Class can have a generic type
27) Comparable can be used to compare something by itself
28) Implemented by extends Comparable / can be made generic with Comparable<T>
29) Generics can help avoid typecasting
30) Type Declaration happens before return type in method signature
31) Wildcards can be bounded or unbounded
32) Upper Bounded Wildcard <? extends SuperClass> uses classes that extend SuperClass
33) Lower Bounded Wildcard <? super SuperClass> uses classes that are parent to SuperClass
34) ? extends limits below given superclass
35) ? super limits above given superclass

Lambda:
1) Can only be used with certain interfaces
2) ((parameters) -> method implementation)
3) Does not need access modifier, return type, method name
4) Converts method implementations into objects
5) If there is only one parameter you can exclude the () in expression
6) If there is a return type Lambda expression does not require return keyword for a returned expression
7) Lambda can only be used with a FunctionalInterface: an interface with only one abstract method
8) FunctionalInterface aka SAM Interface - single abstract method
9) Lambda expression can only define one method
10) Is a shortcut to defining and implementation of a FunctionalInterface
11) FunctionalInterface can have as many Default and static methods but only one abstract method
12) Syntax: Interface<Type> name = () -> implementation
13) java.util.function Types: Suppliers, Predicates, Consumers, Functions
14) Supplier doesn't take an argument produces something
15) Consumer consumes defines specified data type
16) Predicate produces a boolean based on defined parameter
17) Function can return anything defined by<T, R return>
18) Runnable takes no argument and returns nothing
19) Lambda isn't an instance of an anonymous class
20) Specialized Lambda expressions(Supplier, Consumer, Predicates, Function) for primitive type of int, long, double
21) Specialized Lambda expressions used for autoboxing: takes primitive converts to Wrapper / autounboxing: takes Wrapper converts to primitive
22) Compiler autoboxes/autounboxes behind the scenes
23) Interface default methods can be implemented in a Lambda expression
24) Lambda expressions can be chained and implemented in other Lambda expressions
25) 