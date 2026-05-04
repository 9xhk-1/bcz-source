package hj;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import c40.r0;
import com.baicizhan.main.word_book.service.WordFavoriteService;
import ij.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "WordBookHelper")
/* loaded from: classes5.dex */
public final class p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.WordBookHelper$addAction$1", f = "WordBookHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59405a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f59406b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f59407c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f59406b = context;
            this.f59407c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f59406b, this.f59407c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f59405a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            try {
                WordFavoriteService.f27689i.d(this.f59406b, this.f59407c);
            } catch (Exception e11) {
                qb.c.c(rj.f.f84224a, "", e11);
            }
            return g2.f100423a;
        }
    }

    @m80.k
    public static final oj.a a(@m80.k q manager, long j11) {
        g0.p(manager, "manager");
        return new oj.a(manager, j11, null, null, 12, null);
    }

    public static final void b(LifecycleOwner lifecycleOwner, Context context, String str) {
        LifecycleOwnerKt.getLifecycleScope(lifecycleOwner).launchWhenResumed(new a(context, str, null));
    }

    @w00.k
    public static final void c(@m80.k Context context) {
        g0.p(context, "<this>");
        f(context, null, 1, null);
    }

    @w00.k
    public static final void d(@m80.k Context context, @m80.l rj.e eVar) {
        g0.p(context, "<this>");
        WordFavoriteService.f27689i.a(context, eVar);
    }

    public static final void e(@m80.k Fragment fragment, @m80.k rj.e callback) {
        g0.p(fragment, "<this>");
        g0.p(callback, "callback");
        WordFavoriteService.f27689i.b(fragment, callback);
    }

    public static /* synthetic */ void f(Context context, rj.e eVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = null;
        }
        d(context, eVar);
    }

    public static final void g(@m80.k LifecycleOwner lifecycleOwner, @m80.k Context context) {
        g0.p(lifecycleOwner, "<this>");
        g0.p(context, "context");
        b(lifecycleOwner, context, WordFavoriteService.f27693m);
    }

    public static final void h(@m80.k LifecycleOwner lifecycleOwner, @m80.k Context context) {
        g0.p(lifecycleOwner, "<this>");
        g0.p(context, "context");
        b(lifecycleOwner, context, WordFavoriteService.f27691k);
    }

    public static final void i(@m80.k LifecycleOwner lifecycleOwner, @m80.k Context context) {
        g0.p(lifecycleOwner, "<this>");
        g0.p(context, "context");
        b(lifecycleOwner, context, WordFavoriteService.f27692l);
    }

    public static final void j(@m80.k Context context) {
        g0.p(context, "<this>");
        try {
            WordFavoriteService.f27689i.c(context);
        } catch (Exception e11) {
            qb.c.c(rj.f.f84224a, "", e11);
        }
    }

    public static final void k(@m80.k Context context) {
        g0.p(context, "<this>");
        WordFavoriteService.f27689i.e(context);
    }

    public static final void l(@m80.k Context context, @m80.k rj.e callback) {
        g0.p(context, "<this>");
        g0.p(callback, "callback");
        WordFavoriteService.f27689i.f(context, callback);
    }
}
