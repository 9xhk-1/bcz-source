package androidx.compose.ui.graphics.vector;

import a00.h0;
import androidx.compose.runtime.Immutable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, a {
    public static final int $stable = 0;

    @k
    private final List<VectorNode> children;

    @k
    private final List<PathNode> clipPathData;

    @k
    private final String name;
    private final float pivotX;
    private final float pivotY;
    private final float rotation;
    private final float scaleX;
    private final float scaleY;
    private final float translationX;
    private final float translationY;

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof VectorGroup)) {
            VectorGroup vectorGroup = (VectorGroup) obj;
            return g0.g(this.name, vectorGroup.name) && this.rotation == vectorGroup.rotation && this.pivotX == vectorGroup.pivotX && this.pivotY == vectorGroup.pivotY && this.scaleX == vectorGroup.scaleX && this.scaleY == vectorGroup.scaleY && this.translationX == vectorGroup.translationX && this.translationY == vectorGroup.translationY && g0.g(this.clipPathData, vectorGroup.clipPathData) && g0.g(this.children, vectorGroup.children);
        }
        return false;
    }

    @k
    public final VectorNode get(int i11) {
        return this.children.get(i11);
    }

    @k
    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSize() {
        return this.children.size();
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Float.hashCode(this.rotation)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }

    @Override // java.lang.Iterable
    @k
    public Iterator<VectorNode> iterator() {
        return new VectorGroup$iterator$1(this);
    }

    public /* synthetic */ VectorGroup(String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List list, List list2, int i11, v vVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0.0f : f12, (i11 & 8) != 0 ? 0.0f : f13, (i11 & 16) != 0 ? 1.0f : f14, (i11 & 32) != 0 ? 1.0f : f15, (i11 & 64) != 0 ? 0.0f : f16, (i11 & 128) != 0 ? 0.0f : f17, (i11 & 256) != 0 ? VectorKt.getEmptyPath() : list, (i11 & 512) != 0 ? h0.J() : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorGroup(@k String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, @k List<? extends PathNode> list, @k List<? extends VectorNode> list2) {
        super(null);
        this.name = str;
        this.rotation = f11;
        this.pivotX = f12;
        this.pivotY = f13;
        this.scaleX = f14;
        this.scaleY = f15;
        this.translationX = f16;
        this.translationY = f17;
        this.clipPathData = list;
        this.children = list2;
    }
}
