package com.google.accompanist.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import c40.r0;
import g10.u;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;
import x00.l;
import x00.p;
import x00.q;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "Pager")
/* loaded from: classes6.dex */
public final class Pager {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f30293a = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30308a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Modifier f30309b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.google.accompanist.pager.f f30310c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f30311d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f30312e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f30313f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Alignment.Vertical f30314g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f30315h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ l<Integer, Object> f30316i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ r<com.google.accompanist.pager.d, Integer, Composer, Integer, g2> f30317j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f30318k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f30319l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i11, Modifier modifier, com.google.accompanist.pager.f fVar, boolean z11, float f11, PaddingValues paddingValues, Alignment.Vertical vertical, FlingBehavior flingBehavior, l<? super Integer, ? extends Object> lVar, r<? super com.google.accompanist.pager.d, ? super Integer, ? super Composer, ? super Integer, g2> rVar, int i12, int i13) {
            super(2);
            this.f30308a = i11;
            this.f30309b = modifier;
            this.f30310c = fVar;
            this.f30311d = z11;
            this.f30312e = f11;
            this.f30313f = paddingValues;
            this.f30314g = vertical;
            this.f30315h = flingBehavior;
            this.f30316i = lVar;
            this.f30317j = rVar;
            this.f30318k = i12;
            this.f30319l = i13;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            Pager.a(this.f30308a, this.f30309b, this.f30310c, this.f30311d, this.f30312e, this.f30313f, this.f30314g, this.f30315h, this.f30316i, this.f30317j, composer, this.f30318k | 1, this.f30319l);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.a<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f30320a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FlingBehavior flingBehavior) {
            super(0);
            this.f30320a = flingBehavior;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.l
        public final Integer invoke() {
            FlingBehavior flingBehavior = this.f30320a;
            wv.f fVar = flingBehavior instanceof wv.f ? (wv.f) flingBehavior : null;
            if (fVar == null) {
                return null;
            }
            return fVar.j();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.google.accompanist.pager.Pager$Pager$3$1", f = "Pager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f30321a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.accompanist.pager.f f30322b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30323c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.google.accompanist.pager.f fVar, int i11, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f30322b = fVar;
            this.f30323c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@m80.l Object obj, @k j00.c<?> cVar) {
            return new c(this.f30322b, this.f30323c, cVar);
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@k r0 r0Var, @m80.l j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f30321a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            com.google.accompanist.pager.f fVar = this.f30322b;
            fVar.y(u.u(Math.min(this.f30323c - 1, fVar.k()), 0));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements l<LazyListScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30324a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Integer, Object> f30325b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.google.accompanist.pager.a f30326c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r<com.google.accompanist.pager.d, Integer, Composer, Integer, g2> f30327d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.google.accompanist.pager.e f30328e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f30329f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends Lambda implements r<LazyItemScope, Integer, Composer, Integer, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.google.accompanist.pager.a f30330a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r<com.google.accompanist.pager.d, Integer, Composer, Integer, g2> f30331b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.google.accompanist.pager.e f30332c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f30333d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(com.google.accompanist.pager.a aVar, r<? super com.google.accompanist.pager.d, ? super Integer, ? super Composer, ? super Integer, g2> rVar, com.google.accompanist.pager.e eVar, int i11) {
                super(4);
                this.f30330a = aVar;
                this.f30331b = rVar;
                this.f30332c = eVar;
                this.f30333d = i11;
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(@k LazyItemScope items, int i11, @m80.l Composer composer, int i12) {
                int i13;
                int i14;
                Modifier fillParentMaxHeight$default;
                g0.p(items, "$this$items");
                if ((i12 & 14) == 0) {
                    i13 = i12 | (composer.changed(items) ? 4 : 2);
                } else {
                    i13 = i12;
                }
                if ((i12 & 112) == 0) {
                    i14 = i11;
                    i13 |= composer.changed(i14) ? 32 : 16;
                } else {
                    i14 = i11;
                }
                if (((i13 & 731) ^ 146) == 0 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                fillParentMaxHeight$default = LazyItemScope.fillParentMaxHeight$default(items, NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, this.f30330a, null, 2, null), 0.0f, 1, null);
                Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(fillParentMaxHeight$default, null, false, 3, null);
                r<com.google.accompanist.pager.d, Integer, Composer, Integer, g2> rVar = this.f30331b;
                com.google.accompanist.pager.e eVar = this.f30332c;
                int i15 = this.f30333d;
                composer.startReplaceableGroup(-1990474327);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089394);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                x00.a<ComposeUiNode> constructor = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, g2> materializerOf = LayoutKt.materializerOf(wrapContentSize$default);
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
                Updater.m1958setimpl(m1951constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl, density, companion.getSetDensity());
                Updater.m1958setimpl(m1951constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m1958setimpl(m1951constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1924boximpl(SkippableUpdater.m1925constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                rVar.invoke(eVar, Integer.valueOf(i14), composer, Integer.valueOf((i13 & 112) | ((i15 << 3) & 896)));
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i11, l<? super Integer, ? extends Object> lVar, com.google.accompanist.pager.a aVar, r<? super com.google.accompanist.pager.d, ? super Integer, ? super Composer, ? super Integer, g2> rVar, com.google.accompanist.pager.e eVar, int i12) {
            super(1);
            this.f30324a = i11;
            this.f30325b = lVar;
            this.f30326c = aVar;
            this.f30327d = rVar;
            this.f30328e = eVar;
            this.f30329f = i12;
        }

        public final void a(@k LazyListScope LazyColumn) {
            g0.p(LazyColumn, "$this$LazyColumn");
            LazyColumn.items(this.f30324a, this.f30325b, ComposableLambdaKt.composableLambdaInstance(-985539339, true, new a(this.f30326c, this.f30327d, this.f30328e, this.f30329f)));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(LazyListScope lazyListScope) {
            a(lazyListScope);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements l<LazyListScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30334a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Integer, Object> f30335b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.google.accompanist.pager.a f30336c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r<com.google.accompanist.pager.d, Integer, Composer, Integer, g2> f30337d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.google.accompanist.pager.e f30338e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f30339f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends Lambda implements r<LazyItemScope, Integer, Composer, Integer, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.google.accompanist.pager.a f30340a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r<com.google.accompanist.pager.d, Integer, Composer, Integer, g2> f30341b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.google.accompanist.pager.e f30342c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f30343d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(com.google.accompanist.pager.a aVar, r<? super com.google.accompanist.pager.d, ? super Integer, ? super Composer, ? super Integer, g2> rVar, com.google.accompanist.pager.e eVar, int i11) {
                super(4);
                this.f30340a = aVar;
                this.f30341b = rVar;
                this.f30342c = eVar;
                this.f30343d = i11;
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(@k LazyItemScope items, int i11, @m80.l Composer composer, int i12) {
                int i13;
                int i14;
                Modifier fillParentMaxWidth$default;
                g0.p(items, "$this$items");
                if ((i12 & 14) == 0) {
                    i13 = i12 | (composer.changed(items) ? 4 : 2);
                } else {
                    i13 = i12;
                }
                if ((i12 & 112) == 0) {
                    i14 = i11;
                    i13 |= composer.changed(i14) ? 32 : 16;
                } else {
                    i14 = i11;
                }
                if (((i13 & 731) ^ 146) == 0 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                fillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(items, NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, this.f30340a, null, 2, null), 0.0f, 1, null);
                Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(fillParentMaxWidth$default, null, false, 3, null);
                r<com.google.accompanist.pager.d, Integer, Composer, Integer, g2> rVar = this.f30341b;
                com.google.accompanist.pager.e eVar = this.f30342c;
                int i15 = this.f30343d;
                composer.startReplaceableGroup(-1990474327);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089394);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                x00.a<ComposeUiNode> constructor = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, g2> materializerOf = LayoutKt.materializerOf(wrapContentSize$default);
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
                Updater.m1958setimpl(m1951constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl, density, companion.getSetDensity());
                Updater.m1958setimpl(m1951constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m1958setimpl(m1951constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1924boximpl(SkippableUpdater.m1925constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                rVar.invoke(eVar, Integer.valueOf(i14), composer, Integer.valueOf((i13 & 112) | ((i15 << 3) & 896)));
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(int i11, l<? super Integer, ? extends Object> lVar, com.google.accompanist.pager.a aVar, r<? super com.google.accompanist.pager.d, ? super Integer, ? super Composer, ? super Integer, g2> rVar, com.google.accompanist.pager.e eVar, int i12) {
            super(1);
            this.f30334a = i11;
            this.f30335b = lVar;
            this.f30336c = aVar;
            this.f30337d = rVar;
            this.f30338e = eVar;
            this.f30339f = i12;
        }

        public final void a(@k LazyListScope LazyRow) {
            g0.p(LazyRow, "$this$LazyRow");
            LazyRow.items(this.f30334a, this.f30335b, ComposableLambdaKt.composableLambdaInstance(-985545868, true, new a(this.f30336c, this.f30337d, this.f30338e, this.f30339f)));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(LazyListScope lazyListScope) {
            a(lazyListScope);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends Lambda implements p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30344a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Modifier f30345b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.google.accompanist.pager.f f30346c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f30347d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f30348e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f30349f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f30350g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ l<Integer, Object> f30351h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f30352i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Alignment.Vertical f30353j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Alignment.Horizontal f30354k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r<com.google.accompanist.pager.d, Integer, Composer, Integer, g2> f30355l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f30356m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f30357n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f30358o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(int i11, Modifier modifier, com.google.accompanist.pager.f fVar, boolean z11, float f11, boolean z12, FlingBehavior flingBehavior, l<? super Integer, ? extends Object> lVar, PaddingValues paddingValues, Alignment.Vertical vertical, Alignment.Horizontal horizontal, r<? super com.google.accompanist.pager.d, ? super Integer, ? super Composer, ? super Integer, g2> rVar, int i12, int i13, int i14) {
            super(2);
            this.f30344a = i11;
            this.f30345b = modifier;
            this.f30346c = fVar;
            this.f30347d = z11;
            this.f30348e = f11;
            this.f30349f = z12;
            this.f30350g = flingBehavior;
            this.f30351h = lVar;
            this.f30352i = paddingValues;
            this.f30353j = vertical;
            this.f30354k = horizontal;
            this.f30355l = rVar;
            this.f30356m = i12;
            this.f30357n = i13;
            this.f30358o = i14;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            Pager.b(this.f30344a, this.f30345b, this.f30346c, this.f30347d, this.f30348e, this.f30349f, this.f30350g, this.f30351h, this.f30352i, this.f30353j, this.f30354k, this.f30355l, composer, this.f30356m | 1, this.f30357n, this.f30358o);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends Lambda implements p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30359a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Modifier f30360b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.google.accompanist.pager.f f30361c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f30362d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f30363e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f30364f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Alignment.Horizontal f30365g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f30366h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ l<Integer, Object> f30367i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ r<com.google.accompanist.pager.d, Integer, Composer, Integer, g2> f30368j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f30369k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f30370l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(int i11, Modifier modifier, com.google.accompanist.pager.f fVar, boolean z11, float f11, PaddingValues paddingValues, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, l<? super Integer, ? extends Object> lVar, r<? super com.google.accompanist.pager.d, ? super Integer, ? super Composer, ? super Integer, g2> rVar, int i12, int i13) {
            super(2);
            this.f30359a = i11;
            this.f30360b = modifier;
            this.f30361c = fVar;
            this.f30362d = z11;
            this.f30363e = f11;
            this.f30364f = paddingValues;
            this.f30365g = horizontal;
            this.f30366h = flingBehavior;
            this.f30367i = lVar;
            this.f30368j = rVar;
            this.f30369k = i12;
            this.f30370l = i13;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            Pager.c(this.f30359a, this.f30360b, this.f30361c, this.f30362d, this.f30363e, this.f30364f, this.f30365g, this.f30366h, this.f30367i, this.f30368j, composer, this.f30369k | 1, this.f30370l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0248 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010e  */
    @androidx.compose.runtime.Composable
    @com.google.accompanist.pager.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r27, @m80.l androidx.compose.ui.Modifier r28, @m80.l com.google.accompanist.pager.f r29, boolean r30, float r31, @m80.l androidx.compose.foundation.layout.PaddingValues r32, @m80.l androidx.compose.ui.Alignment.Vertical r33, @m80.l androidx.compose.foundation.gestures.FlingBehavior r34, @m80.l x00.l<? super java.lang.Integer, ? extends java.lang.Object> r35, @m80.k x00.r<? super com.google.accompanist.pager.d, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r36, @m80.l androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.Pager.a(int, androidx.compose.ui.Modifier, com.google.accompanist.pager.f, boolean, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, x00.l, x00.r, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d3, code lost:
    
        if (r5 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b9  */
    @androidx.compose.runtime.Composable
    @com.google.accompanist.pager.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r25, @m80.k androidx.compose.ui.Modifier r26, @m80.k com.google.accompanist.pager.f r27, boolean r28, float r29, boolean r30, @m80.k androidx.compose.foundation.gestures.FlingBehavior r31, @m80.l x00.l<? super java.lang.Integer, ? extends java.lang.Object> r32, @m80.k androidx.compose.foundation.layout.PaddingValues r33, @m80.l androidx.compose.ui.Alignment.Vertical r34, @m80.l androidx.compose.ui.Alignment.Horizontal r35, @m80.k x00.r<? super com.google.accompanist.pager.d, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r36, @m80.l androidx.compose.runtime.Composer r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.Pager.b(int, androidx.compose.ui.Modifier, com.google.accompanist.pager.f, boolean, float, boolean, androidx.compose.foundation.gestures.FlingBehavior, x00.l, androidx.compose.foundation.layout.PaddingValues, androidx.compose.ui.Alignment$Vertical, androidx.compose.ui.Alignment$Horizontal, x00.r, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0244 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010e  */
    @androidx.compose.runtime.Composable
    @com.google.accompanist.pager.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(int r26, @m80.l androidx.compose.ui.Modifier r27, @m80.l com.google.accompanist.pager.f r28, boolean r29, float r30, @m80.l androidx.compose.foundation.layout.PaddingValues r31, @m80.l androidx.compose.ui.Alignment.Horizontal r32, @m80.l androidx.compose.foundation.gestures.FlingBehavior r33, @m80.l x00.l<? super java.lang.Integer, ? extends java.lang.Object> r34, @m80.k x00.r<? super com.google.accompanist.pager.d, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r35, @m80.l androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.Pager.c(int, androidx.compose.ui.Modifier, com.google.accompanist.pager.f, boolean, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, x00.l, x00.r, androidx.compose.runtime.Composer, int, int):void");
    }

    @com.google.accompanist.pager.b
    public static final float f(@k com.google.accompanist.pager.d dVar, int i11) {
        g0.p(dVar, "<this>");
        return (dVar.a() + dVar.b()) - i11;
    }

    public static final long g(long j11, boolean z11, boolean z12) {
        return OffsetKt.Offset(z11 ? Offset.m2268getXimpl(j11) : 0.0f, z12 ? Offset.m2269getYimpl(j11) : 0.0f);
    }

    public static final long h(long j11, boolean z11, boolean z12) {
        return VelocityKt.Velocity(z11 ? Velocity.m5353getXimpl(j11) : 0.0f, z12 ? Velocity.m5354getYimpl(j11) : 0.0f);
    }
}
