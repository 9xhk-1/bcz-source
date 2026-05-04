package z6;

import c4.j;
import c4.n;
import com.baicizhan.app.api.LogLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Log.kt\ncom/baicizhan/app/biz/log/L\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final b f101032b = new b();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final c0 f101033c = e0.c(new x00.a() { // from class: z6.a
        @Override // x00.a
        public final Object invoke() {
            c4.k b11;
            b11 = b.b();
            return b11;
        }
    });

    public static final c4.k b() {
        return n.h();
    }

    public static /* synthetic */ void d(b bVar, String str, String str2, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        bVar.c(str, str2, th2);
    }

    public static /* synthetic */ void f(b bVar, String str, String str2, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        bVar.e(str, str2, th2);
    }

    public static /* synthetic */ void j(b bVar, String str, String str2, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        bVar.i(str, str2, th2);
    }

    public final void c(@k String tag, @k String msg, @l Throwable th2) {
        g0.p(tag, "tag");
        g0.p(msg, "msg");
        if (g().l().compareTo(LogLevel.Debug) > 0) {
            return;
        }
        g().m().d(k(tag, msg, th2));
    }

    public final void e(@k String tag, @k String msg, @l Throwable th2) {
        g0.p(tag, "tag");
        g0.p(msg, "msg");
        if (g().l().compareTo(LogLevel.Error) > 0) {
            return;
        }
        g().m().e(k(tag, msg, th2));
    }

    public final c4.k g() {
        return (c4.k) f101033c.getValue();
    }

    public final void i(@k String tag, @k String msg, @l Throwable th2) {
        g0.p(tag, "tag");
        g0.p(msg, "msg");
        if (g().l().compareTo(LogLevel.Info) > 0) {
            return;
        }
        g().m().a(k(tag, msg, th2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r3 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String k(java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "]: "
            r0.append(r3)
            r0.append(r4)
            r3 = 32
            r0.append(r3)
            if (r5 == 0) goto L33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ": "
            r3.append(r4)
            java.lang.String r4 = yz.r.i(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L35
        L33:
            java.lang.String r3 = ""
        L35:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.b.k(java.lang.String, java.lang.String, java.lang.Throwable):java.lang.String");
    }

    @Override // c4.j, pa0.a
    @k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
