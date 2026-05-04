package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import c40.r0;
import c40.s0;
import h10.o;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.a;
import x00.l;
import x00.p;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,411:1\n113#2:412\n96#3,5:413\n1247#4,6:418\n1247#4,3:431\n1250#4,3:435\n1247#4,6:438\n1247#4,6:444\n1247#4,6:451\n1247#4,6:457\n557#5:424\n554#5,6:425\n555#6:434\n75#7:450\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n*L\n89#1:412\n105#1:413,5\n111#1:418,6\n115#1:431,3\n115#1:435,3\n131#1:438,6\n137#1:444,6\n141#1:451,6\n263#1:457,6\n115#1:424\n115#1:425,6\n115#1:434\n139#1:450\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutPagerKt {
    /* JADX WARN: Removed duplicated region for block: B:127:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0220  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Pager-eLwUrMk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m966PagereLwUrMk(@m80.k final androidx.compose.ui.Modifier r30, @m80.k final androidx.compose.foundation.pager.PagerState r31, @m80.k final androidx.compose.foundation.layout.PaddingValues r32, final boolean r33, @m80.k final androidx.compose.foundation.gestures.Orientation r34, @m80.k final androidx.compose.foundation.gestures.TargetedFlingBehavior r35, final boolean r36, @m80.l final androidx.compose.foundation.OverscrollEffect r37, int r38, float r39, @m80.k final androidx.compose.foundation.pager.PageSize r40, @m80.k androidx.compose.ui.input.nestedscroll.NestedScrollConnection r41, @m80.l final x00.l<? super java.lang.Integer, ? extends java.lang.Object> r42, @m80.k final androidx.compose.ui.Alignment.Horizontal r43, @m80.k final androidx.compose.ui.Alignment.Vertical r44, @m80.k final androidx.compose.foundation.gestures.snapping.SnapPosition r45, @m80.k final x00.r<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r46, @m80.l androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt.m966PagereLwUrMk(androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.gestures.Orientation, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, int, float, androidx.compose.foundation.pager.PageSize, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, x00.l, androidx.compose.ui.Alignment$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.snapping.SnapPosition, x00.r, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final Modifier dragDirectionDetector(Modifier modifier, final PagerState pagerState) {
        return modifier.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, pagerState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @d(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", i = {}, l = {287}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
                final /* synthetic */ PagerState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                int label;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @d(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", i = {0, 1, 1, 1}, l = {289, 293}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "downEvent", "upEventOrCancellation"}, s = {"L$0", "L$0", "L$1", "L$2"})
                @u0({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,411:1\n87#2,2:412\n34#2,6:414\n89#2:420\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1$1$1\n*L\n294#1:412,2\n294#1:414,6\n294#1:420\n*E\n"})
                /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00561 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
                    final /* synthetic */ PagerState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00561(PagerState pagerState, c<? super C00561> cVar) {
                        super(2, cVar);
                        this.$state = pagerState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final c<g2> create(Object obj, c<?> cVar) {
                        C00561 c00561 = new C00561(this.$state, cVar);
                        c00561.L$0 = obj;
                        return c00561;
                    }

                    @Override // x00.p
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
                        return ((C00561) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
                    
                        if (r11 == r0) goto L17;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
                    
                        return r0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
                    
                        if (r11 == r0) goto L17;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0065 -> B:6:0x0068). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                        /*
                            r10 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                            int r1 = r10.label
                            r2 = 2
                            r3 = 0
                            r4 = 1
                            if (r1 == 0) goto L2f
                            if (r1 == r4) goto L27
                            if (r1 != r2) goto L1f
                            java.lang.Object r1 = r10.L$2
                            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                            java.lang.Object r4 = r10.L$1
                            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                            java.lang.Object r5 = r10.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                            kotlin.e.n(r11)
                            goto L68
                        L1f:
                            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r11.<init>(r0)
                            throw r11
                        L27:
                            java.lang.Object r1 = r10.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                            kotlin.e.n(r11)
                            goto L44
                        L2f:
                            kotlin.e.n(r11)
                            java.lang.Object r11 = r10.L$0
                            r1 = r11
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                            r10.L$0 = r1
                            r10.label = r4
                            java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r1, r3, r11, r10)
                            if (r11 != r0) goto L44
                            goto L67
                        L44:
                            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                            androidx.compose.foundation.pager.PagerState r4 = r10.$state
                            androidx.compose.ui.geometry.Offset$Companion r5 = androidx.compose.ui.geometry.Offset.Companion
                            long r5 = r5.m2284getZeroF1C5BW0()
                            r4.m985setUpDownDifferencek4lQ0M$foundation_release(r5)
                            r4 = 0
                            r5 = r1
                            r1 = r4
                            r4 = r11
                        L55:
                            if (r1 != 0) goto L94
                            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                            r10.L$0 = r5
                            r10.L$1 = r4
                            r10.L$2 = r1
                            r10.label = r2
                            java.lang.Object r11 = r5.awaitPointerEvent(r11, r10)
                            if (r11 != r0) goto L68
                        L67:
                            return r0
                        L68:
                            androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.ui.input.pointer.PointerEvent) r11
                            java.util.List r6 = r11.getChanges()
                            r7 = r6
                            java.util.Collection r7 = (java.util.Collection) r7
                            int r7 = r7.size()
                            r8 = r3
                        L76:
                            if (r8 >= r7) goto L88
                            java.lang.Object r9 = r6.get(r8)
                            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
                            boolean r9 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r9)
                            if (r9 != 0) goto L85
                            goto L55
                        L85:
                            int r8 = r8 + 1
                            goto L76
                        L88:
                            java.util.List r11 = r11.getChanges()
                            java.lang.Object r11 = r11.get(r3)
                            r1 = r11
                            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                            goto L55
                        L94:
                            androidx.compose.foundation.pager.PagerState r11 = r10.$state
                            long r0 = r1.m3732getPositionF1C5BW0()
                            long r2 = r4.m3732getPositionF1C5BW0()
                            long r0 = androidx.compose.ui.geometry.Offset.m2272minusMKHz9U(r0, r2)
                            r11.m985setUpDownDifferencek4lQ0M$foundation_release(r0)
                            yz.g2 r11 = yz.g2.f100423a
                            return r11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1.C00561.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, PagerState pagerState, c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = pagerState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final c<g2> create(Object obj, c<?> cVar) {
                    return new AnonymousClass1(this.$this_pointerInput, this.$state, cVar);
                }

                @Override // x00.p
                public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                    return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object l11 = b.l();
                    int i11 = this.label;
                    if (i11 == 0) {
                        e.n(obj);
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C00561 c00561 = new C00561(this.$state, null);
                        this.label = 1;
                        if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c00561, this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e.n(obj);
                    }
                    return g2.f100423a;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, c<? super g2> cVar) {
                Object g11 = s0.g(new AnonymousClass1(pointerInputScope, PagerState.this, null), cVar);
                return g11 == b.l() ? g11 : g2.f100423a;
            }
        }));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    private static final a<PagerLazyLayoutItemProvider> rememberPagerItemProviderLambda(final PagerState pagerState, r<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar, l<? super Integer, ? extends Object> lVar, final a<Integer> aVar, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1372505274, i11, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:259)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(rVar, composer, (i11 >> 3) & 14);
        final State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(lVar, composer, (i11 >> 6) & 14);
        boolean changed = ((((i11 & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i11 & 6) == 4) | composer.changed(rememberUpdatedState) | composer.changed(rememberUpdatedState2) | ((((i11 & 7168) ^ 3072) > 2048 && composer.changed(aVar)) || (i11 & 3072) == 2048);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new a<PagerLayoutIntervalContent>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final PagerLayoutIntervalContent invoke() {
                    return new PagerLayoutIntervalContent(rememberUpdatedState.getValue(), rememberUpdatedState2.getValue(), aVar.invoke().intValue());
                }
            });
            final State derivedStateOf2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new a<PagerLazyLayoutItemProvider>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final PagerLazyLayoutItemProvider invoke() {
                    PagerLayoutIntervalContent value = derivedStateOf.getValue();
                    return new PagerLazyLayoutItemProvider(pagerState, value, new NearestRangeKeyIndexMap(pagerState.getNearestRange$foundation_release(), value));
                }
            });
            rememberedValue = new PropertyReference0Impl(derivedStateOf2) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, h10.o
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        o oVar = (o) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return oVar;
    }
}
