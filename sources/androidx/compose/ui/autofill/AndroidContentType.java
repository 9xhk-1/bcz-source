package androidx.compose.ui.autofill;

import a00.x1;
import java.util.Set;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AndroidContentType implements ContentType {

    @m80.k
    private final Set<String> androidAutofillHints;

    public AndroidContentType(@m80.k Set<String> set) {
        this.androidAutofillHints = set;
    }

    @m80.k
    public final Set<String> getAndroidAutofillHints() {
        return this.androidAutofillHints;
    }

    @Override // androidx.compose.ui.autofill.ContentType
    @m80.k
    public ContentType plus(@m80.k ContentType contentType) {
        g0.n(contentType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return new AndroidContentType(x1.C(this.androidAutofillHints, ((AndroidContentType) contentType).androidAutofillHints));
    }
}
