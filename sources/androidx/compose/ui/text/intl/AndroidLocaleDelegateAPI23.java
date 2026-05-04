package androidx.compose.ui.text.intl;

import a00.g0;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AndroidLocaleDelegateAPI23 implements PlatformLocaleDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @k
    public LocaleList getCurrent() {
        return new LocaleList((List<Locale>) g0.l(new Locale(java.util.Locale.getDefault())));
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @k
    public java.util.Locale parseLanguageTag(@k String str) {
        String str2;
        java.util.Locale forLanguageTag = java.util.Locale.forLanguageTag(str);
        if (kotlin.jvm.internal.g0.g(forLanguageTag.toLanguageTag(), C.LANGUAGE_UNDETERMINED)) {
            str2 = AndroidLocaleDelegate_androidKt.TAG;
            Log.e(str2, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }
}
