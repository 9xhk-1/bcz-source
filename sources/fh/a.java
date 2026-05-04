package fh;

import android.content.Context;
import com.baicizhan.client.business.managers.LearnRecordManager;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a {
    public static final boolean a(int i11) {
        return g.f51865a.f() && LearnRecordManager.A().T(i11);
    }

    public static final boolean b(@k Context context, int i11) {
        g0.p(context, "context");
        return a(i11) && !c(context);
    }

    public static final boolean c(@k Context context) {
        g0.p(context, "context");
        return i9.f.c(context, i9.f.f60392q);
    }

    public static final void d(@k Context context, boolean z11) {
        g0.p(context, "context");
        i9.f.j(context, i9.f.f60392q, z11);
    }
}
