package org.mozilla.javascript.commonjs.module.provider;

import java.net.URLConnection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface UrlConnectionExpiryCalculator {
    long calculateExpiry(URLConnection uRLConnection);
}
