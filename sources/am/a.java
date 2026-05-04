package am;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2683a = 1000;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: am.a$a, reason: collision with other inner class name */
    public static final class C0021a extends Lambda implements l<View, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f2684a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f2685b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0021a(long j11, l lVar) {
            super(1);
            this.f2684a = j11;
            this.f2685b = lVar;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(View view) {
            invoke2(view);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@k View v11) {
            g0.q(v11, "v");
            this.f2685b.invoke(v11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.LongRef f2686a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f2687b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f2688c;

        public b(Ref.LongRef longRef, long j11, l lVar) {
            this.f2686a = longRef;
            this.f2687b = j11;
            this.f2688c = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View it) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = this.f2686a.element;
            if (j11 == 0 || j11 + this.f2687b < elapsedRealtime) {
                l lVar = this.f2688c;
                g0.h(it, "it");
                lVar.invoke(it);
                this.f2686a.element = elapsedRealtime;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.LongRef f2689a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f2690b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f2691c;

        public c(Ref.LongRef longRef, long j11, View.OnClickListener onClickListener) {
            this.f2689a = longRef;
            this.f2690b = j11;
            this.f2691c = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = this.f2689a.element;
            if (j11 == 0 || j11 + this.f2690b < elapsedRealtime) {
                this.f2691c.onClick(view);
                this.f2689a.element = elapsedRealtime;
            }
        }
    }

    public static final void a(@k ViewGroup forEach, boolean z11, @k l<? super View, g2> block) {
        g0.q(forEach, "$this$forEach");
        g0.q(block, "block");
        int childCount = forEach.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = forEach.getChildAt(i11);
            g0.h(childAt, "getChildAt(i)");
            block.invoke(childAt);
            if (z11 && (childAt instanceof ViewGroup)) {
                a((ViewGroup) childAt, z11, block);
            }
        }
    }

    @m80.l
    public static final Drawable b(@k ImageView content) {
        g0.q(content, "$this$content");
        return content.getDrawable();
    }

    @m80.l
    public static final CharSequence c(@k TextView content) {
        g0.q(content, "$this$content");
        return content.getText();
    }

    public static final boolean d(@k View visible) {
        g0.q(visible, "$this$visible");
        return visible.getVisibility() == 0;
    }

    public static final void e(@k ImageView content, @m80.l Drawable drawable) {
        g0.q(content, "$this$content");
        content.setImageDrawable(drawable);
        o(content, drawable != null);
    }

    public static final void f(@k TextView content, @m80.l CharSequence charSequence) {
        g0.q(content, "$this$content");
        content.setText(charSequence);
        o(content, !(charSequence == null || charSequence.length() == 0));
    }

    public static final void g(@k View setOnProtectedClickListener, long j11, @k l<? super View, g2> l11) {
        g0.q(setOnProtectedClickListener, "$this$setOnProtectedClickListener");
        g0.q(l11, "l");
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = 0L;
        setOnProtectedClickListener.setOnClickListener(new b(longRef, j11, l11));
    }

    public static final void h(@k View setOnProtectedClickListener, @k View.OnClickListener l11, long j11) {
        g0.q(setOnProtectedClickListener, "$this$setOnProtectedClickListener");
        g0.q(l11, "l");
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = 0L;
        setOnProtectedClickListener.setOnClickListener(new c(longRef, j11, l11));
    }

    public static final void i(@k View[] setOnProtectedClickListener, long j11, @k l<? super View, g2> l11) {
        g0.q(setOnProtectedClickListener, "$this$setOnProtectedClickListener");
        g0.q(l11, "l");
        for (View view : setOnProtectedClickListener) {
            g(view, j11, new C0021a(j11, l11));
        }
    }

    public static final void j(@k View[] setOnProtectedClickListener, @k View.OnClickListener l11, long j11) {
        g0.q(setOnProtectedClickListener, "$this$setOnProtectedClickListener");
        g0.q(l11, "l");
        for (View view : setOnProtectedClickListener) {
            h(view, l11, j11);
        }
    }

    public static /* synthetic */ void k(View view, long j11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 1000;
        }
        g(view, j11, lVar);
    }

    public static /* synthetic */ void l(View view, View.OnClickListener onClickListener, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 1000;
        }
        h(view, onClickListener, j11);
    }

    public static /* synthetic */ void m(View[] viewArr, long j11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 1000;
        }
        i(viewArr, j11, lVar);
    }

    public static /* synthetic */ void n(View[] viewArr, View.OnClickListener onClickListener, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 1000;
        }
        j(viewArr, onClickListener, j11);
    }

    public static final void o(@k View visible, boolean z11) {
        g0.q(visible, "$this$visible");
        visible.setVisibility(z11 ? 0 : 8);
    }
}
