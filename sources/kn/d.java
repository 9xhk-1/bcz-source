package kn;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f66877a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f66878b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f66879c = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class a {
        @DoNotInline
        public static void a(@NonNull Outline outline, @NonNull Path path) {
            outline.setConvexPath(path);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(30)
    public static class b {
        @DoNotInline
        public static void a(@NonNull Outline outline, @NonNull Path path) {
            outline.setPath(path);
        }
    }

    @Nullable
    public static Drawable a(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        return b(drawable, drawable2, -1, -1);
    }

    @Nullable
    public static Drawable b(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Px int i11, @Px int i12) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i11 == -1) {
            i11 = i(drawable, drawable2);
        }
        if (i12 == -1) {
            i12 = h(drawable, drawable2);
        }
        if (i11 > drawable.getIntrinsicWidth() || i12 > drawable.getIntrinsicHeight()) {
            float f11 = i11 / i12;
            if (f11 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i12 = (int) (intrinsicWidth / f11);
                i11 = intrinsicWidth;
            } else {
                i12 = drawable.getIntrinsicHeight();
                i11 = (int) (f11 * i12);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i11, i12);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    @Nullable
    public static Drawable c(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        return e(drawable, colorStateList, mode, false);
    }

    @Nullable
    public static Drawable d(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        return e(drawable, colorStateList, mode, false);
    }

    @Nullable
    public static Drawable e(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, boolean z11) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (z11) {
                drawable.mutate();
            }
            return drawable;
        }
        Drawable mutate = DrawableCompat.wrap(drawable).mutate();
        if (mode != null) {
            DrawableCompat.setTintMode(mutate, mode);
        }
        return mutate;
    }

    @NonNull
    public static int[] f(@NonNull int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 == 16842912) {
                return iArr;
            }
            if (i12 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i11] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    @Nullable
    public static ColorStateList g(@Nullable Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !kn.a.a(drawable)) {
            return null;
        }
        colorStateList = kn.b.a(drawable).getColorStateList();
        return colorStateList;
    }

    public static int h(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    public static int i(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    @NonNull
    public static int[] j(@NonNull int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 != 16842912) {
                iArr2[i11] = i12;
                i11++;
            }
        }
        return iArr2;
    }

    @NonNull
    public static AttributeSet k(@NonNull Context context, @XmlRes int i11, @NonNull CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i11);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException e11) {
            e = e11;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i11));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e12) {
            e = e12;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i11));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    public static void l(@NonNull Outline outline, @NonNull Path path) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            b.a(outline, path);
            return;
        }
        if (i11 >= 29) {
            try {
                a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.a(outline, path);
        }
    }

    @TargetApi(21)
    public static void m(@Nullable RippleDrawable rippleDrawable, int i11) {
        rippleDrawable.setRadius(i11);
    }

    public static void n(@NonNull Drawable drawable, @ColorInt int i11) {
        if (i11 != 0) {
            DrawableCompat.setTint(drawable, i11);
        } else {
            DrawableCompat.setTintList(drawable, null);
        }
    }

    @Nullable
    public static PorterDuffColorFilter o(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
