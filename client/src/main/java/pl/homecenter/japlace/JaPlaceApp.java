package pl.homecenter.japlace;

import pl.homecenter.japlace.configuration.JaPlaceConfiguration;
import pl.homecenter.japlace.handlers.InvoiceServiceHandler;
import ratpack.func.Action;
import ratpack.handling.Chain;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;
import ratpack.server.ServerConfigBuilder;

import static ratpack.spring.Spring.spring;

/**
 * @author s.wieczorek
 */
public class JaPlaceApp {
    public static void main(String... args) throws Exception {
        RatpackServer.start(server -> server
                .registry(spring(JaPlaceConfiguration.class))
                .serverConfig(getServerConfigBuilderAction())
                .handlers(getHandlersChain())
        );
    }

    private static Action<Chain> getHandlersChain() {
        return chain -> chain
                .get("invoice/:id", new InvoiceServiceHandler());
    }

    private static Action<ServerConfigBuilder> getServerConfigBuilderAction() {
        return b -> {
            b.baseDir(BaseDir.find());
            b.props("app.properties");
            b.threads(5);
        };
    }
}