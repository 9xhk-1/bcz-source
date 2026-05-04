package org.conscrypt;

import java.security.cert.X509Certificate;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface ConscryptCertStore {
    Set<X509Certificate> findAllIssuers(X509Certificate x509Certificate);

    X509Certificate getTrustAnchor(X509Certificate x509Certificate);
}
