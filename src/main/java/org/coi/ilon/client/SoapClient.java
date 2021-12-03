package org.coi.ilon.client;

import org.coi.ilon.ILON100;
import org.coi.ilon.ILON100PortType;
import org.coi.ilon.proxyclasses.EXSelect;
import org.coi.ilon.proxyclasses.ItemColl;
import org.coi.ilon.proxyclasses.List;
import org.coi.ilon.proxyclasses.ListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Service
public class SoapClient extends WebServiceGatewaySupport {

//    @Autowired
//    private Jaxb2Marshaller marshaller;

//    private WebServiceTemplate template;

//    ILON100 iLon100 = null;
//    ILON100PortType SmartServer = null;

//    public void toggle()
//    {
//        try {
//            iLon100 = new ILON100();
//            SmartServer = iLon100.getILON100HttpPort();
//            try {
//                // _________________________
//                // Soap::List
//                EXSelect xSelect = new EXSelect();
//                xSelect.setXSelect("//Item[@xsi:type=\"Dp_Cfg\"] [contains(UCPTaliasName,\"nviClaValue\")]");
//                ItemColl itemColl = SmartServer.list(xSelect);
//
//                if (0 < itemColl.getUCPTfaultCount()) {
//                    System.out.printf("List-Response contains %s faults\r\n",
//                            itemColl.getUCPTfaultCount());
//                }
//                // just print the returned count of Item-s
//                System.out.println("Items returned = " + itemColl.getItem().size());
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public ListResponse getList(EXSelect request){
        List getListReq = new List();
        getListReq.setILonItem(request);
//        template = new WebServiceTemplate(marshaller);
        ListResponse response = (ListResponse) getWebServiceTemplate().marshalSendAndReceive(getListReq);
        return response;
    }



}
