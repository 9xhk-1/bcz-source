package qy;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r {
    public static final void a(@m80.k q qVar, @m80.k String name, @m80.k String value, boolean z11) {
        g0.p(qVar, "<this>");
        g0.p(name, "name");
        g0.p(value, "value");
        if (qVar.d(name)) {
            return;
        }
        qVar.b(name, value, z11);
    }

    public static /* synthetic */ void b(q qVar, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        a(qVar, str, str2, z11);
    }
}
