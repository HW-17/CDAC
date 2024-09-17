package Assignment5.second;

public class Logger {
private String logMessages;
private Logger()
{
	this.logMessages=" ";
}
private static Logger instance=null;
public static Logger getInstance()
{
	if(instance==null)
	{
		instance= new Logger();
	}
	return instance;
	}
public void log(String message)
{
	logMessages = logMessages+message+"\n";
}
public String getLog()
{
	return logMessages.toString();
}
public Logger clearLog()
{
	logMessages=" ";
	return this;
}
}

