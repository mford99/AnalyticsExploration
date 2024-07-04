package src.Analytics;

import java.net.*;

public class MovieAnalytics implements IAnalytics 
{
    private String websiteString = "https://datasets.imdbws.com/";
    private URL website;

    public MovieAnalytics()
    {
        try
        {
            this.website = new URI(this.websiteString).toURL();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public MovieAnalytics(URL website)
    {
        this.website = website;
    }

    public MovieAnalytics(String website)
    {
        try
        {
            this.website =  new URI(this.websiteString).toURL();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Boolean connectDBorDataSet() 
    {
            Boolean result = false;
            int code = 200;
            try {
                HttpURLConnection connection = (HttpURLConnection) website.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(3000);
                connection.connect();
                code = connection.getResponseCode();
                if (code == 200) {
                    result = true;
                } 
                connection.disconnect();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                result = false;
            }
            System.out.println(website.toString() + " Website has status of: " + code);
            return result;
    }

    @Override
    public void extractData() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void runAnalytics() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public URL getWebsite() {
        return website;
    }

    public void setWebsite(URL website) {
        this.website = website;
    }
    
}
