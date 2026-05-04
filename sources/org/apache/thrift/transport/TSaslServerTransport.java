package org.apache.thrift.transport;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import javax.security.auth.callback.CallbackHandler;
import javax.security.sasl.Sasl;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServer;
import org.apache.thrift.transport.TSaslTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TSaslServerTransport extends TSaslTransport {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) TSaslServerTransport.class);
    private Map<String, TSaslServerDefinition> serverDefinitionMap;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TSaslServerDefinition {
        public CallbackHandler cbh;
        public String mechanism;
        public Map<String, String> props;
        public String protocol;
        public String serverName;

        public TSaslServerDefinition(String str, String str2, String str3, Map<String, String> map, CallbackHandler callbackHandler) {
            this.mechanism = str;
            this.protocol = str2;
            this.serverName = str3;
            this.props = map;
            this.cbh = callbackHandler;
        }
    }

    public void addServerDefinition(String str, String str2, String str3, Map<String, String> map, CallbackHandler callbackHandler) {
        this.serverDefinitionMap.put(str, new TSaslServerDefinition(str, str2, str3, map, callbackHandler));
    }

    @Override // org.apache.thrift.transport.TSaslTransport, org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // org.apache.thrift.transport.TSaslTransport, org.apache.thrift.transport.TTransport
    public /* bridge */ /* synthetic */ void flush() throws TTransportException {
        super.flush();
    }

    @Override // org.apache.thrift.transport.TSaslTransport
    public TSaslTransport.SaslRole getRole() {
        return TSaslTransport.SaslRole.SERVER;
    }

    @Override // org.apache.thrift.transport.TSaslTransport
    public /* bridge */ /* synthetic */ SaslClient getSaslClient() {
        return super.getSaslClient();
    }

    @Override // org.apache.thrift.transport.TSaslTransport
    public /* bridge */ /* synthetic */ SaslServer getSaslServer() {
        return super.getSaslServer();
    }

    @Override // org.apache.thrift.transport.TSaslTransport
    public /* bridge */ /* synthetic */ TTransport getUnderlyingTransport() {
        return super.getUnderlyingTransport();
    }

    @Override // org.apache.thrift.transport.TSaslTransport
    public void handleSaslStartMessage() throws TTransportException, SaslException {
        TSaslTransport.SaslResponse receiveSaslMessage = receiveSaslMessage();
        Logger logger = LOGGER;
        logger.debug("Received start message with status {}", receiveSaslMessage.status);
        if (receiveSaslMessage.status != TSaslTransport.NegotiationStatus.START) {
            throw sendAndThrowMessage(TSaslTransport.NegotiationStatus.ERROR, "Expecting START status, received " + receiveSaslMessage.status);
        }
        String str = new String(receiveSaslMessage.payload);
        TSaslServerDefinition tSaslServerDefinition = this.serverDefinitionMap.get(str);
        logger.debug("Received mechanism name '{}'", str);
        if (tSaslServerDefinition != null) {
            setSaslServer(Sasl.createSaslServer(tSaslServerDefinition.mechanism, tSaslServerDefinition.protocol, tSaslServerDefinition.serverName, tSaslServerDefinition.props, tSaslServerDefinition.cbh));
            return;
        }
        throw sendAndThrowMessage(TSaslTransport.NegotiationStatus.BAD, "Unsupported mechanism type " + str);
    }

    @Override // org.apache.thrift.transport.TSaslTransport, org.apache.thrift.transport.TTransport
    public /* bridge */ /* synthetic */ boolean isOpen() {
        return super.isOpen();
    }

    @Override // org.apache.thrift.transport.TSaslTransport, org.apache.thrift.transport.TTransport
    public /* bridge */ /* synthetic */ void open() throws TTransportException {
        super.open();
    }

    @Override // org.apache.thrift.transport.TSaslTransport, org.apache.thrift.transport.TTransport
    public /* bridge */ /* synthetic */ int read(byte[] bArr, int i11, int i12) throws TTransportException {
        return super.read(bArr, i11, i12);
    }

    @Override // org.apache.thrift.transport.TSaslTransport, org.apache.thrift.transport.TTransport
    public /* bridge */ /* synthetic */ void write(byte[] bArr, int i11, int i12) throws TTransportException {
        super.write(bArr, i11, i12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory extends TTransportFactory {
        private static Map<TTransport, WeakReference<TSaslServerTransport>> transportMap = Collections.synchronizedMap(new WeakHashMap());
        private Map<String, TSaslServerDefinition> serverDefinitionMap = new HashMap();

        public Factory() {
        }

        public void addServerDefinition(String str, String str2, String str3, Map<String, String> map, CallbackHandler callbackHandler) {
            this.serverDefinitionMap.put(str, new TSaslServerDefinition(str, str2, str3, map, callbackHandler));
        }

        @Override // org.apache.thrift.transport.TTransportFactory
        public TTransport getTransport(TTransport tTransport) {
            WeakReference<TSaslServerTransport> weakReference = transportMap.get(tTransport);
            if (weakReference == null || weakReference.get() == null) {
                TSaslServerTransport.LOGGER.debug("transport map does not contain key", tTransport);
                weakReference = new WeakReference<>(new TSaslServerTransport(this.serverDefinitionMap, tTransport));
                try {
                    weakReference.get().open();
                    transportMap.put(tTransport, weakReference);
                } catch (TTransportException e11) {
                    TSaslServerTransport.LOGGER.debug("failed to open server transport", (Throwable) e11);
                    throw new RuntimeException(e11);
                }
            } else {
                TSaslServerTransport.LOGGER.debug("transport map does contain key {}", tTransport);
            }
            return weakReference.get();
        }

        public Factory(String str, String str2, String str3, Map<String, String> map, CallbackHandler callbackHandler) {
            addServerDefinition(str, str2, str3, map, callbackHandler);
        }
    }

    public TSaslServerTransport(TTransport tTransport) {
        super(tTransport);
        this.serverDefinitionMap = new HashMap();
    }

    public TSaslServerTransport(String str, String str2, String str3, Map<String, String> map, CallbackHandler callbackHandler, TTransport tTransport) {
        super(tTransport);
        this.serverDefinitionMap = new HashMap();
        addServerDefinition(str, str2, str3, map, callbackHandler);
    }

    private TSaslServerTransport(Map<String, TSaslServerDefinition> map, TTransport tTransport) {
        super(tTransport);
        HashMap hashMap = new HashMap();
        this.serverDefinitionMap = hashMap;
        hashMap.putAll(map);
    }
}
