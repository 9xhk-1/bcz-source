package zv;

import android.content.Context;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h implements n {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f102912b;

    public h(@m80.k String string) {
        g0.p(string, "string");
        this.f102912b = string;
    }

    public static /* synthetic */ h d(h hVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hVar.f102912b;
        }
        return hVar.c(str);
    }

    @Override // zv.n
    @m80.k
    public String a(@m80.k Context context) {
        g0.p(context, "context");
        return this.f102912b;
    }

    @m80.k
    public final String b() {
        return this.f102912b;
    }

    @m80.k
    public final h c(@m80.k String string) {
        g0.p(string, "string");
        return new h(string);
    }

    @m80.k
    public final String e() {
        return this.f102912b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && g0.g(this.f102912b, ((h) obj).f102912b);
    }

    public int hashCode() {
        return this.f102912b.hashCode();
    }

    @m80.k
    public String toString() {
        return "RawStringDesc(string=" + this.f102912b + pn.j.f81007d;
    }
}
