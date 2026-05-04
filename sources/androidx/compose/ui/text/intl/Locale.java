package androidx.compose.ui.text.intl;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class Locale {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private final java.util.Locale platformLocale;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Locale getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0);
        }

        private Companion() {
        }
    }

    public Locale(@k java.util.Locale locale) {
        this.platformLocale = locale;
    }

    public boolean equals(@l Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return g0.g(toLanguageTag(), ((Locale) obj).toLanguageTag());
    }

    @k
    public final String getLanguage() {
        return this.platformLocale.getLanguage();
    }

    @k
    public final java.util.Locale getPlatformLocale() {
        return this.platformLocale;
    }

    @k
    public final String getRegion() {
        return PlatformLocale_jvmKt.getRegion(this.platformLocale);
    }

    @k
    public final String getScript() {
        return this.platformLocale.getScript();
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    @k
    public final String toLanguageTag() {
        return PlatformLocale_jvmKt.getLanguageTag(this.platformLocale);
    }

    @k
    public String toString() {
        return toLanguageTag();
    }

    public Locale(@k String str) {
        this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(str));
    }
}
