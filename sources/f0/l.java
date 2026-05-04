package f0;

import a00.w1;
import coil.decode.ExifOrientationPolicy;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Set<String> f50297a = w1.u("image/jpeg", "image/webp", "image/heic", "image/heif");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50298a;

        static {
            int[] iArr = new int[ExifOrientationPolicy.values().length];
            try {
                iArr[ExifOrientationPolicy.RESPECT_PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExifOrientationPolicy.IGNORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExifOrientationPolicy.RESPECT_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f50298a = iArr;
        }
    }

    public static final boolean a(@m80.k i iVar) {
        return iVar.a() > 0;
    }

    public static final boolean b(@m80.k i iVar) {
        return iVar.a() == 90 || iVar.a() == 270;
    }

    public static final boolean c(@m80.k ExifOrientationPolicy exifOrientationPolicy, @m80.l String str) {
        int i11 = a.f50298a[exifOrientationPolicy.ordinal()];
        if (i11 == 1) {
            return str != null && f50297a.contains(str);
        }
        if (i11 == 2) {
            return false;
        }
        if (i11 == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
