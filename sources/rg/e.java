package rg;

import a00.k1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import c40.h1;
import c40.m0;
import c40.r0;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;
import com.baicizhan.main.home.experiment.q0;
import com.jiongji.andriod.card.R;
import gs.v6;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import ma.t;
import pg.l0;
import rg.e;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class e extends DialogFragment {

    /* renamed from: h, reason: collision with root package name */
    public static final int f84043h = 8;

    /* renamed from: a, reason: collision with root package name */
    public int f84044a;

    /* renamed from: b, reason: collision with root package name */
    public int f84045b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public a f84046c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f84047d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f84048e;

    /* renamed from: f, reason: collision with root package name */
    public v6 f84049f;

    /* renamed from: g, reason: collision with root package name */
    public int f84050g = 10;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.view.NewFreshmanGuideDialog$onViewCreated$1", f = "NewFreshmanGuideDialog.kt", i = {0, 0}, l = {66}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-run-NewFreshmanGuideDialog$onViewCreated$1$1"}, s = {"L$1", "I$0"}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f84051a;

        /* renamed from: b, reason: collision with root package name */
        public Object f84052b;

        /* renamed from: c, reason: collision with root package name */
        public Object f84053c;

        /* renamed from: d, reason: collision with root package name */
        public int f84054d;

        /* renamed from: e, reason: collision with root package name */
        public int f84055e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.plan.view.NewFreshmanGuideDialog$onViewCreated$1$1$1", f = "NewFreshmanGuideDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super Integer>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f84057a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f84058b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f84058b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f84058b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super Integer> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f84057a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                ScheduleRecord h11 = i9.a.h(this.f84058b.getContext());
                Integer f11 = l00.a.f(h11 != null ? h11.dailyCount : 10);
                this.f84058b.f84050g = f11.intValue();
                return f11;
            }
        }

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        public static final g2 j(e eVar, View view) {
            a aVar = eVar.f84046c;
            if (aVar != null) {
                aVar.a();
            }
            eVar.f84047d = true;
            return g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return e.this.new b(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            v6 v6Var;
            final e eVar;
            TextView textView;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f84055e;
            if (i11 == 0) {
                kotlin.e.n(obj);
                v6 v6Var2 = e.this.f84049f;
                if (v6Var2 == null) {
                    g0.S("binding");
                    v6Var = null;
                } else {
                    v6Var = v6Var2;
                }
                eVar = e.this;
                if (!q0.f21394a.b()) {
                    TextView wordsCount = v6Var.f57138g;
                    g0.o(wordsCount, "wordsCount");
                    int i12 = new l0().d().i();
                    eVar.f84050g = i12;
                    q.d(wordsCount, i12);
                    TextView btnStart = v6Var.f57132a;
                    g0.o(btnStart, "btnStart");
                    sa.q.t(btnStart, 0, new x00.l() { // from class: rg.f
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            g2 j11;
                            j11 = e.b.j(e.this, (View) obj2);
                            return j11;
                        }
                    }, 1, null);
                    v6Var.f57134c.setVisibility(8);
                    return g2.f100423a;
                }
                TextView wordsCount2 = v6Var.f57138g;
                g0.o(wordsCount2, "wordsCount");
                m0 c11 = h1.c();
                a aVar = new a(eVar, null);
                this.f84051a = eVar;
                this.f84052b = v6Var;
                this.f84053c = wordsCount2;
                this.f84054d = 0;
                this.f84055e = 1;
                Object h11 = c40.i.h(c11, aVar, this);
                if (h11 == l11) {
                    return l11;
                }
                textView = wordsCount2;
                obj = h11;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                textView = (TextView) this.f84053c;
                v6Var = (v6) this.f84052b;
                eVar = (e) this.f84051a;
                kotlin.e.n(obj);
            }
            q.d(textView, ((Number) obj).intValue());
            TextView btnStart2 = v6Var.f57132a;
            g0.o(btnStart2, "btnStart");
            sa.q.t(btnStart2, 0, new x00.l() { // from class: rg.f
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 j11;
                    j11 = e.b.j(e.this, (View) obj2);
                    return j11;
                }
            }, 1, null);
            v6Var.f57134c.setVisibility(8);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f84059a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f84060b;

        public c(x00.a<g2> aVar, e eVar) {
            this.f84059a = aVar;
            this.f84060b = eVar;
        }

        @Override // rg.e.a
        public void a() {
            this.f84059a.invoke();
            ma.l.e(t.f73017p, ma.a.M1, k1.k(yz.h1.a(ma.b.T1, Integer.valueOf(this.f84060b.f84050g))));
            ma.l.a(t.f73003b, ma.a.E);
        }
    }

    private final void A() {
        Window window;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(this.f84045b | 8192);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@m80.l Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        setCancelable(false);
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            this.f84044a = window.getStatusBarColor();
            this.f84045b = window.getDecorView().getSystemUiVisibility();
        }
        setStyle(0, R.style.FullScreenDialog_FreshmanGuide);
        A();
        Context requireContext = requireContext();
        g0.o(requireContext, "requireContext(...)");
        hj.p.i(this, requireContext);
    }

    @Override // androidx.fragment.app.Fragment
    @m80.l
    public View onCreateView(@m80.k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        g0.p(inflater, "inflater");
        v6 d11 = v6.d(inflater);
        g0.o(d11, "inflate(...)");
        this.f84049f = d11;
        if (d11 == null) {
            g0.S("binding");
            d11 = null;
        }
        return d11.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Window window;
        View decorView;
        Window window2;
        super.onDestroy();
        FragmentActivity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            window2.setStatusBarColor(this.f84044a);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(this.f84045b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f84048e = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f84047d) {
            dismiss();
        } else if (this.f84048e) {
            this.f84048e = false;
            A();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@m80.k View view, @m80.l Bundle bundle) {
        g0.p(view, "view");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        g0.o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new b(null), 3, null);
    }

    @m80.k
    public final e z(@m80.k x00.a<g2> interaction) {
        g0.p(interaction, "interaction");
        this.f84046c = new c(interaction, this);
        return this;
    }
}
