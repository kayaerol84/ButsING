import com.xebialabs.restito.server.StubServer;

import static com.xebialabs.restito.builder.stub.StubHttp.whenHttp;
import static com.xebialabs.restito.semantics.Action.contentType;
import static com.xebialabs.restito.semantics.Action.stringContent;
import static com.xebialabs.restito.semantics.Condition.get;

/**
 * Created by MU53YL on 2-5-2017.
 */
public class ButsServer {

    public static void main(String[] args) throws Exception {

        final StubServer server = new StubServer(8080).run();

        whenHttp(server).match(get("/ping")).then(contentType("application/json"), stringContent("Pong!"));

        while (true) { Thread.sleep(10000); }

    }

}
