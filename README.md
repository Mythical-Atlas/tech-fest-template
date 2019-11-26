# Java Template for the Tech Fest Coding Challenge

Programmed by Ben Correll from Concordia Lutheran High School

Basically, use this if you want to win.

Written for Java 12 (although it likely will work with most other versions)

I would highly recommend using the Eclipse IDE for Tech Fest. If you're good enough at programming to be at Tech Fest, you're probably good enough to use Eclipse. The template does, however, work with any other IDE (such as Dr. Java or Netbeans).

# Stuff you should know BEFORE Tech Fest

- basic java syntax
- loops
- arrays

If you're reading this on the bus ride to Tech Fest and you don't already know how to do these things, you're pretty much screwed.

# How to use this template

Put all of your custom code in the loader.java file. I would reccomend using the functions in Simple.java for ease of use, but the more technical stuff (if you want to use it), is there as well.

All the challenges I've personally encountered only involve one data type. This type could be either strings, integers, and characters. Because of this, the functions to read from and write to a file only support integers and strings (characters can be obtained from strings). For simplicity, the read functions parse the data into 2D arrays of their respective data type. The arrays are 2D in order for the data to be separated by line and then by space.

Example input:
`
this is an
example input
`

Example parsed data:

> {{this, is, an}, {example, input}}

`
[0][0] = this
[1][1] = input
`
