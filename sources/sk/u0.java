package sk;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.huawei.hms.android.SystemUtils;
import com.tencent.ijk.media.player.IjkMediaMeta;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes6.dex */
public final class u0 implements ik.f<ParcelFileDescriptor, Bitmap> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f88802b = 536870912;

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.a f88803a;

    public u0(com.bumptech.glide.load.resource.bitmap.a aVar) {
        this.f88803a = aVar;
    }

    @Override // ik.f
    @Nullable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kk.u<Bitmap> a(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i11, int i12, @NonNull ik.e eVar) throws IOException {
        return this.f88803a.d(parcelFileDescriptor, i11, i12, eVar);
    }

    @Override // ik.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull ik.e eVar) {
        return e(parcelFileDescriptor) && this.f88803a.r(parcelFileDescriptor);
    }

    public final boolean e(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !(SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str) || SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= IjkMediaMeta.AV_CH_STEREO_LEFT;
    }
}
