package startup;

import java.util.EnumSet;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;

import com.google.inject.Guice;
import com.google.inject.Stage;
import com.google.inject.servlet.GuiceFilter;

public class Main {
    //This is used for running locally and debugging
    public static void main(String[] args) throws Exception {
        Guice.createInjector(
            Stage.PRODUCTION,
            new RegistrationsModule(),
            new ApiServerletModule()
        );

        int port = 8080;
        Server server = new Server(port);
        System.out.println( server.getURI());
        ServletContextHandler context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
        context.addFilter(GuiceFilter.class, "/*", EnumSet.<javax.servlet.DispatcherType>of(javax.servlet.DispatcherType.REQUEST, javax.servlet.DispatcherType.ASYNC));
        context.addServlet(DefaultServlet.class, "/*");

        server.start();

        server.join();
    }


}
