package androidx.media3.common;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface AdViewProvider {
    default List<AdOverlayInfo> getAdOverlayInfos() {
        return ImmutableList.of();
    }

    @Nullable
    ViewGroup getAdViewGroup();
}
