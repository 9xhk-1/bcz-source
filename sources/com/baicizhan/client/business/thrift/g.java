package com.baicizhan.client.business.thrift;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16599a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f16600b;

    public g(int[] timeouts) {
        this.f16599a = timeouts;
        this.f16600b = timeouts;
    }

    @Override // com.baicizhan.client.business.thrift.i
    public int a(int retryCount, int maxRetryCount) {
        int[] iArr = this.f16599a;
        if (retryCount >= iArr.length) {
            retryCount = iArr.length - 1;
        }
        return iArr[retryCount];
    }

    @Override // com.baicizhan.client.business.thrift.i
    public int b(int retryCount, int maxRetryCount) {
        int[] iArr = this.f16600b;
        if (retryCount >= iArr.length) {
            retryCount = iArr.length - 1;
        }
        return iArr[retryCount];
    }

    public g(int[] connectTimeouts, int[] readTimeouts) {
        this.f16599a = connectTimeouts;
        this.f16600b = readTimeouts;
    }
}
