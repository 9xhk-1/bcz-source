package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class VoiceSpan {
    private static final String FIELD_NAME = Util.intToStringMaxRadix(0);
    public final String name;

    public VoiceSpan(String str) {
        this.name = str;
    }

    public static VoiceSpan fromBundle(Bundle bundle) {
        return new VoiceSpan((String) Assertions.checkNotNull(bundle.getString(FIELD_NAME)));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(FIELD_NAME, this.name);
        return bundle;
    }
}
