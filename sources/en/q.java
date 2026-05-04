package en;

import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f50024c = {R.attr.colorError, R.attr.colorOnError, R.attr.colorErrorContainer, R.attr.colorOnErrorContainer};

    /* renamed from: a, reason: collision with root package name */
    public final int[] f50025a;

    /* renamed from: b, reason: collision with root package name */
    @StyleRes
    public final int f50026b;

    public q(@AttrRes @NonNull int[] iArr, @StyleRes int i11) {
        if (i11 != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.f50025a = iArr;
        this.f50026b = i11;
    }

    @NonNull
    public static q a(@AttrRes @NonNull int[] iArr) {
        return new q(iArr, 0);
    }

    @NonNull
    public static q b(@AttrRes @NonNull int[] iArr, @StyleRes int i11) {
        return new q(iArr, i11);
    }

    @NonNull
    public static q c() {
        return b(f50024c, R.style.ThemeOverlay_Material3_HarmonizedColors);
    }

    @NonNull
    public int[] d() {
        return this.f50025a;
    }

    @StyleRes
    public int e() {
        return this.f50026b;
    }
}
