package androidx.camera.video;

import android.net.Uri;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_OutputResults extends OutputResults {
    private final Uri outputUri;

    public AutoValue_OutputResults(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.outputUri = uri;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputResults) {
            return this.outputUri.equals(((OutputResults) obj).getOutputUri());
        }
        return false;
    }

    @Override // androidx.camera.video.OutputResults
    @NonNull
    public Uri getOutputUri() {
        return this.outputUri;
    }

    public int hashCode() {
        return this.outputUri.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.outputUri + com.alipay.sdk.m.u.i.f11099d;
    }
}
