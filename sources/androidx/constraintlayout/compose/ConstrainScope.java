package androidx.constraintlayout.compose;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import h10.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@u0({"SMAP\nConstrainScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstrainScope.kt\nandroidx/constraintlayout/compose/ConstrainScope\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,482:1\n149#2:483\n149#2:484\n149#2:485\n149#2:486\n149#2:487\n149#2:488\n149#2:489\n149#2:490\n149#2:491\n149#2:492\n149#2:493\n149#2:494\n149#2:495\n149#2:496\n149#2:497\n149#2:498\n149#2:499\n149#2:500\n149#2:501\n*S KotlinDebug\n*F\n+ 1 ConstrainScope.kt\nandroidx/constraintlayout/compose/ConstrainScope\n*L\n119#1:483\n122#1:484\n125#1:485\n193#1:486\n194#1:487\n195#1:488\n196#1:489\n214#1:490\n215#1:491\n216#1:492\n217#1:493\n238#1:494\n239#1:495\n240#1:496\n241#1:497\n242#1:498\n243#1:499\n244#1:500\n245#1:501\n*E\n"})
@Stable
/* loaded from: classes2.dex */
public final class ConstrainScope {
    static final /* synthetic */ n<Object>[] $$delegatedProperties = {o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "scaleX", "getScaleX()F", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "scaleY", "getScaleY()F", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "rotationX", "getRotationX()F", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "rotationY", "getRotationY()F", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "rotationZ", "getRotationZ()F", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "translationX", "getTranslationX-D9Ej5fM()F", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "translationY", "getTranslationY-D9Ej5fM()F", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "pivotX", "getPivotX()F", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "pivotY", "getPivotY()F", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0)), o0.k(new MutablePropertyReference1Impl(ConstrainScope.class, "verticalChainWeight", "getVerticalChainWeight()F", 0))};
    public static final int $stable = 0;

    @k
    private final VerticalAnchorable absoluteLeft;

    @k
    private final VerticalAnchorable absoluteRight;

    @FloatRange(from = 0.0d, to = 1.0d)
    private float alpha;

    @k
    private final BaselineAnchorable baseline;

    @k
    private final HorizontalAnchorable bottom;

    @k
    private final CLObject containerObject;

    @k
    private final VerticalAnchorable end;

    @k
    private final DimensionProperty height$delegate;

    @FloatRange(from = 0.0d, to = 1.0d)
    private float horizontalBias;

    @k
    private final FloatProperty horizontalChainWeight$delegate;

    /* renamed from: id, reason: collision with root package name */
    @k
    private final Object f4236id;

    @k
    private final ConstrainedLayoutReference parent = new ConstrainedLayoutReference(q.a.f13044u);

    @k
    private final FloatProperty pivotX$delegate;

    @k
    private final FloatProperty pivotY$delegate;

    @k
    private final FloatProperty rotationX$delegate;

    @k
    private final FloatProperty rotationY$delegate;

    @k
    private final FloatProperty rotationZ$delegate;

    @k
    private final FloatProperty scaleX$delegate;

    @k
    private final FloatProperty scaleY$delegate;

    @k
    private final VerticalAnchorable start;

    @k
    private final HorizontalAnchorable top;

    @k
    private final DpProperty translationX$delegate;

    @k
    private final DpProperty translationY$delegate;

    @k
    private final DpProperty translationZ$delegate;

    @FloatRange(from = 0.0d, to = 1.0d)
    private float verticalBias;

    @k
    private final FloatProperty verticalChainWeight$delegate;

    @k
    private final ConstrainScope$visibility$2 visibility$delegate;

    @k
    private final DimensionProperty width$delegate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class DimensionProperty extends d10.c<Dimension> {
        public DimensionProperty(@k Dimension dimension) {
            super(dimension);
        }

        @Override // d10.c
        public /* bridge */ /* synthetic */ void afterChange(n nVar, Dimension dimension, Dimension dimension2) {
            afterChange2((n<?>) nVar, dimension, dimension2);
        }

        /* renamed from: afterChange, reason: avoid collision after fix types in other method */
        public void afterChange2(@k n<?> nVar, @k Dimension dimension, @k Dimension dimension2) {
            CLObject containerObject$constraintlayout_compose_release = ConstrainScope.this.getContainerObject$constraintlayout_compose_release();
            String name = nVar.getName();
            g0.n(dimension2, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
            containerObject$constraintlayout_compose_release.put(name, ((DimensionDescription) dimension2).asCLElement$constraintlayout_compose_release());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class DpProperty extends d10.c<Dp> {

        @l
        private final String nameOverride;

        public /* synthetic */ DpProperty(ConstrainScope constrainScope, float f11, String str, v vVar) {
            this(f11, str);
        }

        @Override // d10.c
        public /* bridge */ /* synthetic */ void afterChange(n nVar, Dp dp2, Dp dp3) {
            m5404afterChangeVpY3zN4(nVar, dp2.m5129unboximpl(), dp3.m5129unboximpl());
        }

        /* renamed from: afterChange-VpY3zN4, reason: not valid java name */
        public void m5404afterChangeVpY3zN4(@k n<?> nVar, float f11, float f12) {
            if (Float.isNaN(f12)) {
                return;
            }
            CLObject containerObject$constraintlayout_compose_release = ConstrainScope.this.getContainerObject$constraintlayout_compose_release();
            String str = this.nameOverride;
            if (str == null) {
                str = nVar.getName();
            }
            containerObject$constraintlayout_compose_release.putNumber(str, f12);
        }

        private DpProperty(float f11, String str) {
            super(Dp.m5113boximpl(f11));
            this.nameOverride = str;
        }

        public /* synthetic */ DpProperty(ConstrainScope constrainScope, float f11, String str, int i11, v vVar) {
            this(constrainScope, f11, (i11 & 2) != 0 ? null : str, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class FloatProperty extends d10.c<Float> {

        @l
        private final String nameOverride;

        public FloatProperty(float f11, @l String str) {
            super(Float.valueOf(f11));
            this.nameOverride = str;
        }

        @Override // d10.c
        public /* bridge */ /* synthetic */ void afterChange(n nVar, Float f11, Float f12) {
            afterChange((n<?>) nVar, f11.floatValue(), f12.floatValue());
        }

        public void afterChange(@k n<?> nVar, float f11, float f12) {
            if (Float.isNaN(f12)) {
                return;
            }
            CLObject containerObject$constraintlayout_compose_release = ConstrainScope.this.getContainerObject$constraintlayout_compose_release();
            String str = this.nameOverride;
            if (str == null) {
                str = nVar.getName();
            }
            containerObject$constraintlayout_compose_release.putNumber(str, f12);
        }

        public /* synthetic */ FloatProperty(ConstrainScope constrainScope, float f11, String str, int i11, v vVar) {
            this(f11, (i11 & 2) != 0 ? null : str);
        }
    }

    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.constraintlayout.compose.ConstrainScope$visibility$2] */
    public ConstrainScope(@k Object obj, @k CLObject cLObject) {
        this.f4236id = obj;
        this.containerObject = cLObject;
        this.start = new ConstraintVerticalAnchorable(-2, cLObject);
        this.absoluteLeft = new ConstraintVerticalAnchorable(0, cLObject);
        this.top = new ConstraintHorizontalAnchorable(0, cLObject);
        this.end = new ConstraintVerticalAnchorable(-1, cLObject);
        this.absoluteRight = new ConstraintVerticalAnchorable(1, cLObject);
        this.bottom = new ConstraintHorizontalAnchorable(1, cLObject);
        this.baseline = new ConstraintBaselineAnchorable(cLObject);
        Dimension.Companion companion = Dimension.Companion;
        this.width$delegate = new DimensionProperty(companion.getWrapContent());
        this.height$delegate = new DimensionProperty(companion.getWrapContent());
        final Visibility visible = Visibility.Companion.getVisible();
        this.visibility$delegate = new d10.c<Visibility>(visible) { // from class: androidx.constraintlayout.compose.ConstrainScope$visibility$2
            @Override // d10.c
            public /* bridge */ /* synthetic */ void afterChange(n nVar, Visibility visibility, Visibility visibility2) {
                afterChange2((n<?>) nVar, visibility, visibility2);
            }

            /* renamed from: afterChange, reason: avoid collision after fix types in other method */
            public void afterChange2(n<?> nVar, Visibility visibility, Visibility visibility2) {
                ConstrainScope.this.getContainerObject$constraintlayout_compose_release().putString(nVar.getName(), visibility2.getName$constraintlayout_compose_release());
            }
        };
        this.alpha = 1.0f;
        this.scaleX$delegate = new FloatProperty(this, 1.0f, null, 2, null);
        int i11 = 2;
        v vVar = null;
        String str = null;
        this.scaleY$delegate = new FloatProperty(this, 1.0f, str, i11, vVar);
        float f11 = 0.0f;
        this.rotationX$delegate = new FloatProperty(this, f11, str, i11, vVar);
        this.rotationY$delegate = new FloatProperty(this, f11, str, i11, vVar);
        this.rotationZ$delegate = new FloatProperty(this, f11, str, i11, vVar);
        float f12 = 0;
        this.translationX$delegate = new DpProperty(this, Dp.m5115constructorimpl(f12), str, i11, vVar);
        this.translationY$delegate = new DpProperty(this, Dp.m5115constructorimpl(f12), str, i11, vVar);
        this.translationZ$delegate = new DpProperty(this, Dp.m5115constructorimpl(f12), str, i11, vVar);
        float f13 = 0.5f;
        this.pivotX$delegate = new FloatProperty(this, f13, str, i11, vVar);
        this.pivotY$delegate = new FloatProperty(this, f13, str, i11, vVar);
        this.horizontalChainWeight$delegate = new FloatProperty(Float.NaN, "hWeight");
        this.verticalChainWeight$delegate = new FloatProperty(Float.NaN, "vWeight");
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
    }

    public static /* synthetic */ void centerHorizontallyTo$default(ConstrainScope constrainScope, ConstrainedLayoutReference constrainedLayoutReference, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 0.5f;
        }
        constrainScope.centerHorizontallyTo(constrainedLayoutReference, f11);
    }

    public static /* synthetic */ void centerVerticallyTo$default(ConstrainScope constrainScope, ConstrainedLayoutReference constrainedLayoutReference, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 0.5f;
        }
        constrainScope.centerVerticallyTo(constrainedLayoutReference, f11);
    }

    /* renamed from: linkTo-8ZKsbrE$default, reason: not valid java name */
    public static /* synthetic */ void m5391linkTo8ZKsbrE$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f11, float f12, float f13, float f14, float f15, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        float f16 = f11;
        if ((i11 & 8) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        float f17 = f12;
        if ((i11 & 16) != 0) {
            f13 = Dp.m5115constructorimpl(0);
        }
        constrainScope.m5399linkTo8ZKsbrE(verticalAnchor, verticalAnchor2, f16, f17, f13, (i11 & 32) != 0 ? Dp.m5115constructorimpl(0) : f14, (i11 & 64) != 0 ? 0.5f : f15);
    }

    /* renamed from: linkTo-R7zmacU$default, reason: not valid java name */
    public static /* synthetic */ void m5392linkToR7zmacU$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, int i11, Object obj) {
        constrainScope.m5400linkToR7zmacU(verticalAnchor, horizontalAnchor, verticalAnchor2, horizontalAnchor2, (i11 & 16) != 0 ? Dp.m5115constructorimpl(0) : f11, (i11 & 32) != 0 ? Dp.m5115constructorimpl(0) : f12, (i11 & 64) != 0 ? Dp.m5115constructorimpl(0) : f13, (i11 & 128) != 0 ? Dp.m5115constructorimpl(0) : f14, (i11 & 256) != 0 ? Dp.m5115constructorimpl(0) : f15, (i11 & 512) != 0 ? Dp.m5115constructorimpl(0) : f16, (i11 & 1024) != 0 ? Dp.m5115constructorimpl(0) : f17, (i11 & 2048) != 0 ? Dp.m5115constructorimpl(0) : f18, (i11 & 4096) != 0 ? 0.5f : f19, (i11 & 8192) != 0 ? 0.5f : f21);
    }

    @k
    /* renamed from: asDimension-0680j_4, reason: not valid java name */
    public final Dimension m5393asDimension0680j_4(float f11) {
        return Dimension.Companion.m5473value0680j_4(f11);
    }

    public final void centerAround(@k ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor) {
        m5391linkTo8ZKsbrE$default(this, verticalAnchor, verticalAnchor, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
    }

    public final void centerHorizontallyTo(@k ConstrainedLayoutReference constrainedLayoutReference, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        m5391linkTo8ZKsbrE$default(this, constrainedLayoutReference.getStart(), constrainedLayoutReference.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, f11, 60, (Object) null);
    }

    public final void centerTo(@k ConstrainedLayoutReference constrainedLayoutReference) {
        m5392linkToR7zmacU$default(this, constrainedLayoutReference.getStart(), constrainedLayoutReference.getTop(), constrainedLayoutReference.getEnd(), constrainedLayoutReference.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16368, null);
    }

    public final void centerVerticallyTo(@k ConstrainedLayoutReference constrainedLayoutReference, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        m5390linkTo8ZKsbrE$default(this, constrainedLayoutReference.getTop(), constrainedLayoutReference.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, f11, 60, (Object) null);
    }

    /* renamed from: circular-wH6b6FI, reason: not valid java name */
    public final void m5394circularwH6b6FI(@k ConstrainedLayoutReference constrainedLayoutReference, float f11, float f12) {
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(constrainedLayoutReference.getId$constraintlayout_compose_release().toString()));
        cLArray.add(new CLNumber(f11));
        cLArray.add(new CLNumber(f12));
        this.containerObject.put("circular", cLArray);
    }

    public final void clearConstraints() {
        clearHorizontal();
        clearVertical();
        this.containerObject.remove("circular");
    }

    public final void clearHorizontal() {
        this.containerObject.remove(TtmlNode.LEFT);
        this.containerObject.remove(TtmlNode.RIGHT);
        this.containerObject.remove(TtmlNode.START);
        this.containerObject.remove(TtmlNode.END);
    }

    public final void clearVertical() {
        this.containerObject.remove("top");
        this.containerObject.remove("bottom");
        this.containerObject.remove("baseline");
    }

    @k
    public final VerticalAnchorable getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    @k
    public final VerticalAnchorable getAbsoluteRight() {
        return this.absoluteRight;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @k
    public final BaselineAnchorable getBaseline() {
        return this.baseline;
    }

    @k
    public final HorizontalAnchorable getBottom() {
        return this.bottom;
    }

    @k
    public final CLObject getContainerObject$constraintlayout_compose_release() {
        return this.containerObject;
    }

    @k
    public final VerticalAnchorable getEnd() {
        return this.end;
    }

    @k
    public final Dimension getHeight() {
        return this.height$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getHorizontalChainWeight() {
        return this.horizontalChainWeight$delegate.getValue(this, $$delegatedProperties[13]).floatValue();
    }

    @k
    public final Object getId$constraintlayout_compose_release() {
        return this.f4236id;
    }

    @k
    public final ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    public final float getPivotX() {
        return this.pivotX$delegate.getValue(this, $$delegatedProperties[11]).floatValue();
    }

    public final float getPivotY() {
        return this.pivotY$delegate.getValue(this, $$delegatedProperties[12]).floatValue();
    }

    public final float getRotationX() {
        return this.rotationX$delegate.getValue(this, $$delegatedProperties[5]).floatValue();
    }

    public final float getRotationY() {
        return this.rotationY$delegate.getValue(this, $$delegatedProperties[6]).floatValue();
    }

    public final float getRotationZ() {
        return this.rotationZ$delegate.getValue(this, $$delegatedProperties[7]).floatValue();
    }

    public final float getScaleX() {
        return this.scaleX$delegate.getValue(this, $$delegatedProperties[3]).floatValue();
    }

    public final float getScaleY() {
        return this.scaleY$delegate.getValue(this, $$delegatedProperties[4]).floatValue();
    }

    @k
    public final VerticalAnchorable getStart() {
        return this.start;
    }

    @k
    public final HorizontalAnchorable getTop() {
        return this.top;
    }

    /* renamed from: getTranslationX-D9Ej5fM, reason: not valid java name */
    public final float m5395getTranslationXD9Ej5fM() {
        return this.translationX$delegate.getValue(this, $$delegatedProperties[8]).m5129unboximpl();
    }

    /* renamed from: getTranslationY-D9Ej5fM, reason: not valid java name */
    public final float m5396getTranslationYD9Ej5fM() {
        return this.translationY$delegate.getValue(this, $$delegatedProperties[9]).m5129unboximpl();
    }

    /* renamed from: getTranslationZ-D9Ej5fM, reason: not valid java name */
    public final float m5397getTranslationZD9Ej5fM() {
        return this.translationZ$delegate.getValue(this, $$delegatedProperties[10]).m5129unboximpl();
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public final float getVerticalChainWeight() {
        return this.verticalChainWeight$delegate.getValue(this, $$delegatedProperties[14]).floatValue();
    }

    @k
    public final Visibility getVisibility() {
        return getValue(this, $$delegatedProperties[2]);
    }

    @k
    public final Dimension getWidth() {
        return this.width$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* renamed from: linkTo-8ZKsbrE, reason: not valid java name */
    public final void m5399linkTo8ZKsbrE(@k ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, @k ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f11, float f12, float f13, float f14, @FloatRange(from = 0.0d, to = 1.0d) float f15) {
        this.start.mo5375linkToVpY3zN4(verticalAnchor, f11, f13);
        this.end.mo5375linkToVpY3zN4(verticalAnchor2, f12, f14);
        this.containerObject.putNumber("hRtlBias", f15);
    }

    /* renamed from: linkTo-R7zmacU, reason: not valid java name */
    public final void m5400linkToR7zmacU(@k ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, @k ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, @k ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, @k ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, @FloatRange(from = 0.0d, to = 1.0d) float f19, @FloatRange(from = 0.0d, to = 1.0d) float f21) {
        m5399linkTo8ZKsbrE(verticalAnchor, verticalAnchor2, f11, f13, f15, f17, f19);
        m5398linkTo8ZKsbrE(horizontalAnchor, horizontalAnchor2, f12, f14, f16, f18, f21);
    }

    public final void resetDimensions() {
        Dimension.Companion companion = Dimension.Companion;
        setWidth(companion.getWrapContent());
        setHeight(companion.getWrapContent());
    }

    public final void resetTransforms() {
        this.containerObject.remove("alpha");
        this.containerObject.remove("scaleX");
        this.containerObject.remove("scaleY");
        this.containerObject.remove("rotationX");
        this.containerObject.remove("rotationY");
        this.containerObject.remove("rotationZ");
        this.containerObject.remove("translationX");
        this.containerObject.remove("translationY");
        this.containerObject.remove("translationZ");
        this.containerObject.remove("pivotX");
        this.containerObject.remove("pivotY");
    }

    public final void setAlpha(float f11) {
        this.alpha = f11;
        if (Float.isNaN(f11)) {
            return;
        }
        this.containerObject.putNumber("alpha", f11);
    }

    public final void setHeight(@k Dimension dimension) {
        this.height$delegate.setValue(this, $$delegatedProperties[1], dimension);
    }

    public final void setHorizontalBias(float f11) {
        this.horizontalBias = f11;
        if (Float.isNaN(f11)) {
            return;
        }
        this.containerObject.putNumber("hBias", f11);
    }

    public final void setHorizontalChainWeight(float f11) {
        this.horizontalChainWeight$delegate.setValue(this, $$delegatedProperties[13], Float.valueOf(f11));
    }

    public final void setPivotX(float f11) {
        this.pivotX$delegate.setValue(this, $$delegatedProperties[11], Float.valueOf(f11));
    }

    public final void setPivotY(float f11) {
        this.pivotY$delegate.setValue(this, $$delegatedProperties[12], Float.valueOf(f11));
    }

    public final void setRotationX(float f11) {
        this.rotationX$delegate.setValue(this, $$delegatedProperties[5], Float.valueOf(f11));
    }

    public final void setRotationY(float f11) {
        this.rotationY$delegate.setValue(this, $$delegatedProperties[6], Float.valueOf(f11));
    }

    public final void setRotationZ(float f11) {
        this.rotationZ$delegate.setValue(this, $$delegatedProperties[7], Float.valueOf(f11));
    }

    public final void setScaleX(float f11) {
        this.scaleX$delegate.setValue(this, $$delegatedProperties[3], Float.valueOf(f11));
    }

    public final void setScaleY(float f11) {
        this.scaleY$delegate.setValue(this, $$delegatedProperties[4], Float.valueOf(f11));
    }

    /* renamed from: setTranslationX-0680j_4, reason: not valid java name */
    public final void m5401setTranslationX0680j_4(float f11) {
        this.translationX$delegate.setValue(this, $$delegatedProperties[8], Dp.m5113boximpl(f11));
    }

    /* renamed from: setTranslationY-0680j_4, reason: not valid java name */
    public final void m5402setTranslationY0680j_4(float f11) {
        this.translationY$delegate.setValue(this, $$delegatedProperties[9], Dp.m5113boximpl(f11));
    }

    /* renamed from: setTranslationZ-0680j_4, reason: not valid java name */
    public final void m5403setTranslationZ0680j_4(float f11) {
        this.translationZ$delegate.setValue(this, $$delegatedProperties[10], Dp.m5113boximpl(f11));
    }

    public final void setVerticalBias(float f11) {
        this.verticalBias = f11;
        if (Float.isNaN(f11)) {
            return;
        }
        this.containerObject.putNumber("vBias", f11);
    }

    public final void setVerticalChainWeight(float f11) {
        this.verticalChainWeight$delegate.setValue(this, $$delegatedProperties[14], Float.valueOf(f11));
    }

    public final void setVisibility(@k Visibility visibility) {
        setValue(this, $$delegatedProperties[2], visibility);
    }

    public final void setWidth(@k Dimension dimension) {
        this.width$delegate.setValue(this, $$delegatedProperties[0], dimension);
    }

    public final void centerAround(@k ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor) {
        m5390linkTo8ZKsbrE$default(this, horizontalAnchor, horizontalAnchor, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
    }

    /* renamed from: linkTo-8ZKsbrE, reason: not valid java name */
    public final void m5398linkTo8ZKsbrE(@k ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, @k ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f11, float f12, float f13, float f14, @FloatRange(from = 0.0d, to = 1.0d) float f15) {
        this.top.mo5374linkToVpY3zN4(horizontalAnchor, f11, f13);
        this.bottom.mo5374linkToVpY3zN4(horizontalAnchor2, f12, f14);
        this.containerObject.putNumber("vBias", f15);
    }

    /* renamed from: linkTo-8ZKsbrE$default, reason: not valid java name */
    public static /* synthetic */ void m5390linkTo8ZKsbrE$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f11, float f12, float f13, float f14, float f15, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        float f16 = f11;
        if ((i11 & 8) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        float f17 = f12;
        if ((i11 & 16) != 0) {
            f13 = Dp.m5115constructorimpl(0);
        }
        constrainScope.m5398linkTo8ZKsbrE(horizontalAnchor, horizontalAnchor2, f16, f17, f13, (i11 & 32) != 0 ? Dp.m5115constructorimpl(0) : f14, (i11 & 64) != 0 ? 0.5f : f15);
    }
}
