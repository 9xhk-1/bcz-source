package qu;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.g0;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final e f82727a = new e();

    @o
    public static final <T> T b(@m80.k Activity activity, @m80.k Class<T> entryPoint) {
        g0.p(activity, "activity");
        g0.p(entryPoint, "entryPoint");
        return (T) pu.c.a(activity, entryPoint);
    }

    @o
    public static final <T> T d(@m80.k Context context, @m80.k Class<T> entryPoint) {
        g0.p(context, "context");
        g0.p(entryPoint, "entryPoint");
        return (T) pu.c.a(tu.a.a(context.getApplicationContext()), entryPoint);
    }

    @o
    public static final <T> T f(@m80.k Fragment fragment, @m80.k Class<T> entryPoint) {
        g0.p(fragment, "fragment");
        g0.p(entryPoint, "entryPoint");
        return (T) pu.c.a(fragment, entryPoint);
    }

    @o
    public static final <T> T h(@m80.k View view, @m80.k Class<T> entryPoint) {
        g0.p(view, "view");
        g0.p(entryPoint, "entryPoint");
        return (T) pu.c.a(view, entryPoint);
    }

    public final /* synthetic */ <T> T a(Activity activity) {
        g0.p(activity, "activity");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) b(activity, Object.class);
    }

    public final /* synthetic */ <T> T c(Context context) {
        g0.p(context, "context");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) d(context, Object.class);
    }

    public final /* synthetic */ <T> T e(Fragment fragment) {
        g0.p(fragment, "fragment");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) f(fragment, Object.class);
    }

    public final /* synthetic */ <T> T g(View view) {
        g0.p(view, "view");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) h(view, Object.class);
    }
}
