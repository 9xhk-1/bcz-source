package org.mozilla.javascript.commonjs.module.provider;

import java.io.Serializable;
import java.net.URLConnection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class DefaultUrlConnectionExpiryCalculator implements UrlConnectionExpiryCalculator, Serializable {
    private static final long serialVersionUID = 1;
    private final long relativeExpiry;

    public DefaultUrlConnectionExpiryCalculator() {
        this(60000L);
    }

    @Override // org.mozilla.javascript.commonjs.module.provider.UrlConnectionExpiryCalculator
    public long calculateExpiry(URLConnection uRLConnection) {
        return System.currentTimeMillis() + this.relativeExpiry;
    }

    public DefaultUrlConnectionExpiryCalculator(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("relativeExpiry < 0");
        }
        this.relativeExpiry = j11;
    }
}
