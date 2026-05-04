package sa;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.jiongji.andriod.card.R;
import gs.bo;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f88167f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f88168g = 8;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final String f88169h = "PermissionBannerCompat";

    /* renamed from: i, reason: collision with root package name */
    public static final long f88170i = 300;

    /* renamed from: j, reason: collision with root package name */
    public static final long f88171j = 200;

    /* renamed from: k, reason: collision with root package name */
    public static final long f88172k = 3000;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Activity f88173a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f88174b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f88175c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f88176d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f88177e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ bo f88179b;

        public b(bo boVar) {
            this.f88179b = boVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            g0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            g0.p(animation, "animation");
            View decorView = h.this.g().getWindow().getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f88179b.getRoot());
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            g0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            g0.p(animation, "animation");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public h(@m80.k Activity activity) {
        this(activity, false, 2, null);
        g0.p(activity, "activity");
    }

    public static final bo e(h hVar) {
        return (bo) DataBindingUtil.inflate(LayoutInflater.from(hVar.f88173a), R.layout.view_permission_banner, null, false);
    }

    public static /* synthetic */ void l(h hVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        hVar.k(str, str2);
    }

    public static final boolean m(h hVar, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            hVar.f();
        }
        return true;
    }

    public static final void n(h hVar, bo boVar) {
        if (hVar.f88177e) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(boVar.f54318a, "translationY", (-r0.getHeight()) - zb.a.k(hVar.f88173a), 0.0f);
        ofFloat.setDuration(300L);
        ConstraintLayout banner = boVar.f54318a;
        g0.o(banner, "banner");
        q.z(banner, true);
        ofFloat.start();
        hVar.f88176d = true;
    }

    public static final void o(h hVar) {
        hVar.f();
    }

    public final void f() {
        this.f88177e = true;
        if (this.f88176d) {
            bo h11 = h();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(h11.f54318a, "translationY", 0.0f, (-r2.getHeight()) - zb.a.k(this.f88173a));
            ofFloat.setDuration(300L);
            ofFloat.start();
            ofFloat.addListener(new b(h11));
        }
    }

    @m80.k
    public final Activity g() {
        return this.f88173a;
    }

    public final bo h() {
        Object value = this.f88175c.getValue();
        g0.o(value, "getValue(...)");
        return (bo) value;
    }

    @w00.k
    @SuppressLint({"ClickableViewAccessibility"})
    public final void i() {
        l(this, null, null, 3, null);
    }

    @w00.k
    @SuppressLint({"ClickableViewAccessibility"})
    public final void j(@m80.k String permission) {
        g0.p(permission, "permission");
        l(this, permission, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    @w00.k
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(@m80.k java.lang.String r5, @m80.k java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.h.k(java.lang.String, java.lang.String):void");
    }

    @w00.k
    public h(@m80.k Activity activity, boolean z11) {
        g0.p(activity, "activity");
        this.f88173a = activity;
        this.f88174b = z11;
        this.f88175c = e0.c(new x00.a() { // from class: sa.g
            @Override // x00.a
            public final Object invoke() {
                bo e11;
                e11 = h.e(h.this);
                return e11;
            }
        });
    }

    public /* synthetic */ h(Activity activity, boolean z11, int i11, v vVar) {
        this(activity, (i11 & 2) != 0 ? false : z11);
    }
}
