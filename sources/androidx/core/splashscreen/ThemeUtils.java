package androidx.core.splashscreen;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(31)
/* loaded from: classes2.dex */
public final class ThemeUtils {

    @m80.k
    public static final ThemeUtils INSTANCE = new ThemeUtils();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Api31 {

        @m80.k
        public static final Api31 INSTANCE = new Api31();

        private Api31() {
        }

        @w00.k
        @w00.o
        @DoNotInline
        public static final void applyThemesSystemBarAppearance(@m80.k Resources.Theme theme, @m80.k View decor) {
            g0.p(theme, "theme");
            g0.p(decor, "decor");
            applyThemesSystemBarAppearance$default(theme, decor, null, 4, null);
        }

        public static /* synthetic */ void applyThemesSystemBarAppearance$default(Resources.Theme theme, View view, TypedValue typedValue, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                typedValue = new TypedValue();
            }
            applyThemesSystemBarAppearance(theme, view, typedValue);
        }

        @w00.k
        @w00.o
        @DoNotInline
        public static final void applyThemesSystemBarAppearance(@m80.k Resources.Theme theme, @m80.k View decor, @m80.k TypedValue tv2) {
            WindowInsetsController windowInsetsController;
            g0.p(theme, "theme");
            g0.p(decor, "decor");
            g0.p(tv2, "tv");
            int i11 = (!theme.resolveAttribute(android.R.attr.windowLightStatusBar, tv2, true) || tv2.data == 0) ? 0 : 8;
            if (theme.resolveAttribute(android.R.attr.windowLightNavigationBar, tv2, true) && tv2.data != 0) {
                i11 |= 16;
            }
            windowInsetsController = decor.getWindowInsetsController();
            g0.m(windowInsetsController);
            windowInsetsController.setSystemBarsAppearance(i11, 24);
        }
    }

    private ThemeUtils() {
    }
}
