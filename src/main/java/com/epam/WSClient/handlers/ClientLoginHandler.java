package com.epam.WSClient.handlers;

import com.epam.WSClient.util.SaveUserService;
import jakarta.xml.soap.SOAPConstants;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.soap.SOAPHeaderElement;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

import javax.xml.namespace.QName;
import java.util.Collections;
import java.util.Set;

public class ClientLoginHandler implements SOAPHandler<SOAPMessageContext> {
    @Override
    public Set<QName> getHeaders() {
        return Collections.emptySet();
    }

    @Override
    public boolean handleMessage(SOAPMessageContext soapMessageContext) {
        if ((boolean) soapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)) {
            try {
                SOAPHeader header = soapMessageContext.getMessage().getSOAPHeader();
                String login = SaveUserService.getLogin();
                String password = SaveUserService.getPassword();

                QName qName = new QName("http://localhost", "login");
                SOAPHeaderElement headerElement = header.addHeaderElement(qName);
                headerElement.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
                headerElement.addTextNode(login);

                qName = new QName("http://localhost", "password");
                headerElement = header.addHeaderElement(qName);
                headerElement.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
                headerElement.addTextNode(password);
                return true;

            } catch (SOAPException e) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext soapMessageContext) {
        return false;
    }

    @Override
    public void close(MessageContext messageContext) {

    }
}
