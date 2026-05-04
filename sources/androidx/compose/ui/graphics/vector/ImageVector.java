package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n*L\n1#1,705:1\n27#2:706\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector\n*L\n381#1:706\n*E\n"})
/* loaded from: classes.dex */
public final class ImageVector {
    public static final int $stable = 0;

    @k
    public static final Companion Companion;
    private static int imageVectorCount;

    @k
    private static final Object lock;
    private final boolean autoMirror;
    private final float defaultHeight;
    private final float defaultWidth;
    private final int genId;

    @k
    private final String name;

    @k
    private final VectorGroup root;
    private final int tintBlendMode;
    private final long tintColor;
    private final float viewportHeight;
    private final float viewportWidth;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Builder\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,705:1\n56#2,5:706\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Builder\n*L\n337#1:706,5\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;
        private final boolean autoMirror;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;

        @k
        private final String name;

        @k
        private final ArrayList<GroupParams> nodes;

        @k
        private GroupParams root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class GroupParams {

            @k
            private List<VectorNode> children;

            @k
            private List<? extends PathNode> clipPathData;

            @k
            private String name;
            private float pivotX;
            private float pivotY;
            private float rotate;
            private float scaleX;
            private float scaleY;
            private float translationX;
            private float translationY;

            public GroupParams() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            @k
            public final List<VectorNode> getChildren() {
                return this.children;
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

            public final float getRotate() {
                return this.rotate;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final float getScaleY() {
                return this.scaleY;
            }

            public final float getTranslationX() {
                return this.translationX;
            }

            public final float getTranslationY() {
                return this.translationY;
            }

            public final void setChildren(@k List<VectorNode> list) {
                this.children = list;
            }

            public final void setClipPathData(@k List<? extends PathNode> list) {
                this.clipPathData = list;
            }

            public final void setName(@k String str) {
                this.name = str;
            }

            public final void setPivotX(float f11) {
                this.pivotX = f11;
            }

            public final void setPivotY(float f11) {
                this.pivotY = f11;
            }

            public final void setRotate(float f11) {
                this.rotate = f11;
            }

            public final void setScaleX(float f11) {
                this.scaleX = f11;
            }

            public final void setScaleY(float f11) {
                this.scaleY = f11;
            }

            public final void setTranslationX(float f11) {
                this.translationX = f11;
            }

            public final void setTranslationY(float f11) {
                this.translationY = f11;
            }

            public GroupParams(@k String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, @k List<? extends PathNode> list, @k List<VectorNode> list2) {
                this.name = str;
                this.rotate = f11;
                this.pivotX = f12;
                this.pivotY = f13;
                this.scaleX = f14;
                this.scaleY = f15;
                this.translationX = f16;
                this.translationY = f17;
                this.clipPathData = list;
                this.children = list2;
            }

            public /* synthetic */ GroupParams(String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List list, List list2, int i11, v vVar) {
                this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0.0f : f12, (i11 & 8) != 0 ? 0.0f : f13, (i11 & 16) != 0 ? 1.0f : f14, (i11 & 32) != 0 ? 1.0f : f15, (i11 & 64) != 0 ? 0.0f : f16, (i11 & 128) != 0 ? 0.0f : f17, (i11 & 256) != 0 ? VectorKt.getEmptyPath() : list, (i11 & 512) != 0 ? new ArrayList() : list2);
            }
        }

        @n(level = DeprecationLevel.HIDDEN, message = "Replace with ImageVector.Builder that consumes an optional auto mirror parameter", replaceWith = @w0(expression = "Builder(name, defaultWidth, defaultHeight, viewportWidth, viewportHeight, tintColor, tintBlendMode, false)", imports = {"androidx.compose.ui.graphics.vector"}))
        public /* synthetic */ Builder(String str, float f11, float f12, float f13, float f14, long j11, int i11, v vVar) {
            this(str, f11, f12, f13, f14, j11, i11);
        }

        public static /* synthetic */ Builder addGroup$default(Builder builder, String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "";
            }
            if ((i11 & 2) != 0) {
                f11 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f12 = 0.0f;
            }
            if ((i11 & 8) != 0) {
                f13 = 0.0f;
            }
            if ((i11 & 16) != 0) {
                f14 = 1.0f;
            }
            if ((i11 & 32) != 0) {
                f15 = 1.0f;
            }
            if ((i11 & 64) != 0) {
                f16 = 0.0f;
            }
            if ((i11 & 128) != 0) {
                f17 = 0.0f;
            }
            if ((i11 & 256) != 0) {
                list = VectorKt.getEmptyPath();
            }
            float f18 = f17;
            List list2 = list;
            float f19 = f16;
            float f21 = f14;
            return builder.addGroup(str, f11, f12, f13, f21, f15, f19, f18, list2);
        }

