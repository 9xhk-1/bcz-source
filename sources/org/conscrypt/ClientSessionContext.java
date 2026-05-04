package org.conscrypt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class ClientSessionContext extends AbstractSessionContext {
    private SSLClientSessionCache persistentCache;
    private final Map<HostAndPort, List<NativeSslSession>> sessionsByHostAndPort;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HostAndPort {
        final String host;
        final int port;

        public HostAndPort(String str, int i11) {
            this.host = str;
            this.port = i11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof HostAndPort)) {
                return false;
            }
            HostAndPort hostAndPort = (HostAndPort) obj;
            return this.host.equals(hostAndPort.host) && this.port == hostAndPort.port;
        }

        public int hashCode() {
            return (this.host.hashCode() * 31) + this.port;
        }
    }

    public ClientSessionContext() {
        super(10);
        this.sessionsByHostAndPort = new HashMap();
    }

    private NativeSslSession getSession(String str, int i11) {
        NativeSslSession nativeSslSession;
        byte[] sessionData;
        NativeSslSession newInstance;
        if (str == null) {
            return null;
        }
        HostAndPort hostAndPort = new HostAndPort(str, i11);
        synchronized (this.sessionsByHostAndPort) {
            try {
                List<NativeSslSession> list = this.sessionsByHostAndPort.get(hostAndPort);
                nativeSslSession = (list == null || list.size() <= 0) ? null : list.get(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (nativeSslSession != null && nativeSslSession.isValid()) {
            return nativeSslSession;
        }
        SSLClientSessionCache sSLClientSessionCache = this.persistentCache;
        if (sSLClientSessionCache == null || (sessionData = sSLClientSessionCache.getSessionData(str, i11)) == null || (newInstance = NativeSslSession.newInstance(this, sessionData, str, i11)) == null || !newInstance.isValid()) {
            return null;
        }
        putSession(hostAndPort, newInstance);
        return newInstance;
    }

    private void putSession(HostAndPort hostAndPort, NativeSslSession nativeSslSession) {
        synchronized (this.sessionsByHostAndPort) {
            try {
                List<NativeSslSession> list = this.sessionsByHostAndPort.get(hostAndPort);
                if (list == null) {
                    list = new ArrayList<>();
                    this.sessionsByHostAndPort.put(hostAndPort, list);
                }
                if (list.size() > 0 && list.get(0).isSingleUse() != nativeSslSession.isSingleUse()) {
                    while (!list.isEmpty()) {
                        removeSession(list.get(0));
                    }
                    this.sessionsByHostAndPort.put(hostAndPort, list);
                }
                list.add(nativeSslSession);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void removeSession(HostAndPort hostAndPort, NativeSslSession nativeSslSession) {
        synchronized (this.sessionsByHostAndPort) {
            try {
                List<NativeSslSession> list = this.sessionsByHostAndPort.get(hostAndPort);
                if (list != null) {
                    list.remove(nativeSslSession);
                    if (list.isEmpty()) {
                        this.sessionsByHostAndPort.remove(hostAndPort);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized NativeSslSession getCachedSession(String str, int i11, SSLParametersImpl sSLParametersImpl) {
        if (str == null) {
            return null;
        }
        NativeSslSession session = getSession(str, i11);
        if (session == null) {
            return null;
        }
        String protocol = session.getProtocol();
        for (String str2 : sSLParametersImpl.enabledProtocols) {
            if (protocol.equals(str2)) {
                String cipherSuite = session.getCipherSuite();
                for (String str3 : sSLParametersImpl.getEnabledCipherSuites()) {
                    if (cipherSuite.equals(str3)) {
                        if (session.isSingleUse()) {
                            removeSession(session);
                        }
                        return session;
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override // org.conscrypt.AbstractSessionContext
    public NativeSslSession getSessionFromPersistentCache(byte[] bArr) {
        return null;
    }

    @Override // org.conscrypt.AbstractSessionContext
    public void onBeforeAddSession(NativeSslSession nativeSslSession) {
        byte[] bytes;
        String peerHost = nativeSslSession.getPeerHost();
        int peerPort = nativeSslSession.getPeerPort();
        if (peerHost == null) {
            return;
        }
        putSession(new HostAndPort(peerHost, peerPort), nativeSslSession);
        if (this.persistentCache == null || nativeSslSession.isSingleUse() || (bytes = nativeSslSession.toBytes()) == null) {
            return;
        }
        this.persistentCache.putSessionData(nativeSslSession.toSSLSession(), bytes);
    }

    @Override // org.conscrypt.AbstractSessionContext
    public void onBeforeRemoveSession(NativeSslSession nativeSslSession) {
        String peerHost = nativeSslSession.getPeerHost();
        if (peerHost == null) {
            return;
        }
        removeSession(new HostAndPort(peerHost, nativeSslSession.getPeerPort()), nativeSslSession);
    }

    public void setPersistentCache(SSLClientSessionCache sSLClientSessionCache) {
        this.persistentCache = sSLClientSessionCache;
    }

    public int size() {
        int i11;
        synchronized (this.sessionsByHostAndPort) {
            try {
                Iterator<List<NativeSslSession>> it = this.sessionsByHostAndPort.values().iterator();
                i11 = 0;
                while (it.hasNext()) {
                    i11 += it.next().size();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }
}
