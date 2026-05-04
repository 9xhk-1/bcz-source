package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PathMeasure {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
    }

    static /* synthetic */ boolean getSegment$default(PathMeasure pathMeasure, float f11, float f12, Path path, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        return pathMeasure.getSegment(f11, f12, path, z11);
    }

    float getLength();

    /* renamed from: getPosition-tuRUvjQ */
    long mo2407getPositiontuRUvjQ(float f11);

    boolean getSegment(float f11, float f12, @m80.k Path path, boolean z11);

    /* renamed from: getTangent-tuRUvjQ */
    long mo2408getTangenttuRUvjQ(float f11);

    void setPath(@m80.l Path path, boolean z11);
}
