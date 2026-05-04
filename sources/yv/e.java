package yv;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f100331a;

    public e(@DrawableRes int i11) {
        this.f100331a = i11;
    }

    public static /* synthetic */ e c(e eVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = eVar.f100331a;
        }
        return eVar.b(i11);
    }

    public final int a() {
        return this.f100331a;
    }

    @m80.k
    public final e b(@DrawableRes int i11) {
        return new e(i11);
    }

    @m80.l
    public final Drawable d(@m80.k Context context) {
        g0.p(context, "context");
        return ContextCompat.getDrawable(context, this.f100331a);
    }

    public final int e() {
        return this.f100331a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f100331a == ((e) obj).f100331a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f100331a);
    }

    @m80.k
    public String toString() {
        return "ImageResource(drawableResId=" + this.f100331a + pn.j.f81007d;
    }
}
