package org.coi.ilon;

import org.coi.ilon.proxyclasses.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
        name = "iLON100portType",
        targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/wsdl/"
)
@XmlSeeAlso({ObjectFactory.class})
public interface ILON100PortType {
    @WebMethod(
            operationName = "List",
            action = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/action/List"
    )
    @WebResult(
            name = "iLonItem",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/"
    )
    @RequestWrapper(
            localName = "List",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.List"
    )
    @ResponseWrapper(
            localName = "ListResponse",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.ListResponse"
    )
    ItemColl list(@WebParam(name = "iLonItem",targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/") EXSelect var1);

    @WebMethod(
            operationName = "Get",
            action = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/action/Get"
    )
    @WebResult(
            name = "iLonItem",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/"
    )
    @RequestWrapper(
            localName = "Get",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.Get"
    )
    @ResponseWrapper(
            localName = "GetResponse",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.GetResponse"
    )
    ItemCfgColl get(@WebParam(name = "iLonItem",targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/") ItemColl var1);

    @WebMethod(
            operationName = "Set",
            action = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/action/Set"
    )
    @WebResult(
            name = "iLonItem",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/"
    )
    @RequestWrapper(
            localName = "Set",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.Set"
    )
    @ResponseWrapper(
            localName = "SetResponse",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.SetResponse"
    )
    ItemColl set(@WebParam(name = "iLonItem",targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/") ItemCfgColl var1);

    @WebMethod(
            operationName = "Delete",
            action = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/action/Delete"
    )
    @RequestWrapper(
            localName = "Delete",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.Delete"
    )
    @ResponseWrapper(
            localName = "DeleteResponse",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.DeleteResponse"
    )
    void delete(@WebParam(name = "iLonItem",targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",mode = Mode.INOUT) Holder<ItemColl> var1);

    @WebMethod(
            operationName = "Read",
            action = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/action/Read"
    )
    @WebResult(
            name = "iLonItem",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/"
    )
    @RequestWrapper(
            localName = "Read",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.Read"
    )
    @ResponseWrapper(
            localName = "ReadResponse",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.ReadResponse"
    )
    ItemDataColl read(@WebParam(name = "iLonItem",targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/") ItemColl var1);

    @WebMethod(
            operationName = "Write",
            action = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/action/Write"
    )
    @WebResult(
            name = "iLonItem",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/"
    )
    @RequestWrapper(
            localName = "Write",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.Write"
    )
    @ResponseWrapper(
            localName = "WriteResponse",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.WriteResponse"
    )
    ItemColl write(@WebParam(name = "iLonItem",targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/") ItemDataColl var1);

    @WebMethod(
            operationName = "Clear",
            action = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/action/Clear"
    )
    @RequestWrapper(
            localName = "Clear",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.Clear"
    )
    @ResponseWrapper(
            localName = "ClearResponse",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.ClearResponse"
    )
    void clear(@WebParam(name = "iLonItem",targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",mode = Mode.INOUT) Holder<ItemColl> var1);

    @WebMethod(
            operationName = "InvokeCmd",
            action = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/action/InvokeCmd"
    )
    @RequestWrapper(
            localName = "InvokeCmd",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.InvokeCmd"
    )
    @ResponseWrapper(
            localName = "InvokeCmdResponse",
            targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",
            className = "org.coi.ilon.proxyclasses.InvokeCmdResponse"
    )
    void invokeCmd(@WebParam(name = "iLonItem",targetNamespace = "http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/",mode = Mode.INOUT) Holder<ItemColl> var1);
}