        /* renamed from: addPath-oIyEayM$default, reason: not valid java name */
        public static /* synthetic */ Builder m3194addPathoIyEayM$default(Builder builder, List list, int i11, String str, Brush brush, float f11, Brush brush2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17, int i14, Object obj) {
            return builder.m3195addPathoIyEayM(list, (i14 & 2) != 0 ? VectorKt.getDefaultFillType() : i11, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? null : brush, (i14 & 16) != 0 ? 1.0f : f11, (i14 & 32) == 0 ? brush2 : null, (i14 & 64) != 0 ? 1.0f : f12, (i14 & 128) != 0 ? 0.0f : f13, (i14 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i12, (i14 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i13, (i14 & 1024) != 0 ? 4.0f : f14, (i14 & 2048) != 0 ? 0.0f : f15, (i14 & 4096) == 0 ? f16 : 1.0f, (i14 & 8192) != 0 ? 0.0f : f17);
        }

        private final VectorGroup asVectorGroup(GroupParams groupParams) {
            return new VectorGroup(groupParams.getName(), groupParams.getRotate(), groupParams.getPivotX(), groupParams.getPivotY(), groupParams.getScaleX(), groupParams.getScaleY(), groupParams.getTranslationX(), groupParams.getTranslationY(), groupParams.getClipPathData(), groupParams.getChildren());
        }

        private final void ensureNotConsumed() {
            if (this.isConsumed) {
                InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final GroupParams getCurrentGroup() {
            Object peek;
            peek = ImageVectorKt.peek(this.nodes);
            return (GroupParams) peek;
        }

        @k
        public final Builder addGroup(@k String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, @k List<? extends PathNode> list) {
            ensureNotConsumed();
            ImageVectorKt.push(this.nodes, new GroupParams(str, f11, f12, f13, f14, f15, f16, f17, list, null, 512, null));
            return this;
        }

        @k
        /* renamed from: addPath-oIyEayM, reason: not valid java name */
        public final Builder m3195addPathoIyEayM(@k List<? extends PathNode> list, int i11, @k String str, @l Brush brush, float f11, @l Brush brush2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17) {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(new VectorPath(str, list, i11, brush, f11, brush2, f12, f13, i12, i13, f14, f15, f16, f17, null));
            return this;
        }

        @k
        public final ImageVector build() {
            ensureNotConsumed();
            while (this.nodes.size() > 1) {
                clearGroup();
            }
            ImageVector imageVector = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, asVectorGroup(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, 0, 512, null);
            this.isConsumed = true;
            return imageVector;
        }

        @k
        public final Builder clearGroup() {
            Object pop;
            ensureNotConsumed();
            pop = ImageVectorKt.pop(this.nodes);
            getCurrentGroup().getChildren().add(asVectorGroup((GroupParams) pop));
            return this;
        }

        public /* synthetic */ Builder(String str, float f11, float f12, float f13, float f14, long j11, int i11, boolean z11, v vVar) {
            this(str, f11, f12, f13, f14, j11, i11, z11);
        }

        private Builder(String str, float f11, float f12, float f13, float f14, long j11, int i11, boolean z11) {
            this.name = str;
            this.defaultWidth = f11;
            this.defaultHeight = f12;
            this.viewportWidth = f13;
            this.viewportHeight = f14;
            this.tintColor = j11;
            this.tintBlendMode = i11;
            this.autoMirror = z11;
            ArrayList<GroupParams> arrayList = new ArrayList<>();
            this.nodes = arrayList;
            GroupParams groupParams = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = groupParams;
            ImageVectorKt.push(arrayList, groupParams);
        }

        public /* synthetic */ Builder(String str, float f11, float f12, float f13, float f14, long j11, int i11, boolean z11, int i12, v vVar) {
            this((i12 & 1) != 0 ? "" : str, f11, f12, f13, f14, (i12 & 32) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : j11, (i12 & 64) != 0 ? BlendMode.Companion.m2449getSrcIn0nO6VwU() : i11, (i12 & 128) != 0 ? false : z11, (v) null);
        }

        public /* synthetic */ Builder(String str, float f11, float f12, float f13, float f14, long j11, int i11, int i12, v vVar) {
            this((i12 & 1) != 0 ? "" : str, f11, f12, f13, f14, (i12 & 32) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : j11, (i12 & 64) != 0 ? BlendMode.Companion.m2449getSrcIn0nO6VwU() : i11, (v) null);
        }

        private Builder(String str, float f11, float f12, float f13, float f14, long j11, int i11) {
            this(str, f11, f12, f13, f14, j11, i11, false, (v) null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Companion\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n*L\n1#1,705:1\n32#2,2:706\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Companion\n*L\n384#1:706,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        public final int generateImageVectorId$ui_release() {
            int i11;
            synchronized (ImageVector.lock) {
                Companion companion = ImageVector.Companion;
                i11 = ImageVector.imageVectorCount;
                ImageVector.imageVectorCount = i11 + 1;
            }
            return i11;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        lock = companion;
    }

    public /* synthetic */ ImageVector(String str, float f11, float f12, float f13, float f14, VectorGroup vectorGroup, long j11, int i11, boolean z11, int i12, v vVar) {
        this(str, f11, f12, f13, f14, vectorGroup, j11, i11, z11, i12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        return g0.g(this.name, imageVector.name) && Dp.m5120equalsimpl0(this.defaultWidth, imageVector.defaultWidth) && Dp.m5120equalsimpl0(this.defaultHeight, imageVector.defaultHeight) && this.viewportWidth == imageVector.viewportWidth && this.viewportHeight == imageVector.viewportHeight && g0.g(this.root, imageVector.root) && Color.m2510equalsimpl0(this.tintColor, imageVector.tintColor) && BlendMode.m2420equalsimpl0(this.tintBlendMode, imageVector.tintBlendMode) && this.autoMirror == imageVector.autoMirror;
    }

    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* renamed from: getDefaultHeight-D9Ej5fM, reason: not valid java name */
    public final float m3190getDefaultHeightD9Ej5fM() {
        return this.defaultHeight;
    }

    /* renamed from: getDefaultWidth-D9Ej5fM, reason: not valid java name */
    public final float m3191getDefaultWidthD9Ej5fM() {
        return this.defaultWidth;
    }

    public final int getGenId$ui_release() {
        return this.genId;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final VectorGroup getRoot() {
        return this.root;
    }

    /* renamed from: getTintBlendMode-0nO6VwU, reason: not valid java name */
    public final int m3192getTintBlendMode0nO6VwU() {
        return this.tintBlendMode;
    }

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m3193getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + Dp.m5121hashCodeimpl(this.defaultWidth)) * 31) + Dp.m5121hashCodeimpl(this.defaultHeight)) * 31) + Float.hashCode(this.viewportWidth)) * 31) + Float.hashCode(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + Color.m2516hashCodeimpl(this.tintColor)) * 31) + BlendMode.m2421hashCodeimpl(this.tintBlendMode)) * 31) + Boolean.hashCode(this.autoMirror);
    }

    private ImageVector(String str, float f11, float f12, float f13, float f14, VectorGroup vectorGroup, long j11, int i11, boolean z11, int i12) {
        this.name = str;
        this.defaultWidth = f11;
        this.defaultHeight = f12;
        this.viewportWidth = f13;
        this.viewportHeight = f14;
        this.root = vectorGroup;
        this.tintColor = j11;
        this.tintBlendMode = i11;
        this.autoMirror = z11;
        this.genId = i12;
    }

    public /* synthetic */ ImageVector(String str, float f11, float f12, float f13, float f14, VectorGroup vectorGroup, long j11, int i11, boolean z11, int i12, int i13, v vVar) {
        this(str, f11, f12, f13, f14, vectorGroup, j11, i11, z11, (i13 & 512) != 0 ? Companion.generateImageVectorId$ui_release() : i12, null);
    }
}
