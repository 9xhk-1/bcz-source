package com.google.accompanist.pager;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import g10.u;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@com.google.accompanist.pager.b
/* loaded from: classes6.dex */
public final class f implements ScrollableState {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final c f30378g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final Saver<f, ?> f30379h = ListSaverKt.listSaver(a.f30386a, b.f30387a);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LazyListState f30380a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MutableState f30381b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final State f30382c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final State f30383d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final MutableState f30384e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final MutableState f30385f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements p<SaverScope, f, List<? extends Object>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30386a = new a();

        public a() {
            super(2);
        }

        @Override // x00.p
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(@k SaverScope listSaver, @k f it) {
            g0.p(listSaver, "$this$listSaver");
            g0.p(it, "it");
            return a00.g0.l(Integer.valueOf(it.k()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements l<List<? extends Object>, f> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f30387a = new b();

        public b() {
            super(1);
        }

        @Override // x00.l
        @m80.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke(@k List<? extends Object> it) {
            g0.p(it, "it");
            return new f(((Integer) it.get(0)).intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(v vVar) {
            this();
        }

        @k
        public final Saver<f, ?> a() {
            return f.f30379h;
        }

        public c() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.google.accompanist.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 1, 2, 3, 3, 3, 3, 4}, l = {204, 209, com.jiongji.andriod.card.R.styleable.Theme_drawable_searchwords, 226, com.jiongji.andriod.card.R.styleable.Theme_drawable_tab_review}, m = "animateScrollToPage", n = {"this", "page", "pageOffset", "this", "this", "this", "page", "pageOffset", "currentSize", "this"}, s = {"L$0", "I$0", "F$0", "L$0", "L$0", "L$0", "I$0", "F$0", "I$1", "L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f30388a;

        /* renamed from: b, reason: collision with root package name */
        public int f30389b;

        /* renamed from: c, reason: collision with root package name */
        public int f30390c;

        /* renamed from: d, reason: collision with root package name */
        public float f30391d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f30392e;

        /* renamed from: g, reason: collision with root package name */
        public int f30394g;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f30392e = obj;
            this.f30394g |= Integer.MIN_VALUE;
            return f.this.e(0, 0.0f, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements x00.a<Float> {
        public e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @k
        public final Float invoke() {
            float index;
            if (f.this.i() == null) {
                index = 0.0f;
            } else {
                index = (r0.getIndex() + f.this.j()) - r1.r();
            }
            return Float.valueOf(index);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.accompanist.pager.f$f, reason: collision with other inner class name */
    public static final class C0363f extends Lambda implements x00.a<Integer> {
        public C0363f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @k
        public final Integer invoke() {
            return Integer.valueOf(f.this.o().getLayoutInfo().getTotalItemsCount());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.google.accompanist.pager.PagerState", f = "PagerState.kt", i = {0, 0, 1}, l = {271, 275}, m = "scrollToPage", n = {"this", "pageOffset", "this"}, s = {"L$0", "F$0", "L$0"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f30397a;

        /* renamed from: b, reason: collision with root package name */
        public float f30398b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f30399c;

        /* renamed from: e, reason: collision with root package name */
        public int f30401e;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f30399c = obj;
            this.f30401e |= Integer.MIN_VALUE;
            return f.this.v(0, 0.0f, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.google.accompanist.pager.PagerState$scrollToPage$2", f = "PagerState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements p<ScrollScope, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f30402a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f30403b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f30405d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f11, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f30405d = f11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@m80.l Object obj, @k j00.c<?> cVar) {
            h hVar = f.this.new h(this.f30405d, cVar);
            hVar.f30403b = obj;
            return hVar;
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@k ScrollScope scrollScope, @m80.l j00.c<? super g2> cVar) {
            return ((h) create(scrollScope, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f30402a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            ScrollScope scrollScope = (ScrollScope) this.f30403b;
            if (f.this.i() != null) {
                scrollScope.scrollBy(r0.getSize() * this.f30405d);
            }
            return g2.f100423a;
        }
    }

    public f() {
        this(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object f(f fVar, int i11, float f11, AnimationSpec animationSpec, float f12, boolean z11, j00.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i12 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if ((i12 & 8) != 0) {
            f12 = 0.0f;
        }
        if ((i12 & 16) != 0) {
            z11 = true;
        }
        return fVar.d(i11, f11, animationSpec, f12, z11, cVar);
    }

    public static /* synthetic */ Object g(f fVar, int i11, float f11, j00.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f11 = 0.0f;
        }
        return fVar.e(i11, f11, cVar);
    }

    public static /* synthetic */ Object w(f fVar, int i11, float f11, j00.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f11 = 0.0f;
        }
        return fVar.v(i11, f11, cVar);
    }

    public final void A(int i11) {
        this.f30381b.setValue(Integer.valueOf(i11));
    }

    public final void B() {
        LazyListItemInfo i11 = i();
        y(i11 == null ? 0 : i11.getIndex());
    }

    @m80.l
    @n(message = "Replaced with animateScrollToPage(page, pageOffset)", replaceWith = @w0(expression = "animateScrollToPage(page = page, pageOffset = pageOffset)", imports = {}))
    public final Object d(@IntRange(from = 0) int i11, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k AnimationSpec<Float> animationSpec, float f12, boolean z11, @k j00.c<? super g2> cVar) {
        Object e11 = e(i11, f11, cVar);
        return e11 == kotlin.coroutines.intrinsics.b.l() ? e11 : g2.f100423a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f11) {
        return this.f30380a.dispatchRawDelta(f11);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(3:(5:(1:(1:(2:15|16))(9:18|19|20|21|22|(3:25|(5:27|28|(1:30)|33|34)(1:35)|23)|36|37|38))|44|45|33|34)(3:46|47|48)|42|43)(4:77|78|79|(5:81|(1:83)(1:88)|84|(1:86)|32)(3:89|50|(4:52|(2:54|32)|33|34)(5:55|(2:56|(2:58|(2:60|61)(1:71))(2:72|73))|62|(4:64|(1:66)|33|34)(2:67|(1:69)(6:70|22|(1:23)|36|37|38))|32)))|49|50|(0)(0)))|94|6|7|8|(0)(0)|49|50|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0185, code lost:
    
        if (r14.animateScrollToItem(r1, r13, r4) == r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x003c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x003d, code lost:
    
        r13 = r0;
        r12 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015a A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:22:0x0142, B:23:0x0154, B:25:0x015a, B:28:0x0167, B:30:0x016f, B:37:0x018e, B:38:0x0195, B:45:0x0037, B:52:0x00c4, B:55:0x00d7, B:56:0x00e9, B:58:0x00ef, B:62:0x00fe, B:64:0x0102, B:67:0x011b), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4 A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #3 {all -> 0x003c, blocks: (B:22:0x0142, B:23:0x0154, B:25:0x015a, B:28:0x0167, B:30:0x016f, B:37:0x018e, B:38:0x0195, B:45:0x0037, B:52:0x00c4, B:55:0x00d7, B:56:0x00e9, B:58:0x00ef, B:62:0x00fe, B:64:0x0102, B:67:0x011b), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:22:0x0142, B:23:0x0154, B:25:0x015a, B:28:0x0167, B:30:0x016f, B:37:0x018e, B:38:0x0195, B:45:0x0037, B:52:0x00c4, B:55:0x00d7, B:56:0x00e9, B:58:0x00ef, B:62:0x00fe, B:64:0x0102, B:67:0x011b), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006f  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@androidx.annotation.IntRange(from = 0) int r12, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r13, @m80.k j00.c<? super yz.g2> r14) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.f.e(int, float, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer h() {
        return (Integer) this.f30384e.getValue();
    }

    @m80.l
    public final LazyListItemInfo i() {
        LazyListItemInfo lazyListItemInfo;
        List<LazyListItemInfo> visibleItemsInfo = this.f30380a.getLayoutInfo().getVisibleItemsInfo();
        ListIterator<LazyListItemInfo> listIterator = visibleItemsInfo.listIterator(visibleItemsInfo.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lazyListItemInfo = null;
                break;
            }
            lazyListItemInfo = listIterator.previous();
            if (lazyListItemInfo.getOffset() <= 0) {
                break;
            }
        }
        return lazyListItemInfo;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.f30380a.isScrollInProgress();
    }

    public final float j() {
        if (i() == null) {
            return 0.0f;
        }
        return u.H((-r0.getOffset()) / r0.getSize(), 0.0f, 1.0f);
    }

    @IntRange(from = 0)
    public final int k() {
        return r();
    }

    public final float l() {
        return ((Number) this.f30383d.getValue()).floatValue();
    }

    @m80.l
    public final x00.a<Integer> m() {
        return (x00.a) this.f30385f.getValue();
    }

    @k
    public final InteractionSource n() {
        return this.f30380a.getInteractionSource();
    }

    @k
    public final LazyListState o() {
        return this.f30380a;
    }

    @IntRange(from = 0)
    public final int p() {
        return ((Number) this.f30382c.getValue()).intValue();
    }

    public final int q() {
        Integer h11 = h();
        if (h11 != null) {
            return h11.intValue();
        }
        x00.a<Integer> m11 = m();
        Integer invoke = m11 == null ? null : m11.invoke();
        return invoke == null ? !isScrollInProgress() ? k() : Math.abs(l()) < 0.001f ? k() : l() < 0.0f ? u.u(k() - 1, 0) : u.B(k() + 1, p() - 1) : invoke.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int r() {
        return ((Number) this.f30381b.getValue()).intValue();
    }

    public final void s() {
        B();
        x(null);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @m80.l
    public Object scroll(@k MutatePriority mutatePriority, @k p<? super ScrollScope, ? super j00.c<? super g2>, ? extends Object> pVar, @k j00.c<? super g2> cVar) {
        Object scroll = o().scroll(mutatePriority, pVar, cVar);
        return scroll == kotlin.coroutines.intrinsics.b.l() ? scroll : g2.f100423a;
    }

    public final void t(int i11, String str) {
        if (p() == 0) {
            if (i11 != 0) {
                throw new IllegalArgumentException(g0.C(str, " must be 0 when pageCount is 0").toString());
            }
        } else if (i11 < 0 || i11 >= p()) {
            throw new IllegalArgumentException((str + '[' + i11 + "] must be >= 0 and < pageCount").toString());
        }
    }

    @k
    public String toString() {
        return "PagerState(pageCount=" + p() + ", currentPage=" + k() + ", currentPageOffset=" + l() + ')';
    }

    public final void u(float f11, String str) {
        if (p() == 0) {
            if (f11 != 0.0f) {
                throw new IllegalArgumentException(g0.C(str, " must be 0f when pageCount is 0").toString());
            }
        } else if (0.0f > f11 || f11 > 1.0f) {
            throw new IllegalArgumentException(g0.C(str, " must be >= 0 and <= 1").toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(@androidx.annotation.IntRange(from = 0) int r9, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r10, @m80.k j00.c<? super yz.g2> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.google.accompanist.pager.f.g
            if (r0 == 0) goto L14
            r0 = r11
            com.google.accompanist.pager.f$g r0 = (com.google.accompanist.pager.f.g) r0
            int r1 = r0.f30401e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f30401e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.google.accompanist.pager.f$g r0 = new com.google.accompanist.pager.f$g
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r4.f30399c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f30401e
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L49
            if (r1 == r2) goto L3e
            if (r1 != r7) goto L36
            java.lang.Object r9 = r4.f30397a
            com.google.accompanist.pager.f r9 = (com.google.accompanist.pager.f) r9
            kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L32
            goto L8f
        L32:
            r0 = move-exception
            r10 = r0
            goto L9e
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            float r10 = r4.f30398b
            java.lang.Object r9 = r4.f30397a
            com.google.accompanist.pager.f r9 = (com.google.accompanist.pager.f) r9
            kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L32
            r1 = r9
            goto L73
        L49:
            kotlin.e.n(r11)
            java.lang.String r11 = "page"
            r8.t(r9, r11)
            java.lang.String r11 = "pageOffset"
            r8.u(r10, r11)
            java.lang.Integer r11 = l00.a.f(r9)     // Catch: java.lang.Throwable -> L9b
            r8.x(r11)     // Catch: java.lang.Throwable -> L9b
            androidx.compose.foundation.lazy.LazyListState r1 = r8.o()     // Catch: java.lang.Throwable -> L9b
            r4.f30397a = r8     // Catch: java.lang.Throwable -> L9b
            r4.f30398b = r10     // Catch: java.lang.Throwable -> L9b
            r4.f30401e = r2     // Catch: java.lang.Throwable -> L9b
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r9
            java.lang.Object r9 = androidx.compose.foundation.lazy.LazyListState.scrollToItem$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9b
            if (r9 != r0) goto L72
            goto L8d
        L72:
            r1 = r8
        L73:
            r9 = 953267991(0x38d1b717, float:1.0E-4)
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 <= 0) goto L95
            com.google.accompanist.pager.f$h r3 = new com.google.accompanist.pager.f$h     // Catch: java.lang.Throwable -> L91
            r9 = 0
            r3.<init>(r10, r9)     // Catch: java.lang.Throwable -> L91
            r4.f30397a = r1     // Catch: java.lang.Throwable -> L91
            r4.f30401e = r7     // Catch: java.lang.Throwable -> L91
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r9 = androidx.compose.foundation.gestures.ScrollableState.DefaultImpls.scroll$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L91
            if (r9 != r0) goto L8e
        L8d:
            return r0
        L8e:
            r9 = r1
        L8f:
            r1 = r9
            goto L95
        L91:
            r0 = move-exception
            r10 = r0
            r9 = r1
            goto L9e
        L95:
            r1.s()
            yz.g2 r9 = yz.g2.f100423a
            return r9
        L9b:
            r0 = move-exception
            r10 = r0
            r9 = r8
        L9e:
            r9.s()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.f.v(int, float, j00.c):java.lang.Object");
    }

    public final void x(Integer num) {
        this.f30384e.setValue(num);
    }

    public final void y(int i11) {
        if (i11 != r()) {
            A(i11);
        }
    }

    public final void z(@m80.l x00.a<Integer> aVar) {
        this.f30385f.setValue(aVar);
    }

    public f(@IntRange(from = 0) int i11) {
        this.f30380a = new LazyListState(i11, 0, 2, null);
        this.f30381b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i11), null, 2, null);
        this.f30382c = SnapshotStateKt.derivedStateOf(new C0363f());
        this.f30383d = SnapshotStateKt.derivedStateOf(new e());
        this.f30384e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f30385f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public /* synthetic */ f(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
