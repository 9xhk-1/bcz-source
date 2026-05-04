package um;

import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.l<DisposableEffectScope, DisposableEffectResult> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ um.d f92314a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ManagedActivityResultLauncher<String[], Map<String, Boolean>> f92315b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: um.e$a$a, reason: collision with other inner class name */
        public static final class C1242a implements DisposableEffectResult {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ um.d f92316a;

            public C1242a(um.d dVar) {
                this.f92316a = dVar;
            }

            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.f92316a.h(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(um.d dVar, ManagedActivityResultLauncher<String[], Map<String, Boolean>> managedActivityResultLauncher) {
            super(1);
            this.f92314a = dVar;
            this.f92315b = managedActivityResultLauncher;
        }

        @Override // x00.l
        @m80.k
        public final DisposableEffectResult invoke(@m80.k DisposableEffectScope DisposableEffect) {
            g0.p(DisposableEffect, "$this$DisposableEffect");
            this.f92314a.h(this.f92315b);
            return new C1242a(this.f92314a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.l<Map<String, Boolean>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ um.d f92317a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(um.d dVar) {
            super(1);
            this.f92317a = dVar;
        }

        public final void a(@m80.k Map<String, Boolean> permissionsResult) {
            g0.p(permissionsResult, "permissionsResult");
            this.f92317a.j(permissionsResult);
            this.f92317a.i(true);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Map<String, Boolean> map) {
            a(map);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.l<DisposableEffectScope, DisposableEffectResult> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f92318a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> f92319b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements DisposableEffectResult {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f92320a;

            public a(f fVar) {
                this.f92320a = fVar;
            }

            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.f92320a.k(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f fVar, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher) {
            super(1);
            this.f92318a = fVar;
            this.f92319b = managedActivityResultLauncher;
        }

        @Override // x00.l
        @m80.k
        public final DisposableEffectResult invoke(@m80.k DisposableEffectScope DisposableEffect) {
            g0.p(DisposableEffect, "$this$DisposableEffect");
            this.f92318a.k(this.f92319b);
            return new a(this.f92318a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements x00.l<Boolean, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f92321a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar) {
            super(1);
            this.f92321a = fVar;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return g2.f100423a;
        }

        public final void invoke(boolean z11) {
            this.f92321a.j(z11);
        }
    }

    @Composable
    @um.a
    @m80.k
    public static final um.b a(@m80.k List<String> permissions, @m80.l Composer composer, int i11) {
        g0.p(permissions, "permissions");
        composer.startReplaceableGroup(-1585749351);
        List<f> b11 = b(permissions, composer, 8);
        m.e(b11, null, composer, 8, 2);
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(permissions);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new um.d(b11);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        um.d dVar = (um.d) rememberedValue;
        ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new b(dVar), composer, 8);
        EffectsKt.DisposableEffect(dVar, rememberLauncherForActivityResult, new a(dVar, rememberLauncherForActivityResult), composer, ManagedActivityResultLauncher.$stable << 3);
        composer.endReplaceableGroup();
        return dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L6;
     */
    @androidx.compose.runtime.Composable
    @um.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<um.f> b(java.util.List<java.lang.String> r5, androidx.compose.runtime.Composer r6, int r7) {
        /*
            r7 = -1458104751(0xffffffffa9171651, float:-3.3548092E-14)
            r6.startReplaceableGroup(r7)
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()
            java.lang.Object r7 = r6.consume(r7)
            android.content.Context r7 = (android.content.Context) r7
            android.app.Activity r0 = um.m.h(r7)
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r6.startReplaceableGroup(r1)
            boolean r2 = r6.changed(r5)
            java.lang.Object r3 = r6.rememberedValue()
            if (r2 != 0) goto L2c
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L55
        L2c:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r3 = new java.util.ArrayList
            r2 = 10
            int r2 = a00.i0.d0(r5, r2)
            r3.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L3d:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            um.f r4 = new um.f
            r4.<init>(r2, r7, r0)
            r3.add(r4)
            goto L3d
        L52:
            r6.updateRememberedValue(r3)
        L55:
            r6.endReplaceableGroup()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r5 = r3.iterator()
        L5e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Laf
            java.lang.Object r7 = r5.next()
            um.f r7 = (um.f) r7
            r0 = -1458104231(0xffffffffa9171859, float:-3.3549854E-14)
            java.lang.String r2 = r7.e()
            r6.startMovableGroup(r0, r2)
            androidx.activity.result.contract.ActivityResultContracts$RequestPermission r0 = new androidx.activity.result.contract.ActivityResultContracts$RequestPermission
            r0.<init>()
            r6.startReplaceableGroup(r1)
            boolean r2 = r6.changed(r7)
            java.lang.Object r4 = r6.rememberedValue()
            if (r2 != 0) goto L8e
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r4 != r2) goto L96
        L8e:
            um.e$d r4 = new um.e$d
            r4.<init>(r7)
            r6.updateRememberedValue(r4)
        L96:
            r6.endReplaceableGroup()
            x00.l r4 = (x00.l) r4
            r2 = 8
            androidx.activity.compose.ManagedActivityResultLauncher r0 = androidx.activity.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(r0, r4, r6, r2)
            um.e$c r2 = new um.e$c
            r2.<init>(r7, r0)
            int r7 = androidx.activity.compose.ManagedActivityResultLauncher.$stable
            androidx.compose.runtime.EffectsKt.DisposableEffect(r0, r2, r6, r7)
            r6.endMovableGroup()
            goto L5e
        Laf:
            r6.endReplaceableGroup()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: um.e.b(java.util.List, androidx.compose.runtime.Composer, int):java.util.List");
    }
}
