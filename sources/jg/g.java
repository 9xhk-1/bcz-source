package jg;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nEasyNewUserGuide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EasyNewUserGuide.kt\ncom/baicizhan/main/guide/EasyNewUserGuide\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,76:1\n43#2:77\n35#2:78\n*S KotlinDebug\n*F\n+ 1 EasyNewUserGuide.kt\ncom/baicizhan/main/guide/EasyNewUserGuide\n*L\n49#1:77\n51#1:78\n*E\n"})
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final int f64083e = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedList<c> f64084a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f64085b;

    /* renamed from: c, reason: collision with root package name */
    public View f64086c;

    /* renamed from: d, reason: collision with root package name */
    public b f64087d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final int f64088b = 8;

        /* renamed from: a, reason: collision with root package name */
        @k
        public LinkedList<c> f64089a = new LinkedList<>();

        @k
        public final a a(@k c view) {
            g0.p(view, "view");
            this.f64089a.offer(view);
            return this;
        }

        @k
        public final g b(@k ViewGroup container) {
            g0.p(container, "container");
            return new g(this.f64089a, container, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void onFinish();
    }

    public /* synthetic */ g(LinkedList linkedList, ViewGroup viewGroup, v vVar) {
        this(linkedList, viewGroup);
    }

    public static final g2 k(g gVar, Boolean bool) {
        gVar.g();
        return g2.f100423a;
    }

    public static final void l(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    @k
    public final ViewGroup c() {
        return this.f64085b;
    }

    @k
    public final View d() {
        View view = this.f64086c;
        if (view != null) {
            return view;
        }
        g0.S("mCurrentView");
        return null;
    }

    @k
    public final LinkedList<c> e() {
        return this.f64084a;
    }

    @k
    public final b f() {
        b bVar = this.f64087d;
        if (bVar != null) {
            return bVar;
        }
        g0.S("onFinishListener");
        return null;
    }

    public final void g() {
        this.f64085b.removeView(d());
        LinkedList<c> linkedList = this.f64084a;
        if ((linkedList == null || linkedList.isEmpty()) && this.f64087d != null) {
            f().onFinish();
        } else {
            j();
        }
    }

    public final void h(@k View view) {
        g0.p(view, "<set-?>");
        this.f64086c = view;
    }

    public final void i(@k b bVar) {
        g0.p(bVar, "<set-?>");
        this.f64087d = bVar;
    }

    public final void j() {
        LinkedList<c> linkedList = this.f64084a;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        g0.n(linkedList, "null cannot be cast to non-null type java.util.LinkedList<com.baicizhan.main.guide.EasyGuideTemplateView>");
        c poll = linkedList.poll();
        if (poll != null) {
            h(poll.f());
            this.f64085b.addView(d());
            dc0.c<Boolean> g11 = poll.g();
            final l lVar = new l() { // from class: jg.e
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 k11;
                    k11 = g.k(g.this, (Boolean) obj);
                    return k11;
                }
            };
            g11.t5(new wb0.b() { // from class: jg.f
                @Override // wb0.b
                public final void call(Object obj) {
                    g.l(l.this, obj);
                }
            });
        }
    }

    public g(LinkedList<c> linkedList, ViewGroup viewGroup) {
        this.f64084a = linkedList;
        this.f64085b = viewGroup;
    }

    public /* synthetic */ g(LinkedList linkedList, ViewGroup viewGroup, int i11, v vVar) {
        this((i11 & 1) != 0 ? new LinkedList() : linkedList, viewGroup);
    }
}
