package tf;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f90484c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public j0 f90485a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public dc0.b<Boolean> f90486b;

    public a() {
        dc0.b<Boolean> y72 = dc0.b.y7();
        kotlin.jvm.internal.g0.o(y72, "create(...)");
        this.f90486b = y72;
    }

    @m80.k
    public final dc0.b<Boolean> a() {
        return this.f90486b;
    }

    @m80.l
    public final j0 b() {
        return this.f90485a;
    }

    public abstract void c(@m80.k b bVar);

    public abstract void d(@m80.k Context context);

    public abstract boolean e();

    public abstract void f();

    public final void g(@m80.k dc0.b<Boolean> bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<set-?>");
        this.f90486b = bVar;
    }

    public final void h(@m80.l j0 j0Var) {
        this.f90485a = j0Var;
    }
}
