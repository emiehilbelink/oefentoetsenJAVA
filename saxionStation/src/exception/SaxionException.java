package exception;

import applicaties.Application;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;

/**
 * Created by emiehilbelink on 30-01-18.
 */
public class SaxionException extends Exception{
    private ArrayList<BIConversion.User> users = new ArrayList<>();
    private ArrayList<Application> apps = new ArrayList<>();

    public SaxionException(String message){
        super(message);
    }
}
