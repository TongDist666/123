#include<iostream>
using namespace std;   
template <class T>
int getArrayLen(T& array)
{
return (sizeof(array) / sizeof(array[0]));
}
int paixvsaomiao1(int s[],int a,int b,int c){
	for(int i=a;i<b;i++){
		if(s[i]==c){
			return i;
			break;
		}
		else if(s[4]!=c and i==4){
		return 0;
		break;
		}
	}
}//找c是否在数组s中 
int erfensaomiaodigui1(int s[5],int a,int b,int c){
	if(a==0 and b==0 and s[0]==c)
		return 0;
	if(a<b){
		int i=(int)((a+b)/2);
		if(s[i]>c){
			erfensaomiaodigui1(s,a,i,c);
			int A=paixvsaomiao1(s,a,i,c);
			return A;
			}
		else erfensaomiaodigui1(s,i+1,b,c);
		return paixvsaomiao1(s,i+1,b,c);
	}
	return false;
}
int binary_search(int a[],int z,int x,int c)  
{  
    if(z>x)  return -1;  
    int zhong=(z+x)/2;  
    if(c<a[zhong])  binary_search(a,z,zhong-1,c);  
    else if(c>a[zhong])  binary_search(a,zhong+1,x,c);  
    else return zhong;    
}    
void merge(int a[],int z,int x,int c)  
{  
    int s[10];  
    int d=0;  
    int i,j;  
    i=x;
	j=c;
    while(i>=z and j>=x+1)  
    {  
        if(a[i]>=a[j])  s[d++]=a[i--];  
		else s[d++]=a[j--];   
    }  
    while(i>=z)  
    {  
        s[d++]=a[i--];  
    }  
    while(j>=x+1)  
    {  
        s[d++]=a[j--];  
    }  
    d--;  
    for(int i=z;i<=c;i++)  
    {  
        a[i]=s[d--];  
    }  
}
void merge_sort(int a[],int z,int x)  
{  
    int c=0;  
    if(z<x)  
    {  
        c=(z+x)/2;  
        merge_sort(a,z,c);  
        merge_sort(a,c+1,x);  
        merge(a,z,c,x); 
    }  
}  
int check(int s[],int z,int x)  
{  
    int r=0;  
    merge_sort(s,0,z-1); 
    for(int i=0;i<z;i++)  
    {  
        int SearchResult=binary_search(s,0,z-1,x-s[i]);  
        if(SearchResult!=-1)  
        {   
            if(SearchResult!=i)  
            {  
                r=1;  
                break;  
            }  
        }  
    }  
    return r;  
}  
int main(){
	int g[]={9,12,5,12,8};
	cout<<"排序前的数组；";
	for(int Q=0;Q<5;Q++){
		cout<<g[Q]<<" ";
	}
	int z=sizeof(g)/sizeof(g[0]);  
    int x=5;
    int result=check(g,z,x); 
	cout<<endl<<result<<endl;  
	int W=22;
	for (int i=0;i<5;i++){
		int Z=W-g[i];
		for(int j=i+1;j<5;j++){
			if(g[j]==Z){
				cout<<"ture"<<endl;
				goto breakLoop;
			}
			else if(g[4]+g[3]!=W and i==3){
				cout<<"false"<<endl;
				goto breakLoop;
			}
				
		}	
	}
	breakLoop:for(int Q=0;Q<5;Q++){
		cout<<g[Q]<<" ";}
	return 0;
}

