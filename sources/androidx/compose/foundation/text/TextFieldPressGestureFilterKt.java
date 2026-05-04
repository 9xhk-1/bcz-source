package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import c40.r0;
import com.baicizhan.main.home.player.IslandsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldPressGestureFilterKt {
    @k
    public static final Modifier tapPressTextFieldModifier(@k Modifier modifier, @l final MutableInteractionSource mutableInteractionSource, boolean z11, @k final x00.l<? super Offset, g2> lVar) {
        return z11 ? ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(-102778667);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-102778667, i11, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                }
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                    composer.updateRememberedValue(rememberedValue);
                }
                final r0 r0Var = (r0) rememberedValue;
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                final MutableState mutableState = (MutableState) rememberedValue2;
                final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, 0);
                Object obj = mutableInteractionSource;
                boolean changed = composer.changed(obj);
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                Object rememberedValue3 = composer.rememberedValue();
                if (changed || rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            final MutableState<PressInteraction.Press> mutableState2 = mutableState;
                            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    PressInteraction.Press press = (PressInteraction.Press) MutableState.this.getValue();
                                    if (press != null) {
                                        PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                        if (mutableInteractionSource4 != null) {
                                            mutableInteractionSource4.tryEmit(cancel);
                                        }
                                        MutableState.this.setValue(null);
                                    }
                                }
                            };
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                EffectsKt.DisposableEffect(obj, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, composer, 0);
                Modifier.Companion companion2 = Modifier.Companion;
                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                boolean changedInstance = composer.changedInstance(r0Var) | composer.changed(mutableInteractionSource) | composer.changed(rememberUpdatedState);
                final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
                Object rememberedValue4 = composer.rememberedValue();
                if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1

                        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                        @d(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends SuspendLambda implements q<PressGestureScope, Offset, j00.c<? super g2>, Object> {
                            final /* synthetic */ MutableInteractionSource $interactionSource;
                            final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                            final /* synthetic */ r0 $scope;
                            /* synthetic */ long J$0;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                            @d(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", i = {1}, l = {60, 64}, m = "invokeSuspend", n = {IslandsKt.f23311p}, s = {"L$0"})
                            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            public static final class C00611 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ long $it;
                                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                                Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C00611(MutableState<PressInteraction.Press> mutableState, long j11, MutableInteractionSource mutableInteractionSource, j00.c<? super C00611> cVar) {
                                    super(2, cVar);
                                    this.$pressedInteraction = mutableState;
                                    this.$it = j11;
                                    this.$interactionSource = mutableInteractionSource;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                                    return new C00611(this.$pressedInteraction, this.$it, this.$interactionSource, cVar);
                                }

                                @Override // x00.p
                                public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                                    return ((C00611) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                                    /*
                                        r7 = this;
                                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                                        int r1 = r7.label
                                        r2 = 0
                                        r3 = 2
                                        r4 = 1
                                        if (r1 == 0) goto L27
                                        if (r1 == r4) goto L1f
                                        if (r1 != r3) goto L17
                                        java.lang.Object r0 = r7.L$0
                                        androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                                        kotlin.e.n(r8)
                                        goto L66
                                    L17:
                                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                        r8.<init>(r0)
                                        throw r8
                                    L1f:
                                        java.lang.Object r1 = r7.L$0
                                        androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                                        kotlin.e.n(r8)
                                        goto L4b
                                    L27:
                                        kotlin.e.n(r8)
                                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r8 = r7.$pressedInteraction
                                        java.lang.Object r8 = r8.getValue()
                                        androidx.compose.foundation.interaction.PressInteraction$Press r8 = (androidx.compose.foundation.interaction.PressInteraction.Press) r8
                                        if (r8 == 0) goto L4f
                                        androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r5 = r7.$pressedInteraction
                                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                                        r6.<init>(r8)
                                        if (r1 == 0) goto L4c
                                        r7.L$0 = r5
                                        r7.label = r4
                                        java.lang.Object r8 = r1.emit(r6, r7)
                                        if (r8 != r0) goto L4a
                                        goto L64
                                    L4a:
                                        r1 = r5
                                    L4b:
                                        r5 = r1
                                    L4c:
                                        r5.setValue(r2)
                                    L4f:
                                        androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                                        long r4 = r7.$it
                                        r8.<init>(r4, r2)
                                        androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                                        if (r1 == 0) goto L67
                                        r7.L$0 = r8
                                        r7.label = r3
                                        java.lang.Object r1 = r1.emit(r8, r7)
                                        if (r1 != r0) goto L65
                                    L64:
                                        return r0
                                    L65:
                                        r0 = r8
                                    L66:
                                        r8 = r0
                                    L67:
                                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r7.$pressedInteraction
                                        r0.setValue(r8)
                                        yz.g2 r8 = yz.g2.f100423a
                                        return r8
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1.C00611.invokeSuspend(java.lang.Object):java.lang.Object");
                                }
                            }

                            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                            @d(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
                            public static final class AnonymousClass2 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                                final /* synthetic */ boolean $success;
                                Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass2(MutableState<PressInteraction.Press> mutableState, boolean z11, MutableInteractionSource mutableInteractionSource, j00.c<? super AnonymousClass2> cVar) {
                                    super(2, cVar);
                                    this.$pressedInteraction = mutableState;
                                    this.$success = z11;
                                    this.$interactionSource = mutableInteractionSource;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                                    return new AnonymousClass2(this.$pressedInteraction, this.$success, this.$interactionSource, cVar);
                                }

                                @Override // x00.p
                                public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                                    return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    MutableState<PressInteraction.Press> mutableState;
                                    MutableState<PressInteraction.Press> mutableState2;
                                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                                    int i11 = this.label;
                                    if (i11 == 0) {
                                        e.n(obj);
                                        PressInteraction.Press value = this.$pressedInteraction.getValue();
                                        if (value != null) {
                                            boolean z11 = this.$success;
                                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                            mutableState = this.$pressedInteraction;
                                            Interaction release = z11 ? new PressInteraction.Release(value) : new PressInteraction.Cancel(value);
                                            if (mutableInteractionSource != null) {
                                                this.L$0 = mutableState;
                                                this.label = 1;
                                                if (mutableInteractionSource.emit(release, this) == l11) {
                                                    return l11;
                                                }
                                                mutableState2 = mutableState;
                                            }
                                            mutableState.setValue(null);
                                        }
                                        return g2.f100423a;
                                    }
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    mutableState2 = (MutableState) this.L$0;
                                    e.n(obj);
                                    mutableState = mutableState2;
                                    mutableState.setValue(null);
                                    return g2.f100423a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(r0 r0Var, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, j00.c<? super AnonymousClass1> cVar) {
                                super(3, cVar);
                                this.$scope = r0Var;
                                this.$pressedInteraction = mutableState;
                                this.$interactionSource = mutableInteractionSource;
                            }

                            @Override // x00.q
                            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, j00.c<? super g2> cVar) {
                                return m1154invoked4ec7I(pressGestureScope, offset.m2278unboximpl(), cVar);
                            }

                            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                            public final Object m1154invoked4ec7I(PressGestureScope pressGestureScope, long j11, j00.c<? super g2> cVar) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, cVar);
                                anonymousClass1.L$0 = pressGestureScope;
                                anonymousClass1.J$0 = j11;
                                return anonymousClass1.invokeSuspend(g2.f100423a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object l11 = kotlin.coroutines.intrinsics.b.l();
                                int i11 = this.label;
                                if (i11 == 0) {
                                    e.n(obj);
                                    PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                    c40.k.f(this.$scope, null, null, new C00611(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3, null);
                                    this.label = 1;
                                    obj = pressGestureScope.tryAwaitRelease(this);
                                    if (obj == l11) {
                                        return l11;
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    e.n(obj);
                                }
                                c40.k.f(this.$scope, null, null, new AnonymousClass2(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3, null);
                                return g2.f100423a;
                            }
                        }

                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(r0.this, mutableState, mutableInteractionSource4, null);
                            final State<x00.l<Offset, g2>> state = rememberUpdatedState;
                            Object detectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, anonymousClass1, new x00.l<Offset, g2>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // x00.l
                                public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                                    m1155invokek4lQ0M(offset.m2278unboximpl());
                                    return g2.f100423a;
                                }

                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                public final void m1155invokek4lQ0M(long j11) {
                                    state.getValue().invoke(Offset.m2257boximpl(j11));
                                }
                            }, cVar);
                            return detectTapAndPress == kotlin.coroutines.intrinsics.b.l() ? detectTapAndPress : g2.f100423a;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource3, (PointerInputEventHandler) rememberedValue4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return pointerInput;
            }
        }, 1, null) : modifier;
    }

    public static /* synthetic */ Modifier tapPressTextFieldModifier$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z11, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return tapPressTextFieldModifier(modifier, mutableInteractionSource, z11, lVar);
    }
}
