package com.athenanamedquery;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.athena.AmazonAthena;
import com.amazonaws.services.athena.AmazonAthenaClientBuilder;

/**
* AthenaClientFactory
* -------------------------------------
* This code will show how to create and configure an AmazonAthena client.
*/
public class AthenaClientFactory
{
  /**
   * AmazonAthenaClientBuilder to build AmazonAthena with the following properties:
   * - Set the region of the client
   * - Use Instance Profile from EC2 instance as its CredentialsProvider
   * - Configure the client to increase the execution timeout.
   */
  private final AmazonAthenaClientBuilder builder = AmazonAthenaClientBuilder.standard()
          .withRegion(Regions.US_EAST_1)
          .withCredentials(InstanceProfileCredentialsProvider.getInstance())
          .withClientConfiguration(new ClientConfiguration().withClientExecutionTimeout(100000));
  

   
  


  public AmazonAthena createClient()
  {
      return builder.build();
  }
}