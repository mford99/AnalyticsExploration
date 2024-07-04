package src.Analytics;

public interface IAnalytics 
{
    public Boolean connectDBorDataSet();

    public void extractData();

    public void runAnalytics();
}
