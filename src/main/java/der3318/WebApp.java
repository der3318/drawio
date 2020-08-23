package der3318;

import io.jooby.Jooby;

public class WebApp extends Jooby {

    {
        assets("/src/main/webapp/**", "src/main/webapp/");
        assets("/images/**", "src/main/webapp/images/");
        get("/", ctx -> {
            return ctx.sendRedirect("/src/main/webapp/index.html");
        });
    }

    public static void main(final String[] args) {
        runApp(args, WebApp::new);
    }

}
