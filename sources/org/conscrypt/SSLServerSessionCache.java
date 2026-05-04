package org.conscrypt;

import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
interface SSLServerSessionCache {
    byte[] getSessionData(byte[] bArr);

    void putSessionData(SSLSession sSLSession, byte[] bArr);
}
