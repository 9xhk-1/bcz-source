package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(24)
@kotlin.jvm.internal.u0({"SMAP\nEditorInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/LocaleListHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,195:1\n1549#2:196\n1620#2,3:197\n37#3,2:200\n*S KotlinDebug\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/LocaleListHelper\n*L\n167#1:196\n167#1:197,3\n167#1:200,2\n*E\n"})
/* loaded from: classes.dex */
public final class LocaleListHelper {
    public static final int $stable = 0;

    @m80.k
    public static final LocaleListHelper INSTANCE = new LocaleListHelper();

    private LocaleListHelper() {
    }

    @RequiresApi(24)
    public final void setHintLocales(@m80.k EditorInfo editorInfo, @m80.k LocaleList localeList) {
        if (kotlin.jvm.internal.g0.g(localeList, LocaleList.Companion.getEmpty())) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(a00.i0.d0(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        editorInfo.hintLocales = new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
