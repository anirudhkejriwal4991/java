import java.io.Serializable;
import java.io.*;
class Student implements Serializable{
int id;
String name;
public Student(int id, String name) {
 this.id = id;
 this.name = name;
}
}
class Persist{
public static void main(String args[]){
 try{
 //Creating the object
 Student s1 =new Student(211,"sravani");
 //Creating stream and writing the object
 FileOutputStream fout=new FileOutputStream("f.txt");
 ObjectOutputStream out=new ObjectOutputStream(fout);
 out.writeObject(s1);
 out.flush();
 //closing the stream
 out.close();
 System.out.println("success");
ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
 Student s=(Student)in.readObject();
 //printing the data of the serialized object
 System.out.println(s.id+" "+s.name);
 //closing the stream
 in.close();
 }catch(Exception e){System.out.println(e);}
}
} 