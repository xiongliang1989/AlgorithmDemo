package com.xl.cmd;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CmdTest {

	public static void main(String args[])
    {
		
//		String cmd1 = "javac /Users/lxiong/myapp/Project/Upload/Demo.java";
//		String cmd2 = "java /Users/lxiong/myapp/Project/Upload/Demo";
//		
//		String cmd1 = "javac /Users/lxiong/myapp/workspace/AlgorithmDemo/Demo.java";
//		String cmd2 = "java /Users/lxiong/myapp/workspace/AlgorithmDemo/Demo";
//		
		String cmd1 = "javac Demo.java";
		String cmd2 = "java Demo";
	
		excuteCmd(cmd1);
		System.out.println(excuteCmd(cmd2));
		
    }
	
	public static String excuteCmd(String cmd){
		String runInfo = "";
		try
        {            
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec(cmd);
            InputStream stderr = proc.getInputStream();
            InputStreamReader isr = new InputStreamReader(stderr);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ( (line = br.readLine()) != null){
            	runInfo = runInfo + line + "   ";
            }
            	
                
        } catch (Throwable t)
          {
            t.printStackTrace();
          }
		
		return runInfo;
	}
	
	
}
