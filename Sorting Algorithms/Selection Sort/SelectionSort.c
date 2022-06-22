/* C program for Selection Sort Algorithms*/

#include<stdio.h>
// swap using poiter
void swap(int *a, int *b)
{
    int temp = *b;
    *b = *a;
    *a = temp;
}

void SelectionSort(int array[],int size)
{
    int i, j, min_index;
    for(i = 0; i< size - 1; i++)
    {
        min_index = i;
        for(j = i+1 ; j < size ; j++)
        {
            if(array[min_index] > array[j])
                min_index = j;
        }

        /* 
        
        int temp = array[min_index];
         array[min_index] = array[i];
         array[i]= temp;
        
        */

        swap(&array[i], &array[min_index]);

    }
}


void printArray(int array[],int size)
{
    for(int i = 0; i < size; i++)
    {
        printf("%d  ",array[i] );
    }
}




int main()
{
    int data[] = {64, 12, 22, 25, 11, 23, 100, 99};
    int size = sizeof(data)/sizeof(data[0]);
    SelectionSort(data,size);
    printArray(data, size);
}
