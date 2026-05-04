package androidx.compose.foundation.content;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class PlatformTransferableContent {
    public static final int $stable = 8;

    @k
    private final Bundle extras;

    @l
    private final Uri linkUri;

    public PlatformTransferableContent(@l Uri uri, @k Bundle bundle) {
        this.linkUri = uri;
        this.extras = bundle;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTransferableContent)) {
            return false;
        }
        PlatformTransferableContent platformTransferableContent = (PlatformTransferableContent) obj;
        return g0.g(this.linkUri, platformTransferableContent.linkUri) && g0.g(this.extras, platformTransferableContent.extras);
    }

    @k
    public final Bundle getExtras() {
        return this.extras;
    }

    @l
    public final Uri getLinkUri() {
        return this.linkUri;
    }

    public int hashCode() {
        Uri uri = this.linkUri;
        return ((uri != null ? uri.hashCode() : 0) * 31) + this.extras.hashCode();
    }

    @k
    public String toString() {
        return "PlatformTransferableContent(linkUri=" + this.linkUri + ", extras=" + this.extras + ')';
    }
}
