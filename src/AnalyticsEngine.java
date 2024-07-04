package src;

import src.Analytics.*;

public class AnalyticsEngine {

    public static void main(String[] args)
	{
		AnalyticsEngine myObj = new AnalyticsEngine();
        myObj.beginAnalytics();
	}
    
    private void beginAnalytics()
    {
        MovieAnalytics IMDBAnalytics = new MovieAnalytics();
        if(IMDBAnalytics.connectDBorDataSet())
        {
            System.err.println("Success");
        }
    }

}



