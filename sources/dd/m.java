package dd;

import android.text.TextUtils;
import android.webkit.WebView;
import b0.f;
import com.baicizhan.client.business.util.AutoSizeMgr;
import com.baicizhan.client.business.util.Profiler;
import com.baicizhan.client.business.util.ZpkPicassoRequestHandler;
import com.baicizhan.client.business.webview.sdk.NavigatorMgr;
import com.baicizhan.common.picparser.ParserType;
import com.squareup.picasso.Picasso;
import java.io.File;
import t50.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class m extends pb.a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f47935b = "MainHandler";

    public static /* synthetic */ g2 e(Picasso.b bVar) {
        bVar.a(new ZpkPicassoRequestHandler());
        return null;
    }

    public static void k() {
        if ((pb.a.a().getApplicationInfo().flags & 2) != 0) {
            try {
                if (pb.a.a().getPackageName().equals(xb.f.e(pb.a.a()))) {
                    WebView.setWebContentsDebuggingEnabled(true);
                }
            } catch (Exception e11) {
                qb.c.p(f47935b, "", e11);
            }
        }
    }

    @Override // pb.a
    public void b() {
        Profiler profiler = new Profiler();
        profiler.openFunc(f47935b, "PropertyHelper.init");
        i9.j.j();
        profiler.closeAndPrintFunc(f47935b, "PropertyHelper.init");
        h();
        String e11 = xb.f.e(pb.a.a());
        qb.c.b(f47935b, "processName " + e11, new Object[0]);
        profiler.openFunc(f47935b, "KVHelperPerformance.init");
        i9.h.f().e(pb.a.a(), e11.replace(fs.b.f52352b, ""));
        profiler.closeAndPrintFunc(f47935b, "KVHelperPerformance.init");
        if (TextUtils.equals(e11, fs.b.f52352b)) {
            qh.b.f();
            profiler.openFunc(f47935b, "LeakCanary.init");
            profiler.closeAndPrintFunc(f47935b, "LeakCanary.init");
            profiler.openFunc(f47935b, "BaicizhanThrift.init");
            com.baicizhan.client.business.thrift.c.c(pb.a.a());
            profiler.closeAndPrintFunc(f47935b, "BaicizhanThrift.init");
            profiler.openFunc(f47935b, "PicassoUtil.init");
            hc.c.h(pb.a.a(), new x00.l() { // from class: dd.l
                @Override // x00.l
                public final Object invoke(Object obj) {
                    return m.e((Picasso.b) obj);
                }
            }, ParserType.valueOf(fs.b.f52357g));
            profiler.closeAndPrintFunc(f47935b, "PicassoUtil.init");
            uf.c.b();
            uf.c.a();
            f();
            i();
            j();
            g();
        }
    }

    public final void f() {
        AutoSizeMgr.INSTANCE.autoSizeInit(pb.a.a());
    }

    public final void g() {
        b0.a.f(new f.a(pb.a.a()).N(ga.e.f53519a.b(new q.a()).f()).j());
    }

    public final void h() {
        File externalFilesDir = pb.a.a().getExternalFilesDir("bczkv");
        qb.c.i(f47935b, "kv start", new Object[0]);
        nc.b.d(pb.a.a(), externalFilesDir == null ? null : externalFilesDir.getAbsolutePath());
        qb.c.i(f47935b, "kv end", new Object[0]);
    }

    public final void i() {
        NavigatorMgr.INSTANCE.setNavigator(new dh.k().a());
    }

    public final void j() {
        ga.e.f53519a.a(pb.a.a());
        rb.e.b().c(ga.d.c());
    }
}
