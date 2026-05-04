package androidx.constraintlayout.core.motion.utils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class FloatRect {
    public float bottom;
    public float left;
    public float right;
    public float top;

    public final float centerX() {
        return (this.left + this.right) * 0.5f;
    }

    public final float centerY() {
        return (this.top + this.bottom) * 0.5f;
    }
}
