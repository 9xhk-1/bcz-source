package androidx.compose.ui.res;

import androidx.annotation.ArrayRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import java.util.Arrays;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class StringResources_androidKt {
    @Composable
    @ReadOnlyComposable
    @k
    public static final String pluralStringResource(@PluralsRes int i11, int i12, @l Composer composer, int i13) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1784741530, i13, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String quantityString = Resources_androidKt.resources(composer, 0).getQuantityString(i11, i12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return quantityString;
    }

    @Composable
    @ReadOnlyComposable
    @k
    public static final String[] stringArrayResource(@ArrayRes int i11, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1562162650, i12, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:59)");
        }
        String[] stringArray = Resources_androidKt.resources(composer, 0).getStringArray(i11);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stringArray;
    }

    @Composable
    @ReadOnlyComposable
    @k
    public static final String stringResource(@StringRes int i11, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1223887937, i12, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i11);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    @Composable
    @ReadOnlyComposable
    @k
    public static final String pluralStringResource(@PluralsRes int i11, int i12, @k Object[] objArr, @l Composer composer, int i13) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(523207213, i13, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = Resources_androidKt.resources(composer, 0).getQuantityString(i11, i12, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return quantityString;
    }

    @Composable
    @ReadOnlyComposable
    @k
    public static final String stringResource(@StringRes int i11, @k Object[] objArr, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2071230100, i12, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i11, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }
}
