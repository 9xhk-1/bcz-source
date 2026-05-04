package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,642:1\n635#2:643\n640#2:644\n249#3,8:645\n257#3:654\n259#3,4:661\n1#4:653\n34#5,6:655\n34#5,6:665\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n409#1:643\n410#1:644\n608#1:645,8\n608#1:654\n608#1:661,4\n615#1:655,6\n621#1:665,6\n*E\n"})
/* loaded from: classes.dex */
public final class GroupComponent extends VNode {
    public static final int $stable = 8;

    @k
    private final List<VNode> children;

    @l
    private Path clipPath;

    @k
    private List<? extends PathNode> clipPathData;

    @l
    private float[] groupMatrix;

    @l
    private x00.l<? super VNode, g2> invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;
    private boolean isTintable;

    @k
    private String name;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private long tintColor;
    private float translationX;
    private float translationY;

    @k
    private final x00.l<VNode, g2> wrappedListener;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.Companion.m2545getUnspecified0d7_KjU();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.wrappedListener = new x00.l<VNode, g2>() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(VNode vNode) {
                invoke2(vNode);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(VNode vNode) {
                GroupComponent.this.markTintForVNode(vNode);
                x00.l<VNode, g2> invalidateListener$ui_release = GroupComponent.this.getInvalidateListener$ui_release();
                if (invalidateListener$ui_release != null) {
                    invalidateListener$ui_release.invoke(vNode);
                }
            }
        };
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    private final void markNotTintable() {
        this.isTintable = false;
        this.tintColor = Color.Companion.m2545getUnspecified0d7_KjU();
    }

    private final void markTintForBrush(Brush brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m3188markTintForColor8_81llA(((SolidColor) brush).m2844getValue0d7_KjU());
            } else {
                markNotTintable();
            }
        }
    }

    /* renamed from: markTintForColor-8_81llA, reason: not valid java name */
    private final void m3188markTintForColor8_81llA(long j11) {
        if (this.isTintable && j11 != 16) {
            long j12 = this.tintColor;
            if (j12 == 16) {
                this.tintColor = j11;
            } else {
                if (VectorKt.m3211rgbEqualOWjLjI(j12, j11)) {
                    return;
                }
                markNotTintable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markTintForVNode(VNode vNode) {
        if (vNode instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) vNode;
            markTintForBrush(pathComponent.getFill());
            markTintForBrush(pathComponent.getStroke());
        } else if (vNode instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) vNode;
            if (groupComponent.isTintable && this.isTintable) {
                m3188markTintForColor8_81llA(groupComponent.tintColor);
            } else {
                markNotTintable();
            }
        }
    }

    private final void updateClipPath() {
        if (getWillClipPath()) {
            Path path = this.clipPath;
            if (path == null) {
                path = AndroidPath_androidKt.Path();
                this.clipPath = path;
            }
            PathParserKt.toPath(this.clipPathData, path);
        }
    }

    private final void updateMatrix() {
        float[] fArr = this.groupMatrix;
        if (fArr == null) {
            fArr = Matrix.m2739constructorimpl$default(null, 1, null);
            this.groupMatrix = fArr;
        } else {
            Matrix.m2748resetimpl(fArr);
        }
        float[] fArr2 = fArr;
        Matrix.m2761translateimpl$default(fArr2, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        Matrix.m2753rotateZimpl(fArr2, this.rotation);
        Matrix.m2754scaleimpl(fArr2, this.scaleX, this.scaleY, 1.0f);
        Matrix.m2761translateimpl$default(fArr2, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(@k DrawScope drawScope) {
        if (this.isMatrixDirty) {
            updateMatrix();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            float[] fArr = this.groupMatrix;
            if (fArr != null) {
                transform.mo2989transform58bKbWc(Matrix.m2737boximpl(fArr).m2762unboximpl());
            }
            Path path = this.clipPath;
            if (getWillClipPath() && path != null) {
                DrawTransform.m3116clipPathmtrdDE$default(transform, path, 0, 2, null);
            }
            List<VNode> list = this.children;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).draw(drawScope);
            }
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
        } catch (Throwable th2) {
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            throw th2;
        }
    }

    @k
    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    @l
    public x00.l<VNode, g2> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final int getNumChildren() {
        return this.children.size();
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

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m3189getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void insertAt(int i11, @k VNode vNode) {
        if (i11 < getNumChildren()) {
            this.children.set(i11, vNode);
        } else {
            this.children.add(vNode);
        }
        markTintForVNode(vNode);
        vNode.setInvalidateListener$ui_release(this.wrappedListener);
        invalidate();
    }

    public final boolean isTintable() {
        return this.isTintable;
    }

    public final void move(int i11, int i12, int i13) {
        int i14 = 0;
        if (i11 > i12) {
            while (i14 < i13) {
                VNode vNode = this.children.get(i11);
                this.children.remove(i11);
                this.children.add(i12, vNode);
                i12++;
                i14++;
            }
        } else {
            while (i14 < i13) {
                VNode vNode2 = this.children.get(i11);
                this.children.remove(i11);
                this.children.add(i12 - 1, vNode2);
                i14++;
            }
        }
        invalidate();
    }

    public final void remove(int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (i11 < this.children.size()) {
                this.children.get(i11).setInvalidateListener$ui_release(null);
                this.children.remove(i11);
            }
        }
        invalidate();
    }

    public final void setClipPathData(@k List<? extends PathNode> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        invalidate();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(@l x00.l<? super VNode, g2> lVar) {
        this.invalidateListener = lVar;
    }

    public final void setName(@k String str) {
        this.name = str;
        invalidate();
    }

    public final void setPivotX(float f11) {
        this.pivotX = f11;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setPivotY(float f11) {
        this.pivotY = f11;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setRotation(float f11) {
        this.rotation = f11;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleX(float f11) {
        this.scaleX = f11;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleY(float f11) {
        this.scaleY = f11;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationX(float f11) {
        this.translationX = f11;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationY(float f11) {
        this.translationY = f11;
        this.isMatrixDirty = true;
        invalidate();
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.name);
        List<VNode> list = this.children;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            VNode vNode = list.get(i11);
            sb2.append("\t");
            sb2.append(vNode.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
