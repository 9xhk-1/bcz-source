package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class TextGeometricTransform {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final TextGeometricTransform None = new TextGeometricTransform(1.0f, 0.0f);
    private final float scaleX;
    private final float skewX;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final TextGeometricTransform getNone$ui_text_release() {
            return TextGeometricTransform.None;
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getNone$ui_text_release$annotations() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextGeometricTransform() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.style.TextGeometricTransform.<init>():void");
    }

    public static /* synthetic */ TextGeometricTransform copy$default(TextGeometricTransform textGeometricTransform, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = textGeometricTransform.scaleX;
        }
        if ((i11 & 2) != 0) {
            f12 = textGeometricTransform.skewX;
        }
        return textGeometricTransform.copy(f11, f12);
    }

    @k
    public final TextGeometricTransform copy(float f11, float f12) {
        return new TextGeometricTransform(f11, f12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj;
        return this.scaleX == textGeometricTransform.scaleX && this.skewX == textGeometricTransform.skewX;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    public int hashCode() {
        return (Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.skewX);
    }

    @k
    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.scaleX + ", skewX=" + this.skewX + ')';
    }

    public TextGeometricTransform(float f11, float f12) {
        this.scaleX = f11;
        this.skewX = f12;
    }

    public /* synthetic */ TextGeometricTransform(float f11, float f12, int i11, v vVar) {
        this((i11 & 1) != 0 ? 1.0f : f11, (i11 & 2) != 0 ? 0.0f : f12);
    }
}
