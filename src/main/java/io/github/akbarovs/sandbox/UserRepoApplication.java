package io.github.akbarovs.sandbox;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import io.github.akbarovs.sandbox.resources.ServerResource;

public class UserRepoApplication extends Application<UserRepoConfiguration> {

    @Override
    public void run(UserRepoConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new ServerResource());
    }

    public static void main(String... args) throws Exception{
        new UserRepoApplication().run(args);
    }
}
