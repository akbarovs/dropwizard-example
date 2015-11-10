package io.github.akbarovs.sandbox;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class UserRepoConfiguration extends Configuration {
    @NotEmpty
    private String httpServiceUrl;

    public String getHttpServiceUrl() {
        return httpServiceUrl;
    }

    public void setHttpServiceUrl(String httpServiceUrl) {
        this.httpServiceUrl = httpServiceUrl;
    }
}
