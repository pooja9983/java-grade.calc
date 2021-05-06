public class calculationgrades{
public static void main(string args[]){
scanner sc =new Scanner(System.in);
int average = sc. nextInt();
char grade;
if (average>=80){
grade='A';
}else if (average>=60 && average<80){
grade='B';
}
else if (average >=40 && average<60){
grade='C';
}
else{
grade='D';
}
switch(grade){
case 'A':
System.out.println("excellent!");
break;
case'B':
case'C':
System.out.println("well done");
break;
case 'D':
System.out.println("you passed");
case'F' :
system.out.println("better try again");
break;
default:
System.out.println("invalid grade");
}
System.out.println("your grade is"+ grade);
}
}