package utils;

public class PayloadUtils {
    public static String postPersonPayload(String firstname,String lastname,String gender,String birthdate,String address1,
                                           String address2,String city,String state,String country,String zip){

        String payload="{\n" +
                "    \"names\": [\n" +
                "        {\n" +
                "        \"givenName\": \""+firstname+"\",\n" +
                "        \"familyName\": \""+lastname+"\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"gender\": \""+gender+"\",\n" +
                "    \"birthdate\": \""+birthdate+"\",\n" +
                "    \"dead\": false,\n" +
                "    \"addresses\": [\n" +
                "        {\n" +
                "        \"address1\": \""+address1+"\",\n" +
                "        \"address2\": \""+address2+"\",\n" +
                "        \"cityVillage\": \""+city+"\",\n" +
                "        \"stateProvince\": \""+state+"\",\n" +
                "        \"country\": \""+country+"\",\n" +
                "        \"postalCode\": \""+zip+"\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        return payload;
    }
    public static String postPatientPayload(String person_ID,String id,String idType,String location){

        String payload="{\n" +
                " \n" +
                "    \"identifiers\": [\n" +
                "        {\n" +
                "          \"identifier\":\""+id+"\", \n" +
                "          \"identifierType\":\""+idType+"\", \n" +
                "          \"location\":\""+location+"\",\n" +
                "          \"preferred\":true\n" +
                "        } ],\n" +
                "    \"person\":\""+person_ID+"\"\n" +
                " \n" +
                "}";

        return payload;
    }
}
