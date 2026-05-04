package com.getui.gtc.base.http.crypt;

import com.getui.gtc.base.http.Interceptor;

/* loaded from: classes6.dex */
public class GtRASCryptoInterceptor implements Interceptor {
    private final String keyId;
    private final String publicKeyStr;

    public GtRASCryptoInterceptor(String str, String str2) {
        this.keyId = str;
        this.publicKeyStr = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x01be, code lost:
    
        throw new java.lang.SecurityException("GT_ERR header is " + r9.get(0));
     */
    @Override // com.getui.gtc.base.http.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.getui.gtc.base.http.Response intercept(com.getui.gtc.base.http.Interceptor.Chain r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.base.http.crypt.GtRASCryptoInterceptor.intercept(com.getui.gtc.base.http.Interceptor$Chain):com.getui.gtc.base.http.Response");
    }
}
