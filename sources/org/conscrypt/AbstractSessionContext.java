package org.conscrypt;

import androidx.collection.SieveCacheKt;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
abstract class AbstractSessionContext implements SSLSessionContext {
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 28800;
    private volatile int maximumSize;
    private volatile int timeout = DEFAULT_SESSION_TIMEOUT_SECONDS;
    final long sslCtxNativePointer = NativeCrypto.SSL_CTX_new();
    private final Map<ByteArray, NativeSslSession> sessions = new LinkedHashMap<ByteArray, NativeSslSession>() { // from class: org.conscrypt.AbstractSessionContext.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<ByteArray, NativeSslSession> entry) {
            if (AbstractSessionContext.this.maximumSize <= 0 || size() <= AbstractSessionContext.this.maximumSize) {
                return false;
            }
            AbstractSessionContext.this.onBeforeRemoveSession(entry.getValue());
            return true;
        }
    };

    public AbstractSessionContext(int i11) {
        this.maximumSize = i11;
    }

    private void trimToSize() {
        synchronized (this.sessions) {
            try {
                int size = this.sessions.size();
                if (size > this.maximumSize) {
                    int i11 = size - this.maximumSize;
                    Iterator<NativeSslSession> it = this.sessions.values().iterator();
                    while (true) {
                        int i12 = i11 - 1;
                        if (i11 <= 0) {
                            break;
                        }
                        onBeforeRemoveSession(it.next());
                        it.remove();
                        i11 = i12;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void cacheSession(NativeSslSession nativeSslSession) {
        byte[] id2 = nativeSslSession.getId();
        if (id2 == null || id2.length == 0) {
            return;
        }
        synchronized (this.sessions) {
            try {
                ByteArray byteArray = new ByteArray(id2);
                if (this.sessions.containsKey(byteArray)) {
                    removeSession(this.sessions.get(byteArray));
                }
                onBeforeAddSession(nativeSslSession);
                this.sessions.put(byteArray, nativeSslSession);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void finalize() throws Throwable {
        try {
            NativeCrypto.SSL_CTX_free(this.sslCtxNativePointer, this);
        } finally {
            super.finalize();
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final Enumeration<byte[]> getIds() {
        final Iterator it;
        synchronized (this.sessions) {
            it = Arrays.asList(this.sessions.values().toArray(new NativeSslSession[this.sessions.size()])).iterator();
        }
        return new Enumeration<byte[]>() { // from class: org.conscrypt.AbstractSessionContext.2
            private NativeSslSession next;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                if (this.next != null) {
                    return true;
                }
                while (it.hasNext()) {
                    NativeSslSession nativeSslSession = (NativeSslSession) it.next();
                    if (nativeSslSession.isValid()) {
                        this.next = nativeSslSession;
                        return true;
                    }
                }
                this.next = null;
                return false;
            }

            @Override // java.util.Enumeration
            public byte[] nextElement() {
                if (!hasMoreElements()) {
                    throw new NoSuchElementException();
                }
                byte[] id2 = this.next.getId();
                this.next = null;
                return id2;
            }
        };
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final SSLSession getSession(byte[] bArr) {
        NativeSslSession nativeSslSession;
        if (bArr == null) {
            throw new NullPointerException("sessionId");
        }
        ByteArray byteArray = new ByteArray(bArr);
        synchronized (this.sessions) {
            nativeSslSession = this.sessions.get(byteArray);
        }
        if (nativeSslSession == null || !nativeSslSession.isValid()) {
            return null;
        }
        return nativeSslSession.toSSLSession();
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionCacheSize() {
        return this.maximumSize;
    }

    public final NativeSslSession getSessionFromCache(byte[] bArr) {
        NativeSslSession nativeSslSession;
        if (bArr == null) {
            return null;
        }
        synchronized (this.sessions) {
            nativeSslSession = this.sessions.get(new ByteArray(bArr));
        }
        if (nativeSslSession == null || !nativeSslSession.isValid()) {
            return getSessionFromPersistentCache(bArr);
        }
        if (nativeSslSession.isSingleUse()) {
            removeSession(nativeSslSession);
        }
        return nativeSslSession;
    }

    public abstract NativeSslSession getSessionFromPersistentCache(byte[] bArr);

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionTimeout() {
        return this.timeout;
    }

    public abstract void onBeforeAddSession(NativeSslSession nativeSslSession);

    public abstract void onBeforeRemoveSession(NativeSslSession nativeSslSession);

    public final void removeSession(NativeSslSession nativeSslSession) {
        byte[] id2 = nativeSslSession.getId();
        if (id2 == null || id2.length == 0) {
            return;
        }
        onBeforeRemoveSession(nativeSslSession);
        ByteArray byteArray = new ByteArray(id2);
        synchronized (this.sessions) {
            this.sessions.remove(byteArray);
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionCacheSize(int i11) throws IllegalArgumentException {
        if (i11 < 0) {
            throw new IllegalArgumentException("size < 0");
        }
        int i12 = this.maximumSize;
        this.maximumSize = i11;
        if (i11 < i12) {
            trimToSize();
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionTimeout(int i11) throws IllegalArgumentException {
        if (i11 < 0) {
            throw new IllegalArgumentException("seconds < 0");
        }
        synchronized (this.sessions) {
            try {
                this.timeout = i11;
                if (i11 > 0) {
                    NativeCrypto.SSL_CTX_set_timeout(this.sslCtxNativePointer, this, i11);
                } else {
                    NativeCrypto.SSL_CTX_set_timeout(this.sslCtxNativePointer, this, SieveCacheKt.NodeLinkMask);
                }
                Iterator<NativeSslSession> it = this.sessions.values().iterator();
                while (it.hasNext()) {
                    NativeSslSession next = it.next();
                    if (!next.isValid()) {
                        onBeforeRemoveSession(next);
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
