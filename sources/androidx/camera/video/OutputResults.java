package androidx.camera.video;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class OutputResults {
    @NonNull
    public static OutputResults of(@NonNull Uri uri) {
        Preconditions.checkNotNull(uri, "OutputUri cannot be null.");
        return new AutoValue_OutputResults(uri);
    }

    @NonNull
    public abstract Uri getOutputUri();
}
