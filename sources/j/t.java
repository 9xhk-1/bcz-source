package j;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface t extends u {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static /* synthetic */ void a(t tVar, boolean z11, x00.l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transaction");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            tVar.m(z11, lVar);
        }

        public static /* synthetic */ Object b(t tVar, boolean z11, x00.l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transactionWithResult");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return tVar.n(z11, lVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b implements w {

        /* renamed from: f, reason: collision with root package name */
        public boolean f63095f;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public u f63097h;

        /* renamed from: a, reason: collision with root package name */
        public final long f63090a = n.a.a();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<x00.a<g2>> f63091b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<x00.a<g2>> f63092c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final Set<Integer> f63093d = new LinkedHashSet();

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final Set<String> f63094e = new LinkedHashSet();

        /* renamed from: g, reason: collision with root package name */
        public boolean f63096g = true;

        @Override // j.w
        public void d(@m80.k x00.a<g2> function) {
            g0.p(function, "function");
            g();
            this.f63092c.add(function);
        }

        @Override // j.w
        public void e(@m80.k x00.a<g2> function) {
            g0.p(function, "function");
            g();
            this.f63091b.add(function);
        }

        public final void g() {
            if (this.f63090a != n.a.a()) {
                throw new IllegalStateException("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.");
            }
        }

        @m80.l
        public final b h() {
            return l();
        }

        @m80.k
        public abstract l.c<g2> i(boolean z11);

        @m80.k
        public final l.c<g2> j() {
            g();
            return i(this.f63095f && this.f63096g);
        }

        public final boolean k() {
            return this.f63096g;
        }

        @m80.l
        public abstract b l();

        @m80.k
        public final Set<String> m() {
            return this.f63094e;
        }

        @m80.k
        public final List<x00.a<g2>> n() {
            return this.f63091b;
        }

        @m80.k
        public final List<x00.a<g2>> o() {
            return this.f63092c;
        }

        @m80.k
        public final Set<Integer> p() {
            return this.f63093d;
        }

        public final boolean q() {
            return this.f63095f;
        }

        @m80.l
        public final u r() {
            return this.f63097h;
        }

        public final void s(boolean z11) {
            this.f63096g = z11;
        }

        public final void t(boolean z11) {
            this.f63095f = z11;
        }

        public final void u(@m80.l u uVar) {
            this.f63097h = uVar;
        }
    }

    void m(boolean z11, @m80.k x00.l<? super y, g2> lVar);

    <R> R n(boolean z11, @m80.k x00.l<? super x<R>, ? extends R> lVar);
}
