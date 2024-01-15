#include<stdio.h>
// https://www.geeksforgeeks.org/strings-in-c/
// https://www.geeksforgeeks.org/strings-in-cpp/
int main() {
    // printf("Hello\n");
    // Char Array
    char charr[] = {'H', 'e', 'l', 'l', 'o'};
    printf("%c\n", charr[0]);
    // Strings
    char str1[] = {'H', 'e', 'l', 'l', 'o', '\0'};
    printf("%c\n", str1[0]);
    char str2[] = "Hello";
    printf("%p\n", &str2);
    str2[5] = '!';
    str2[6] = '\0';
    printf("%p\n", &str2);
    // C-Strings are mutable
    printf("%s\n", str2);
}