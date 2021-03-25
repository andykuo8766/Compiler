#include <stdio.h> 
#include <stdlib.h> 
#include <string.h>

#define MAX 80

void inToPostfix(char *infix, char *postfix) {
	char stack[MAX] = { "\0" };
	int i, j, top;
	for (i = 0, j = 0, top = 0; infix[i] != '\0'; i++) {
		switch (infix[i]) {
		case '(':              
			stack[++top] = infix[i];
			break;
		case '+': case '-': case '*': case '/':
			while (priority(stack[top]) >= priority(infix[i])) {
				postfix[j++] = stack[top--];
			}
			stack[++top] = infix[i]; 
			break;
		case ')':
			while (stack[top] != '(') { 
				postfix[j++] = stack[top--];
			}
			top--; 
			break;
		default:  
			postfix[j++] = infix[i];
		}
	}
	while (top > 0) {
		postfix[j++] = stack[top--];
	}
}
void inToPrefix(char *infix, char *prefix) {
	char stack[MAX] = { "\0" };
	int i, j, top;
	for (i = strlen(infix) - 1, j = 0, top = 0; i >= 0; i--) {
		switch (infix[i]) {
		case ')':              
			stack[++top] = infix[i];
			break;
		case '+': case '-': case '*': case '/':
			while (priority(stack[top]) >= priority(infix[i])) {
				prefix[j++] = stack[top--];
			}
			stack[++top] = infix[i]; 
			break;
		case '(':
			while (stack[top] != ')') { 
				prefix[j++] = stack[top--];
			}
			top--; 
			break;
		default:  
			prefix[j++] = infix[i];
		}
	}
	while (top > 0) {
		prefix[j++] = stack[top--];
	}
}
int priority(char op) {
	switch (op) {
	case '+': case '-': return 1;
	case '*': case '/': return 2;
	default:            return 0;
	}
}

int main(void) {
	char infix[MAX]={ "\0" };
	char postfix[MAX]={ "\0" };
	char prefix[MAX]={ "\0" };
	printf("Infix: ");
	scanf("%s", infix);
	inToPostfix(infix, postfix);
	inToPrefix(infix, prefix);
	int i;
	printf("Postfix: ");
	for (i = 0; postfix[i] != '\0'; i++) {
		printf("%c", postfix[i]);
	}
	printf("\n");
	printf("Prefix: ");
	for (i = strlen(infix) - 1; i >= 0; i--) {
		printf("%c", prefix[i]);
	}
	printf("\n");
	system("pause");
	return 0;
}

