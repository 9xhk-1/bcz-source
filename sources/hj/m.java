package hj;

import a00.r0;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.main.word_book.FavoriteStatus;
import com.baicizhan.main.word_book.data.FavoriteInfo;
import com.jiongji.andriod.card.R;
import dg.d;
import eg.i;
import eg.k;
import hj.m;
import ij.e0;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kc.d;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import yz.c0;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFavoriteHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoriteHelper.kt\ncom/baicizhan/main/word_book/FavoriteHelper\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,188:1\n426#2,11:189\n37#3,2:200\n37#3,2:202\n37#3,2:204\n*S KotlinDebug\n*F\n+ 1 FavoriteHelper.kt\ncom/baicizhan/main/word_book/FavoriteHelper\n*L\n63#1:189,11\n182#1:200,2\n133#1:202,2\n152#1:204,2\n*E\n"})
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f59392f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f59393g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final String f59394h = m.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ij.e f59395a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final FragmentActivity f59396b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final LifecycleOwner f59397c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final LoadingDialogActivity f59398d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c0 f59399e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nFavoriteHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoriteHelper.kt\ncom/baicizhan/main/word_book/FavoriteHelper$FavoriteStatusCallback\n+ 2 Result.kt\ncom/baicizhan/main/data/ResultKt\n*L\n1#1,188:1\n39#2,4:189\n*S KotlinDebug\n*F\n+ 1 FavoriteHelper.kt\ncom/baicizhan/main/word_book/FavoriteHelper$FavoriteStatusCallback\n*L\n93#1:189,4\n*E\n"})
    public static class b implements hj.a<dg.d<? extends FavoriteStatus>> {

        /* renamed from: b, reason: collision with root package name */
        public static final int f59400b = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final LoadingDialogActivity f59401a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f59402a;

            static {
                int[] iArr = new int[FavoriteStatus.values().length];
                try {
                    iArr[FavoriteStatus.FAVORITE_SUCCEEDED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FavoriteStatus.UN_FAVORITE_SUCCEEDED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FavoriteStatus.SAVED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f59402a = iArr;
            }
        }

        public b(@m80.l LoadingDialogActivity loadingDialogActivity) {
            this.f59401a = loadingDialogActivity;
        }

        public void a(@m80.k Throwable e11) {
            g0.p(e11, "e");
            va.g.j(e11, 0);
        }

        public void b(boolean z11) {
            va.g.g(z11 ? R.string.word_book_collect_result_add_success : R.string.word_book_collect_result_delete_success, 0);
        }

        public void c() {
            va.g.g(R.string.word_book_collect_saved_success, 0);
        }

        @Override // hj.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void onResult(@m80.k dg.d<? extends FavoriteStatus> result) {
            g0.p(result, "result");
            qb.c.b(m.f59394h, "received " + result, new Object[0]);
            LoadingDialogActivity loadingDialogActivity = this.f59401a;
            if (loadingDialogActivity != null) {
                LoadingDialogActivity.setLoading$default(loadingDialogActivity, dg.e.a(result) == FavoriteStatus.ON_GOING, 250L, null, 4, null);
            }
            FavoriteStatus favoriteStatus = (FavoriteStatus) dg.e.a(result);
            if (favoriteStatus == null) {
                if (dg.e.b(result)) {
                    a(((d.a) result).d());
                    return;
                }
                return;
            }
            int i11 = a.f59402a[favoriteStatus.ordinal()];
            if (i11 == 1) {
                b(true);
            } else if (i11 == 2) {
                b(false);
            } else {
                if (i11 != 3) {
                    return;
                }
                c();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> implements hj.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c40.n<List<Integer>> f59403a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(c40.n<? super List<Integer>> nVar) {
            this.f59403a = nVar;
        }

        @Override // hj.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onResult(List<Integer> list) {
            g0.p(list, "list");
            c40.n<List<Integer>> nVar = this.f59403a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(list));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f59404a;

        public e(x00.l function) {
            g0.p(function, "function");
            this.f59404a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final w<?> getFunctionDelegate() {
            return this.f59404a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f59404a.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public m(@m80.l FragmentActivity fragmentActivity, @m80.k ij.e controller) {
        this(fragmentActivity, null, controller, 2, null);
        g0.p(controller, "controller");
    }

    public static final g2 A(hj.a aVar, o oVar, List list, Throwable th2) {
        dg.d dVar;
        if (th2 == null) {
            dVar = new d.c(FavoriteStatus.SAVED);
            Boolean bool = Boolean.TRUE;
            long[] b62 = r0.b6(list);
            oVar.a(bool, Arrays.copyOf(b62, b62.length));
        } else {
            dg.d aVar2 = new d.a(th2);
            oVar.a(null, new long[0]);
            dVar = aVar2;
        }
        aVar.onResult(dVar);
        return g2.f100423a;
    }

    public static final void B(Boolean bool, long[] jArr) {
        g0.p(jArr, "<unused var>");
    }

    public static final void E(hj.a aVar, Set it) {
        g0.p(it, "it");
        aVar.onResult(r0.a6(it));
    }

    public static final b G(m mVar) {
        return new b(mVar.f59398d);
    }

    public static /* synthetic */ void n(m mVar, List list, o oVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            oVar = new o() { // from class: hj.j
                @Override // hj.o
                public final void a(Boolean bool, long[] jArr) {
                    m.o(bool, jArr);
                }
            };
        }
        mVar.m(list, oVar);
    }

    public static final void o(Boolean bool, long[] jArr) {
        g0.p(jArr, "<unused var>");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s(m mVar, hj.a aVar, boolean z11, o oVar, e0[] e0VarArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = mVar.F();
        }
        mVar.p(aVar, z11, oVar, e0VarArr);
    }

    public static /* synthetic */ void t(m mVar, e0 e0Var, o oVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            oVar = new o() { // from class: hj.c
                @Override // hj.o
                public final void a(Boolean bool, long[] jArr) {
                    m.B(bool, jArr);
                }
            };
        }
        mVar.r(e0Var, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final g2 u(final m mVar, final hj.a aVar, boolean z11, final o oVar, final e0[] e0VarArr, pj.b bVar) {
        if (bVar.i()) {
            Boolean g11 = bVar.g();
            if (g11 != null) {
                aVar.onResult(new d.c(z11 ? FavoriteStatus.SAVED : g11.booleanValue() ? FavoriteStatus.FAVORITE_SUCCEEDED : FavoriteStatus.UN_FAVORITE_SUCCEEDED));
                oVar.a(g11, 0);
            } else {
                aVar.onResult(new d.c(FavoriteStatus.PROMPTED));
                if (z11) {
                    i.a aVar2 = (i.a) d.a.I(d.a.s(new i.a(mVar.f59396b).L(R.string.word_book_collect_dialog_title), null, new x00.l() { // from class: hj.h
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            g2 y11;
                            y11 = m.y(o.this, (View) obj);
                            return y11;
                        }
                    }, 1, null), R.string.word_book_collect_dialog_positive_btn, null, null, 6, null);
                    List<FavoriteInfo> h11 = bVar.h();
                    g0.m(h11);
                    kc.i iVar = (kc.i) aVar2.P((FavoriteInfo[]) h11.toArray(new FavoriteInfo[0])).O(new i.d() { // from class: hj.i
                        @Override // eg.i.d
                        public final void a(List list) {
                            m.z(a.this, mVar, e0VarArr, oVar, list);
                        }
                    }).d();
                    FragmentManager supportFragmentManager = mVar.f59396b.getSupportFragmentManager();
                    g0.o(supportFragmentManager, "getSupportFragmentManager(...)");
                    iVar.show(supportFragmentManager, "favorites");
                } else {
                    k.a aVar3 = (k.a) d.a.I(d.a.s(new k.a(mVar.f59396b).L(R.string.word_book_collect_dialog_title), null, new x00.l() { // from class: hj.f
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            g2 v11;
                            v11 = m.v(o.this, (View) obj);
                            return v11;
                        }
                    }, 1, null), R.string.word_book_collect_dialog_positive_btn, null, null, 6, null);
                    List<FavoriteInfo> h12 = bVar.h();
                    g0.m(h12);
                    kc.i iVar2 = (kc.i) aVar3.P((FavoriteInfo[]) h12.toArray(new FavoriteInfo[0])).O(new k.c() { // from class: hj.g
                        @Override // eg.k.c
                        public final void a(List list) {
                            m.w(a.this, mVar, e0VarArr, oVar, list);
                        }
                    }).d();
                    FragmentManager supportFragmentManager2 = mVar.f59396b.getSupportFragmentManager();
                    g0.o(supportFragmentManager2, "getSupportFragmentManager(...)");
                    iVar2.show(supportFragmentManager2, "favorite");
                }
            }
        } else {
            Throwable f11 = bVar.f();
            g0.m(f11);
            aVar.onResult(new d.a(f11));
            g2 g2Var = g2.f100423a;
            oVar.a(null, new long[0]);
        }
        return g2.f100423a;
    }

    public static final g2 v(o oVar, View it) {
        g0.p(it, "it");
        oVar.a(null, new long[0]);
        return g2.f100423a;
    }

    public static final void w(final hj.a aVar, m mVar, e0[] e0VarArr, final o oVar, final List ids) {
        g0.p(ids, "ids");
        aVar.onResult(new d.c(FavoriteStatus.ON_GOING));
        mVar.f59395a.F(false, ids, (e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length)).observe(mVar.f59397c, new e(new x00.l() { // from class: hj.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 x11;
                x11 = m.x(a.this, oVar, ids, (Throwable) obj);
                return x11;
            }
        }));
    }

    public static final g2 x(hj.a aVar, o oVar, List list, Throwable th2) {
        dg.d dVar;
        if (th2 == null) {
            dVar = new d.c(FavoriteStatus.SAVED);
            Boolean valueOf = Boolean.valueOf(!r4.isEmpty());
            long[] b62 = r0.b6(list);
            oVar.a(valueOf, Arrays.copyOf(b62, b62.length));
        } else {
            dg.d aVar2 = new d.a(th2);
            oVar.a(null, new long[0]);
            dVar = aVar2;
        }
        aVar.onResult(dVar);
        return g2.f100423a;
    }

    public static final g2 y(o oVar, View it) {
        g0.p(it, "it");
        oVar.a(null, new long[0]);
        return g2.f100423a;
    }

    public static final void z(final hj.a aVar, m mVar, e0[] e0VarArr, final o oVar, final List ids) {
        g0.p(ids, "ids");
        aVar.onResult(new d.c(FavoriteStatus.ON_GOING));
        mVar.f59395a.F(true, ids, (e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length)).observe(mVar.f59397c, new e(new x00.l() { // from class: hj.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 A;
                A = m.A(a.this, oVar, ids, (Throwable) obj);
                return A;
            }
        }));
    }

    @m80.l
    public final Object C(@m80.k j00.c<? super List<Integer>> cVar) {
        c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        D(new d(pVar));
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    public final void D(@m80.k final hj.a<List<Integer>> list) {
        g0.p(list, "list");
        if (this.f59395a.C().isEmpty()) {
            this.f59395a.q(new ij.h() { // from class: hj.l
                @Override // ij.h
                public final void a(Set set) {
                    m.E(a.this, set);
                }
            });
        } else {
            list.onResult(r0.a6(this.f59395a.C()));
        }
    }

    public final b F() {
        return (b) this.f59399e.getValue();
    }

    public final void m(@m80.k List<e0> words, @m80.k o done) {
        g0.p(words, "words");
        g0.p(done, "done");
        c cVar = new c(this.f59398d);
        e0[] e0VarArr = (e0[]) words.toArray(new e0[0]);
        p(cVar, true, done, (e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length));
    }

    public final void p(final hj.a<dg.d<FavoriteStatus>> aVar, final boolean z11, final o oVar, final e0... e0VarArr) {
        if (!z11 && e0VarArr.length != 1) {
            throw new IllegalArgumentException("Only for adding for update for one item!");
        }
        aVar.onResult(new d.c(FavoriteStatus.ON_GOING));
        this.f59395a.M(z11, (e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length)).observe(this.f59397c, new e(new x00.l() { // from class: hj.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 u11;
                u11 = m.u(m.this, aVar, z11, oVar, e0VarArr, (pj.b) obj);
                return u11;
            }
        }));
    }

    @w00.k
    public final void q(@m80.k e0 word) {
        g0.p(word, "word");
        t(this, word, null, 2, null);
    }

    @w00.k
    public final void r(@m80.k e0 word, @m80.k o done) {
        g0.p(word, "word");
        g0.p(done, "done");
        s(this, null, false, done, new e0[]{word}, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public m(@m80.k ij.e controller) {
        this(null, null, controller, 3, null);
        g0.p(controller, "controller");
    }

    @w00.k
    public m(@m80.l FragmentActivity fragmentActivity, @m80.l Fragment fragment, @m80.k ij.e controller) {
        FragmentActivity fragmentActivity2;
        g0.p(controller, "controller");
        this.f59395a = controller;
        LoadingDialogActivity loadingDialogActivity = null;
        if (fragmentActivity == null) {
            fragmentActivity2 = fragment != null ? fragment.requireActivity() : null;
            if (fragmentActivity2 == null) {
                throw new RuntimeException("No activity available!");
            }
        } else {
            fragmentActivity2 = fragmentActivity;
        }
        this.f59396b = fragmentActivity2;
        this.f59397c = fragmentActivity2;
        LoadingDialogActivity loadingDialogActivity2 = fragmentActivity instanceof LoadingDialogActivity ? (LoadingDialogActivity) fragmentActivity : null;
        if (loadingDialogActivity2 == null) {
            FragmentActivity activity = fragment != null ? fragment.getActivity() : null;
            if (activity instanceof LoadingDialogActivity) {
                loadingDialogActivity = (LoadingDialogActivity) activity;
            }
        } else {
            loadingDialogActivity = loadingDialogActivity2;
        }
        this.f59398d = loadingDialogActivity;
        this.f59399e = yz.e0.c(new x00.a() { // from class: hj.d
            @Override // x00.a
            public final Object invoke() {
                m.b G;
                G = m.G(m.this);
                return G;
            }
        });
    }

    public /* synthetic */ m(FragmentActivity fragmentActivity, Fragment fragment, ij.e eVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : fragmentActivity, (i11 & 2) != 0 ? null : fragment, eVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(@m80.k Fragment fragment, @m80.k ij.e controller) {
        this(null, fragment, controller);
        g0.p(fragment, "fragment");
        g0.p(controller, "controller");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends b {
        public c(LoadingDialogActivity loadingDialogActivity) {
            super(loadingDialogActivity);
        }

        @Override // hj.m.b
        public void c() {
        }
    }
}
