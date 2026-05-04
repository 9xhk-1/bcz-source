package org.apache.thrift.server;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.thrift.TException;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TIOStreamTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TServlet extends HttpServlet {
    private final Collection<Map.Entry<String, String>> customHeaders;
    private final TProtocolFactory inProtocolFactory;
    private final TProtocolFactory outProtocolFactory;
    private final TProcessor processor;

    public TServlet(TProcessor tProcessor, TProtocolFactory tProtocolFactory, TProtocolFactory tProtocolFactory2) {
        this.processor = tProcessor;
        this.inProtocolFactory = tProtocolFactory;
        this.outProtocolFactory = tProtocolFactory2;
        this.customHeaders = new ArrayList();
    }

    public void addCustomHeader(final String str, final String str2) {
        this.customHeaders.add(new Map.Entry<String, String>() { // from class: org.apache.thrift.server.TServlet.1
            @Override // java.util.Map.Entry
            public String setValue(String str3) {
                return null;
            }

            @Override // java.util.Map.Entry
            public String getKey() {
                return str;
            }

            @Override // java.util.Map.Entry
            public String getValue() {
                return str2;
            }
        });
    }

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        doPost(httpServletRequest, httpServletResponse);
    }

    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        try {
            httpServletResponse.setContentType("application/x-thrift");
            Collection<Map.Entry<String, String>> collection = this.customHeaders;
            if (collection != null) {
                for (Map.Entry<String, String> entry : collection) {
                    httpServletResponse.addHeader(entry.getKey(), entry.getValue());
                }
            }
            ServletInputStream inputStream = httpServletRequest.getInputStream();
            ServletOutputStream outputStream = httpServletResponse.getOutputStream();
            TIOStreamTransport tIOStreamTransport = new TIOStreamTransport(inputStream, outputStream);
            this.processor.process(this.inProtocolFactory.getProtocol(tIOStreamTransport), this.outProtocolFactory.getProtocol(tIOStreamTransport));
            outputStream.flush();
        } catch (TException e11) {
            throw new ServletException(e11);
        }
    }

    public void setCustomHeaders(Collection<Map.Entry<String, String>> collection) {
        this.customHeaders.clear();
        this.customHeaders.addAll(collection);
    }

    public TServlet(TProcessor tProcessor, TProtocolFactory tProtocolFactory) {
        this(tProcessor, tProtocolFactory, tProtocolFactory);
    }
}
