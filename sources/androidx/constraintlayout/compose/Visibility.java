package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class Visibility {
    public static final int $stable = 0;

    @k
    private final String name;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Visibility Visible = new Visibility("visible");

    @k
    private static final Visibility Invisible = new Visibility("invisible");

    @k
    private static final Visibility Gone = new Visibility("gone");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Visibility getGone() {
            return Visibility.Gone;
        }

        @k
        public final Visibility getInvisible() {
            return Visibility.Invisible;
        }

        @k
        public final Visibility getVisible() {
            return Visibility.Visible;
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getGone$annotations() {
        }

        @Stable
        public static /* synthetic */ void getInvisible$annotations() {
        }

        @Stable
        public static /* synthetic */ void getVisible$annotations() {
        }
    }

    public Visibility(@k String str) {
        this.name = str;
    }

    @k
    public final String getName$constraintlayout_compose_release() {
        return this.name;
    }
}
