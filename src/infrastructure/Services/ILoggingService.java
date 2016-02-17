package infrastructure.Services;

import java.util.ArrayList;

public interface ILoggingService {

	void setClass(Class className);
	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#info(java.lang.String)
	 */
	void info(String message);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#info(java.lang.String,
	 * java.lang.Throwable)
	 */
	void info(String message, Throwable error);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#info(java.lang.String,
	 * java.util.ArrayList, java.lang.String)
	 */
	void info(String message, ArrayList<String> additionalInfo, String area, String caller);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#info(java.lang.String,
	 * java.lang.Throwable, java.util.ArrayList, java.lang.String)
	 */
	void info(String message, Throwable error, ArrayList<String> additionalInfo, String area);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#error(java.lang.String)
	 */
	void error(String message, String caller);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#error(java.lang.String,
	 * java.lang.Throwable)
	 */
	void error(String message, Throwable error);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#error(java.lang.String,
	 * java.util.ArrayList, java.lang.String)
	 */
	void error(String message, ArrayList<String> additionalInfo, String area, String caller);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#error(java.lang.String,
	 * java.lang.Throwable, java.util.ArrayList, java.lang.String)
	 */
	void error(String message, Throwable error, ArrayList<String> additionalInfo, String area);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#fatal(java.lang.String)
	 */
	void fatal(String message, String caller);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#fatal(java.lang.String,
	 * java.lang.Throwable)
	 */
	void fatal(String message, Throwable error);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#fatal(java.lang.String,
	 * java.util.ArrayList, java.lang.String)
	 */
	void fatal(String message, ArrayList<String> additionalInfo, String area, String caller);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#fatal(java.lang.String,
	 * java.lang.Throwable, java.util.ArrayList, java.lang.String)
	 */
	void fatal(String message, Throwable error, ArrayList<String> additionalInfo, String area);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#debug(java.lang.String)
	 */
	void debug(String message, String caller);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#debug(java.lang.String,
	 * java.lang.Throwable)
	 */
	void debug(String message, Throwable error);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#debug(java.lang.String,
	 * java.util.ArrayList, java.lang.String)
	 */
	void debug(String message, ArrayList<String> additionalInfo, String area, String caller);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#debug(java.lang.String,
	 * java.lang.Throwable, java.util.ArrayList, java.lang.String)
	 */
	void debug(String message, Throwable error, ArrayList<String> additionalInfo, String area);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#warn(java.lang.String)
	 */
	void warn(String message, String caller);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#warn(java.lang.String,
	 * java.lang.Throwable)
	 */
	void warn(String message, Throwable error);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#warn(java.lang.String,
	 * java.util.ArrayList, java.lang.String)
	 */
	void warn(String message, ArrayList<String> additionalInfo, String area, String caller);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Infrastructure.Services.ILoggingService#warn(java.lang.String,
	 * java.lang.Throwable, java.util.ArrayList, java.lang.String)
	 */
	void warn(String message, Throwable error, ArrayList<String> additionalInfo, String area);

}