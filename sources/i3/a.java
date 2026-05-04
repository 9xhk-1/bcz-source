package i3;

import com.baicizhan.app.api.AppType;
import com.baicizhan.app.api.LogLevel;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public AppType f60134a;

    /* renamed from: c, reason: collision with root package name */
    @l
    public b f60136c;

    /* renamed from: b, reason: collision with root package name */
    @k
    public LogLevel f60135b = LogLevel.Info;

    /* renamed from: d, reason: collision with root package name */
    @k
    public String f60137d = "";

    /* renamed from: e, reason: collision with root package name */
    @k
    public String f60138e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f60139f = true;

    @k
    public final String a() {
        return this.f60137d;
    }

    @k
    public final AppType b() {
        AppType appType = this.f60134a;
        if (appType != null) {
            return appType;
        }
        g0.S("appType");
        return null;
    }

    public final boolean c() {
        return this.f60139f;
    }

    @k
    public final LogLevel d() {
        return this.f60135b;
    }

    @l
    public final b e() {
        return this.f60136c;
    }

    @k
    public final String f() {
        return this.f60138e;
    }

    public final void g(@k String str) {
        g0.p(str, "<set-?>");
        this.f60137d = str;
    }

    public final void h(@k AppType appType) {
        g0.p(appType, "<set-?>");
        this.f60134a = appType;
    }

    public final void i(boolean z11) {
        this.f60139f = z11;
    }

    public final void j(@k LogLevel logLevel) {
        g0.p(logLevel, "<set-?>");
        this.f60135b = logLevel;
    }

    public final void k(@l b bVar) {
        this.f60136c = bVar;
    }

    public final void l(@k String str) {
        g0.p(str, "<set-?>");
        this.f60138e = str;
    }
}
