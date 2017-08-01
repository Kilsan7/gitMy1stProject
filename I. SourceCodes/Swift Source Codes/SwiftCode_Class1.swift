/*****************************************
* My 2nd swift code example
* Value Type and Reference Type
*****************************************/
struct Resolution {
   var width = 0
   var height = 0
}

class VideoMode { 
   var resolution = Resolution()
   var interlaced = false
   var frameRate = 0.0
}

let someResolution = Resolution()
let someVideoMode = VideoMode()

print("The someResolution.width is \(someResolution.width)")
print("The someVideoMode.resolution.width is \(someVideoMode.resolution.width)")

print("Now let's set someVideoMode.resolution.width value : 1280")
someVideoMode.resolution.width = 1280
print("The new someVideoMode.resolution.width is \(someVideoMode.resolution.width)")

let vga = Resolution(width: 640, height: 480)
print("The width of vga instance is \(someResolution.width) & \nThe width of vga instance is \(someResolution.height)")

//Structures are Value Types
let hd = Resolution(width: 1920, height: 1080)
var cinema = hd


print("cinema.width is assigned new pixels value.")
cinema.width = 2048
print("hd is still \(hd.width) pixels wide")
// prints "hd is still 1920 pixels wide"

//Classes are Reference Types
let tenEighty = VideoMode()
tenEighty.resolution = hd
tenEighty.interlaced = true

let alsoTenEighty = tenEighty
alsoTenEighty.interlaced = false
/* Because classes are reference types, tenEighty and alsoTenEighty actually both refer to the same VideoMode instance, 
so the interlaced value is changed for both. 
Effectively, they are just two different names for the same single instance. 
Rather than being declared as variables, tenEighty and alsoTenEighty are declared as constants. 
However, it's still possible to change their properties, 
because the values of the tenEighty and alsoTenEighty constants themselves do not actually change. */

class Test {
   var num = 17
}
let a = Test()
let b = a
b.num = 42
print(a.num)    //Because class is reference type. the value of a is also changed.

/* Identity Operators

You may need to determine whether two constants or variables refer to the same instance of a class. 
To accomplish this, Swift provides the following identity operators:
Identical to (===)
Not identical to (!==) 
Use these operators to check your constants or variables to see if they refer to the same single instance:
*/

if tenEighty === alsoTenEighty {
 print("Same")
}


