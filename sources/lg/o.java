package lg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.main.home.plan.a3;
import com.baicizhan.main.home.plan.data.LearnCardStatus;
import gs.gh;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class o extends lg.a<mg.h, a> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f71285h = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends zf.d {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final gh f71286e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final TextView f71287f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final TextView f71288g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final TextView f71289h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ o f71290i;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(@m80.k final lg.o r5, gs.gh r6) {
            /*
                r4 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.g0.p(r6, r0)
                r4.f71290i = r5
                androidx.constraintlayout.widget.ConstraintLayout r0 = r6.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                r4.<init>(r0)
                r4.f71286e = r6
                android.widget.TextView r0 = r6.f55075e
                java.lang.String r1 = "extraTitle"
                kotlin.jvm.internal.g0.o(r0, r1)
                r4.f71287f = r0
                android.widget.TextView r0 = r6.f55073c
                java.lang.String r1 = "extraDesc"
                kotlin.jvm.internal.g0.o(r0, r1)
                r4.f71288g = r0
                android.widget.TextView r6 = r6.f55074d
                java.lang.String r0 = "extraEnter"
                kotlin.jvm.internal.g0.o(r6, r0)
                r4.f71289h = r6
                lg.m r0 = new lg.m
                r0.<init>()
                r1 = 1
                r2 = 0
                r3 = 0
                sa.q.t(r6, r3, r0, r1, r2)
                com.baicizhan.main.home.plan.a3 r6 = r5.C()
                if (r6 == 0) goto L58
                androidx.lifecycle.LiveData r6 = r6.z0()
                if (r6 == 0) goto L58
                androidx.lifecycle.LifecycleOwner r5 = lg.o.D(r5)
                lg.n r0 = new lg.n
                r0.<init>()
                lg.o$b r1 = new lg.o$b
                r1.<init>(r0)
                r6.observe(r5, r1)
            L58:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.o.a.<init>(lg.o, gs.gh):void");
        }

        public static final g2 n(o oVar, View it) {
            ClickProtectedEvent v02;
            kotlin.jvm.internal.g0.p(it, "it");
            a3 C = oVar.C();
            if (C != null && (v02 = C.v0()) != null) {
                v02.call();
            }
            return g2.f100423a;
        }

        public static final g2 o(a aVar, LearnCardStatus learnCardStatus) {
            aVar.f71289h.setEnabled((learnCardStatus == LearnCardStatus.LOADING || learnCardStatus == LearnCardStatus.ERROR) ? false : true);
            return g2.f100423a;
        }

        public final void p(@m80.k mg.h item) {
            kotlin.jvm.internal.g0.p(item, "item");
            this.f71287f.setText(item.h());
            this.f71288g.setText(item.f());
            this.f71289h.setText(item.g());
        }

        @m80.k
        public final gh q() {
            return this.f71286e;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f71291a;

        public b(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f71291a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return kotlin.jvm.internal.g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f71291a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f71291a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@m80.k LifecycleOwner owner) {
        super(owner);
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    @Override // zf.b
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void s(@m80.k a holder, @m80.k mg.h item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        holder.p(item);
    }

    @Override // zf.b
    @m80.k
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public a u(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        kotlin.jvm.internal.g0.p(parent, "parent");
        gh c11 = gh.c(inflater);
        kotlin.jvm.internal.g0.o(c11, "inflate(...)");
        return new a(this, c11);
    }
}
