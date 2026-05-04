package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,642:1\n85#2:643\n113#2,2:644\n85#2:646\n113#2,2:647\n635#3:649\n57#4:650\n61#4:653\n57#4:656\n61#4:659\n57#4:663\n61#4:666\n60#5:651\n70#5:654\n60#5:657\n70#5:660\n80#5:662\n60#5:664\n70#5:667\n22#6:652\n22#6:655\n22#6:658\n22#6:665\n22#6:668\n30#7:661\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n*L\n121#1:643\n121#1:644,2\n127#1:646\n127#1:647,2\n142#1:649\n161#1:650\n162#1:653\n165#1:656\n165#1:659\n192#1:663\n193#1:666\n161#1:651\n162#1:654\n165#1:657\n165#1:660\n165#1:662\n192#1:664\n193#1:667\n161#1:652\n162#1:655\n165#1:658\n192#1:665\n193#1:668\n165#1:661\n*E\n"})
/* loaded from: classes.dex */
public final class VectorComponent extends VNode {
    public static final int $stable = 8;

    @k
    private final DrawCache cacheDrawScope;

    @k
    private final l<DrawScope, g2> drawVectorBlock;

    @k
    private final MutableState intrinsicColorFilter$delegate;

    @k
    private a<g2> invalidateCallback;
    private boolean isDirty;

    @k
    private String name;
    private long previousDrawSize;

    @k
    private final GroupComponent root;
    private float rootScaleX;
    private float rootScaleY;

    @m80.l
    private ColorFilter tintFilter;

    @k
    private final MutableState viewportSize$delegate;

    public VectorComponent(@k GroupComponent groupComponent) {
        super(null);
        this.root = groupComponent;
        groupComponent.setInvalidateListener$ui_release(new l<VNode, g2>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent.1
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
                VectorComponent.this.doInvalidate();
            }
        });
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = new a<g2>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }
        };
        this.intrinsicColorFilter$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        Size.Companion companion = Size.Companion;
        this.viewportSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2325boximpl(companion.m2346getZeroNHjbRc()), null, 2, null);
        this.previousDrawSize = companion.m2345getUnspecifiedNHjbRc();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new l<DrawScope, g2>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                float f11;
                float f12;
                GroupComponent root = VectorComponent.this.getRoot();
                VectorComponent vectorComponent = VectorComponent.this;
                f11 = vectorComponent.rootScaleX;
                f12 = vectorComponent.rootScaleY;
                long m2284getZeroF1C5BW0 = Offset.Companion.m2284getZeroF1C5BW0();
                DrawContext drawContext = drawScope.getDrawContext();
                long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo2988scale0AR0LA0(f11, f12, m2284getZeroF1C5BW0);
                    root.draw(drawScope);
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    public final void draw(@k DrawScope drawScope, float f11, @m80.l ColorFilter colorFilter) {
        DrawScope drawScope2;
        int m2728getAlpha8_sVssgQ = (this.root.isTintable() && this.root.m3189getTintColor0d7_KjU() != 16 && VectorKt.tintableWithAlphaMask(getIntrinsicColorFilter$ui_release()) && VectorKt.tintableWithAlphaMask(colorFilter)) ? ImageBitmapConfig.Companion.m2728getAlpha8_sVssgQ() : ImageBitmapConfig.Companion.m2729getArgb8888_sVssgQ();
        if (!this.isDirty && Size.m2333equalsimpl0(this.previousDrawSize, drawScope.mo3060getSizeNHjbRc()) && ImageBitmapConfig.m2724equalsimpl0(m2728getAlpha8_sVssgQ, m3204getCacheBitmapConfig_sVssgQ$ui_release())) {
            drawScope2 = drawScope;
        } else {
            this.tintFilter = ImageBitmapConfig.m2724equalsimpl0(m2728getAlpha8_sVssgQ, ImageBitmapConfig.Companion.m2728getAlpha8_sVssgQ()) ? ColorFilter.Companion.m2550tintxETnrds$default(ColorFilter.Companion, this.root.m3189getTintColor0d7_KjU(), 0, 2, null) : null;
            this.rootScaleX = Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() >> 32)) / Float.intBitsToFloat((int) (m3205getViewportSizeNHjbRc$ui_release() >> 32));
            this.rootScaleY = Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() & 4294967295L)) / Float.intBitsToFloat((int) (m3205getViewportSizeNHjbRc$ui_release() & 4294967295L));
            drawScope2 = drawScope;
            this.cacheDrawScope.m3187drawCachedImageFqjB98A(m2728getAlpha8_sVssgQ, IntSize.m5281constructorimpl((((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() & 4294967295L)))) & 4294967295L) | (((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() >> 32)))) << 32)), drawScope2, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope2.mo3060getSizeNHjbRc();
        }
        if (colorFilter == null) {
            colorFilter = getIntrinsicColorFilter$ui_release() != null ? getIntrinsicColorFilter$ui_release() : this.tintFilter;
        }
        this.cacheDrawScope.drawInto(drawScope2, f11, colorFilter);
    }

    /* renamed from: getCacheBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m3204getCacheBitmapConfig_sVssgQ$ui_release() {
        ImageBitmap mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.mo2376getConfig_sVssgQ() : ImageBitmapConfig.Companion.m2729getArgb8888_sVssgQ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter) this.intrinsicColorFilter$delegate.getValue();
    }

    @k
    public final a<g2> getInvalidateCallback$ui_release() {
        return this.invalidateCallback;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final GroupComponent getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m3205getViewportSizeNHjbRc$ui_release() {
        return ((Size) this.viewportSize$delegate.getValue()).m2342unboximpl();
    }

    public final void setIntrinsicColorFilter$ui_release(@m80.l ColorFilter colorFilter) {
        this.intrinsicColorFilter$delegate.setValue(colorFilter);
    }

    public final void setInvalidateCallback$ui_release(@k a<g2> aVar) {
        this.invalidateCallback = aVar;
    }

    public final void setName(@k String str) {
        this.name = str;
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m3206setViewportSizeuvyYCjk$ui_release(long j11) {
        this.viewportSize$delegate.setValue(Size.m2325boximpl(j11));
    }

    @k
    public String toString() {
        String str = "Params: \tname: " + this.name + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (m3205getViewportSizeNHjbRc$ui_release() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (m3205getViewportSizeNHjbRc$ui_release() & 4294967295L)) + "\n";
        g0.o(str, "toString(...)");
        return str;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(@k DrawScope drawScope) {
        draw(drawScope, 1.0f, null);
    }
}
