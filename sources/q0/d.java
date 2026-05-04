package q0;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.g0;
import m80.l;
import q0.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Context f81360a;

    public d(@m80.k Context context) {
        this.f81360a = context;
    }

    @Override // q0.h
    @l
    public Object a(@m80.k j00.c<? super g> cVar) {
        DisplayMetrics displayMetrics = this.f81360a.getResources().getDisplayMetrics();
        c.a a11 = a.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new g(a11, a11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && g0.g(this.f81360a, ((d) obj).f81360a);
    }

    public int hashCode() {
        return this.f81360a.hashCode();
    }
}
