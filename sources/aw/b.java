package aw;

import android.content.Context;
import android.content.res.Configuration;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {
    public static final int a(@k a aVar, @k Context context) {
        g0.p(aVar, "<this>");
        g0.p(context, "context");
        if (aVar instanceof c) {
            return ((c) aVar).a().a(context);
        }
        if (aVar instanceof e) {
            return (int) ((e) aVar).a().h();
        }
        if (aVar instanceof g) {
            Configuration configuration = context.getResources().getConfiguration();
            g0.o(configuration, "getConfiguration(...)");
            int i11 = configuration.uiMode & 48;
            return (int) (i11 != 16 ? i11 != 32 ? ((g) aVar).b() : ((g) aVar).a() : ((g) aVar).b()).h();
        }
        throw new IllegalArgumentException("unknown class " + o0.d(aVar.getClass()));
    }
}
