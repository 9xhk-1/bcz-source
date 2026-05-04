package kc;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.AttrRes;
import androidx.core.content.res.ResourcesCompat;
import com.baicizhan.framework.common.magicdialog.Location;
import com.baicizhan.framework.common.magicdialog.R;
import com.baicizhan.framework.common.magicdialog.State;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class g extends h {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f66381h;

    /* renamed from: i, reason: collision with root package name */
    @AttrRes
    public final int f66382i;

    /* renamed from: j, reason: collision with root package name */
    public final int f66383j = v.a(Location.CENTER, State.WRAP);

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final c0 f66384k = e0.c(new b());

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final c0 f66385l = e0.c(new c());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66386a;

        static {
            int[] iArr = new int[State.values().length];
            iArr[State.WRAP.ordinal()] = 1;
            iArr[State.EXPANDED.ordinal()] = 2;
            f66386a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.a<Drawable> {
        public b() {
            super(0);
        }

        @Override // x00.a
        @m80.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Drawable invoke() {
            return ResourcesCompat.getDrawable(g.this.getResources(), R.drawable.bg_magic_round_all, g.this.requireDialog().getContext().getTheme());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.a<Drawable> {
        public c() {
            super(0);
        }

        @Override // x00.a
        @m80.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Drawable invoke() {
            return ResourcesCompat.getDrawable(g.this.getResources(), R.drawable.bg_magic_round_top, g.this.requireDialog().getContext().getTheme());
        }
    }

    private final Drawable E() {
        return (Drawable) this.f66384k.getValue();
    }

    public final int C() {
        Point I = I();
        int f11 = mc.b.f(this, R.attr.magicMaxWidth, 0);
        if (f11 <= 0 || f11 >= I.x) {
            return -1;
        }
        return f11;
    }

    public int D() {
        return this.f66382i;
    }

    public final Drawable F() {
        return (Drawable) this.f66385l.getValue();
    }

    public int G() {
        return this.f66383j;
    }

    public boolean H() {
        return this.f66381h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r1 = r1.getDisplay();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Point I() {
        /*
            r3 = this;
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L1d
            android.content.Context r1 = r3.getContext()
            if (r1 != 0) goto L12
            goto L38
        L12:
            android.view.Display r1 = kc.f.a(r1)
            if (r1 != 0) goto L19
            goto L38
        L19:
            r1.getRealSize(r0)
            return r0
        L1d:
            android.app.Dialog r1 = r3.getDialog()
            if (r1 != 0) goto L24
            goto L38
        L24:
            android.view.Window r1 = r1.getWindow()
            if (r1 != 0) goto L2b
            goto L38
        L2b:
            android.view.WindowManager r1 = r1.getWindowManager()
            if (r1 != 0) goto L32
            goto L38
        L32:
            android.view.Display r1 = r1.getDefaultDisplay()
            if (r1 != 0) goto L39
        L38:
            return r0
        L39:
            r1.getRealSize(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.g.I():android.graphics.Point");
    }

    @m80.l
    public Integer J(@m80.k Context context) {
        g0.p(context, "context");
        Integer valueOf = Integer.valueOf(D());
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        Resources.Theme theme = context.getTheme();
        if (theme == null) {
            return null;
        }
        return mc.b.s(theme, intValue);
    }

    @Override // kc.h, androidx.fragment.app.DialogFragment
    @m80.k
    public Dialog onCreateDialog(@m80.l Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Resources.Theme theme = onCreateDialog.getContext().getTheme();
        Context context = onCreateDialog.getContext();
        g0.o(context, "context");
        Integer J = J(context);
        if (J == null) {
            return onCreateDialog;
        }
        theme.applyStyle(J.intValue(), true);
        return onCreateDialog;
    }

    @Override // kc.h, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Drawable E;
        super.onStart();
        Dialog dialog = getDialog();
        Window window = dialog == null ? null : dialog.getWindow();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        Location c11 = v.c(G());
        State d11 = v.d(G());
        Location location = Location.BOTTOM;
        attributes.gravity = c11 == location ? 80 : 17;
        int i11 = -2;
        attributes.height = -2;
        int i12 = a.f66386a[d11.ordinal()];
        if (i12 == 1) {
            int f11 = mc.b.f(this, R.attr.magicMinWidth, 0);
            if (f11 > 0 && H()) {
                i11 = f11;
            }
            attributes.width = i11;
            E = E();
        } else if (i12 != 2) {
            attributes.width = C();
            E = c11 == location ? F() : E();
        } else {
            attributes.width = C();
            int h11 = mc.b.h(this, R.attr.magicBackgroundMargin, 0, 2, null);
            int h12 = mc.b.h(this, R.attr.magicBackgroundMarginBottom, 0, 2, null);
            E = (!(h11 == 0 && h12 == 0) && attributes.width <= 0) ? new InsetDrawable(E(), h11, 0, h11, h12) : E();
        }
        window.setAttributes(attributes);
        window.setBackgroundDrawable(E);
    }
}
