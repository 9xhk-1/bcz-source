package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidUriHandler implements UriHandler {
    public static final int $stable = 8;

    @m80.k
    private final Context context;

    public AndroidUriHandler(@m80.k Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.platform.UriHandler
    public void openUri(@m80.k String str) {
        try {
            this.context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)));
        } catch (ActivityNotFoundException e11) {
            throw new IllegalArgumentException("Can't open " + str + '.', e11);
        }
    }
}
