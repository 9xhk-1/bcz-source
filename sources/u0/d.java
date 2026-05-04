package u0;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.XmlRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-Contexts")
@u0({"SMAP\nContexts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Contexts.kt\ncoil/util/-Contexts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,83:1\n1#2:84\n31#3:85\n*S KotlinDebug\n*F\n+ 1 Contexts.kt\ncoil/util/-Contexts\n*L\n78#1:85\n*E\n"})
/* loaded from: classes3.dex */
public final class d {
    @m80.k
    public static final Drawable a(@m80.k Context context, @DrawableRes int i11) {
        Drawable drawable = AppCompatResources.getDrawable(context, i11);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i11).toString());
    }

    @m80.k
    public static final Drawable b(@m80.k Resources resources, @DrawableRes int i11, @m80.l Resources.Theme theme) {
        Drawable drawable = ResourcesCompat.getDrawable(resources, i11, theme);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i11).toString());
    }

    @m80.l
    public static final Lifecycle c(@m80.l Context context) {
        Object obj = context;
        while (!(obj instanceof LifecycleOwner)) {
            if (!(obj instanceof ContextWrapper)) {
                return null;
            }
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return ((LifecycleOwner) obj).getLifecycle();
    }

    @m80.k
    public static final Drawable d(@m80.k Context context, @m80.k Resources resources, @XmlRes @DrawableRes int i11) {
        XmlResourceParser xml = resources.getXml(i11);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return b(resources, i11, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean e(@m80.k Context context, @m80.k String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public static final /* synthetic */ <T> T f(Context context) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t11 = (T) ContextCompat.getSystemService(context, Object.class);
        g0.m(t11);
        return t11;
    }
}
