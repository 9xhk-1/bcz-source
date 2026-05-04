package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class LinkAnnotation implements AnnotatedString.Annotation {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class Clickable extends LinkAnnotation {
        public static final int $stable = 8;

        @l
        private final LinkInteractionListener linkInteractionListener;

        @l
        private final TextLinkStyles styles;

        @k
        private final String tag;

        public /* synthetic */ Clickable(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i11, v vVar) {
            this(str, (i11 & 2) != 0 ? null : textLinkStyles, linkInteractionListener);
        }

        public static /* synthetic */ Clickable copy$default(Clickable clickable, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = clickable.tag;
            }
            if ((i11 & 2) != 0) {
                textLinkStyles = clickable.getStyles();
            }
            if ((i11 & 4) != 0) {
                linkInteractionListener = clickable.getLinkInteractionListener();
            }
            return clickable.copy(str, textLinkStyles, linkInteractionListener);
        }

        @k
        public final Clickable copy(@k String str, @l TextLinkStyles textLinkStyles, @l LinkInteractionListener linkInteractionListener) {
            return new Clickable(str, textLinkStyles, linkInteractionListener);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Clickable)) {
                return false;
            }
            Clickable clickable = (Clickable) obj;
            return g0.g(this.tag, clickable.tag) && g0.g(getStyles(), clickable.getStyles()) && g0.g(getLinkInteractionListener(), clickable.getLinkInteractionListener());
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        @l
        public LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        @l
        public TextLinkStyles getStyles() {
            return this.styles;
        }

        @k
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int hashCode = this.tag.hashCode() * 31;
            TextLinkStyles styles = getStyles();
            int hashCode2 = (hashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = getLinkInteractionListener();
            return hashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        @k
        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.tag + ')';
        }

        public Clickable(@k String str, @l TextLinkStyles textLinkStyles, @l LinkInteractionListener linkInteractionListener) {
            super(null);
            this.tag = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class Url extends LinkAnnotation {
        public static final int $stable = 8;

        @l
        private final LinkInteractionListener linkInteractionListener;

        @l
        private final TextLinkStyles styles;

        @k
        private final String url;

        public /* synthetic */ Url(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i11, v vVar) {
            this(str, (i11 & 2) != 0 ? null : textLinkStyles, (i11 & 4) != 0 ? null : linkInteractionListener);
        }

        public static /* synthetic */ Url copy$default(Url url, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = url.url;
            }
            if ((i11 & 2) != 0) {
                textLinkStyles = url.getStyles();
            }
            if ((i11 & 4) != 0) {
                linkInteractionListener = url.getLinkInteractionListener();
            }
            return url.copy(str, textLinkStyles, linkInteractionListener);
        }

        @k
        public final Url copy(@k String str, @l TextLinkStyles textLinkStyles, @l LinkInteractionListener linkInteractionListener) {
            return new Url(str, textLinkStyles, linkInteractionListener);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return g0.g(this.url, url.url) && g0.g(getStyles(), url.getStyles()) && g0.g(getLinkInteractionListener(), url.getLinkInteractionListener());
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        @l
        public LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        @l
        public TextLinkStyles getStyles() {
            return this.styles;
        }

        @k
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            TextLinkStyles styles = getStyles();
            int hashCode2 = (hashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = getLinkInteractionListener();
            return hashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        @k
        public String toString() {
            return "LinkAnnotation.Url(url=" + this.url + ')';
        }

        public Url(@k String str, @l TextLinkStyles textLinkStyles, @l LinkInteractionListener linkInteractionListener) {
            super(null);
            this.url = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }
    }

    public /* synthetic */ LinkAnnotation(v vVar) {
        this();
    }

    @l
    public abstract LinkInteractionListener getLinkInteractionListener();

    @l
    public abstract TextLinkStyles getStyles();

    private LinkAnnotation() {
    }
}
