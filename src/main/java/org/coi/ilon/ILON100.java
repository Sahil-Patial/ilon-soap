package org.coi.ilon;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(
        name = "iLON100",
        targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/wsdl/",
        wsdlLocation = "file:/C:/Users/sahil/Desktop/iLON/src/main/resources/wsdl/iLON.wsdl"
)
public class ILON100 extends Service {
    private static final URL ILON100_WSDL_LOCATION;
    private static final Logger logger = Logger.getLogger(ILON100.class.getName());

    public ILON100(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ILON100() {
        super(ILON100_WSDL_LOCATION, new QName("http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/wsdl/", "iLON100"));
    }

    @WebEndpoint(
            name = "iLON100httpPort"
    )
    public ILON100PortType getILON100HttpPort() {
        return (ILON100PortType)super.getPort(new QName("http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/wsdl/", "iLON100httpPort"), ILON100PortType.class);
    }

    @WebEndpoint(
            name = "iLON100httpPort"
    )
    public ILON100PortType getILON100HttpPort(WebServiceFeature... features) {
        return (ILON100PortType)super.getPort(new QName("http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/wsdl/", "iLON100httpPort"), ILON100PortType.class, features);
    }

    static {
        URL url = null;

        try {
            URL baseUrl = ILON100.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/Users/sahil/Desktop/iLON/src/main/resources/wsdl/iLON.wsdl");
        } catch (MalformedURLException var2) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/Users/sahil/Desktop/iLON/src/main/resources/wsdl/iLON.wsdl', retrying as a local file");
            logger.warning(var2.getMessage());
        }

        ILON100_WSDL_LOCATION = url;
    }
}

