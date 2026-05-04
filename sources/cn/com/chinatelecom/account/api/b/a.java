package cn.com.chinatelecom.account.api.b;

import android.content.Context;
import android.net.Network;
import androidx.media3.extractor.Ac3Util;
import cn.com.chinatelecom.account.api.CtSetting;
import cn.com.chinatelecom.account.api.c.g;
import cn.com.chinatelecom.account.api.d.f;
import cn.com.chinatelecom.account.api.d.g;
import cn.com.chinatelecom.account.api.d.h;
import cn.com.chinatelecom.account.api.d.j;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8855a = "a";

    /* renamed from: b, reason: collision with root package name */
    private boolean f8856b = false;

    /* renamed from: c, reason: collision with root package name */
    private Context f8857c;

    /* renamed from: d, reason: collision with root package name */
    private String f8858d;

    /* renamed from: e, reason: collision with root package name */
    private String f8859e;

    /* renamed from: f, reason: collision with root package name */
    private c f8860f;

    /* renamed from: cn.com.chinatelecom.account.api.b.a$2, reason: invalid class name */
    public class AnonymousClass2 implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8869a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8870b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CtSetting f8871c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ cn.com.chinatelecom.account.api.c f8872d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f8873e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f8874f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f8875g;

        public AnonymousClass2(int i11, String str, CtSetting ctSetting, cn.com.chinatelecom.account.api.c cVar, String str2, String str3, int i12) {
            this.f8869a = i11;
            this.f8870b = str;
            this.f8871c = ctSetting;
            this.f8872d = cVar;
            this.f8873e = str2;
            this.f8874f = str3;
            this.f8875g = i12;
        }

        @Override // cn.com.chinatelecom.account.api.b.b
        public void a() {
            a.this.a(80800, cn.com.chinatelecom.account.api.a.d.a(j.f9012o), this.f8873e, 2500L, "Switching network timeout (4.x)", this.f8872d);
        }

        @Override // cn.com.chinatelecom.account.api.b.b
        public void a(long j11) {
            a.this.a(80801, cn.com.chinatelecom.account.api.a.d.a(j.f9013p), this.f8873e, j11, "Switching network failed (4.x)", this.f8872d);
        }

        @Override // cn.com.chinatelecom.account.api.b.b
        public void a(Network network, long j11) {
            long j12 = this.f8869a - j11;
            if (j12 > 100) {
                a.this.a(this.f8870b, this.f8871c, null, this.f8872d, j12, this.f8873e, this.f8874f, this.f8875g);
            } else {
                cn.com.chinatelecom.account.api.a.a(this.f8873e, j.c(), this.f8872d);
            }
            f.a(this.f8873e).b(j11);
        }
    }

    public a(Context context, String str, String str2) {
        this.f8857c = context;
        this.f8858d = str;
        this.f8859e = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(Context context, String str, String str2, String str3, CtSetting ctSetting, Network network, String str4, String str5, int i11) {
        String b11;
        String b12;
        boolean z11;
        try {
            long a11 = cn.com.chinatelecom.account.api.d.a.a(context);
            if (i11 == cn.com.chinatelecom.account.api.b.f8853d) {
                b11 = h.a();
                b12 = h.a(context, str, str2, str3, a11, "");
            } else {
                b11 = h.b();
                b12 = h.b(context, str, str2, str3, a11, "");
            }
            if (g.a() != null) {
                b11 = b11.replace(cn.com.chinatelecom.account.api.a.d.a(cn.com.chinatelecom.account.api.d.b.f8958f), g.a());
            }
            JSONObject jSONObject = new JSONObject(b12);
            String optString = jSONObject.optString("p");
            String optString2 = jSONObject.optString("k");
            g.a aVar = new g.a();
            aVar.a(str5);
            aVar.a(false, cn.com.chinatelecom.account.api.c.c.a(), cn.com.chinatelecom.account.api.a.d.a(cn.com.chinatelecom.account.api.d.b.f8958f));
            aVar.b(str4);
            aVar.a(network);
            aVar.a(CtSetting.getConnTimeout(ctSetting));
            aVar.b(CtSetting.getReadTimeout(ctSetting));
            cn.com.chinatelecom.account.api.c.g a12 = aVar.a();
            cn.com.chinatelecom.account.api.c.b bVar = new cn.com.chinatelecom.account.api.c.b(context);
            cn.com.chinatelecom.account.api.c.h a13 = bVar.a(b11, optString, 1, a12);
            if (a13.f8950d) {
                synchronized (this) {
                    z11 = this.f8856b;
                }
                if (!z11) {
                    a13 = bVar.a(b11, optString, 1, aVar.a(true).a(false, "", "").a());
                    f.a(str4).b(1);
                }
            }
            JSONObject a14 = cn.com.chinatelecom.account.api.d.a.a(context, a13, optString2, network, true, str4);
            f.b(str4, a14, optString);
            return a14;
        } catch (Throwable th2) {
            JSONObject i12 = j.i();
            f.a(str4).g("gpm ：" + th2.getMessage()).a(80102).e(cn.com.chinatelecom.account.api.a.d.a(j.f9008k));
            cn.com.chinatelecom.account.api.a.a(f8855a, "GPM Throwable", th2);
            return i12;
        }
    }

    public void b(final String str, final CtSetting ctSetting, final int i11, final cn.com.chinatelecom.account.api.c cVar) {
        final int totalTimeout = CtSetting.getTotalTimeout(ctSetting);
        final String a11 = cn.com.chinatelecom.account.api.d.d.a();
        String a12 = cn.com.chinatelecom.account.api.d.d.a(this.f8857c);
        final String a13 = cn.com.chinatelecom.account.api.d.a.a(i11);
        f.a(a11).a(a12).c(a13).b("BOTH");
        c cVar2 = new c(this.f8857c);
        this.f8860f = cVar2;
        cVar2.a(new b() { // from class: cn.com.chinatelecom.account.api.b.a.1
            @Override // cn.com.chinatelecom.account.api.b.b
            public void a() {
                a.this.a();
                a.this.a(80800, cn.com.chinatelecom.account.api.a.d.a(j.f9012o), a11, 2500L, "", cVar);
            }

            @Override // cn.com.chinatelecom.account.api.b.b
            public void a(long j11) {
                a.this.a();
                a.this.a(80801, cn.com.chinatelecom.account.api.a.d.a(j.f9013p), a11, j11, "", cVar);
            }

            @Override // cn.com.chinatelecom.account.api.b.b
            public void a(Network network, long j11) {
                long j12 = totalTimeout - j11;
                if (j12 <= 100) {
                    a.this.a();
                    cn.com.chinatelecom.account.api.a.a(a11, j.c(), cVar);
                } else {
                    a.this.a(str, ctSetting, network, cVar, j12, a11, a13, i11);
                }
                f.a(a11).b(j11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        c cVar = this.f8860f;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i11, String str, String str2, long j11, String str3, cn.com.chinatelecom.account.api.c cVar) {
        f.a(str2).a(i11).e(str).b(j11).g(str3);
        f.c(str2);
        String a11 = j.a(i11, str, str2);
        if (cVar != null) {
            cVar.a(a11);
        }
    }

    public void a(String str, CtSetting ctSetting, int i11, cn.com.chinatelecom.account.api.c cVar) {
        int totalTimeout = CtSetting.getTotalTimeout(ctSetting);
        String a11 = cn.com.chinatelecom.account.api.d.d.a();
        String a12 = cn.com.chinatelecom.account.api.d.d.a(this.f8857c);
        String a13 = cn.com.chinatelecom.account.api.d.a.a(i11);
        f.a(a11).a(a12).c(a13).b(cn.com.chinatelecom.account.api.d.g.e(this.f8857c));
        a(str, ctSetting, null, cVar, totalTimeout, a11, a13, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final CtSetting ctSetting, final Network network, final cn.com.chinatelecom.account.api.c cVar, long j11, final String str2, final String str3, final int i11) {
        new d().a(new e(j11) { // from class: cn.com.chinatelecom.account.api.b.a.3
            @Override // cn.com.chinatelecom.account.api.b.e
            public void a() {
                a aVar = a.this;
                JSONObject a11 = aVar.a(aVar.f8857c, a.this.f8858d, a.this.f8859e, str, ctSetting, network, str2, str3, i11);
                synchronized (this) {
                    try {
                        if (!c()) {
                            a(true);
                            d();
                            cn.com.chinatelecom.account.api.a.a(str2, a11, cVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (network != null) {
                    a.this.a();
                }
            }

            @Override // cn.com.chinatelecom.account.api.b.e
            public void b() {
                super.b();
                synchronized (a.this) {
                    a.this.f8856b = true;
                }
                synchronized (this) {
                    try {
                        if (!c()) {
                            a(true);
                            a.this.a(Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, cn.com.chinatelecom.account.api.a.d.a(j.f8998a), str2, 0L, "", cVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (network != null) {
                    a.this.a();
                }
            }
        });
    }
}
