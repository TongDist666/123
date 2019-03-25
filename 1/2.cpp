#include<iostream>
using namespace std;
int maximum(int b[]){
	return b[1];
}
int size(int b[]){
	int count;
	for(int i=0;i<100;i++){
		if(b[i]!=0)
		count++;
		else break;
	}
	return count;
}
void paixv(int b[]){
	int r=size(b);
	cout<<r<<endl;
	for(int q=r;q>0;q--){
		int w=(q+1)/2;
		if(w!=0 and b[q-1]>b[w-1]){
			int e=b[q-1];
			b[q-1]=b[w-1];
			b[w-1]=e;
		}
	}
}
void insert(int b[],int m){
	int n=size(b);
	b[n]=m;
}
void extract_max(int b[]){
	int z=size(b);
	for(int x=0;x<z;x++){
		b[x]=b[x+1];
	}
}
void increase_key(int b[],int z,int x){
	int f;
	f=size(b);
	if(z>f-1)
	cout<<"wrong"<<endl;
	else b[z-1]=x;
}
int main(){
	int a[100]={3,7,10,13,17,22,28,1,30};
	int b[10];
	for(int i=0;i<9;i++){
		b[i+1]=a[i];
	}
	for(int q=10;q>1;q--){
		int w=q/2;
		if(w!=0 and b[q]>b[w]){
			int e=b[q];
			b[q]=b[w];
			b[w]=e;
		}
	}
	for(int i=1;i<10;i++){
		cout<<b[i]<<" ";
	}
	cout<<endl<<"²âÊÔ maximum";//²âÊÔ maximum
	cout<<maximum(b)<<endl<<endl;
	int v[6]={1,4,7,8};
	int k=size(v);//²âÊÔÅÅÐò 
	cout<<"²âÊÔÅÅÐò"<<endl;
	paixv(v);
	cout<<v[0]<<" "<<v[1]<<" "<<v[2]<<" "<<v[3]<<endl;
	cout<<"²âÊÔinsert(v,10)"<<endl;
	//²âÊÔ	insert
	insert(v,10);
	cout<<v[0]<<" "<<v[1]<<" "<<v[2]<<" "<<v[3]<<" "<<v[4]<<endl;
	paixv(v);
	cout<<v[0]<<" "<<v[1]<<" "<<v[2]<<" "<<v[3]<<" "<<v[4]<<endl;
	paixv(v);
	cout<<v[0]<<" "<<v[1]<<" "<<v[2]<<" "<<v[3]<<" "<<v[4]<<endl;
	//²âÊÔextract_max
	cout<<"²âÊÔextract_max"<<endl;
	extract_max(v);
	cout<<v[0]<<" "<<v[1]<<" "<<v[2]<<" "<<v[3]<<" "<<endl;
	paixv(v);
	cout<<v[0]<<" "<<v[1]<<" "<<v[2]<<" "<<v[3]<<" "<<endl;
	//²âÊÔincrease_key
	cout<<"²âÊÔincrease_key(v,1,9)"<<endl;
	increase_key(v,1,9);
	cout<<v[0]<<" "<<v[1]<<" "<<v[2]<<" "<<v[3]<<" "<<endl;
	paixv(v);
	cout<<v[0]<<" "<<v[1]<<" "<<v[2]<<" "<<v[3]<<" "<<endl;
	return 0;
}
