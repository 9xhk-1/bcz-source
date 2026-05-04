package u0;

import android.content.Context;
import android.view.View;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final m f91459a = new m();

    @w00.o
    @yz.n(level = DeprecationLevel.ERROR, message = "ImageLoaders no longer (and should not) use OkHttp's disk cache. Use 'ImageLoader.Builder.diskCache' to configure a custom disk cache.")
    @m80.k
    public static final okhttp3.b a(@m80.k Context context) {
        l.K();
        throw new KotlinNothingValueException();
    }

    @w00.o
    public static final void b(@m80.k View view) {
        l.t(view).a();
    }

    @m80.l
    @w00.o
    public static final o0.g c(@m80.k View view) {
        return l.t(view).c();
    }
}
