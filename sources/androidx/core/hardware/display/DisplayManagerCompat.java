package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class DisplayManagerCompat {
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private final Context mContext;

    private DisplayManagerCompat(Context context) {
        this.mContext = context;
    }

    @NonNull
    public static DisplayManagerCompat getInstance(@NonNull Context context) {
        return new DisplayManagerCompat(context);
    }

    @Nullable
    public Display getDisplay(int i11) {
        return ((DisplayManager) this.mContext.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL)).getDisplay(i11);
    }

    @NonNull
    public Display[] getDisplays() {
        return ((DisplayManager) this.mContext.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL)).getDisplays();
    }

    @NonNull
    public Display[] getDisplays(@Nullable String str) {
        return ((DisplayManager) this.mContext.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL)).getDisplays();
    }
}
