package androidx.compose.ui.text.intl;

import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.SynchronizedObject;
import androidx.media3.common.C;
import java.util.ArrayList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@RequiresApi(api = 24)
@u0({"SMAP\nAndroidLocaleDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidLocaleDelegate.android.kt\nandroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n28#2:88\n1#3:89\n*S KotlinDebug\n*F\n+ 1 AndroidLocaleDelegate.android.kt\nandroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24\n*L\n52#1:88\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {
    public static final int $stable = 8;

    @l
    private LocaleList lastLocaleList;

    @l
    private android.os.LocaleList lastPlatformLocaleList;

    @k
    private final SynchronizedObject lock = new SynchronizedObject();

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @k
    public LocaleList getCurrent() {
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        synchronized (this.lock) {
            LocaleList localeList2 = this.lastLocaleList;
            if (localeList2 != null && localeList == this.lastPlatformLocaleList) {
                return localeList2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(new Locale(localeList.get(i11)));
            }
            LocaleList localeList3 = new LocaleList(arrayList);
            this.lastPlatformLocaleList = localeList;
            this.lastLocaleList = localeList3;
            return localeList3;
        }
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @k
    public java.util.Locale parseLanguageTag(@k String str) {
        String str2;
        java.util.Locale forLanguageTag = java.util.Locale.forLanguageTag(str);
        if (g0.g(forLanguageTag.toLanguageTag(), C.LANGUAGE_UNDETERMINED)) {
            str2 = AndroidLocaleDelegate_androidKt.TAG;
            Log.e(str2, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }
}
