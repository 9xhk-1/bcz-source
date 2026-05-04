package yv;

import android.content.Context;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f100333a;

    public m(@StringRes int i11) {
        this.f100333a = i11;
    }

    public static /* synthetic */ m c(m mVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = mVar.f100333a;
        }
        return mVar.b(i11);
    }

    public final int a() {
        return this.f100333a;
    }

    @m80.k
    public final m b(@StringRes int i11) {
        return new m(i11);
    }

    public final int d() {
        return this.f100333a;
    }

    @m80.k
    public final String e(@m80.k Context context) {
        g0.p(context, "context");
        String string = context.getString(this.f100333a);
        g0.o(string, "getString(...)");
        return string;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f100333a == ((m) obj).f100333a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f100333a);
    }

    @m80.k
    public String toString() {
        return "StringResource(resourceId=" + this.f100333a + pn.j.f81007d;
    }
}
