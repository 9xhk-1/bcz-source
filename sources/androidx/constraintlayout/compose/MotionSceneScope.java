package androidx.constraintlayout.compose;

import a00.a0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.constraintlayout.core.parser.CLObject;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.w0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
@u0({"SMAP\nMotionSceneScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionSceneScope.kt\nandroidx/constraintlayout/compose/MotionSceneScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n1#2:398\n*E\n"})
/* loaded from: classes2.dex */
public final class MotionSceneScope {
    public static final int $stable = 8;
    private int generatedCount;
    private int generatedIdCount;

    @k
    private HashMap<String, ConstraintSet> constraintSetsByName = new HashMap<>();

    @k
    private HashMap<String, Transition> transitionsByName = new HashMap<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMotionSceneScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionSceneScope.kt\nandroidx/constraintlayout/compose/MotionSceneScope$ConstrainedLayoutReferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n1#2:398\n*E\n"})
    public final class ConstrainedLayoutReferences {

        @k
        private final Object[] ids;

        public ConstrainedLayoutReferences(@k Object[] objArr) {
            this.ids = objArr;
        }

        @k
        public final ConstrainedLayoutReference component1() {
            Object[] objArr = this.ids;
            return new ConstrainedLayoutReference(a0.Oe(objArr) >= 0 ? objArr[0] : MotionSceneScope.this.nextId());
        }

