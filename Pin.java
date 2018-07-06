import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Pin{
	public static void main(String[] args)
	{

    String ip;int n;
    System.out.println("Enter host address : \n");
    Scanner sc = new Scanner(System.in);
    ip = sc.next();
    String pingResult = "";
    System.out.println("Enter how many times to ping : \n");
    n = sc.nextInt();
    String pingCmd = "ping " + ip + " -c" +" " + n;

    try{
Runtime r = Runtime.getRuntime();
Process p = r.exec(pingCmd);

BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
String inputLine;
while ((inputLine = in.readLine()) != null) {
    System.out.println(inputLine);
    pingResult += inputLine;
}
in.close();

List<String> time = new ArrayList<String>();
int i = 0;
for(i=0;i<n;i++)
{
pingResult = pingResult.substring(pingResult.indexOf("time="));

time.add(pingResult.substring(5,10));
 pingResult = pingResult.substring(10); 
}


int d = time.size()/2;
int re = time.size()%2;
if(re == 1){
    
	float f = Float.parseFloat(time.get(d));
	System.out.println("Median of ping : " + f +"\n");
}

else{
	float f1 = Float.parseFloat(time.get(d-1));
	float f2 = Float.parseFloat(time.get(d));
	float f3 = (f1 + f2 )/2 ;
	System.out.println("\nMedian of ping : " + f3 +"\n");
}

}

catch(Exception e)
{
	System.out.println(e);
}

}

}