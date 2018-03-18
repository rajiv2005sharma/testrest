package com.athenanamedquery;



import com.amazonaws.services.athena.AmazonAthena;
import com.amazonaws.services.athena.model.CreateNamedQueryRequest;
import com.amazonaws.services.athena.model.CreateNamedQueryResult;

/**
* CreateNamedQueryExample
* -------------------------------------
* This code will show how to create a named query.
*/
public class CreateNamedQueryExample
{
  public static void main(String[] args) throws Exception
  {
      // Build an AmazonAthena client
      AthenaClientFactory factory = new AthenaClientFactory();
      AmazonAthena client = factory.createClient();

      // Create the NamedQuery Request.
      CreateNamedQueryRequest createNamedQueryRequest = new CreateNamedQueryRequest()
              .withDatabase(ExampleConstants.ATHENA_DEFAULT_DATABASE)
              .withQueryString(ExampleConstants.ATHENA_SAMPLE_QUERY)
              .withDescription("Sample Description")
              .withName("SampleQuery");

      // Call Athena service to create the Named Query. If it fails, an exception will be thrown.
      CreateNamedQueryResult createNamedQueryResult = client.createNamedQuery(createNamedQueryRequest);
  }
}