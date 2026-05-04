package dd;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.auth.QQAuthHelper;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f47820a = new a();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f47821b = "AppIniter";

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f47822c = "5033521c52701513e10000d7";

    /* renamed from: d, reason: collision with root package name */
    public static final int f47823d = 0;

    public final void a(Context context) {
        uf.b.d(context);
        qb.c.i(f47821b, "Bugly inited", new Object[0]);
    }

    public final void b(@m80.k Context context) {
        g0.p(context, "context");
        a(context);
        c();
        d(context);
        e();
    }

    public final void c() {
        x9.b.f97909a.d();
    }

    public final void d(Context context) {
        rl.c.e(false);
        rl.c.o(context);
        qb.c.i(f47821b, "initOpenInstall inited", new Object[0]);
    }

    public final void e() {
        QQAuthHelper.h().m();
    }

    public final void g(@m80.k Context context) {
        g0.p(context, "context");
    }

    public final void f(Context context) {
    }

    public final void h(Context context) {
    }
}
