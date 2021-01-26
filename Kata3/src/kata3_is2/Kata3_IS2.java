
package kata3_is2;

public class Kata3_IS2 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("gamil.com");
        histogram.increment("gamil.com");
        histogram.increment("hotmail.com");
        
        HistogramDisplay histo = new HistogramDisplay("HISTOGRAM...", histogram);
        
        histo.execute();
    }  
}

