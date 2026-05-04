package androidx.startup;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class StartupException extends RuntimeException {
    public StartupException(@NonNull String str) {
        super(str);
    }

    public StartupException(@NonNull Throwable th2) {
        super(th2);
    }

    public StartupException(@NonNull String str, @NonNull Throwable th2) {
        super(str, th2);
    }
}
