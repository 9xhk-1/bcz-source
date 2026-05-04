package fi;

import xb.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f51877a;

    /* renamed from: b, reason: collision with root package name */
    public float f51878b;

    public d(int initialTimeoutMs, float backoffMultiplier) {
        this.f51877a = initialTimeoutMs;
        this.f51878b = backoffMultiplier;
    }

    @Override // xb.l
    public long a(int maxRetry, int retried) {
        int i11 = this.f51877a;
        this.f51877a = (int) (i11 * this.f51878b);
        return i11;
    }
}
