package be;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface k {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static int a(@m80.k k kVar) {
            return k.super.p();
        }

        @Deprecated
        public static int b(@m80.k k kVar) {
            return k.super.D();
        }

        @Deprecated
        @m80.k
        public static Pair<Integer, Integer> c(@m80.k k kVar) {
            return k.super.I();
        }

        @Deprecated
        public static int d(@m80.k k kVar) {
            return k.super.E();
        }

        @Deprecated
        public static boolean e(@m80.k k kVar) {
            return k.super.i();
        }

        @m80.l
        @Deprecated
        public static View f(@m80.k k kVar) {
            return k.super.getTarget();
        }

        @m80.l
        @Deprecated
        public static x00.a<View> g(@m80.k k kVar) {
            return k.super.f();
        }

        @Deprecated
        public static boolean h(@m80.k k kVar) {
            return k.super.v();
        }

        @Deprecated
        public static int i(@m80.k k kVar) {
            return k.super.getWeight();
        }

        @CallSuper
        @Deprecated
        public static void j(@m80.k k kVar, @m80.k ViewGroup parent, @m80.k View guideView, @m80.l View view, @m80.l Rect rect, @m80.k x00.a<g2> onDismiss) {
            g0.p(parent, "parent");
            g0.p(guideView, "guideView");
            g0.p(onDismiss, "onDismiss");
            k.super.B(parent, guideView, view, rect, onDismiss);
        }
    }

    static void C(x00.a aVar, k kVar, View view) {
        aVar.invoke();
        kVar.b();
    }

    @m80.k
    Triple<Integer, Integer, Integer> A();

    @CallSuper
    default void B(@m80.k ViewGroup parent, @m80.k View guideView, @m80.l View view, @m80.l Rect rect, @m80.k final x00.a<g2> onDismiss) {
        g0.p(parent, "parent");
        g0.p(guideView, "guideView");
        g0.p(onDismiss, "onDismiss");
        guideView.setOnClickListener(new View.OnClickListener() { // from class: be.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                k.C(x00.a.this, this, view2);
            }
        });
    }

    default int D() {
        return 0;
    }

    default int E() {
        return xb.f.a(getContext(), 6.0f);
    }

    @m80.k
    default Pair<Integer, Integer> I() {
        return new Pair<>(0, 0);
    }

    boolean a();

    void b();

    @m80.l
    default x00.a<View> f() {
        return null;
    }

    @m80.k
    Context getContext();

    @m80.l
    default View getTarget() {
        return null;
    }

    default int getWeight() {
        return 0;
    }

    default boolean i() {
        return true;
    }

    default int p() {
        return -1728053248;
    }

    boolean r(@m80.k Rect rect);

    default boolean v() {
        return false;
    }
}
