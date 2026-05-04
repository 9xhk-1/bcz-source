package androidx.constraintlayout.compose;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLObject;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import ix.l1;
import java.util.Arrays;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
@u0({"SMAP\nTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/TransitionScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,969:1\n1#2:970\n*E\n"})
/* loaded from: classes2.dex */
public final class TransitionScope {
    public static final int $stable = 8;

    @k
    private final String from;

    @FloatRange(from = -1.0d, fromInclusive = false, to = 1.0d, toInclusive = false)
    private float maxStaggerDelay;

    @l
    private OnSwipe onSwipe;

    /* renamed from: to, reason: collision with root package name */
    @k
    private final String f4245to;

    @k
    private final CLObject containerObject = new CLObject(new char[0]);

    @k
    private final CLObject keyFramesObject = new CLObject(new char[0]);

    @k
    private final CLArray keyAttributesArray = new CLArray(new char[0]);

    @k
    private final CLArray keyPositionsArray = new CLArray(new char[0]);

    @k
    private final CLArray keyCyclesArray = new CLArray(new char[0]);

    @k
    private final CLObject onSwipeObject = new CLObject(new char[0]);

    @k
    private Arc motionArc = Arc.Companion.getNone();

    public TransitionScope(@k String str, @k String str2) {
        this.from = str;
        this.f4245to = str2;
    }

    private final void addKeyAttributesIfMissing() {
        this.containerObject.put("KeyFrames", this.keyFramesObject);
        this.keyFramesObject.put(TypedValues.AttributesType.NAME, this.keyAttributesArray);
    }

    private final void addKeyCyclesIfMissing() {
        this.containerObject.put("KeyFrames", this.keyFramesObject);
        this.keyFramesObject.put("KeyCycles", this.keyCyclesArray);
    }

    private final void addKeyPositionsIfMissing() {
        this.containerObject.put("KeyFrames", this.keyFramesObject);
        this.keyFramesObject.put("KeyPositions", this.keyPositionsArray);
    }

    @k
    public final ConstrainedLayoutReference createRefFor(@k Object obj) {
        return new ConstrainedLayoutReference(obj);
    }

    public final float getMaxStaggerDelay() {
        return this.maxStaggerDelay;
    }

    @k
    public final Arc getMotionArc() {
        return this.motionArc;
    }

    @k
    public final CLObject getObject$constraintlayout_compose_release() {
        Object id$constraintlayout_compose_release;
        Object id$constraintlayout_compose_release2;
        this.containerObject.putString(TypedValues.TransitionType.S_PATH_MOTION_ARC, this.motionArc.getName());
        this.containerObject.putString("from", this.from);
        this.containerObject.putString("to", this.f4245to);
        this.containerObject.putNumber(TypedValues.TransitionType.S_STAGGERED, this.maxStaggerDelay);
        OnSwipe onSwipe = this.onSwipe;
        if (onSwipe != null) {
            this.containerObject.put("onSwipe", this.onSwipeObject);
            this.onSwipeObject.putString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, onSwipe.getDirection().getName());
            this.onSwipeObject.putNumber("scale", onSwipe.getDragScale());
            ConstrainedLayoutReference dragAround = onSwipe.getDragAround();
            if (dragAround != null && (id$constraintlayout_compose_release2 = dragAround.getId$constraintlayout_compose_release()) != null) {
                this.onSwipeObject.putString("around", id$constraintlayout_compose_release2.toString());
            }
            ConstrainedLayoutReference limitBoundsTo = onSwipe.getLimitBoundsTo();
            if (limitBoundsTo != null && (id$constraintlayout_compose_release = limitBoundsTo.getId$constraintlayout_compose_release()) != null) {
                this.onSwipeObject.putString("limitBounds", id$constraintlayout_compose_release.toString());
            }
            this.onSwipeObject.putNumber("threshold", onSwipe.getDragThreshold());
            this.onSwipeObject.putString(l1.a.f62925c, onSwipe.getAnchor().getId$constraintlayout_compose_release().toString());
            this.onSwipeObject.putString("side", onSwipe.getSide().getName());
            this.onSwipeObject.putString("touchUp", onSwipe.getOnTouchUp().getName());
            this.onSwipeObject.putString("mode", onSwipe.getMode().getName());
            this.onSwipeObject.putNumber("maxVelocity", onSwipe.getMode().getMaxVelocity$constraintlayout_compose_release());
            this.onSwipeObject.putNumber("maxAccel", onSwipe.getMode().getMaxAcceleration$constraintlayout_compose_release());
            this.onSwipeObject.putNumber("springMass", onSwipe.getMode().getSpringMass$constraintlayout_compose_release());
            this.onSwipeObject.putNumber("springStiffness", onSwipe.getMode().getSpringStiffness$constraintlayout_compose_release());
            this.onSwipeObject.putNumber("springDamping", onSwipe.getMode().getSpringDamping$constraintlayout_compose_release());
            this.onSwipeObject.putNumber("stopThreshold", onSwipe.getMode().getSpringThreshold$constraintlayout_compose_release());
            this.onSwipeObject.putString("springBoundary", onSwipe.getMode().getSpringBoundary$constraintlayout_compose_release().getName());
        }
        return this.containerObject;
    }

    @l
    public final OnSwipe getOnSwipe() {
        return this.onSwipe;
    }

    public final void keyAttributes(@k ConstrainedLayoutReference[] constrainedLayoutReferenceArr, @k x00.l<? super KeyAttributesScope, g2> lVar) {
        KeyAttributesScope keyAttributesScope = new KeyAttributesScope((ConstrainedLayoutReference[]) Arrays.copyOf(constrainedLayoutReferenceArr, constrainedLayoutReferenceArr.length));
        lVar.invoke(keyAttributesScope);
        addKeyAttributesIfMissing();
        this.keyAttributesArray.add(keyAttributesScope.getKeyFramePropsObject$constraintlayout_compose_release());
    }

    public final void keyCycles(@k ConstrainedLayoutReference[] constrainedLayoutReferenceArr, @k x00.l<? super KeyCyclesScope, g2> lVar) {
        KeyCyclesScope keyCyclesScope = new KeyCyclesScope((ConstrainedLayoutReference[]) Arrays.copyOf(constrainedLayoutReferenceArr, constrainedLayoutReferenceArr.length));
        lVar.invoke(keyCyclesScope);
        addKeyCyclesIfMissing();
        this.keyCyclesArray.add(keyCyclesScope.getKeyFramePropsObject$constraintlayout_compose_release());
    }

    public final void keyPositions(@k ConstrainedLayoutReference[] constrainedLayoutReferenceArr, @k x00.l<? super KeyPositionsScope, g2> lVar) {
        KeyPositionsScope keyPositionsScope = new KeyPositionsScope((ConstrainedLayoutReference[]) Arrays.copyOf(constrainedLayoutReferenceArr, constrainedLayoutReferenceArr.length));
        lVar.invoke(keyPositionsScope);
        addKeyPositionsIfMissing();
        this.keyPositionsArray.add(keyPositionsScope.getKeyFramePropsObject$constraintlayout_compose_release());
    }

    public final void reset$constraintlayout_compose_release() {
        this.containerObject.clear();
        this.keyFramesObject.clear();
        this.keyAttributesArray.clear();
        this.onSwipeObject.clear();
    }

    public final void setMaxStaggerDelay(float f11) {
        this.maxStaggerDelay = f11;
    }

    public final void setMotionArc(@k Arc arc) {
        this.motionArc = arc;
    }

    public final void setOnSwipe(@l OnSwipe onSwipe) {
        this.onSwipe = onSwipe;
    }
}
