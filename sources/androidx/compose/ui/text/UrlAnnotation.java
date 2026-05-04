package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalTextApi
@n(message = "Use LinkAnnotatation.Url(url) instead", replaceWith = @w0(expression = "LinkAnnotation.Url(url)", imports = {}))
/* loaded from: classes2.dex */
public final class UrlAnnotation implements AnnotatedString.Annotation {
    public static final int $stable = 0;

    @k
    private final String url;

    public UrlAnnotation(@k String str) {
        this.url = str;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UrlAnnotation) && g0.g(this.url, ((UrlAnnotation) obj).url);
    }

    @k
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @k
    public String toString() {
        return "UrlAnnotation(url=" + this.url + ')';
    }
}
