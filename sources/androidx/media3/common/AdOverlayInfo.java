package androidx.media3.common;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class AdOverlayInfo {
    public static final int PURPOSE_CLOSE_AD = 2;
    public static final int PURPOSE_CONTROLS = 1;
    public static final int PURPOSE_NOT_VISIBLE = 4;
    public static final int PURPOSE_OTHER = 3;
    public final int purpose;

    @Nullable
    public final String reasonDetail;
    public final View view;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {

        @Nullable
        private String detailedReason;
        private final int purpose;
        private final View view;

        public Builder(View view, int i11) {
            this.view = view;
            this.purpose = i11;
        }

        public AdOverlayInfo build() {
            return new AdOverlayInfo(this.view, this.purpose, this.detailedReason);
        }

        @uo.a
        public Builder setDetailedReason(@Nullable String str) {
            this.detailedReason = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Purpose {
    }

    @UnstableApi
    @Deprecated
    public AdOverlayInfo(View view, int i11) {
        this(view, i11, null);
    }

    @UnstableApi
    @Deprecated
    public AdOverlayInfo(View view, int i11, @Nullable String str) {
        this.view = view;
        this.purpose = i11;
        this.reasonDetail = str;
    }
}
