# Requirements
Java 17
Gradle

# About Program
Program converts any number within the range [0,1).

# Running the program
Change the args in build.gradle to change what input is run.
If more than one input, add args in the format [".1", ".2"] with number wrapped in quotes and a comma between each input.
If number is outside of range [0,1), output will be "Number must be between 0 (inclusve) and 1 (exclusive)."
To run, use ./gradlew run.
Output will be similar to:
| Base 10 | Base 2 |
|   0.500  |  0.1  |
|   0.250  |  0.01  |
|   0.750  |  0.11  |
|   0.100  |  0.00011001  |
|   0.300  |  0.01001100  |

