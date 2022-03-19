package com.sgtesting.teststrails;

import org.apache.log4j.Logger;

public class LogForLoops 
{

	public static void main(String[] args)
	{
		getLogs();
	}
	private static Logger log=Logger.getLogger("Loop Output");
	private static void getLogs()
	{
		log.info("For loop Execution Started here...");
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				log.info("Even number:"+i);
			}
		}
		log.info("For Loop execution ended here...");
	}
}
