# Requirements
Java 17
Gradle

# About Program
Program converts any number within the range [0,1).

# Running the program
If number is outside of range [0,1), output will be "Number must be between 0 (inclusve) and 1 (exclusive)."
To run, use ./gradlew run --args="base numberToBeConverted".
Seperate the base and each input by a space
Every digit will be seperated by a ; in the output

Example run
./gradlew run --args="4 .2 .3 .4"
Output will be similar to:
| Base 10 | Base 4 | 
| :------ |  :---- |
|   0.200  |  0.0;3;0;3;0;3;0;3  |
|   0.300  |  0.1;0;3;0;3;0;3;0  |
|   0.400  |  0.1;2;1;2;1;2;1;2  |


