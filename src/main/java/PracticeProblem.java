import java.io.*;

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.print(getNumber(10, "file.txt"));
	}

	public static String getName(int Line, String file){
BufferedReader inS = null;
String name = "";
int count = 0;
try{
	inS = new BufferedReader (new FileReader(file));
for (int c = 0; c<Line; c++){
	name = inS.readLine();
}
if (name ==null){
	name = "";
	return name;
}
for (int s = 0; s<name.length();s++){
	if (count ==2){
		name= name.substring(0, s-1);
		s = 100;
	}
	else if (name.charAt(s)==' '){
count++;
	}
}
}
catch(IOException e){
	System.out.println(e);
}
finally{
	try{		
		if (inS!=null){
			inS.close();
		}
	}
	catch(IOException e){
System.out.println(e);
	}
}
return name;
	}

public static int getAge(int Line, String file){
int age = 0;
BufferedReader inS = null;
String name = "";
int count = 0;
int countForAge = 0;
int ageStart = 0;
try{
	inS = new BufferedReader (new FileReader(file));
for (int c = 0; c<Line; c++){
	name = inS.readLine();
	
}
if (name ==""||name==null){
	age = -1;
	return age;
}
for (int s = 0; s<name.length();s++){
if (count ==3){
	for (int j = 0; j<name.length();j++){
		if (countForAge ==2){
			ageStart = j;
			j = 100;
		}
		else if (name.charAt(j)==' '){
	countForAge++;
		}
	}
		name= name.substring(ageStart, s-1);
		System.out.println(name + " and " + ageStart);
		s = 100;

	}
	else if (name.charAt(s)==' '){
count++;
	}
}
}
catch(IOException e){
	System.out.println(e);
}
finally{
	try{		
		if (inS!=null){
			inS.close();
		}
	}
	catch(IOException e){
System.out.println(e);
	}
}
age = Integer.parseInt(name);
return age;

}

public static int getNumber(int Line, String file){
	int number = 0;
BufferedReader inS = null;
String name = "";
int countForNumber = 0;
try{
	inS = new BufferedReader (new FileReader(file));
for (int c = 0; c<Line; c++){
	name = inS.readLine();
	
}
if (name =="" ||name==null){
	number = -1;
	return number;
}
for (int j = 0; j<name.length();j++){
	if (countForNumber ==3){
		name= name.substring(j);
		j = 100;
	}
	else if (name.charAt(j)==' '){
countForNumber++;
	}
}}
catch(IOException e){
	System.out.println(e);
}
finally{
	try{		
		if (inS!=null){
			inS.close();
		}
	}
	catch(IOException e){
System.out.println(e);
	}
}
number = Integer.parseInt(name);
return number;
}

public static void fileAppend(String output, String filename){
BufferedWriter writer = null;
try{
	writer = new BufferedWriter (new FileWriter(filename, true));
writer.write(output);
}
catch(IOException e){
	System.out.println(e);
}
finally{
	try{
		if (writer!=null){
			writer.close();
		}
	}
	catch(IOException e){
		System.out.println(e);
	}
}






}


}

