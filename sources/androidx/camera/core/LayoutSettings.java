package androidx.camera.core;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class LayoutSettings {
    public static final LayoutSettings DEFAULT = new Builder().setAlpha(1.0f).setOffsetX(0.0f).setOffsetY(0.0f).setWidth(1.0f).setHeight(1.0f).build();
    private final float mAlpha;
    private final float mHeight;
    private final float mOffsetX;
    private final float mOffsetY;
    private final float mWidth;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private float mAlpha = 1.0f;
        private float mOffsetX = 0.0f;
        private float mOffsetY = 0.0f;
        private float mWidth = 0.0f;
        private float mHeight = 0.0f;

        @NonNull
        public LayoutSettings build() {
            return new LayoutSettings(this.mAlpha, this.mOffsetX, this.mOffsetY, this.mWidth, this.mHeight);
        }

        @NonNull
        public Builder setAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
            this.mAlpha = f11;
            return this;
        }

        @NonNull
        public Builder setHeight(@FloatRange(from = -1.0d, to = 1.0d) float f11) {
            this.mHeight = f11;
            return this;
        }

        @NonNull
        public Builder setOffsetX(@FloatRange(from = -1.0d, to = 1.0d) float f11) {
            this.mOffsetX = f11;
            return this;
        }

        @NonNull
        public Builder setOffsetY(@FloatRange(from = -1.0d, to = 1.0d) float f11) {
            this.mOffsetY = f11;
            return this;
        }

        @NonNull
        public Builder setWidth(@FloatRange(from = -1.0d, to = 1.0d) float f11) {
            this.mWidth = f11;
            return this;
        }
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public float getHeight() {
        return this.mHeight;
    }

    public float getOffsetX() {
        return this.mOffsetX;
    }

    public float getOffsetY() {
        return this.mOffsetY;
    }

    public float getWidth() {
        return this.mWidth;
    }

    private LayoutSettings(float f11, float f12, float f13, float f14, float f15) {
        this.mAlpha = f11;
        this.mOffsetX = f12;
        this.mOffsetY = f13;
        this.mWidth = f14;
        this.mHeight = f15;
    }
}
