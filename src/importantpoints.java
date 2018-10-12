
public class importantpoints {


}

/*1) consider two classes class A and Class B if both classes are present in the same package and if we want to use class A methods in class B 
 just create object of class A in class B and use methods of class A.
  same way if class A and class B are present in different package then if we want to use methods of class A in B then we want to mention
 " import packagename.classname "
 however eclipse will mention in default when we create an object
 
 2)Access modifiers ------>  there are four access modifiers, public, private, protected and default 
 
 ## Default : If we don't specify anything say--- void abc(){ }  then it considers are default, this can be accessed anywhere inside the package
   but if we go out of project we cannot access the above method even though we import package name.classname.
   the rule of default is it will be accessed only in the package.applies to variable as well.
   
  ## public :If we make variable or method public then we can use this anywhere or in any package, there is no restriction.
   
##private : if we use this, we cannot access method or variable outside the class itself.restricted only to class
   
##protected :if we define any variable or method as protected we can access those in subclasses only(which ever child is inheriting
           that particular parent class can access)
           only child class can access protected access modifier which extends parent class either in same package or in another package
           but the class outside the package should inherit the parent class.
           
         ####  only way to access a method or variable outside the package is using public and protected( only if the class is inheriting the parent)
 
 ##Java collection framework is collection of interfaces and classes which helps in storing and processing the data efficiently.
 this framework has several useful classess which have tons of useful functions which makes a programmer task super easy.
 1)list collection - where we can insert multiple values but it is different from Array
 It is an ordered collection( sequence ) , can have duplicate elements also.
 	Array list, linked list, vector
 */
 
 
 
