package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class Label {
    private static final String FIELD_LANGUAGE_INDEX = Util.intToStringMaxRadix(0);
    private static final String FIELD_VALUE_INDEX = Util.intToStringMaxRadix(1);

    @Nullable
    public final String language;
    public final String value;

    public Label(@Nullable String str, String str2) {
        this.language = Util.normalizeLanguageCode(str);
        this.value = str2;
    }

    public static Label fromBundle(Bundle bundle) {
        return new Label(bundle.getString(FIELD_LANGUAGE_INDEX), (String) Assertions.checkNotNull(bundle.getString(FIELD_VALUE_INDEX)));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Label label = (Label) obj;
            if (Objects.equals(this.language, label.language) && Objects.equals(this.value, label.value)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        String str = this.language;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        String str = this.language;
        if (str != null) {
            bundle.putString(FIELD_LANGUAGE_INDEX, str);
        }
        bundle.putString(FIELD_VALUE_INDEX, this.value);
        return bundle;
    }
}
