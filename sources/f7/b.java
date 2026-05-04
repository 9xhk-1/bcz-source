package f7;

import android.app.Application;
import java.io.InputStream;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBczMokoResource.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczMokoResource.android.kt\ncom/baicizhan/app/biz/resource/BczMokoResource_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static Application f51143a;

    @l
    public static final Object a(@k yv.a aVar, @k j00.c<? super String> cVar) {
        return "AssetResource(path='" + aVar.d() + "', originalPath='" + aVar.b() + "')";
    }

    @k
    public static final String b(@k yv.a aVar) {
        g0.p(aVar, "<this>");
        return aVar.b();
    }

    @k
    public static final Application c() {
        Application application = f51143a;
        if (application != null) {
            return application;
        }
        g0.S("resourceContext");
        return null;
    }

    @l
    public static final Object d(@k yv.a aVar, @k j00.c<? super byte[]> cVar) {
        InputStream open = c().getAssets().open(aVar.b());
        try {
            g0.m(open);
            byte[] p11 = r00.a.p(open);
            r00.b.a(open, null);
            return p11;
        } finally {
        }
    }

    public static final void e(@k Application application) {
        g0.p(application, "<set-?>");
        f51143a = application;
    }
}
