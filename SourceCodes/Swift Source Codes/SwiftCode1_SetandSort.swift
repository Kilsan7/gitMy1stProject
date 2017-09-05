/*****************************************
* My 1st swift code example
* 아래 주소에 저장되어 있음
* https://iswift.org/playground?ACzhxo 
*****************************************/
print("Hello World! :-)");
var letters = Set<Character>()
letters = ["a", "b", "A"]
//var names: Set<String> = ["David", "Susan", "Robert"]
var names: Set = ["David", "Susan", "Robert"]
print("Your letters Set data : \(letters)")
print("Set allow for ommiting <Type> : \(names)")
print("Now I'll insert another data 'Paul' using insert method.")
names.insert("Paul")
print("The data in the set names are : \(names)")
if names.contains("James") {
    print("James is here.")
} else {
    print("James is not with us.")
}
names.remove("Paul")
print("Now the data in the set names are : \(names)")
print("Now I'll remove all the data in names.")
names.removeAll()
print("The data in names are : \(names)")

var mySet: Set<String> = ["David, 27", "Susan: 30", "Robert, 41", "42"]
print("Here are mySet data now. I'll just state : $print(mySet)")
print(mySet)
print("Now in turn I'll display the same Set data with message.\nHere are mySet data : \(mySet)")
if mySet.contains("42") {
    print("Now I'll delete all the data using removeAll method.")
    mySet.removeAll()
    print("All of the data in mySet are just removed!")
    print("So the data Set is empty : \(mySet)")
}  
else {
    print(mySet.count)
    print("Here are mySet data : \(mySet)")
}

var mySet2: Set<String> = ["David, 27", "Susan: 30", "Robert, 41", "Kilsan: 45", "Eugene: 51", "Aris: 67", "Hegel: 61", "Marx: 57"]
print("\n1. Here are mySet2 data now. First I'll show all the data in the Set. \nI'll just state : $print(mySet2)")
print(mySet2)
print("2. Here are mySet2 data iterating with for-in loop.")
for name in mySet2 {
   print("\(name)")
}
print("3. Here are mySet2 data iterating with for-in loop with sorted() method.")
for name in mySet2.sorted() {
   print("\(name)")
} /* In Swift3, the sort method is named sorted(). Sololearn user comments(^^). */
