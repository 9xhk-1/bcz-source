package rw;

import java.util.ArrayList;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<x00.p<ex.c, j00.c<? super g2>, Object>> f84770a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<s> f84771b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f84772c = true;

    public final boolean a() {
        return this.f84772c;
    }

    @m80.k
    public final List<s> b() {
        return this.f84771b;
    }

    @m80.k
    public final List<x00.p<ex.c, j00.c<? super g2>, Object>> c() {
        return this.f84770a;
    }

    public final void d(@m80.k x00.q<? super Throwable, ? super cx.w, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        this.f84771b.add(new k1(block));
    }

    public final void e(@m80.k x00.q<? super Throwable, ? super cx.w, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        this.f84771b.add(new k1(block));
    }

    public final void f(boolean z11) {
        this.f84772c = z11;
    }

    public final void g(@m80.k x00.p<? super ex.c, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        this.f84770a.add(block);
    }
}
