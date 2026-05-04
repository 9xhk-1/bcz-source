package hy;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public String f59965a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public String f59966b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public String f59967c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f59968d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final List<x00.l<String, Boolean>> f59969e;

    public k0() {
        this(null, null, null, false, null, 31, null);
    }

    @m80.k
    public final String a() {
        return this.f59966b;
    }

    @m80.k
    public final String b() {
        return this.f59965a;
    }

    @m80.k
    public final String c() {
        return this.f59967c;
    }

    @m80.k
    public final List<x00.l<String, Boolean>> d() {
        return this.f59969e;
    }

    public final boolean e() {
        return this.f59968d;
    }

    public final void f(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f59966b = str;
    }

    public final void g(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f59965a = str;
    }

    public final void h(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f59967c = str;
    }

    public final void i(boolean z11) {
        this.f59968d = z11;
    }

    public k0(@m80.k String defaultPage, @m80.k String applicationRoute, @m80.k String filesPath, boolean z11, @m80.k List<x00.l<String, Boolean>> ignoredFiles) {
        kotlin.jvm.internal.g0.p(defaultPage, "defaultPage");
        kotlin.jvm.internal.g0.p(applicationRoute, "applicationRoute");
        kotlin.jvm.internal.g0.p(filesPath, "filesPath");
        kotlin.jvm.internal.g0.p(ignoredFiles, "ignoredFiles");
        this.f59965a = defaultPage;
        this.f59966b = applicationRoute;
        this.f59967c = filesPath;
        this.f59968d = z11;
        this.f59969e = ignoredFiles;
    }

    public /* synthetic */ k0(String str, String str2, String str3, boolean z11, List list, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? o4.a.f75712c : str, (i11 & 2) != 0 ? "/" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? new ArrayList() : list);
    }
}
