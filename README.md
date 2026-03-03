# Stream Api Test
## Description
This project contains the basic programs using Stream Api. Each program has different functions like sorting values,removing duplicates,mapping data and identifying duplicates.This helps me to  understand the basic functions of stream Api in a better way.
## Technologies Used
 1.Java 21
 
 2.Stream API
 
 3.Collections
 ### Task 1
 #### Given a list of integers, find out all the even numbers that exist in the list using Stream functions ?
#### 10,15,8,49,25,98,32
To find even numbers, use filter() with condition n%2==0
### Task 2
#### How to find duplicate elements in a given integers list in java using Stream functions?
#### 10,15,8,49,25,98,98,32,15
To find duplicate elements,use Map<key,value> here key is given numbers and the value is count of the number , use collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) to group the same elements and count it. Then use if condition (if>1) to find duplicate elements.
### Task 3
#### Given a list of integers, sort all the values present in it in descending order using Stream functions?
#### 10,15,8,49,25,98,98,32,15
To sort in descending order, use sorted(Comparator.reverseOrder())
### Task4
#### How to find only duplicate elements with its count from the String ArrayList in Java8?
#### [“AA", "BB", "AA", "CC”]
To find duplicate elements with its count,use Map<key,value> here key is given String and the value is count of the number , use collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) to group the same elements and count it. Then use if condition (if>1) to find duplicate elements with its count.
### Task 5
#### Mapping
#### Question: Given a list of strings representing names, map each name to its length and collect the lengths into a new list.
use map(String::length) to find the length of the string
### Task 6
#### Distinct Elements:
####      Question: Given a list of integers with duplicates, remove duplicates and collect the unique elements into a new list.

  ####    Input: [1, 2, 2, 3, 4, 4, 4, 5]
  #### Expected Output: [1, 2, 3, 4, 5]
  use distinct() to remove duplicates.
