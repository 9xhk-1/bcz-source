package be;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface m extends k {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static boolean a(@m80.k m mVar) {
            return m.super.a();
        }

        @Deprecated
        public static int b(@m80.k m mVar) {
            return m.super.p();
        }

        @Deprecated
        public static int c(@m80.k m mVar) {
            return m.super.D();
        }

        @Deprecated
        @m80.k
        public static Pair<Integer, Integer> d(@m80.k m mVar) {
            return m.super.I();
        }

        @Deprecated
        public static int e(@m80.k m mVar) {
            return m.super.E();
        }

        @Deprecated
        public static boolean f(@m80.k m mVar) {
            return m.super.i();
        }

        @m80.l
        @Deprecated
        public static View g(@m80.k m mVar) {
            return m.super.getTarget();
        }

        @m80.l
        @Deprecated
        public static x00.a<View> h(@m80.k m mVar) {
            return m.super.f();
        }

        @Deprecated
        public static boolean i(@m80.k m mVar) {
            return m.super.v();
        }

        @Deprecated
        public static int j(@m80.k m mVar) {
            return m.super.getWeight();
        }

        @Deprecated
        public static void k(@m80.k m mVar) {
            m.super.b();
        }

        @CallSuper
        @Deprecated
        public static void l(@m80.k m mVar, @m80.k ViewGroup parent, @m80.k View guideView, @m80.l View view, @m80.l Rect rect, @m80.k x00.a<g2> onDismiss) {
            g0.p(parent, "parent");
            g0.p(guideView, "guideView");
            g0.p(onDismiss, "onDismiss");
            m.super.B(parent, guideView, view, rect, onDismiss);
        }
    }

    @Override // be.k
    default boolean a() {
        return getKey().length() > 0 && i9.f.c(getContext(), getKey());
    }

    @Override // be.k
    default void b() {
        i9.f.j(getContext(), getKey(), true);
    }

    @m80.k
    String getKey();
}
