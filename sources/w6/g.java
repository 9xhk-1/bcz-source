package w6;

import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c7.e f95404a;

    public g(@m80.k c7.e device) {
        g0.p(device, "device");
        this.f95404a = device;
    }

    @Override // w6.b
    @m80.k
    public String a() {
        String b11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Pay-Support-H5=");
        b11 = c.b(this.f95404a);
        sb2.append(b11);
        return sb2.toString();
    }
}
