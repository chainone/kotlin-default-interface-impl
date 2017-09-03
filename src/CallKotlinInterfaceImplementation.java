import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

public class CallKotlinInterfaceImplementation {
    public static void callKotlinInterface(){
        DftImplInterface dftInter = DftImplInterfaceKt.createDftInterface();
        dftInter.callMeDefaultImplementation();
//        DftImplClass dftClass = new DftImplClass();
//        dftClass.callMeDefaultImplementation();
    }
}
