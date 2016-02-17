package infrastructure.Services;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;


public class LoggingService implements ILoggingService {
	private Logger _logger = LogManager.getLogger(LoggingService.class);

	@Override
	public void setClass(Class className)
	{
		_logger = LogManager.getLogger(className);
	}
	@Override	
	public void info(String message) {
		_logger.log(Level.INFO, message);
	}

	@Override
	public void info(String message, Throwable error) {
		_logger.log(Level.INFO, message, error);
	}

	
	@Override
	public void info(String message, ArrayList<String> additionalInfo, String area, String caller) {
		String errorMessage = BuildMessage(message.toString(), additionalInfo, area);
		_logger.log(caller, Level.INFO, errorMessage, null);
	}


	@Override
	public void info(String message, Throwable error, ArrayList<String> additionalInfo, String area) {
		String errorMessage = BuildMessage(message.toString(), additionalInfo, area);
		_logger.log(Level.INFO, errorMessage, error);
	}

	
	@Override
	public void error(String message, String caller) {
		_logger.log(caller, Level.ERROR, message,null);
	}

	
	@Override
	public void error(String message, Throwable error) {
		_logger.log(Level.ERROR, message, error);
	}

	
	@Override
	public void error(String message, ArrayList<String> additionalInfo, String area, String caller) {
		String errorMessage = BuildMessage(message.toString(), additionalInfo, area);
		_logger.log(caller, Level.ERROR, errorMessage,null);
	}


	@Override
	public void error(String message, Throwable error, ArrayList<String> additionalInfo, String area) {
		String errorMessage = BuildMessage(message.toString(), additionalInfo, area);
		_logger.log(Level.ERROR, errorMessage, error);
	}

	
	@Override
	public void fatal(String message, String caller) {
		_logger.log(caller, Level.FATAL, message,null);
	}


	@Override
	public void fatal(String message, Throwable error) {
		_logger.log(Level.FATAL, message, error);
	}

	@Override
	public void fatal(String message, ArrayList<String> additionalInfo, String area, String caller) {
		String errorMessage = BuildMessage(message.toString(), additionalInfo, area);
		_logger.log(caller, Level.FATAL, errorMessage,null);
	}


	@Override
	public void fatal(String message, Throwable error, ArrayList<String> additionalInfo, String area) {
		String errorMessage = BuildMessage(message.toString(), additionalInfo, area);
		_logger.log(Level.FATAL, errorMessage, error);
	}

	
	@Override
	public void debug(String message, String caller) {
		_logger.log(caller, Level.DEBUG, message,null);
	}


	@Override
	public void debug(String message, Throwable error) {
		_logger.log(Level.DEBUG, message, error);
	}


	@Override
	public void debug(String message, ArrayList<String> additionalInfo, String area, String caller) {
		String errorMessage = BuildMessage(message.toString(), additionalInfo, area);
		_logger.log(caller, Level.DEBUG, errorMessage,null);
	}


	@Override
	public void debug(String message, Throwable error, ArrayList<String> additionalInfo, String area) {
		String errorMessage = BuildMessage(message.toString(), additionalInfo, area);
		_logger.log(Level.DEBUG, errorMessage, error);
	}


	@Override
	public void warn(String message, String caller) {
		_logger.log(caller, Level.WARN, message,null);
	}


	@Override
	public void warn(String message, Throwable error) {
		_logger.log(Level.WARN, message, error);
	}

	
	@Override
	public void warn(String message, ArrayList<String> additionalInfo, String area, String caller) {
		String errorMessage = BuildMessage(message.toString(), additionalInfo, area);
		_logger.log(caller, Level.WARN, errorMessage,null);
	}

	@Override
	public void warn(String message, Throwable error, ArrayList<String> additionalInfo, String area) {
		String errorMessage = BuildMessage(message.toString(), additionalInfo, area);
		_logger.log(Level.WARN, errorMessage, error);
	}

	private String BuildMessage(String message, ArrayList<String> additionalInfo, String area) {
		String newMessage = message + "|";
		if (additionalInfo != null) {
			for (String msg : additionalInfo) {
				newMessage += msg + "|";
			}
		}
		if (!area.isEmpty()) {
			newMessage += area + "|";
		}
		return newMessage;
	}
}
