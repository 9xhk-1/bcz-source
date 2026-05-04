package androidx.compose.foundation.content;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class MediaType {
    public static final int $stable = 0;

    @k
    private final String representation;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final MediaType Text = new MediaType("text/*");

    @k
    private static final MediaType PlainText = new MediaType("text/plain");

    @k
    private static final MediaType HtmlText = new MediaType("text/html");

    @k
    private static final MediaType Image = new MediaType("image/*");

    @k
    private static final MediaType All = new MediaType("*/*");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final MediaType getAll() {
            return MediaType.All;
        }

        @k
        public final MediaType getHtmlText() {
            return MediaType.HtmlText;
        }

        @k
        public final MediaType getImage() {
            return MediaType.Image;
        }

        @k
        public final MediaType getPlainText() {
            return MediaType.PlainText;
        }

        @k
        public final MediaType getText() {
            return MediaType.Text;
        }

        private Companion() {
        }
    }

    public MediaType(@k String str) {
        this.representation = str;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaType) {
            return g0.g(this.representation, ((MediaType) obj).representation);
        }
        return false;
    }

    @k
    public final String getRepresentation() {
        return this.representation;
    }

    public int hashCode() {
        return this.representation.hashCode();
    }

    @k
    public String toString() {
        return "MediaType(representation='" + this.representation + "')";
    }
}
