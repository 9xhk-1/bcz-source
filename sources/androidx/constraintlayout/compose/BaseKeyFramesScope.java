package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import h10.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
@u0({"SMAP\nTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/BaseKeyFramesScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n1#2:970\n13579#3,2:971\n*S KotlinDebug\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/BaseKeyFramesScope\n*L\n286#1:971,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BaseKeyFramesScope {
    static final /* synthetic */ n<Object>[] $$delegatedProperties = {o0.k(new MutablePropertyReference1Impl(BaseKeyFramesScope.class, "easing", "getEasing()Landroidx/constraintlayout/compose/Easing;", 0))};
    public static final int $stable = 8;

    @k
    private final d10.c easing$delegate;

    @k
    private final CLArray framesContainer;

    @k
    private final CLObject keyFramePropsObject;

    @k
    private final CLArray targetsContainer;

    public /* synthetic */ BaseKeyFramesScope(ConstrainedLayoutReference[] constrainedLayoutReferenceArr, v vVar) {
        this(constrainedLayoutReferenceArr);
    }

    public static /* synthetic */ d10.c addNameOnPropertyChange$constraintlayout_compose_release$default(BaseKeyFramesScope baseKeyFramesScope, NamedPropertyOrValue namedPropertyOrValue, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNameOnPropertyChange");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return baseKeyFramesScope.addNameOnPropertyChange$constraintlayout_compose_release(namedPropertyOrValue, str);
    }

    @k
    public final <E extends NamedPropertyOrValue> d10.c<E> addNameOnPropertyChange$constraintlayout_compose_release(final E e11, @l final String str) {
        return (d10.c<E>) new d10.c<E>(e11) { // from class: androidx.constraintlayout.compose.BaseKeyFramesScope$addNameOnPropertyChange$1
            /* JADX WARN: Incorrect types in method signature: (Lh10/n<*>;TE;TE;)V */
            @Override // d10.c
            public void afterChange(n nVar, NamedPropertyOrValue namedPropertyOrValue, NamedPropertyOrValue namedPropertyOrValue2) {
                String str2 = str;
                if (str2 == null) {
                    str2 = nVar.getName();
                }
                if (namedPropertyOrValue2 != null) {
                    this.getKeyFramePropsObject$constraintlayout_compose_release().putString(str2, namedPropertyOrValue2.getName());
                }
            }
        };
    }

    @k
    public final Easing getEasing() {
        return (Easing) this.easing$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @k
    public final CLArray getFramesContainer$constraintlayout_compose_release() {
        return this.framesContainer;
    }

    @k
    public final CLObject getKeyFramePropsObject$constraintlayout_compose_release() {
        return this.keyFramePropsObject;
    }

    public final void setEasing(@k Easing easing) {
        this.easing$delegate.setValue(this, $$delegatedProperties[0], easing);
    }

    private BaseKeyFramesScope(ConstrainedLayoutReference... constrainedLayoutReferenceArr) {
        CLObject cLObject = new CLObject(new char[0]);
        cLObject.clear();
        this.keyFramePropsObject = cLObject;
        CLArray cLArray = new CLArray(new char[0]);
        this.targetsContainer = cLArray;
        CLArray cLArray2 = new CLArray(new char[0]);
        this.framesContainer = cLArray2;
        this.easing$delegate = addNameOnPropertyChange$constraintlayout_compose_release(Easing.Companion.getStandard(), "transitionEasing");
        cLObject.put(TypedValues.AttributesType.S_TARGET, cLArray);
        cLObject.put("frames", cLArray2);
        for (ConstrainedLayoutReference constrainedLayoutReference : constrainedLayoutReferenceArr) {
            char[] charArray = constrainedLayoutReference.getId$constraintlayout_compose_release().toString().toCharArray();
            g0.o(charArray, "this as java.lang.String).toCharArray()");
            CLArray cLArray3 = this.targetsContainer;
            CLString cLString = new CLString(charArray);
            cLString.setStart(0L);
            cLString.setEnd(charArray.length - 1);
            cLArray3.add(cLString);
        }
    }
}
