package androidx.lifecycle.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffectImpl$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,745:1\n64#2,5:746\n1#3:751\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffectImpl$1$1\n*L\n374#1:746,5\n*E\n"})
/* loaded from: classes2.dex */
public final class LifecycleEffectKt$LifecycleStartEffectImpl$1$1 extends Lambda implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ l<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> $effects;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ LifecycleStartStopEffectScope $scope;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleEffectKt$LifecycleStartEffectImpl$1$1(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, l<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> lVar) {
        super(1);
        this.$lifecycleOwner = lifecycleOwner;
        this.$scope = lifecycleStartStopEffectScope;
        this.$effects = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static final void invoke$lambda$1(LifecycleStartStopEffectScope lifecycleStartStopEffectScope, Ref.ObjectRef objectRef, l lVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            objectRef.element = lVar.invoke(lifecycleStartStopEffectScope);
        } else {
            if (i11 != 2) {
                return;
            }
            LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) objectRef.element;
            if (lifecycleStopOrDisposeEffectResult != null) {
                lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
            }
            objectRef.element = null;
        }
    }

    @Override // x00.l
    @k
    public final DisposableEffectResult invoke(@k DisposableEffectScope disposableEffectScope) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final LifecycleStartStopEffectScope lifecycleStartStopEffectScope = this.$scope;
        final l<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> lVar = this.$effects;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.c
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleEffectKt$LifecycleStartEffectImpl$1$1.invoke$lambda$1(LifecycleStartStopEffectScope.this, objectRef, lVar, lifecycleOwner, event);
            }
        };
        this.$lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
                LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) objectRef.element;
                if (lifecycleStopOrDisposeEffectResult != null) {
                    lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
                }
            }
        };
    }
}
