package q0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import c40.n;
import c40.p;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import m80.l;
import q0.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nViewSizeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewSizeResolver.kt\ncoil/size/ViewSizeResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,118:1\n1#2:119\n314#3,11:120\n*S KotlinDebug\n*F\n+ 1 ViewSizeResolver.kt\ncoil/size/ViewSizeResolver\n*L\n42#1:120,11\n*E\n"})
/* loaded from: classes3.dex */
public interface j<T extends View> extends h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static <T extends View> boolean a(@m80.k j<T> jVar) {
            return j.super.e();
        }

        @l
        @Deprecated
        public static <T extends View> Object b(@m80.k j<T> jVar, @m80.k j00.c<? super g> cVar) {
            return j.super.a(cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.l<Throwable, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j<T> f81368a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserver f81369b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f81370c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j<T> jVar, ViewTreeObserver viewTreeObserver, c cVar) {
            super(1);
            this.f81368a = jVar;
            this.f81369b = viewTreeObserver;
            this.f81370c = cVar;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
            invoke2(th2);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l Throwable th2) {
            this.f81368a.d(this.f81369b, this.f81370c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f81371a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j<T> f81372b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserver f81373c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n<g> f81374d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(j<T> jVar, ViewTreeObserver viewTreeObserver, n<? super g> nVar) {
            this.f81372b = jVar;
            this.f81373c = viewTreeObserver;
            this.f81374d = nVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            g size = this.f81372b.getSize();
            if (size != null) {
                this.f81372b.d(this.f81373c, this);
                if (!this.f81371a) {
                    this.f81371a = true;
                    n<g> nVar = this.f81374d;
                    Result.a aVar = Result.Companion;
                    nVar.resumeWith(Result.m6308constructorimpl(size));
                }
            }
            return true;
        }
    }

    static /* synthetic */ <T extends View> Object b(j<T> jVar, j00.c<? super g> cVar) {
        g size = jVar.getSize();
        if (size != null) {
            return size;
        }
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        ViewTreeObserver viewTreeObserver = jVar.getView().getViewTreeObserver();
        c cVar2 = new c(jVar, viewTreeObserver, pVar);
        viewTreeObserver.addOnPreDrawListener(cVar2);
        pVar.p(new b(jVar, viewTreeObserver, cVar2));
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    @Override // q0.h
    @l
    default Object a(@m80.k j00.c<? super g> cVar) {
        return b(this, cVar);
    }

    default void d(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    default boolean e() {
        return true;
    }

    default q0.c getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return h(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), e() ? getView().getPaddingTop() + getView().getPaddingBottom() : 0);
    }

    default g getSize() {
        q0.c height;
        q0.c width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new g(width, height);
    }

    @m80.k
    T getView();

    default q0.c getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return h(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), e() ? getView().getPaddingLeft() + getView().getPaddingRight() : 0);
    }

    default q0.c h(int i11, int i12, int i13) {
        if (i11 == -2) {
            return c.b.f81359a;
        }
        int i14 = i11 - i13;
        if (i14 > 0) {
            return q0.a.a(i14);
        }
        int i15 = i12 - i13;
        if (i15 > 0) {
            return q0.a.a(i15);
        }
        return null;
    }
}
