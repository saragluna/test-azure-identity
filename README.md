The `AzureDeveloperCliCredential` is added to the `DefaultAzureCredential`. When I try to run application using the DAC, it throws the following exception:

```console
Exception in thread "main" com.azure.core.exception.ClientAuthenticationException: DefaultAzureCredential authentication failed. ---> AzureDeveloperCliCredential authentication failed. Error Details: /bin/sh: azd: command not found
	at com.azure.identity.ChainedTokenCredential.getTokenSync(ChainedTokenCredential.java:113)
	at org.example.Main.main(Main.java:16)
Caused by: com.azure.core.exception.ClientAuthenticationException: /bin/sh: azd: command not found
	at com.azure.identity.implementation.IdentityClientBase.getTokenFromAzureDeveloperCLIAuthentication(IdentityClientBase.java:571)
	at com.azure.identity.implementation.IdentitySyncClient.authenticateWithAzureDeveloperCli(IdentitySyncClient.java:370)
	at com.azure.identity.AzureDeveloperCliCredential.getTokenSync(AzureDeveloperCliCredential.java:54)
	at com.azure.identity.ChainedTokenCredential.getTokenSync(ChainedTokenCredential.java:108)
```

I don't have `azd` installed on my local machine. 
