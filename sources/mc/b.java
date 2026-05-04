package mc;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.fragment.app.DialogFragment;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c0 f73093a = e0.c(a.f73094a);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.a<TypedValue> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f73094a = new a();

        public a() {
            super(0);
        }

        @Override // x00.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TypedValue invoke() {
            return new TypedValue();
        }
    }

    public static final int a(@k Resources.Theme theme, @AttrRes int i11, int i12) {
        g0.p(theme, "<this>");
        return (!theme.resolveAttribute(i11, m(), true) || m().type < 28 || m().type > 31) ? i12 : m().data;
    }

    public static final int b(@k DialogFragment dialogFragment, @AttrRes int i11, int i12) {
        g0.p(dialogFragment, "<this>");
        Resources.Theme theme = dialogFragment.requireDialog().getContext().getTheme();
        g0.o(theme, "requireDialog().context.theme");
        return a(theme, i11, i12);
    }

    public static /* synthetic */ int c(Resources.Theme theme, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return a(theme, i11, i12);
    }

    public static /* synthetic */ int d(DialogFragment dialogFragment, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return b(dialogFragment, i11, i12);
    }

    public static final int e(@k Resources.Theme theme, @AttrRes int i11, int i12) {
        g0.p(theme, "<this>");
        return (theme.resolveAttribute(i11, m(), true) && m().type == 5) ? (int) m().getDimension(theme.getResources().getDisplayMetrics()) : i12;
    }

    public static final int f(@k DialogFragment dialogFragment, @AttrRes int i11, int i12) {
        g0.p(dialogFragment, "<this>");
        Resources.Theme theme = dialogFragment.requireDialog().getContext().getTheme();
        g0.o(theme, "requireDialog().context.theme");
        return e(theme, i11, i12);
    }

    public static /* synthetic */ int g(Resources.Theme theme, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return e(theme, i11, i12);
    }

    public static /* synthetic */ int h(DialogFragment dialogFragment, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return f(dialogFragment, i11, i12);
    }

    public static final int i(@k Resources.Theme theme, @AttrRes int i11, int i12) {
        g0.p(theme, "<this>");
        return (!theme.resolveAttribute(i11, m(), true) || m().type < 16 || m().type > 31) ? i12 : m().data;
    }

    public static final int j(@k DialogFragment dialogFragment, @AttrRes int i11, int i12) {
        g0.p(dialogFragment, "<this>");
        Resources.Theme theme = dialogFragment.requireDialog().getContext().getTheme();
        g0.o(theme, "requireDialog().context.theme");
        return i(theme, i11, i12);
    }

    public static /* synthetic */ int k(Resources.Theme theme, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return i(theme, i11, i12);
    }

    public static /* synthetic */ int l(DialogFragment dialogFragment, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return j(dialogFragment, i11, i12);
    }

    public static final TypedValue m() {
        return (TypedValue) f73093a.getValue();
    }

    @l
    public static final Integer n(@l Bundle bundle, @k String key) {
        g0.p(key, "key");
        if (bundle != null) {
            Integer valueOf = Integer.valueOf(bundle.getInt(key));
            if (valueOf.intValue() != 0) {
                return valueOf;
            }
        }
        return null;
    }

    public static final int o(@k Resources.Theme theme, @AttrRes int i11, int i12) {
        g0.p(theme, "<this>");
        return (theme.resolveAttribute(i11, m(), true) && m().type == 3) ? m().resourceId : i12;
    }

    public static final int p(@k DialogFragment dialogFragment, @AttrRes int i11, int i12) {
        g0.p(dialogFragment, "<this>");
        Resources.Theme theme = dialogFragment.requireDialog().getContext().getTheme();
        g0.o(theme, "requireDialog().context.theme");
        return o(theme, i11, i12);
    }

    public static /* synthetic */ int q(Resources.Theme theme, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return o(theme, i11, i12);
    }

    public static /* synthetic */ int r(DialogFragment dialogFragment, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return p(dialogFragment, i11, i12);
    }

    @l
    public static final Integer s(@k Resources.Theme theme, @AttrRes int i11) {
        g0.p(theme, "<this>");
        Integer valueOf = Integer.valueOf((theme.resolveAttribute(i11, m(), true) && m().type == 1) ? m().data : 0);
        if (valueOf.intValue() != 0) {
            return valueOf;
        }
        return null;
    }

    @l
    public static final Integer t(@k DialogFragment dialogFragment, @AttrRes int i11) {
        g0.p(dialogFragment, "<this>");
        Resources.Theme theme = dialogFragment.requireDialog().getContext().getTheme();
        g0.o(theme, "requireDialog().context.theme");
        return s(theme, i11);
    }

    public static final void u(@k Resources.Theme theme, @AttrRes int i11, @AttrRes int i12, @k x00.l<? super Integer, g2> result) {
        int intValue;
        g0.p(theme, "<this>");
        g0.p(result, "result");
        Integer s11 = s(theme, i11);
        if (s11 == null) {
            Integer s12 = s(theme, i12);
            if (s12 == null) {
                return;
            } else {
                intValue = s12.intValue();
            }
        } else {
            intValue = s11.intValue();
        }
        result.invoke(Integer.valueOf(intValue));
    }

    public static final void v(@k Resources.Theme theme, @AttrRes int i11, @k x00.l<? super Integer, g2> result) {
        g0.p(theme, "<this>");
        g0.p(result, "result");
        Integer s11 = s(theme, i11);
        if (s11 == null) {
            return;
        }
        result.invoke(s11);
    }
}
