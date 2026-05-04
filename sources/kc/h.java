package kc;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import androidx.annotation.StyleRes;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c40.h1;
import c40.l3;
import c40.p2;
import c40.r0;
import c40.v3;
import com.baicizhan.framework.common.magicdialog.R;
import java.io.Closeable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class h extends DialogFragment {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f66390f = "BaseDialogFragment";

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public DialogInterface.OnDismissListener f66392a;

    /* renamed from: c, reason: collision with root package name */
    @StyleRes
    public final int f66394c;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f66389e = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final n40.a f66391g = n40.g.b(false, 1, null);

    /* renamed from: b, reason: collision with root package name */
    public final int f66393b = R.style.MagicDefault;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c0 f66395d = e0.c(d.f66407a);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Closeable, r0 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final kotlin.coroutines.d f66396a;

        public a(@m80.k kotlin.coroutines.d context) {
            g0.p(context, "context");
            this.f66396a = context;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            p2.j(getCoroutineContext(), null, 1, null);
        }

        @Override // c40.r0
        @m80.k
        public kotlin.coroutines.d getCoroutineContext() {
            return this.f66396a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.framework.common.magicdialog.BaseDialogFragment$actuallyShow$2", f = "BaseDialogFragment.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f66397a;

        /* renamed from: b, reason: collision with root package name */
        public Object f66398b;

        /* renamed from: c, reason: collision with root package name */
        public Object f66399c;

        /* renamed from: d, reason: collision with root package name */
        public int f66400d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ FragmentManager f66401e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f66402f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ h f66403g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends FragmentManager.FragmentLifecycleCallbacks {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c40.n<Boolean> f66404a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f66405b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f66406c;

            /* JADX WARN: Multi-variable type inference failed */
            public a(c40.n<? super Boolean> nVar, h hVar, FragmentManager fragmentManager) {
                this.f66404a = nVar;
                this.f66405b = hVar;
                this.f66406c = fragmentManager;
            }

            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentAttached(@m80.k FragmentManager fm2, @m80.k Fragment f11, @m80.k Context context) {
                g0.p(fm2, "fm");
                g0.p(f11, "f");
                g0.p(context, "context");
                super.onFragmentAttached(fm2, f11, context);
                Log.d(h.f66390f, f11 + " attached");
                c40.n<Boolean> nVar = this.f66404a;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m6308constructorimpl(Boolean.valueOf(g0.g(this.f66405b, f11))));
                this.f66406c.unregisterFragmentLifecycleCallbacks(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FragmentManager fragmentManager, String str, h hVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f66401e = fragmentManager;
            this.f66402f = str;
            this.f66403g = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.k
        public final j00.c<g2> create(@m80.l Object obj, @m80.k j00.c<?> cVar) {
            return new c(this.f66401e, this.f66402f, this.f66403g, cVar);
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@m80.k r0 r0Var, @m80.l j00.c<? super Boolean> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f66400d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            FragmentManager fragmentManager = this.f66401e;
            String str = this.f66402f;
            h hVar = this.f66403g;
            this.f66397a = fragmentManager;
            this.f66398b = str;
            this.f66399c = hVar;
            this.f66400d = 1;
            c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(this), 1);
            pVar.y();
            if (fragmentManager.findFragmentByTag(str) != null) {
                Log.d(h.f66390f, "actuallyShow: already added");
                Result.a aVar = Result.Companion;
                pVar.resumeWith(Result.m6308constructorimpl(l00.a.a(false)));
            } else {
                fragmentManager.registerFragmentLifecycleCallbacks(new a(pVar, hVar, fragmentManager), false);
                fragmentManager.beginTransaction().add(hVar, str).commitAllowingStateLoss();
            }
            Object F = pVar.F();
            if (F == kotlin.coroutines.intrinsics.b.l()) {
                l00.f.c(this);
            }
            return F == l11 ? l11 : F;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements x00.a<a> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f66407a = new d();

        public d() {
            super(0);
        }

        @Override // x00.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(l3.c(null, 1, null).plus(h1.e().q()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements x00.l<Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Resources.Theme f66408a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Resources.Theme theme) {
            super(1);
            this.f66408a = theme;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Integer num) {
            invoke(num.intValue());
            return g2.f100423a;
        }

        public final void invoke(int i11) {
            this.f66408a.applyStyle(i11, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.framework.common.magicdialog.BaseDialogFragment$show$1", f = "BaseDialogFragment.kt", i = {0, 1}, l = {135, 63}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f66409a;

        /* renamed from: b, reason: collision with root package name */
        public Object f66410b;

        /* renamed from: c, reason: collision with root package name */
        public Object f66411c;

        /* renamed from: d, reason: collision with root package name */
        public Object f66412d;

        /* renamed from: e, reason: collision with root package name */
        public int f66413e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ FragmentManager f66415g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f66416h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(FragmentManager fragmentManager, String str, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f66415g = fragmentManager;
            this.f66416h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.k
        public final j00.c<g2> create(@m80.l Object obj, @m80.k j00.c<?> cVar) {
            return h.this.new f(this.f66415g, this.f66416h, cVar);
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@m80.k r0 r0Var, @m80.l j00.c<? super g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            n40.a aVar;
            h hVar;
            FragmentManager fragmentManager;
            String str;
            n40.a aVar2;
            Throwable th2;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f66413e;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    aVar = h.f66391g;
                    hVar = h.this;
                    FragmentManager fragmentManager2 = this.f66415g;
                    String str2 = this.f66416h;
                    this.f66409a = aVar;
                    this.f66410b = hVar;
                    this.f66411c = fragmentManager2;
                    this.f66412d = str2;
                    this.f66413e = 1;
                    if (aVar.lock(null, this) != l11) {
                        fragmentManager = fragmentManager2;
                        str = str2;
                    }
                    return l11;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (n40.a) this.f66409a;
                    try {
                        kotlin.e.n(obj);
                        g2 g2Var = g2.f100423a;
                        aVar2.unlock(null);
                        return g2Var;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.unlock(null);
                        throw th2;
                    }
                }
                str = (String) this.f66412d;
                fragmentManager = (FragmentManager) this.f66411c;
                hVar = (h) this.f66410b;
                n40.a aVar3 = (n40.a) this.f66409a;
                kotlin.e.n(obj);
                aVar = aVar3;
                this.f66409a = aVar;
                this.f66410b = null;
                this.f66411c = null;
                this.f66412d = null;
                this.f66413e = 2;
                if (hVar.w(fragmentManager, str, this) != l11) {
                    aVar2 = aVar;
                    g2 g2Var2 = g2.f100423a;
                    aVar2.unlock(null);
                    return g2Var2;
                }
                return l11;
            } catch (Throwable th4) {
                aVar2 = aVar;
                th2 = th4;
                aVar2.unlock(null);
                throw th2;
            }
        }
    }

    public boolean A() {
        return true;
    }

    @m80.k
    public final h B(@m80.k DialogInterface.OnDismissListener l11) {
        g0.p(l11, "l");
        this.f66392a = l11;
        return this;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        try {
            dismissAllowingStateLoss();
        } catch (Exception e11) {
            Log.e(f66390f, g0.C("dismiss: ", e11));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, z());
        setCancelable(A());
    }

    @Override // androidx.fragment.app.DialogFragment
    @m80.k
    public Dialog onCreateDialog(@m80.l Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        g0.o(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        Resources.Theme theme = onCreateDialog.getContext().getTheme();
        g0.o(theme, "");
        mc.b.v(theme, R.attr.magicAppearance, new e(theme));
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@m80.k DialogInterface dialog) {
        g0.p(dialog, "dialog");
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = this.f66392a;
        if (onDismissListener == null) {
            return;
        }
        onDismissListener.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(x());
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return;
        }
        window.setWindowAnimations(valueOf.intValue());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@m80.k FragmentManager manager, @m80.l String str) {
        g0.p(manager, "manager");
        try {
            c40.k.f(y(manager), null, null, new f(manager, str, null), 3, null);
        } catch (Exception e11) {
            Log.e(f66390f, g0.C("show: ", e11));
        }
    }

    public final Object w(FragmentManager fragmentManager, String str, j00.c<? super Boolean> cVar) {
        return v3.c(100L, new c(fragmentManager, str, this, null), cVar);
    }

    public int x() {
        return this.f66394c;
    }

    public final r0 y(FragmentManager fragmentManager) {
        return (r0) this.f66395d.getValue();
    }

    public int z() {
        return this.f66393b;
    }
}
