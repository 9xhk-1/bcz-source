package io.ktor.util.pipeline;

import a00.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPhaseContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhaseContent.kt\nio/ktor/util/pipeline/PhaseContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
/* loaded from: classes8.dex */
public final class b<TSubject, Call> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f62045e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final List<Object> f62046f = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h f62047a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final i f62048b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public List<q<d<TSubject, Call>, TSubject, j00.c<? super g2>, Object>> f62049c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62050d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final List<Object> a() {
            return b.f62046f;
        }

        public a() {
        }
    }

    public b(@m80.k h phase, @m80.k i relation, @m80.k List<q<d<TSubject, Call>, TSubject, j00.c<? super g2>, Object>> interceptors) {
        g0.p(phase, "phase");
        g0.p(relation, "relation");
        g0.p(interceptors, "interceptors");
        this.f62047a = phase;
        this.f62048b = relation;
        this.f62049c = interceptors;
        this.f62050d = true;
    }

    public final void b(@m80.k q<? super d<TSubject, Call>, ? super TSubject, ? super j00.c<? super g2>, ? extends Object> interceptor) {
        g0.p(interceptor, "interceptor");
        if (this.f62050d) {
            f();
        }
        this.f62049c.add(interceptor);
    }

    public final void c(@m80.k b<TSubject, Call> destination) {
        g0.p(destination, "destination");
        if (k()) {
            return;
        }
        if (destination.k()) {
            destination.f62049c = m();
            destination.f62050d = true;
        } else {
            if (destination.f62050d) {
                destination.f();
            }
            d(destination.f62049c);
        }
    }

    public final void d(@m80.k List<q<d<TSubject, Call>, TSubject, j00.c<? super g2>, Object>> destination) {
        g0.p(destination, "destination");
        List<q<d<TSubject, Call>, TSubject, j00.c<? super g2>, Object>> list = this.f62049c;
        if (destination instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) destination;
            arrayList.ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            destination.add(list.get(i11));
        }
    }

    public final List<q<d<TSubject, Call>, TSubject, j00.c<? super g2>, Object>> e() {
        return r0.d6(this.f62049c);
    }

    public final void f() {
        this.f62049c = e();
        this.f62050d = false;
    }

    @m80.k
    public final h g() {
        return this.f62047a;
    }

    @m80.k
    public final i h() {
        return this.f62048b;
    }

    public final boolean i() {
        return this.f62050d;
    }

    public final int j() {
        return this.f62049c.size();
    }

    public final boolean k() {
        return this.f62049c.isEmpty();
    }

    public final void l(boolean z11) {
        this.f62050d = z11;
    }

    @m80.k
    public final List<q<d<TSubject, Call>, TSubject, j00.c<? super g2>, Object>> m() {
        this.f62050d = true;
        return this.f62049c;
    }

    @m80.k
    public String toString() {
        return "Phase `" + this.f62047a.a() + "`, " + j() + " handlers";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@m80.k io.ktor.util.pipeline.h r3, @m80.k io.ktor.util.pipeline.i r4) {
        /*
            r2 = this;
            java.lang.String r0 = "phase"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "relation"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List<java.lang.Object> r0 = io.ktor.util.pipeline.b.f62046f
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.MutableList<@[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.Unit>>"
            kotlin.jvm.internal.g0.n(r0, r1)
            java.util.List r1 = kotlin.jvm.internal.x0.g(r0)
            r2.<init>(r3, r4, r1)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L1f
            return
        L1f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "The shared empty array list has been modified"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.b.<init>(io.ktor.util.pipeline.h, io.ktor.util.pipeline.i):void");
    }
}