        @k
        public final ConstrainedLayoutReference component10() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(9 <= a0.Oe(objArr) ? objArr[9] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component11() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(10 <= a0.Oe(objArr) ? objArr[10] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component12() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(11 <= a0.Oe(objArr) ? objArr[11] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component13() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(12 <= a0.Oe(objArr) ? objArr[12] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component14() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(13 <= a0.Oe(objArr) ? objArr[13] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component15() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(14 <= a0.Oe(objArr) ? objArr[14] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component16() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(15 <= a0.Oe(objArr) ? objArr[15] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component2() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(1 <= a0.Oe(objArr) ? objArr[1] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component3() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(2 <= a0.Oe(objArr) ? objArr[2] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component4() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(3 <= a0.Oe(objArr) ? objArr[3] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component5() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(4 <= a0.Oe(objArr) ? objArr[4] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component6() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(5 <= a0.Oe(objArr) ? objArr[5] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component7() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(6 <= a0.Oe(objArr) ? objArr[6] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component8() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(7 <= a0.Oe(objArr) ? objArr[7] : motionSceneScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component9() {
            MotionSceneScope motionSceneScope = MotionSceneScope.this;
            Object[] objArr = this.ids;
            return motionSceneScope.createRefFor(8 <= a0.Oe(objArr) ? objArr[8] : motionSceneScope.nextId());
        }
    }

    public static /* synthetic */ ConstraintSetRef addConstraintSet$default(MotionSceneScope motionSceneScope, ConstraintSet constraintSet, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return motionSceneScope.addConstraintSet(constraintSet, str);
    }

    public static /* synthetic */ void addTransition$default(MotionSceneScope motionSceneScope, Transition transition, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        motionSceneScope.addTransition(transition, str);
    }

    public static /* synthetic */ ConstraintSetRef constraintSet$default(MotionSceneScope motionSceneScope, String str, ConstraintSetRef constraintSetRef, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            constraintSetRef = null;
        }
        return motionSceneScope.constraintSet(str, constraintSetRef, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defaultTransition$default(MotionSceneScope motionSceneScope, ConstraintSetRef constraintSetRef, ConstraintSetRef constraintSetRef2, l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            lVar = new l<TransitionScope, g2>() { // from class: androidx.constraintlayout.compose.MotionSceneScope$defaultTransition$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TransitionScope transitionScope) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(TransitionScope transitionScope) {
                    invoke2(transitionScope);
                    return g2.f100423a;
                }
            };
        }
        motionSceneScope.defaultTransition(constraintSetRef, constraintSetRef2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String nextId() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("androidx.constraintlayoutid");
        int i11 = this.generatedIdCount;
        this.generatedIdCount = i11 + 1;
        sb2.append(i11);
        return sb2.toString();
    }

    private final String nextName() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("androidx.constraintlayout");
        int i11 = this.generatedCount;
        this.generatedCount = i11 + 1;
        sb2.append(i11);
        return sb2.toString();
    }

    private final void setMotionProperty(ConstrainScope constrainScope, String str, float f11) {
        if (!constrainScope.getContainerObject$constraintlayout_compose_release().has("motion")) {
            constrainScope.getContainerObject$constraintlayout_compose_release().put("motion", new CLObject(new char[0]));
        }
        CLObject objectOrNull = constrainScope.getContainerObject$constraintlayout_compose_release().getObjectOrNull("motion");
        if (objectOrNull == null) {
            return;
        }
        objectOrNull.putNumber(str, f11);
    }

    /* renamed from: toJsonHexString-8_81llA, reason: not valid java name */
    private final String m5558toJsonHexString8_81llA(long j11) {
        w0 w0Var = w0.f67050a;
        String format = String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(ColorKt.m2563toArgb8_81llA(j11))}, 1));
        g0.o(format, "format(format, *args)");
        return format;
    }

    public static /* synthetic */ void transition$default(MotionSceneScope motionSceneScope, ConstraintSetRef constraintSetRef, ConstraintSetRef constraintSetRef2, String str, l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        motionSceneScope.transition(constraintSetRef, constraintSetRef2, str, lVar);
    }

    @k
    public final ConstraintSetRef addConstraintSet(@k ConstraintSet constraintSet, @m80.l String str) {
        if (str == null) {
            str = nextName();
        }
        this.constraintSetsByName.put(str, constraintSet);
        return new ConstraintSetRef(str);
    }

    public final void addTransition(@k Transition transition, @m80.l String str) {
        if (str == null) {
            str = nextName();
        }
        this.transitionsByName.put(str, transition);
    }

    @k
    public final ConstraintSetRef constraintSet(@m80.l String str, @m80.l ConstraintSetRef constraintSetRef, @k l<? super ConstraintSetScope, g2> lVar) {
        return addConstraintSet(new DslConstraintSet(lVar, constraintSetRef != null ? this.constraintSetsByName.get(constraintSetRef.getName$constraintlayout_compose_release()) : null), str);
    }

    @k
    public final ConstrainedLayoutReference createRefFor(@k Object obj) {
        return new ConstrainedLayoutReference(obj);
    }

    @k
    public final ConstrainedLayoutReferences createRefsFor(@k Object... objArr) {
        return new ConstrainedLayoutReferences(Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: customColor-mxwnekA, reason: not valid java name */
    public final void m5559customColormxwnekA(@k ConstrainScope constrainScope, @k String str, long j11) {
        if (!constrainScope.getContainerObject$constraintlayout_compose_release().has("custom")) {
            constrainScope.getContainerObject$constraintlayout_compose_release().put("custom", new CLObject(new char[0]));
        }
        CLObject objectOrNull = constrainScope.getContainerObject$constraintlayout_compose_release().getObjectOrNull("custom");
        if (objectOrNull == null) {
            return;
        }
        objectOrNull.putString(str, m5558toJsonHexString8_81llA(j11));
    }

    /* renamed from: customDistance-wH6b6FI, reason: not valid java name */
    public final void m5561customDistancewH6b6FI(@k ConstrainScope constrainScope, @k String str, float f11) {
        customFloat(constrainScope, str, f11);
    }

    public final void customFloat(@k ConstrainScope constrainScope, @k String str, float f11) {
        if (!constrainScope.getContainerObject$constraintlayout_compose_release().has("custom")) {
            constrainScope.getContainerObject$constraintlayout_compose_release().put("custom", new CLObject(new char[0]));
        }
        CLObject objectOrNull = constrainScope.getContainerObject$constraintlayout_compose_release().getObjectOrNull("custom");
        if (objectOrNull == null) {
            return;
        }
        objectOrNull.putNumber(str, f11);
    }

    /* renamed from: customFontSize-kncR6DU, reason: not valid java name */
    public final void m5563customFontSizekncR6DU(@k ConstrainScope constrainScope, @k String str, long j11) {
        customFloat(constrainScope, str, TextUnit.m5309getValueimpl(j11));
    }

    public final void customInt(@k ConstrainScope constrainScope, @k String str, int i11) {
        customFloat(constrainScope, str, i11);
    }

    public final void defaultTransition(@k ConstraintSetRef constraintSetRef, @k ConstraintSetRef constraintSetRef2, @k l<? super TransitionScope, g2> lVar) {
        transition(constraintSetRef, constraintSetRef2, "default", lVar);
    }

    @k
    public final HashMap<String, ConstraintSet> getConstraintSetsByName$constraintlayout_compose_release() {
        return this.constraintSetsByName;
    }

    public final float getStaggeredWeight(@k ConstrainScope constrainScope) {
        if (constrainScope.getContainerObject$constraintlayout_compose_release().has("motion")) {
            return constrainScope.getContainerObject$constraintlayout_compose_release().getObject("motion").getFloatOrNaN("stagger");
        }
        return Float.NaN;
    }

    @k
    public final HashMap<String, Transition> getTransitionsByName$constraintlayout_compose_release() {
        return this.transitionsByName;
    }

    public final void reset$constraintlayout_compose_release() {
        this.generatedCount = 0;
        this.constraintSetsByName.clear();
        this.transitionsByName.clear();
    }

    public final void setConstraintSetsByName$constraintlayout_compose_release(@k HashMap<String, ConstraintSet> hashMap) {
        this.constraintSetsByName = hashMap;
    }

    public final void setStaggeredWeight(@k ConstrainScope constrainScope, float f11) {
        setMotionProperty(constrainScope, "stagger", f11);
    }

    public final void setTransitionsByName$constraintlayout_compose_release(@k HashMap<String, Transition> hashMap) {
        this.transitionsByName = hashMap;
    }

    public final void transition(@k ConstraintSetRef constraintSetRef, @k ConstraintSetRef constraintSetRef2, @m80.l String str, @k l<? super TransitionScope, g2> lVar) {
        if (str == null) {
            str = nextName();
        }
        HashMap<String, Transition> hashMap = this.transitionsByName;
        TransitionScope transitionScope = new TransitionScope(constraintSetRef.getName$constraintlayout_compose_release(), constraintSetRef2.getName$constraintlayout_compose_release());
        lVar.invoke(transitionScope);
        hashMap.put(str, new TransitionImpl(transitionScope.getObject$constraintlayout_compose_release()));
    }

    /* renamed from: customDistance-wH6b6FI, reason: not valid java name */
    public final void m5562customDistancewH6b6FI(@k KeyAttributeScope keyAttributeScope, @k String str, float f11) {
        keyAttributeScope.getCustomPropertiesValue$constraintlayout_compose_release().put(str, Float.valueOf(f11));
    }

    /* renamed from: customFontSize-kncR6DU, reason: not valid java name */
    public final void m5564customFontSizekncR6DU(@k KeyAttributeScope keyAttributeScope, @k String str, long j11) {
        keyAttributeScope.getCustomPropertiesValue$constraintlayout_compose_release().put(str, Float.valueOf(TextUnit.m5309getValueimpl(j11)));
    }

    public final void customInt(@k KeyAttributeScope keyAttributeScope, @k String str, int i11) {
        keyAttributeScope.getCustomPropertiesValue$constraintlayout_compose_release().put(str, Integer.valueOf(i11));
    }

    /* renamed from: customColor-mxwnekA, reason: not valid java name */
    public final void m5560customColormxwnekA(@k KeyAttributeScope keyAttributeScope, @k String str, long j11) {
        keyAttributeScope.getCustomPropertiesValue$constraintlayout_compose_release().put(str, m5558toJsonHexString8_81llA(j11));
    }

    public final void customFloat(@k KeyAttributeScope keyAttributeScope, @k String str, float f11) {
        keyAttributeScope.getCustomPropertiesValue$constraintlayout_compose_release().put(str, Float.valueOf(f11));
    }
}
