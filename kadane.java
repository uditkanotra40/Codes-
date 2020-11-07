static int findMaxSum(int a[], int n) {
int max = a[0];
int current_sum = a[0];
for(int i = 1; i < n; i++){
current_sum = Math.max(a[i], current_sum+a[i]);
max = Math.max(max, current_sum);
}
return max;
}
