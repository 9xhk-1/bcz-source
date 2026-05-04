package u0;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import coil.request.ImageRequest;
import coil.size.Precision;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-Requests")
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final o0.b f91442a = new o0.b(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91443a;

        static {
            int[] iArr = new int[Precision.values().length];
            try {
                iArr[Precision.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Precision.INEXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Precision.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f91443a = iArr;
        }
    }

    public static final boolean a(@m80.k ImageRequest imageRequest) {
        int i11 = a.f91443a[imageRequest.H().ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return true;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (imageRequest.q().o() == null && (imageRequest.K() instanceof q0.d)) {
            return true;
        }
        return (imageRequest.M() instanceof r0.d) && (imageRequest.K() instanceof q0.j) && (((r0.d) imageRequest.M()).getView() instanceof ImageView) && ((r0.d) imageRequest.M()).getView() == ((q0.j) imageRequest.K()).getView();
    }

    @m80.k
    public static final o0.b b() {
        return f91442a;
    }

    @m80.l
    public static final Drawable c(@m80.k ImageRequest imageRequest, @m80.l Drawable drawable, @m80.l @DrawableRes Integer num, @m80.l Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return d.a(imageRequest.l(), num.intValue());
    }
}
