package um;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.l<DisposableEffectScope, DisposableEffectResult> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f92329a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> f92330b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: um.g$a$a, reason: collision with other inner class name */
        public static final class C1243a implements DisposableEffectResult {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f92331a;

            public C1243a(f fVar) {
                this.f92331a = fVar;
            }

            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.f92331a.k(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher) {
            super(1);
            this.f92329a = fVar;
            this.f92330b = managedActivityResultLauncher;
        }

        @Override // x00.l
        @m80.k
        public final DisposableEffectResult invoke(@m80.k DisposableEffectScope DisposableEffect) {
            g0.p(DisposableEffect, "$this$DisposableEffect");
            this.f92329a.k(this.f92330b);
            return new C1243a(this.f92329a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.l<Boolean, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f92332a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(1);
            this.f92332a = fVar;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return g2.f100423a;
        }

        public final void invoke(boolean z11) {
            this.f92332a.j(z11);
            this.f92332a.l(true);
        }
    }

    @Composable
    @um.a
    @m80.k
    public static final f a(@m80.k String permission, @m80.l Composer composer, int i11) {
        g0.p(permission, "permission");
        composer.startReplaceableGroup(-1903070366);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(permission);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new f(permission, context, m.h(context));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        f fVar = (f) rememberedValue;
        m.c(fVar, null, composer, 0, 2);
        ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestPermission(), new b(fVar), composer, 8);
        EffectsKt.DisposableEffect(fVar, rememberLauncherForActivityResult, new a(fVar, rememberLauncherForActivityResult), composer, ManagedActivityResultLauncher.$stable << 3);
        composer.endReplaceableGroup();
        return fVar;
    }
}
