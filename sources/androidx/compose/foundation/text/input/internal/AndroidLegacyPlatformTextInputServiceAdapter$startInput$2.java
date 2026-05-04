package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.ui.platform.PlatformTextInputSession;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends SuspendLambda implements x00.p<PlatformTextInputSession, j00.c<?>, Object> {
    final /* synthetic */ x00.l<LegacyTextInputMethodRequest, g2> $initializeRequest;
    final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode $node;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements x00.p<c40.r0, j00.c<?>, Object> {
        final /* synthetic */ PlatformTextInputSession $$this$launchTextInputSession;
        final /* synthetic */ x00.l<LegacyTextInputMethodRequest, g2> $initializeRequest;
        final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode $node;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {140, 141}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00621 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
            final /* synthetic */ InputMethodManager $inputMethodManager;
            int label;
            final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00621(AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, InputMethodManager inputMethodManager, j00.c<? super C00621> cVar) {
                super(2, cVar);
                this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
                this.$inputMethodManager = inputMethodManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C00621(this.this$0, this.$inputMethodManager, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                return ((C00621) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
            
                if (r5.collect(r1, r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
            
                if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r5, r4) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r4.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 == r2) goto L16
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L16:
                    kotlin.e.n(r5)
                    goto L44
                L1a:
                    kotlin.e.n(r5)
                    goto L2c
                L1e:
                    kotlin.e.n(r5)
                    androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$1 r5 = new x00.l<java.lang.Long, yz.g2>() { // from class: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.startInput.2.1.1.1
                        static {
                            /*
                                androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$1 r0 = new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$1
                                r0.<init>()
                                
                                // error: 0x0005: SPUT (r0 I:androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$1) androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.startInput.2.1.1.1.INSTANCE androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$1
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C00621.C00631.<clinit>():void");
                        }

                        {
                            /*
                                r1 = this;
                                r0 = 1
                                r1.<init>(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C00621.C00631.<init>():void");
                        }

                        public final void invoke(long r1) {
                            /*
                                r0 = this;
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C00621.C00631.invoke(long):void");
                        }

                        @Override // x00.l
                        public /* bridge */ /* synthetic */ yz.g2 invoke(java.lang.Long r3) {
                            /*
                                r2 = this;
                                java.lang.Number r3 = (java.lang.Number) r3
                                long r0 = r3.longValue()
                                r2.invoke(r0)
                                yz.g2 r3 = yz.g2.f100423a
                                return r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C00621.C00631.invoke(java.lang.Object):java.lang.Object");
                        }
                    }
                    r4.label = r3
                    java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r5, r4)
                    if (r5 != r0) goto L2c
                    goto L43
                L2c:
                    androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter r5 = r4.this$0
                    kotlinx.coroutines.flow.x r5 = androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.access$getStylusHandwritingTrigger(r5)
                    if (r5 == 0) goto L4a
                    androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$2 r1 = new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$2
                    androidx.compose.foundation.text.input.internal.InputMethodManager r3 = r4.$inputMethodManager
                    r1.<init>()
                    r4.label = r2
                    java.lang.Object r5 = r5.collect(r1, r4)
                    if (r5 != r0) goto L44
                L43:
                    return r0
                L44:
                    kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
                    r5.<init>()
                    throw r5
                L4a:
                    yz.g2 r5 = yz.g2.f100423a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C00621.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PlatformTextInputSession platformTextInputSession, x00.l<? super LegacyTextInputMethodRequest, g2> lVar, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$$this$launchTextInputSession = platformTextInputSession;
            this.$initializeRequest = lVar;
            this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
            this.$node = legacyPlatformTextInputNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<?> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    c40.r0 r0Var = (c40.r0) this.L$0;
                    InputMethodManager invoke = LegacyPlatformTextInputServiceAdapter_androidKt.getInputMethodManagerFactory().invoke(this.$$this$launchTextInputSession.getView());
                    LegacyTextInputMethodRequest legacyTextInputMethodRequest = new LegacyTextInputMethodRequest(this.$$this$launchTextInputSession.getView(), new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(this.$node), invoke);
                    if (StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
                        c40.k.f(r0Var, null, null, new C00621(this.this$0, invoke, null), 3, null);
                    }
                    x00.l<LegacyTextInputMethodRequest, g2> lVar = this.$initializeRequest;
                    if (lVar != null) {
                        lVar.invoke(legacyTextInputMethodRequest);
                    }
                    this.this$0.currentRequest = legacyTextInputMethodRequest;
                    PlatformTextInputSession platformTextInputSession = this.$$this$launchTextInputSession;
                    this.label = 1;
                    if (platformTextInputSession.startInputMethod(legacyTextInputMethodRequest, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th2) {
                this.this$0.currentRequest = null;
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(x00.l<? super LegacyTextInputMethodRequest, g2> lVar, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, j00.c<? super AndroidLegacyPlatformTextInputServiceAdapter$startInput$2> cVar) {
        super(2, cVar);
        this.$initializeRequest = lVar;
        this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
        this.$node = legacyPlatformTextInputNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.$initializeRequest, this.this$0, this.$node, cVar);
        androidLegacyPlatformTextInputServiceAdapter$startInput$2.L$0 = obj;
        return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
    }

    @Override // x00.p
    public final Object invoke(PlatformTextInputSession platformTextInputSession, j00.c<?> cVar) {
        return ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2) create(platformTextInputSession, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PlatformTextInputSession) this.L$0, this.$initializeRequest, this.this$0, this.$node, null);
            this.label = 1;
            if (c40.s0.g(anonymousClass1, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
