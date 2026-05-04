package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.util.Predicate;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class UriMatcherCompat {
    private UriMatcherCompat() {
    }

    public static /* synthetic */ boolean a(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }

    @NonNull
    public static Predicate<Uri> asPredicate(@NonNull final UriMatcher uriMatcher) {
        return new Predicate() { // from class: androidx.core.content.w
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return UriMatcherCompat.a(uriMatcher, (Uri) obj);
            }
        };
    }
}
