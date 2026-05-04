package kc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.baicizhan.framework.common.magicdialog.Action;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.framework.common.magicdialog.Config;
import com.baicizhan.framework.common.magicdialog.R;
import java.io.Serializable;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import u30.k0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class d extends kc.g {

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final b f66336q = new b(null);

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final String f66337r = "button_config";

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public static final String f66338s = "button_layout";

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public static final String f66339t = "button_config_negative";

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public static final String f66340u = "button_config_positive";

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public static final String f66341v = "button_config_neutral";

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public static final String f66342w = "cancellable";

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public static final String f66343x = "style";

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public static final String f66344y = "button_type";

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public q f66345m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    public q f66346n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f66347o = true;

    /* renamed from: p, reason: collision with root package name */
    public int f66348p = R.layout.layout_action_buttons;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a<T extends a<T, R>, R extends d> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Context f66349a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final Bundle f66350b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public x00.l<? super View, g2> f66351c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public x00.l<? super View, g2> f66352d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public x00.l<? super View, g2> f66353e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public q f66354f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kc.d$a$a, reason: collision with other inner class name */
        public static final class C0766a implements q {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a<T, R> f66355a;

            public C0766a(a<T, R> aVar) {
                this.f66355a = aVar;
            }

            @Override // kc.q
            public void a(@m80.k View v11) {
                g0.p(v11, "v");
                this.f66355a.f66353e.invoke(v11);
            }

            @Override // kc.q
            public void onDialogNegativeClick(@m80.k View v11) {
                g0.p(v11, "v");
                this.f66355a.f66351c.invoke(v11);
            }

            @Override // kc.q
            public void onDialogPositiveClick(@m80.k View v11) {
                g0.p(v11, "v");
                this.f66355a.f66352d.invoke(v11);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends Lambda implements x00.l<View, g2> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f66356a = new b();

            public b() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@m80.k View it) {
                g0.p(it, "it");
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(View view) {
                invoke2(view);
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c extends Lambda implements x00.l<View, g2> {

            /* renamed from: a, reason: collision with root package name */
            public static final c f66357a = new c();

            public c() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@m80.k View it) {
                g0.p(it, "it");
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(View view) {
                invoke2(view);
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kc.d$a$d, reason: collision with other inner class name */
        public static final class C0767d extends Lambda implements x00.l<View, g2> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0767d f66358a = new C0767d();

            public C0767d() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@m80.k View it) {
                g0.p(it, "it");
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(View view) {
                invoke2(view);
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class e implements q {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x00.l<View, g2> f66359a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a<T, R> f66360b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x00.l<View, g2> f66361c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ x00.l<View, g2> f66362d;

            /* JADX WARN: Multi-variable type inference failed */
            public e(x00.l<? super View, g2> lVar, a<T, R> aVar, x00.l<? super View, g2> lVar2, x00.l<? super View, g2> lVar3) {
                this.f66359a = lVar;
                this.f66360b = aVar;
                this.f66361c = lVar2;
                this.f66362d = lVar3;
            }

            @Override // kc.q
            public void a(@m80.k View v11) {
                g0.p(v11, "v");
                x00.l<View, g2> lVar = this.f66362d;
                if (lVar == null) {
                    lVar = this.f66360b.f66353e;
                }
                lVar.invoke(v11);
            }

            @Override // kc.q
            public void onDialogNegativeClick(@m80.k View v11) {
                g0.p(v11, "v");
                x00.l<View, g2> lVar = this.f66359a;
                if (lVar == null) {
                    lVar = this.f66360b.f66351c;
                }
                lVar.invoke(v11);
            }

            @Override // kc.q
            public void onDialogPositiveClick(@m80.k View v11) {
                g0.p(v11, "v");
                this.f66361c.invoke(v11);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class f extends Lambda implements x00.l<View, g2> {

            /* renamed from: a, reason: collision with root package name */
            public static final f f66363a = new f();

            public f() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@m80.k View it) {
                g0.p(it, "it");
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(View view) {
                invoke2(view);
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class g extends Lambda implements x00.l<View, g2> {

            /* renamed from: a, reason: collision with root package name */
            public static final g f66364a = new g();

            public g() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@m80.k View it) {
                g0.p(it, "it");
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(View view) {
                invoke2(view);
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class h extends Lambda implements x00.l<View, g2> {

            /* renamed from: a, reason: collision with root package name */
            public static final h f66365a = new h();

            public h() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@m80.k View it) {
                g0.p(it, "it");
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(View view) {
                invoke2(view);
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class i extends Lambda implements x00.l<View, g2> {

            /* renamed from: a, reason: collision with root package name */
            public static final i f66366a = new i();

            public i() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@m80.k View it) {
                g0.p(it, "it");
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(View view) {
                invoke2(view);
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class j extends Lambda implements x00.l<View, g2> {

            /* renamed from: a, reason: collision with root package name */
            public static final j f66367a = new j();

            public j() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@m80.k View it) {
                g0.p(it, "it");
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(View view) {
                invoke2(view);
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class k extends Lambda implements x00.l<View, g2> {

            /* renamed from: a, reason: collision with root package name */
            public static final k f66368a = new k();

            public k() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@m80.k View it) {
                g0.p(it, "it");
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(View view) {
                invoke2(view);
                return g2.f100423a;
            }
        }

        public a(@m80.k Context context) {
            g0.p(context, "context");
            this.f66349a = context;
            this.f66350b = new Bundle();
            this.f66351c = b.f66356a;
            this.f66352d = C0767d.f66358a;
            this.f66353e = c.f66357a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a I(a aVar, int i11, Action action, x00.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: positive");
            }
            if ((i12 & 2) != 0) {
                action = null;
            }
            if ((i12 & 4) != 0) {
                lVar = k.f66368a;
            }
            return aVar.E(i11, action, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a J(a aVar, String str, Action action, x00.l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: positive");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                action = null;
            }
            if ((i11 & 4) != 0) {
                lVar = j.f66367a;
            }
            return aVar.H(str, action, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a l(a aVar, x00.l lVar, x00.l lVar2, x00.l lVar3, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: interaction");
            }
            if ((i11 & 1) != 0) {
                lVar = null;
            }
            if ((i11 & 2) != 0) {
                lVar2 = null;
            }
            return aVar.k(lVar, lVar2, lVar3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a r(a aVar, int i11, x00.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: negative");
            }
            if ((i12 & 2) != 0) {
                lVar = g.f66364a;
            }
            return aVar.o(i11, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a s(a aVar, String str, x00.l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: negative");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                lVar = f.f66363a;
            }
            return aVar.q(str, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a x(a aVar, int i11, x00.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: neutral");
            }
            if ((i12 & 2) != 0) {
                lVar = i.f66366a;
            }
            return aVar.u(i11, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a y(a aVar, String str, x00.l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: neutral");
            }
            if ((i11 & 2) != 0) {
                lVar = h.f66365a;
            }
            return aVar.w(str, lVar);
        }

        public void A() {
            Config c11 = Config.Companion.c(this.f66349a);
            Serializable serializable = this.f66350b.getSerializable(d.f66339t);
            Config config = serializable instanceof Config ? (Config) serializable : null;
            Serializable serializable2 = this.f66350b.getSerializable(d.f66340u);
            Config config2 = serializable2 instanceof Config ? (Config) serializable2 : null;
            Serializable serializable3 = this.f66350b.getSerializable(d.f66341v);
            Config config3 = serializable3 instanceof Config ? (Config) serializable3 : null;
            Bundle bundle = this.f66350b;
            CharSequence cancel = config == null ? null : config.getCancel();
            boolean z11 = true;
            if (cancel == null || k0.O3(cancel)) {
                cancel = null;
            }
            if (cancel == null) {
                cancel = c11.getCancel();
            }
            CharSequence charSequence = cancel;
            CharSequence ok2 = config2 == null ? null : config2.getOk();
            if (ok2 == null || k0.O3(ok2)) {
                ok2 = null;
            }
            if (ok2 == null) {
                ok2 = c11.getOk();
            }
            CharSequence charSequence2 = ok2;
            CharSequence neutral = config3 == null ? null : config3.getNeutral();
            if (neutral != null && !k0.O3(neutral)) {
                z11 = false;
            }
            CharSequence charSequence3 = !z11 ? neutral : null;
            Action actionOk = config2 != null ? config2.getActionOk() : null;
            if (actionOk == null) {
                actionOk = Action.RECOMMENDED;
            }
            bundle.putSerializable(d.f66337r, new Config(charSequence, charSequence2, charSequence3, null, actionOk, null, 40, null));
        }

        @w00.k
        @m80.k
        public final T B() {
            return (T) J(this, null, null, null, 7, null);
        }

        @w00.k
        @m80.k
        public final T C(@StringRes int i11) {
            return (T) I(this, i11, null, null, 6, null);
        }

        @w00.k
        @m80.k
        public final T D(@StringRes int i11, @m80.l Action action) {
            return (T) I(this, i11, action, null, 4, null);
        }

        @w00.k
        @m80.k
        public final T E(@StringRes int i11, @m80.l Action action, @m80.k x00.l<? super View, g2> callback) {
            g0.p(callback, "callback");
            return H(this.f66349a.getString(i11), action, callback);
        }

        @w00.k
        @m80.k
        public final T F(@m80.l String str) {
            return (T) J(this, str, null, null, 6, null);
        }

        @w00.k
        @m80.k
        public final T G(@m80.l String str, @m80.l Action action) {
            return (T) J(this, str, action, null, 4, null);
        }

        @w00.k
        @m80.k
        public final T H(@m80.l String str, @m80.l Action action, @m80.k x00.l<? super View, g2> callback) {
            g0.p(callback, "callback");
            this.f66350b.putSerializable(d.f66340u, Config.Companion.d(this.f66349a, str, action));
            this.f66352d = callback;
            return this;
        }

        @m80.k
        public final T K(@StyleRes int i11) {
            this.f66350b.putInt("style", i11);
            return this;
        }

        @m80.k
        public final R d() {
            A();
            R g11 = g();
            g11.setArguments(h());
            q qVar = this.f66354f;
            if (qVar == null) {
                qVar = new C0766a(this);
            }
            g11.e0(qVar);
            z(g11);
            return g11;
        }

        @m80.k
        public final T e(@LayoutRes int i11) {
            this.f66350b.putInt(d.f66338s, i11);
            return this;
        }

        @m80.k
        public final T f(boolean z11) {
            this.f66350b.putBoolean(d.f66342w, z11);
            return this;
        }

        @m80.k
        public abstract R g();

        @m80.k
        public final Bundle h() {
            return this.f66350b;
        }

        @m80.k
        public final Context i() {
            return this.f66349a;
        }

        @m80.k
        public final T j(@m80.k q interaction) {
            g0.p(interaction, "interaction");
            this.f66354f = interaction;
            return this;
        }

        @m80.k
        public final T k(@m80.l x00.l<? super View, g2> lVar, @m80.l x00.l<? super View, g2> lVar2, @m80.k x00.l<? super View, g2> positive) {
            g0.p(positive, "positive");
            return j(new e(lVar, this, positive, lVar2));
        }

        @w00.k
        @m80.k
        public final T m() {
            return (T) s(this, null, null, 3, null);
        }

        @w00.k
        @m80.k
        public final T n(@StringRes int i11) {
            return (T) r(this, i11, null, 2, null);
        }

        @w00.k
        @m80.k
        public final T o(@StringRes int i11, @m80.k x00.l<? super View, g2> callback) {
            g0.p(callback, "callback");
            return q(this.f66349a.getString(i11), callback);
        }

        @w00.k
        @m80.k
        public final T p(@m80.l String str) {
            return (T) s(this, str, null, 2, null);
        }

        @w00.k
        @m80.k
        public final T q(@m80.l String str, @m80.k x00.l<? super View, g2> callback) {
            g0.p(callback, "callback");
            this.f66350b.putSerializable(d.f66339t, Config.Companion.a(this.f66349a, str));
            this.f66351c = callback;
            return this;
        }

        @w00.k
        @m80.k
        public final T t(@StringRes int i11) {
            return (T) x(this, i11, null, 2, null);
        }

        @w00.k
        @m80.k
        public final T u(@StringRes int i11, @m80.k x00.l<? super View, g2> callback) {
            g0.p(callback, "callback");
            return w(this.f66349a.getString(i11), callback);
        }

        @w00.k
        @m80.k
        public final T v(@m80.l String str) {
            return (T) y(this, str, null, 2, null);
        }

        @w00.k
        @m80.k
        public final T w(@m80.l String str, @m80.k x00.l<? super View, g2> callback) {
            g0.p(callback, "callback");
            this.f66350b.putSerializable(d.f66341v, Config.Companion.b(this.f66349a, str));
            this.f66353e = callback;
            return this;
        }

        public void z(@m80.k R built) {
            g0.p(built, "built");
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
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66369a;

        static {
            int[] iArr = new int[Action.values().length];
            iArr[Action.RECOMMENDED.ordinal()] = 1;
            iArr[Action.ALERT.ordinal()] = 2;
            f66369a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: kc.d$d, reason: collision with other inner class name */
    public static final class C0768d extends Lambda implements x00.a<View> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f66370a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0768d(View view) {
            super(0);
            this.f66370a = view;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final View invoke() {
            return this.f66370a.findViewById(R.id.magic_buttons_gap_bottom);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements x00.a<TextView> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f66371a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(0);
            this.f66371a = view;
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) this.f66371a.findViewById(R.id.magic_button_negative);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends Lambda implements x00.a<TextView> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f66372a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view) {
            super(0);
            this.f66372a = view;
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) this.f66372a.findViewById(R.id.magic_button_neutral);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends Lambda implements x00.a<TextView> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f66373a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(View view) {
            super(0);
            this.f66373a = view;
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) this.f66373a.findViewById(R.id.magic_button_positive);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends Lambda implements x00.a<View> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f66374a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(View view) {
            super(0);
            this.f66374a = view;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final View invoke() {
            return this.f66374a.findViewById(R.id.magic_buttons_gap_top);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends Lambda implements x00.l<View, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f66375a = new i();

        public i() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m80.k View it) {
            g0.p(it, "it");
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(View view) {
            invoke2(view);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends Lambda implements x00.l<View, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f66376a = new j();

        public j() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m80.k View it) {
            g0.p(it, "it");
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(View view) {
            invoke2(view);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l<View, g2> f66377a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<View, g2> f66378b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<View, g2> f66379c;

        /* JADX WARN: Multi-variable type inference failed */
        public k(x00.l<? super View, g2> lVar, x00.l<? super View, g2> lVar2, x00.l<? super View, g2> lVar3) {
            this.f66377a = lVar;
            this.f66378b = lVar2;
            this.f66379c = lVar3;
        }

        @Override // kc.q
        public void a(@m80.k View v11) {
            g0.p(v11, "v");
            this.f66379c.invoke(v11);
        }

        @Override // kc.q
        public void onDialogNegativeClick(@m80.k View v11) {
            g0.p(v11, "v");
            this.f66377a.invoke(v11);
        }

        @Override // kc.q
        public void onDialogPositiveClick(@m80.k View v11) {
            g0.p(v11, "v");
            this.f66378b.invoke(v11);
        }
    }

    public static final void Q(d this$0, TextView v11, View view) {
        g2 g2Var;
        q qVar;
        g0.p(this$0, "this$0");
        g0.p(v11, "$v");
        this$0.b0(v11);
        q qVar2 = this$0.f66346n;
        if (qVar2 == null) {
            g2Var = null;
        } else {
            qVar2.onDialogNegativeClick(v11);
            g2Var = g2.f100423a;
        }
        if (g2Var == null && (qVar = this$0.f66345m) != null) {
            qVar.onDialogNegativeClick(v11);
            g2 g2Var2 = g2.f100423a;
        }
        this$0.dismiss();
    }

    public static final void S(d this$0, TextView v11, View view) {
        g2 g2Var;
        q qVar;
        g0.p(this$0, "this$0");
        g0.p(v11, "$v");
        this$0.c0(v11);
        q qVar2 = this$0.f66346n;
        if (qVar2 == null) {
            g2Var = null;
        } else {
            qVar2.a(v11);
            g2Var = g2.f100423a;
        }
        if (g2Var == null && (qVar = this$0.f66345m) != null) {
            qVar.a(v11);
            g2 g2Var2 = g2.f100423a;
        }
        this$0.dismiss();
    }

    public static final void U(d this$0, TextView v11, View view) {
        g2 g2Var;
        q qVar;
        g0.p(this$0, "this$0");
        g0.p(v11, "$v");
        this$0.d0(v11);
        q qVar2 = this$0.f66346n;
        if (qVar2 == null) {
            g2Var = null;
        } else {
            qVar2.onDialogPositiveClick(v11);
            g2Var = g2.f100423a;
        }
        if (g2Var == null && (qVar = this$0.f66345m) != null) {
            qVar.onDialogPositiveClick(v11);
            g2 g2Var2 = g2.f100423a;
        }
        this$0.dismiss();
    }

    public static final TextView W(c0<? extends TextView> c0Var) {
        return c0Var.getValue();
    }

    public static final TextView X(c0<? extends TextView> c0Var) {
        return c0Var.getValue();
    }

    public static final TextView Y(c0<? extends TextView> c0Var) {
        return c0Var.getValue();
    }

    public static final View Z(c0<? extends View> c0Var) {
        return c0Var.getValue();
    }

    public static final View a0(c0<? extends View> c0Var) {
        return c0Var.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d h0(d dVar, x00.l lVar, x00.l lVar2, x00.l lVar3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOnDialogFragmentInteraction");
        }
        if ((i11 & 1) != 0) {
            lVar = i.f66375a;
        }
        if ((i11 & 2) != 0) {
            lVar2 = j.f66376a;
        }
        return dVar.g0(lVar, lVar2, lVar3);
    }

    @Override // kc.h
    public boolean A() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return true;
        }
        return arguments.getBoolean(f66342w, true);
    }

    @Override // kc.g
    public boolean H() {
        return this.f66347o;
    }

    @Override // kc.g
    @m80.l
    public Integer J(@m80.k Context context) {
        g0.p(context, "context");
        Integer n11 = mc.b.n(getArguments(), "style");
        return n11 == null ? super.J(context) : n11;
    }

    @m80.k
    public ButtonType O() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments == null ? null : arguments.getSerializable("button_type");
        ButtonType buttonType = serializable instanceof ButtonType ? (ButtonType) serializable : null;
        return buttonType == null ? ButtonType.DOUBLE : buttonType;
    }

    public void P(@m80.k final TextView v11) {
        g0.p(v11, "v");
        Bundle arguments = getArguments();
        Serializable serializable = arguments == null ? null : arguments.getSerializable(f66337r);
        Config config = serializable instanceof Config ? (Config) serializable : null;
        v11.setOnClickListener(new View.OnClickListener() { // from class: kc.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.Q(d.this, v11, view);
            }
        });
        if (config == null) {
            return;
        }
        v11.setText(config.getCancel());
    }

    public void R(@m80.k final TextView v11) {
        g0.p(v11, "v");
        Bundle arguments = getArguments();
        Serializable serializable = arguments == null ? null : arguments.getSerializable(f66337r);
        Config config = serializable instanceof Config ? (Config) serializable : null;
        v11.setOnClickListener(new View.OnClickListener() { // from class: kc.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.S(d.this, v11, view);
            }
        });
        if (config == null) {
            return;
        }
        v11.setText(config.getNeutral());
    }

    public void T(@m80.k final TextView v11) {
        g0.p(v11, "v");
        Bundle arguments = getArguments();
        Serializable serializable = arguments == null ? null : arguments.getSerializable(f66337r);
        Config config = serializable instanceof Config ? (Config) serializable : null;
        v11.setOnClickListener(new View.OnClickListener() { // from class: kc.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.U(d.this, v11, view);
            }
        });
        if (config == null) {
            return;
        }
        v11.setText(config.getOk());
        Action actionOk = config.getActionOk();
        if (actionOk == null) {
            return;
        }
        int i11 = c.f66369a[actionOk.ordinal()];
        Integer valueOf = Integer.valueOf(mc.b.b(this, i11 != 1 ? i11 != 2 ? R.attr.magicButtonActionNormalColor : R.attr.magicButtonActionAlertColor : R.attr.magicButtonActionRecommendedColor, 0));
        Integer num = valueOf.intValue() != 0 ? valueOf : null;
        if (num == null) {
            return;
        }
        v11.setTextColor(num.intValue());
    }

    @m80.l
    public abstract View V(@m80.k LayoutInflater layoutInflater);

    public void b0(@m80.k TextView v11) {
        g0.p(v11, "v");
    }

    public void c0(@m80.k TextView v11) {
        g0.p(v11, "v");
    }

    public void d0(@m80.k TextView v11) {
        g0.p(v11, "v");
    }

    public final void e0(q qVar) {
        this.f66346n = qVar;
    }

    @yz.n(message = "Use setter in builder instead")
    @m80.k
    public final d f0(@m80.k q listener) {
        g0.p(listener, "listener");
        this.f66346n = listener;
        return this;
    }

    @m80.k
    public final d g0(@m80.k x00.l<? super View, g2> negative, @m80.k x00.l<? super View, g2> neutral, @m80.k x00.l<? super View, g2> positive) {
        g0.p(negative, "negative");
        g0.p(neutral, "neutral");
        g0.p(positive, "positive");
        this.f66346n = new k(negative, positive, neutral);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@m80.k Context context) {
        g0.p(context, "context");
        super.onAttach(context);
        this.f66345m = context instanceof q ? (q) context : null;
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ResourceType"})
    @m80.k
    public final View onCreateView(@m80.k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        g0.p(inflater, "inflater");
        lc.a c11 = lc.a.c(inflater);
        View V = V(inflater);
        if (V != null) {
            c11.f71044b.addView(V);
        }
        Integer n11 = mc.b.n(getArguments(), f66338s);
        View inflate = inflater.inflate(n11 == null ? mc.b.p(this, R.attr.magicButtonsLayout, this.f66348p) : n11.intValue(), (ViewGroup) c11.f71045c, false);
        inflate.setPadding(0, mc.b.h(this, R.attr.magicButtonsTopPadding, 0, 2, null), 0, 0);
        c0 c12 = e0.c(new e(inflate));
        c0 c13 = e0.c(new g(inflate));
        c0 c14 = e0.c(new f(inflate));
        c0 c15 = e0.c(new h(inflate));
        c0 c16 = e0.c(new C0768d(inflate));
        ButtonType O = O();
        TextView negativeButton = W(c12);
        g0.o(negativeButton, "negativeButton");
        am.a.o(negativeButton, (O.getFlag() & 4) == 4);
        TextView positiveButton = X(c13);
        g0.o(positiveButton, "positiveButton");
        am.a.o(positiveButton, (O.getFlag() & 1) == 1);
        TextView Y = Y(c14);
        if (Y != null) {
            am.a.o(Y, (O.getFlag() & 2) == 2);
        }
        View Z = Z(c15);
        if (Z != null) {
            am.a.o(Z, O.getFlag() != 0);
        }
        View a02 = a0(c16);
        if (a02 != null) {
            am.a.o(a02, O.getFlag() != 0);
        }
        TextView negativeButton2 = W(c12);
        g0.o(negativeButton2, "negativeButton");
        P(negativeButton2);
        TextView positiveButton2 = X(c13);
        g0.o(positiveButton2, "positiveButton");
        T(positiveButton2);
        TextView Y2 = Y(c14);
        if (Y2 != null) {
            R(Y2);
        }
        if (inflate.getId() == -1) {
            inflate.setId(View.generateViewId());
        }
        c11.f71045c.addView(inflate);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(c11.f71045c);
        constraintSet.constrainWidth(inflate.getId(), 0);
        constraintSet.connect(inflate.getId(), 3, c11.f71044b.getId(), 4);
        constraintSet.connect(inflate.getId(), 6, c11.f71045c.getId(), 6);
        constraintSet.connect(inflate.getId(), 7, c11.f71045c.getId(), 7);
        constraintSet.connect(inflate.getId(), 4, c11.f71045c.getId(), 4);
        constraintSet.applyTo(c11.f71045c);
        ConstraintLayout root = c11.getRoot();
        g0.o(root, "inflate(inflater).apply …         }\n        }.root");
        return root;
    }
}
