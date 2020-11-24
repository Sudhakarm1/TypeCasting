package org.jsp.DataNarrow;

public class NarrowCasting 
{
	int x=(int) 123.321;//Narrow TypeCasting-should to explicitly
	int i=(int) 12.34f;//float-4
	int n='c';//char-2
	int i1=(int) 123456l;//long-8
	
	double y=123;//Widening TypeCasting no need to do explicitly if we do that is not effects
	double o=12.32f;//float
	double u='d';//char
	double b=123456l;//long
	
    float f=(float) 123.453;//double
    float f1=12;//integer
    float f2='d';//char
    float f3=1234431223l;//long
    
    long l2=12;//integer
    long l3=(long) 12.23f;//float
    long l4='s';//char
    long l5=(long) 1234.7654;//double
    
    char c1=(char) 1234l;//long
    char c2=(char) 123.432;//double
    char c3=(char) 12.32f;//float
    char c4=12;//integer
}
