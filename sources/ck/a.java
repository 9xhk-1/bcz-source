package ck;

import com.baicizhan.client.business.thrift.l;
import kotlin.jvm.internal.g0;
import m80.k;
import org.apache.thrift.TServiceClient;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {
    public static final boolean a(@k String str) {
        g0.p(str, "<this>");
        return f0.J2(str, "http://", false, 2, null) || f0.J2(str, "https://", false, 2, null);
    }

    @k
    public static final <T extends TServiceClient> T b(@k String name) {
        g0.p(name, "name");
        Object a11 = new l(name).a();
        g0.o(a11, "build(...)");
        return (T) a11;
    }
}
