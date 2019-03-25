#include<stdlib.h>
#include<iostream>
using namespace std;
int fenge(int a[],int z,int x){
	int c;
	c=a[x];
	int v;
	v=z-1;
	int o;
	for(int p=z;p<x;p++){
		if(a[p]<c or a[p]==c){
			v++;
			o=a[v];
			a[v]=a[p];
			a[p]=o;	
		}
	}
	o=a[v+1];
	a[v+1]=a[x];
	a[x]=o;
	return v+1;
}
void paixv(int a[],int z,int x){
	int s;
	if(z<x){
		s=fenge(a,z,x);
		paixv(a,z,s-1);
		paixv(a,s+1,x);
	}
}
int zhaoi(int a[],int i){
	int z=0;
	for(;;)
		if(a[z]>=0 and a[z]<=100)
		z++;
		else break;
		if(i>z or i<1)
		return -1;
		else 
	return a[i-1];
}
int zhaok(int a[],int b[],int j,int k,int K){
	int c[j+k];
	int A=0;
	int B=0;
	for(int i=0;i<j+k;i++){
		if(a[A]>b[B]){
			c[i]=b[B];
			B++;
			continue;
		}
		else c[i]=a[A];
		A++;
	}
	return c[K-1];
} 
int dayinhebingshuzu(int a[],int b[],int j,int k){
	int c[j+k];
	int A=0;
	int B=0;
	for(int i=0;i<j+k;i++){
		if(a[A]>b[B]){
			c[i]=b[B];
			B++;
			continue;
		}
		else c[i]=a[A];
		A++;
	}
	for(int i=0;i<j+k;i++){
		cout<<c[i]<<" ";
	}
}
int main(){
	int j,k;
	cout<<"输入随机数组大小："<<endl;
	cout<<"数组a的大小:";
	cin>>j;
	cout<<"数组b的大小:";
	cin>>k;
	int* a;
	a=new int[j];
	int* b;
	b=new int[k];
	cout<<"数组a的元素：";
	for(int l=0;l<j;l++){
		a[l]=rand()%100;
		cout<<a[l]<<" "; 
	} 
	cout<<endl<<"数组b的元素：";
	for(int l=0;l<k;l++){
		b[l]=rand()%100;
		cout<<b[l]<<" "; 
	} 
	paixv(a,0,j-1);
	cout<<endl<<"从小到大排序后数组a的元素：";
	for(int l=0;l<j;l++){
		cout<<a[l]<<" ";
	}
	paixv(b,0,k-1);
	cout<<endl<<"从小到大排序后数组b的元素：";
	for(int l=0;l<k;l++){
		cout<<b[l]<<" ";
	}
	cout<<endl<<"请输入K：";
	int K;
	cin>>K;
	cout<<endl<<"数组a的第"<<K<<"个元素:"<<zhaoi(a,K);
	cout<<endl<<"数组b的第"<<K<<"个元素:"<<zhaoi(b,K)<<endl;
	cout<<"合并后的数组："; 
	dayinhebingshuzu(a,b,j,k);
	cout<<endl<<"数组a,b合并后第" <<K<<"个元素:"<<zhaok(a,b,j,k,K);
	return 0;
}
