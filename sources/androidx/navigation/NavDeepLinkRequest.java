package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.text.Regex;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class NavDeepLinkRequest {

    @l
    private final String action;

    @l
    private final String mimeType;

    @l
    private final Uri uri;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNavDeepLinkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkRequest.kt\nandroidx/navigation/NavDeepLinkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    public static final class Builder {

        @k
        public static final Companion Companion = new Companion(null);

        @l
        private String action;

        @l
        private String mimeType;

        @l
        private Uri uri;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            @o
            @k
            public final Builder fromAction(@k String action) {
                g0.p(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
                }
                Builder builder = new Builder(null);
                builder.setAction(action);
                return builder;
            }

            @o
            @k
            public final Builder fromMimeType(@k String mimeType) {
                g0.p(mimeType, "mimeType");
                Builder builder = new Builder(null);
                builder.setMimeType(mimeType);
                return builder;
            }

            @o
            @k
            public final Builder fromUri(@k Uri uri) {
                g0.p(uri, "uri");
                Builder builder = new Builder(null);
                builder.setUri(uri);
                return builder;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Builder(v vVar) {
            this();
        }

        @o
        @k
        public static final Builder fromAction(@k String str) {
            return Companion.fromAction(str);
        }

        @o
        @k
        public static final Builder fromMimeType(@k String str) {
            return Companion.fromMimeType(str);
        }

        @o
        @k
        public static final Builder fromUri(@k Uri uri) {
            return Companion.fromUri(uri);
        }

        @k
        public final NavDeepLinkRequest build() {
            return new NavDeepLinkRequest(this.uri, this.action, this.mimeType);
        }

        @k
        public final Builder setAction(@k String action) {
            g0.p(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        @k
        public final Builder setMimeType(@k String mimeType) {
            g0.p(mimeType, "mimeType");
            if (new Regex("^[-\\w*.]+/[-\\w+*.]+$").matches(mimeType)) {
                this.mimeType = mimeType;
                return this;
            }
            throw new IllegalArgumentException(("The given mimeType " + mimeType + " does not match to required \"type/subtype\" format").toString());
        }

        @k
        public final Builder setUri(@k Uri uri) {
            g0.p(uri, "uri");
            this.uri = uri;
            return this;
        }

        private Builder() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLinkRequest(@l Uri uri, @l String str, @l String str2) {
        this.uri = uri;
        this.action = str;
        this.mimeType = str2;
    }

    @l
    public String getAction() {
        return this.action;
    }

    @l
    public String getMimeType() {
        return this.mimeType;
    }

    @l
    public Uri getUri() {
        return this.uri;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (getUri() != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(getUri()));
        }
        if (getAction() != null) {
            sb2.append(" action=");
            sb2.append(getAction());
        }
        if (getMimeType() != null) {
            sb2.append(" mimetype=");
            sb2.append(getMimeType());
        }
        sb2.append(" }");
        String sb3 = sb2.toString();
        g0.o(sb3, "sb.toString()");
        return sb3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLinkRequest(@k Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        g0.p(intent, "intent");
    }
}
