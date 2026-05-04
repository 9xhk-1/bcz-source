package com.google.accompanist.pager;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import m80.k;
import wv.i;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@b
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f30373a = new c();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final l<i, Float> f30374b = a.f30376a;

    /* renamed from: c, reason: collision with root package name */
    public static final int f30375c = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements l<i, Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30376a = new a();

        public a() {
            super(1);
        }

        @Override // x00.l
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(@k i layoutInfo) {
            g0.p(layoutInfo, "layoutInfo");
            return Float.valueOf(layoutInfo.f() - layoutInfo.g());
        }
    }

    @Composable
    @wv.a
    @k
    public final FlingBehavior a(@k f state, @m80.l DecayAnimationSpec<Float> decayAnimationSpec, @m80.l AnimationSpec<Float> animationSpec, @m80.l l<? super i, Float> lVar, float f11, @m80.l Composer composer, int i11, int i12) {
        g0.p(state, "state");
        composer.startReplaceableGroup(1278754661);
        if ((i12 & 2) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        DecayAnimationSpec<Float> decayAnimationSpec2 = decayAnimationSpec;
        if ((i12 & 4) != 0) {
            animationSpec = wv.g.f96920a.b();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if ((i12 & 8) != 0) {
            lVar = f30374b;
        }
        l<? super i, Float> lVar2 = lVar;
        if ((i12 & 16) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        wv.f b11 = wv.b.b(state.o(), wv.e.f96881a.c(), f11, decayAnimationSpec2, animationSpec2, lVar2, composer, ((i11 >> 6) & 896) | 36864 | (458752 & (i11 << 6)), 0);
        composer.endReplaceableGroup();
        return b11;
    }

    @k
    public final l<i, Float> b() {
        return f30374b;
    }

    @wv.a
    public static /* synthetic */ void c() {
    }
}
