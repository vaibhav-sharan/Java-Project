package com.Practical.StringOperation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.IOException;

public class Testing {
    public void test() throws IOException {
        String jsonData = "[\n" +
                "    {\n" +
                "      \"id\": \"VS123\",\n" +
                "      \"fees\": 1000\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"VS456\",\n" +
                "      \"fees\": 1200\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"VS789\",\n" +
                "      \"fees\": 900\n" +
                "    }\n" +
                "  ]";


        try {
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(jsonData);

            int totalFees = 0;

            for (Object obj : jsonArray) {
                JSONObject student = (JSONObject) obj;
                long fees = (long) student.get("fees");
                totalFees += fees;
            }

            System.out.println("Total fees: " + totalFees);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Testing testing = new Testing();
        testing.test();
    }
}
