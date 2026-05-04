package wv;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@wv.a
/* loaded from: classes8.dex */
public final class f implements FlingBehavior {

    /* renamed from: f, reason: collision with root package name */
    public static final int f96889f = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final i f96890a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<i, Float> f96891b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final DecayAnimationSpec<Float> f96892c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final AnimationSpec<Float> f96893d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableState f96894e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0, 0, 0, 0}, l = {343, 391}, m = "performDecayFling", n = {"this", "$this$performDecayFling", "velocityLeft", "needSpringAfter", "targetIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f96895a;

        /* renamed from: b, reason: collision with root package name */
        public Object f96896b;

        /* renamed from: c, reason: collision with root package name */
        public Object f96897c;

        /* renamed from: d, reason: collision with root package name */
        public Object f96898d;

        /* renamed from: e, reason: collision with root package name */
        public int f96899e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f96900f;

        /* renamed from: h, reason: collision with root package name */
        public int f96902h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f96900f = obj;
            this.f96902h |= Integer.MIN_VALUE;
            return f.this.k(null, null, 0, 0.0f, false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.l<AnimationScope<Float, AnimationVector1D>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f96903a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f96904b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f96905c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f96906d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f96907e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f96908f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f96909g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<Float, Float> {
            public a(Object obj) {
                super(1, obj, ScrollScope.class, "scrollBy", "scrollBy(F)F", 0);
            }

            @m80.k
            public final Float invoke(float f11) {
                return Float.valueOf(((ScrollScope) this.receiver).scrollBy(f11));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return invoke(f11.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.FloatRef floatRef2, f fVar, boolean z11, int i11, Ref.BooleanRef booleanRef) {
            super(1);
            this.f96903a = floatRef;
            this.f96904b = scrollScope;
            this.f96905c = floatRef2;
            this.f96906d = fVar;
            this.f96907e = z11;
            this.f96908f = i11;
            this.f96909g = booleanRef;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m80.k AnimationScope<Float, AnimationVector1D> animateDecay) {
            g0.p(animateDecay, "$this$animateDecay");
            float floatValue = animateDecay.getValue().floatValue() - this.f96903a.element;
            float scrollBy = this.f96904b.scrollBy(floatValue);
            this.f96903a.element = animateDecay.getValue().floatValue();
            this.f96905c.element = animateDecay.getVelocity().floatValue();
            if (Math.abs(floatValue - scrollBy) > 0.5f) {
                animateDecay.cancelAnimation();
            }
            j e11 = this.f96906d.f96890a.e();
            if (e11 == null) {
                animateDecay.cancelAnimation();
                return;
            }
            if (animateDecay.isRunning() && this.f96907e) {
                if (animateDecay.getVelocity().floatValue() > 0.0f && e11.a() == this.f96908f - 1) {
                    this.f96909g.element = true;
                    animateDecay.cancelAnimation();
                } else if (animateDecay.getVelocity().floatValue() < 0.0f && e11.a() == this.f96908f) {
                    this.f96909g.element = true;
                    animateDecay.cancelAnimation();
                }
            }
            if (animateDecay.isRunning() && this.f96906d.m(animateDecay, e11, this.f96908f, new a(this.f96904b))) {
                animateDecay.cancelAnimation();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0}, l = {TypedValues.CycleType.TYPE_WAVE_PHASE}, m = "performSpringFling", n = {"this", "velocityLeft"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f96910a;

        /* renamed from: b, reason: collision with root package name */
        public Object f96911b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f96912c;

        /* renamed from: e, reason: collision with root package name */
        public int f96914e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f96912c = obj;
            this.f96914e |= Integer.MIN_VALUE;
            return f.this.n(null, null, 0, 0.0f, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements x00.l<AnimationScope<Float, AnimationVector1D>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f96915a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f96916b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f96917c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f96918d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f96919e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<Float, Float> {
            public a(Object obj) {
                super(1, obj, ScrollScope.class, "scrollBy", "scrollBy(F)F", 0);
            }

            @m80.k
            public final Float invoke(float f11) {
                return Float.valueOf(((ScrollScope) this.receiver).scrollBy(f11));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return invoke(f11.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.FloatRef floatRef2, f fVar, int i11) {
            super(1);
            this.f96915a = floatRef;
            this.f96916b = scrollScope;
            this.f96917c = floatRef2;
            this.f96918d = fVar;
            this.f96919e = i11;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m80.k AnimationScope<Float, AnimationVector1D> animateTo) {
            g0.p(animateTo, "$this$animateTo");
            float floatValue = animateTo.getValue().floatValue() - this.f96915a.element;
            float scrollBy = this.f96916b.scrollBy(floatValue);
            this.f96915a.element = animateTo.getValue().floatValue();
            this.f96917c.element = animateTo.getVelocity().floatValue();
            j e11 = this.f96918d.f96890a.e();
            if (e11 == null) {
                animateTo.cancelAnimation();
            } else if (this.f96918d.m(animateTo, e11, this.f96919e, new a(this.f96916b))) {
                animateTo.cancelAnimation();
            } else if (Math.abs(floatValue - scrollBy) > 0.5f) {
                animateTo.cancelAnimation();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@m80.k i layoutInfo, @m80.k x00.l<? super i, Float> maximumFlingDistance, @m80.k DecayAnimationSpec<Float> decayAnimationSpec, @m80.k AnimationSpec<Float> springAnimationSpec) {
        g0.p(layoutInfo, "layoutInfo");
        g0.p(maximumFlingDistance, "maximumFlingDistance");
        g0.p(decayAnimationSpec, "decayAnimationSpec");
        g0.p(springAnimationSpec, "springAnimationSpec");
        this.f96890a = layoutInfo;
        this.f96891b = maximumFlingDistance;
        this.f96892c = decayAnimationSpec;
        this.f96893d = springAnimationSpec;
        this.f96894e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static /* synthetic */ Object l(f fVar, ScrollScope scrollScope, j jVar, int i11, float f11, boolean z11, j00.c cVar, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        return fVar.k(scrollScope, jVar, i11, f11, z11, cVar);
    }

    public static /* synthetic */ Object o(f fVar, ScrollScope scrollScope, j jVar, int i11, float f11, j00.c cVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f11 = 0.0f;
        }
        return fVar.n(scrollScope, jVar, i11, f11, cVar);
    }

    public final int f(float f11, j jVar, int i11) {
        if (f11 > 0.0f && jVar.a() == i11) {
            return this.f96890a.d(jVar.a());
        }
        if (f11 >= 0.0f || jVar.a() != i11 - 1) {
            return 0;
        }
        return this.f96890a.d(jVar.a() + 1);
    }

    public final boolean g(DecayAnimationSpec<Float> decayAnimationSpec, float f11, j jVar) {
        if (Math.abs(f11) < 0.5f) {
            return false;
        }
        float calculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, f11);
        k kVar = k.f96927a;
        return f11 < 0.0f ? calculateTargetValue <= ((float) this.f96890a.d(jVar.a())) : calculateTargetValue >= ((float) this.f96890a.d(jVar.a() + 1));
    }

    public final float h(float f11) {
        if ((f11 >= 0.0f || this.f96890a.b()) && (f11 <= 0.0f || this.f96890a.a())) {
            return 0.0f;
        }
        return f11;
    }

    public final Object i(ScrollScope scrollScope, int i11, float f11, j00.c<? super Float> cVar) {
        j e11 = this.f96890a.e();
        if (e11 == null) {
            return l00.a.e(f11);
        }
        if (e11.a() != i11 || this.f96890a.d(e11.a()) != 0) {
            return g(this.f96892c, f11, e11) ? l(this, scrollScope, e11, i11, f11, false, cVar, 8, null) : n(scrollScope, e11, i11, f11, cVar);
        }
        k kVar = k.f96927a;
        return l00.a.e(h(f11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    public final Integer j() {
        return (Integer) this.f96894e.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(androidx.compose.foundation.gestures.ScrollScope r21, wv.j r22, int r23, float r24, boolean r25, j00.c<? super java.lang.Float> r26) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wv.f.k(androidx.compose.foundation.gestures.ScrollScope, wv.j, int, float, boolean, j00.c):java.lang.Object");
    }

    public final boolean m(AnimationScope<Float, AnimationVector1D> animationScope, j jVar, int i11, x00.l<? super Float, Float> lVar) {
        k kVar = k.f96927a;
        int f11 = f(animationScope.getVelocity().floatValue(), jVar, i11);
        if (f11 == 0) {
            return false;
        }
        lVar.invoke(Float.valueOf(f11));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(androidx.compose.foundation.gestures.ScrollScope r22, wv.j r23, int r24, float r25, j00.c<? super java.lang.Float> r26) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wv.f.n(androidx.compose.foundation.gestures.ScrollScope, wv.j, int, float, j00.c):java.lang.Object");
    }

    public final void p(Integer num) {
        this.f96894e.setValue(num);
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @m80.l
    public Object performFling(@m80.k ScrollScope scrollScope, float f11, @m80.k j00.c<? super Float> cVar) {
        if (!this.f96890a.b() || !this.f96890a.a()) {
            return l00.a.e(f11);
        }
        k kVar = k.f96927a;
        float floatValue = this.f96891b.invoke(this.f96890a).floatValue();
        if (floatValue > 0.0f) {
            return i(scrollScope, this.f96890a.c(f11, this.f96892c, floatValue), f11, cVar);
        }
        throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0");
    }

    public /* synthetic */ f(i iVar, x00.l lVar, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec, int i11, v vVar) {
        this(iVar, (i11 & 2) != 0 ? g.f96920a.a() : lVar, decayAnimationSpec, (i11 & 8) != 0 ? g.f96920a.b() : animationSpec);
    }
}
