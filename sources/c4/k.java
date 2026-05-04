package c4;

import com.baicizhan.app.api.AppType;
import com.baicizhan.app.api.LogLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final LogLevel f7803a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final i3.b f7804b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final AppType f7805c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f7806d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f7807e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7808f;

    public k(@m80.k LogLevel logLevel, @m80.k i3.b logger, @m80.k AppType appType, @m80.k String appChannel, @m80.k String workingPath, boolean z11) {
        g0.p(logLevel, "logLevel");
        g0.p(logger, "logger");
        g0.p(appType, "appType");
        g0.p(appChannel, "appChannel");
        g0.p(workingPath, "workingPath");
        this.f7803a = logLevel;
        this.f7804b = logger;
        this.f7805c = appType;
        this.f7806d = appChannel;
        this.f7807e = workingPath;
        this.f7808f = z11;
    }

    public static /* synthetic */ k h(k kVar, LogLevel logLevel, i3.b bVar, AppType appType, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            logLevel = kVar.f7803a;
        }
        if ((i11 & 2) != 0) {
            bVar = kVar.f7804b;
        }
        if ((i11 & 4) != 0) {
            appType = kVar.f7805c;
        }
        if ((i11 & 8) != 0) {
            str = kVar.f7806d;
        }
        if ((i11 & 16) != 0) {
            str2 = kVar.f7807e;
        }
        if ((i11 & 32) != 0) {
            z11 = kVar.f7808f;
        }
        String str3 = str2;
        boolean z12 = z11;
        return kVar.g(logLevel, bVar, appType, str, str3, z12);
    }

    @m80.k
    public final LogLevel a() {
        return this.f7803a;
    }

    @m80.k
    public final i3.b b() {
        return this.f7804b;
    }

    @m80.k
    public final AppType c() {
        return this.f7805c;
    }

    @m80.k
    public final String d() {
        return this.f7806d;
    }

    @m80.k
    public final String e() {
        return this.f7807e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f7803a == kVar.f7803a && g0.g(this.f7804b, kVar.f7804b) && this.f7805c == kVar.f7805c && g0.g(this.f7806d, kVar.f7806d) && g0.g(this.f7807e, kVar.f7807e) && this.f7808f == kVar.f7808f;
    }

    public final boolean f() {
        return this.f7808f;
    }

    @m80.k
    public final k g(@m80.k LogLevel logLevel, @m80.k i3.b logger, @m80.k AppType appType, @m80.k String appChannel, @m80.k String workingPath, boolean z11) {
        g0.p(logLevel, "logLevel");
        g0.p(logger, "logger");
        g0.p(appType, "appType");
        g0.p(appChannel, "appChannel");
        g0.p(workingPath, "workingPath");
        return new k(logLevel, logger, appType, appChannel, workingPath, z11);
    }

    public int hashCode() {
        return (((((((((this.f7803a.hashCode() * 31) + this.f7804b.hashCode()) * 31) + this.f7805c.hashCode()) * 31) + this.f7806d.hashCode()) * 31) + this.f7807e.hashCode()) * 31) + Boolean.hashCode(this.f7808f);
    }

    @m80.k
    public final String i() {
        return this.f7806d;
    }

    @m80.k
    public final AppType j() {
        return this.f7805c;
    }

    public final boolean k() {
        return this.f7808f;
    }

    @m80.k
    public final LogLevel l() {
        return this.f7803a;
    }

    @m80.k
    public final i3.b m() {
        return this.f7804b;
    }

    @m80.k
    public final String n() {
        return this.f7807e;
    }

    @m80.k
    public String toString() {
        return "SdkContext(logLevel=" + this.f7803a + ", logger=" + this.f7804b + ", appType=" + this.f7805c + ", appChannel=" + this.f7806d + ", workingPath=" + this.f7807e + ", debug=" + this.f7808f + ')';
    }

    public /* synthetic */ k(LogLevel logLevel, i3.b bVar, AppType appType, String str, String str2, boolean z11, int i11, v vVar) {
        this(logLevel, bVar, appType, str, (i11 & 16) != 0 ? "" : str2, (i11 & 32) != 0 ? false : z11);
    }
}
