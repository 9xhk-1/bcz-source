package androidx.media3.common;

import android.util.Pair;
import java.lang.Throwable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface ErrorMessageProvider<T extends Throwable> {
    Pair<Integer, String> getErrorMessage(T t11);
}
