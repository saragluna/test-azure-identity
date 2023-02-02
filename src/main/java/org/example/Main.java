package org.example;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.identity.DefaultAzureCredentialBuilder;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        final TokenCredential credential = new DefaultAzureCredentialBuilder().build();
        final TokenRequestContext tokenRequestContext = new TokenRequestContext();
        tokenRequestContext.addScopes("https://servicebus.azure.net/.default");
        final AccessToken tokenSync = credential.getTokenSync(tokenRequestContext);
        System.out.println(tokenSync.getToken());
    }

}