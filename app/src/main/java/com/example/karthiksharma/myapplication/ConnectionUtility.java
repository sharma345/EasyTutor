package com.example.karthiksharma.myapplication;

        import java.io.IOException;
        import java.io.InputStream;
        import java.net.HttpURLConnection;
        import java.net.MalformedURLException;
        import java.net.URL;
//Class Name ConnectionUtility
public class ConnectionUtility{

    //url includesipaddress and the web project name which includes the servlets
    static String url = "http://108.59.8.208:8080/Connect";

    static String send(String url) {

        String responce = null;

        try {
            //urlString is converted into URL object .
            URL urlString = new URL(url);

            //HttpUrlConnection is used for opening the connection
            HttpURLConnection connection = (HttpURLConnection) urlString.openConnection(); //using this statement we connect to the web server and it returns the HttpURLConnection object

            // The getInputStream() method of HttpURLConnection object is used to get the response.
            //This method returns InputStream

            InputStream stream = connection.getInputStream();


            int i = 0;

            StringBuffer buffer = new StringBuffer("");

            //String buffer object is used to capture the inputStram data into buffer
            while ((i = stream.read()) != -1) {

                buffer.append((char) i);
            }
            responce = buffer.toString();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return responce; //Finally returns the response
    }
}

