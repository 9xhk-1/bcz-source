package uk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f92269a = true;

    public static Drawable a(Context context, @DrawableRes int i11, @Nullable Resources.Theme theme) {
        return c(context, context, i11, theme);
    }

    public static Drawable b(Context context, Context context2, @DrawableRes int i11) {
        return c(context, context2, i11, null);
    }

    public static Drawable c(Context context, Context context2, @DrawableRes int i11, @Nullable Resources.Theme theme) {
        try {
            if (f92269a) {
                return e(context2, i11, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e11) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e11;
            }
            return ContextCompat.getDrawable(context2, i11);
        } catch (NoClassDefFoundError unused2) {
            f92269a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i11, theme);
    }

    public static Drawable d(Context context, @DrawableRes int i11, @Nullable Resources.Theme theme) {
        return ResourcesCompat.getDrawable(context.getResources(), i11, theme);
    }

    public static Drawable e(Context context, @DrawableRes int i11, @Nullable Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i11);
    }
}
