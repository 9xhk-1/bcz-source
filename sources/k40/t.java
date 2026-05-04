package k40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k40.m;
import kotlin.jvm.internal.u0;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@v0
@u0({"SMAP\nSelectUnbiased.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1863#2,2:66\n*S KotlinDebug\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n*L\n60#1:66,2\n*E\n"})
/* loaded from: classes8.dex */
public class t<R> extends m<R> {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final List<m<R>.a> f65864g;

    public t(@m80.k kotlin.coroutines.d dVar) {
        super(dVar);
        this.f65864g = new ArrayList();
    }

    @v0
    public static /* synthetic */ <R> Object P(t<R> tVar, j00.c<? super R> cVar) {
        tVar.Q();
        return super.w(cVar);
    }

    public final void Q() {
        try {
            Collections.shuffle(this.f65864g);
            Iterator<T> it = this.f65864g.iterator();
            while (it.hasNext()) {
                m.I(this, (m.a) it.next(), false, 1, null);
            }
        } finally {
            this.f65864g.clear();
        }
    }

    @Override // k40.m, k40.d
    public <P, Q> void c(@m80.k j<? super P, ? extends Q> jVar, P p11, @m80.k x00.p<? super Q, ? super j00.c<? super R>, ? extends Object> pVar) {
        this.f65864g.add(new m.a(jVar.d(), jVar.c(), jVar.b(), p11, pVar, jVar.a()));
    }

    @Override // k40.m, k40.d
    public <Q> void f(@m80.k h<? extends Q> hVar, @m80.k x00.p<? super Q, ? super j00.c<? super R>, ? extends Object> pVar) {
        this.f65864g.add(new m.a(hVar.d(), hVar.c(), hVar.b(), null, pVar, hVar.a()));
    }

    @Override // k40.m, k40.d
    public void j(@m80.k f fVar, @m80.k x00.l<? super j00.c<? super R>, ? extends Object> lVar) {
        this.f65864g.add(new m.a(fVar.d(), fVar.c(), fVar.b(), p.l(), lVar, fVar.a()));
    }

    @Override // k40.m
    @m80.l
    @v0
    public Object w(@m80.k j00.c<? super R> cVar) {
        return P(this, cVar);
    }
}
