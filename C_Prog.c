Today I start to write anything I learnt  about C programming here and I'm preparing for TCS NQT nad I have to clear it by taking it in an one chanse.
1).To print the matrix which is after rotated for 90 degrees(by transposing and interchanging the rows);
/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

// Function to transpose the matrix
void transpose(int N, int mat[N][N]) 
    for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
            // Swap mat[i][j] with mat[j][i]
            int temp = mat[i][j];
            mat[i][j] = mat[j][i];
            mat[j][i] = temp;
        }
    }
}

// Function to reverse each row of the matrix
void reverse_rows(int N, int mat[N][N]) {
    for (int i = 0; i < N; i++) {
        int start = 0, end = N - 1;
        while (start < end) {
            // Swap mat[i][start] with mat[i][end]
            int temp = mat[i][start];
            mat[i][start] = mat[i][end];
            mat[i][end] = temp;
            start++;
            
        }
    }
}

// Function to print the matrix
void print_matrix(int N, int mat[N][N]){
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            printf("%d ", mat[i][j]);
        }
        printf("\n");
    }
}

int main() {
    int N;
    printf("Enter the size of the matrix (N): ");
    scanf("%d", &N);

    int mat[N][N];
    printf("Enter the elements of the matrix:\n");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            scanf("%d", &mat[i][j]);
        }
    }

    // Transpose the matrix
    transpose(N, mat);

    // Reverse each row of the transposed matrix
    reverse_rows(N, mat);

    printf("Resultant matrix after rotating 90 degrees clockwise:\n");
    print_matrix(N, mat);

    return 0;
}
2).to find how many number of cards are required to construct 2 staged pyramid using cards.

/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
#include <stdio.h>

int CalculateCards(int n) {
    int ans = 0;
    int level = 1;

    while (level <= n) {
        ans += (level * 3);
        level++;
    }

    ans -= n;

    return ans;
}

int main() {
    int result = CalculateCards(2);
    printf("%d\n", result);

    return 0;
}
3).to calculate standard deviation.
  #include<stdio.h>
  void StandardDeviation(int n, int arr){
//to calculate average
  double sum = 0;
for(int i=0;i<n;i++){
sum+=arr[i];
}
double avg=sum/n;
double sum_of_squares = 0;
//to calculate sum of squares
for(int i=0;i<n;i++){
sum_of_squares+=(arr[i]-avg)*(arr[i]-avg);
}
//to calculate SD
double standard deviation=0;
standard deviation=sqrt(sum_of_squares/n);
}
int main(){
  int main() {
    int arr[] = {10, 20, 30, 40, 50};
    int n = sizeof(arr) / sizeof(arr[0]);

    double result = StandardDeviation(arr, n);
    printf("Standard deviation: %.2f\n", result);

    return 0;
}
4).to find the odd numbered ballon on the given table and print the same.
#include <stdio.h>
int main(){
    char FindOddColor(char arr[], int n) {
    char oddColor;
    int count;

    for (int i = 0; i < n; i++) {
        count = 0;
        for (int j = 0; j < n; j++) {
            if (arr[i] == arr[j]) {
                count++;
            }
        }
        if (count % 2 != 0) {
            oddColor = arr[i];
            break; // Exit loop once odd color is found
        }
    }
    return oddColor;
}

int main() {
    char arr[] = {'r','g', 'g', 'b', 'b', 'y', 'y'};
    int n = sizeof(arr) / sizeof(arr[0]);

    char oddColor = FindOddColor(arr, n);

    printf("%c is the odd color balloon.\n", oddColor);

    return 0;
}


