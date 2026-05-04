package um;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.l<DisposableEffectScope, DisposableEffectResult> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f92347a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LifecycleEventObserver f92348b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: um.m$a$a, reason: collision with other inner class name */
        public static final class C1244a implements DisposableEffectResult {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Lifecycle f92349a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LifecycleEventObserver f92350b;

            public C1244a(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
                this.f92349a = lifecycle;
                this.f92350b = lifecycleEventObserver;
            }

            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.f92349a.removeObserver(this.f92350b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            super(1);
            this.f92347a = lifecycle;
            this.f92348b = lifecycleEventObserver;
        }

        @Override // x00.l
        @m80.k
        public final DisposableEffectResult invoke(@m80.k DisposableEffectScope DisposableEffect) {
            g0.p(DisposableEffect, "$this$DisposableEffect");
            this.f92347a.addObserver(this.f92348b);
            return new C1244a(this.f92347a, this.f92348b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f92351a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.Event f92352b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f92353c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f92354d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, Lifecycle.Event event, int i11, int i12) {
            super(2);
            this.f92351a = fVar;
            this.f92352b = event;
            this.f92353c = i11;
            this.f92354d = i12;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            m.c(this.f92351a, this.f92352b, composer, this.f92353c | 1, this.f92354d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.l<DisposableEffectScope, DisposableEffectResult> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f92355a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LifecycleEventObserver f92356b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements DisposableEffectResult {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Lifecycle f92357a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LifecycleEventObserver f92358b;

            public a(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
                this.f92357a = lifecycle;
                this.f92358b = lifecycleEventObserver;
            }

            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.f92357a.removeObserver(this.f92358b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            super(1);
            this.f92355a = lifecycle;
            this.f92356b = lifecycleEventObserver;
        }

        @Override // x00.l
        @m80.k
        public final DisposableEffectResult invoke(@m80.k DisposableEffectScope DisposableEffect) {
            g0.p(DisposableEffect, "$this$DisposableEffect");
            this.f92355a.addObserver(this.f92356b);
            return new a(this.f92355a, this.f92356b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<f> f92359a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.Event f92360b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f92361c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f92362d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<f> list, Lifecycle.Event event, int i11, int i12) {
            super(2);
            this.f92359a = list;
            this.f92360b = event;
            this.f92361c = i11;
            this.f92362d = i12;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            m.e(this.f92359a, this.f92360b, composer, this.f92361c | 1, this.f92362d);
        }
    }

    @Composable
    @um.a
    public static final void c(@m80.k final f permissionState, @m80.l final Lifecycle.Event event, @m80.l Composer composer, int i11, int i12) {
        int i13;
        g0.p(permissionState, "permissionState");
        Composer startRestartGroup = composer.startRestartGroup(-899070982);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (startRestartGroup.changed(permissionState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= startRestartGroup.changed(event) ? 32 : 16;
        }
        if (((i13 & 91) ^ 18) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i14 != 0) {
                event = Lifecycle.Event.ON_RESUME;
            }
            startRestartGroup.startReplaceableGroup(-3686930);
            boolean changed = startRestartGroup.changed(permissionState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LifecycleEventObserver() { // from class: um.k
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                        m.d(Lifecycle.Event.this, permissionState, lifecycleOwner, event2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) rememberedValue;
            Lifecycle lifecycle = ((LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            g0.o(lifecycle, "LocalLifecycleOwner.current.lifecycle");
            EffectsKt.DisposableEffect(lifecycle, lifecycleEventObserver, new a(lifecycle, lifecycleEventObserver), startRestartGroup, 72);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new b(permissionState, event, i11, i12));
    }

    public static final void d(Lifecycle.Event event, f permissionState, LifecycleOwner noName_0, Lifecycle.Event event2) {
        g0.p(permissionState, "$permissionState");
        g0.p(noName_0, "$noName_0");
        g0.p(event2, "event");
        if (event2 != event || permissionState.d()) {
            return;
        }
        permissionState.h();
    }

    @Composable
    @um.a
    public static final void e(@m80.k final List<f> permissions, @m80.l final Lifecycle.Event event, @m80.l Composer composer, int i11, int i12) {
        g0.p(permissions, "permissions");
        Composer startRestartGroup = composer.startRestartGroup(-1664753418);
        if ((i12 & 2) != 0) {
            event = Lifecycle.Event.ON_RESUME;
        }
        startRestartGroup.startReplaceableGroup(-3686930);
        boolean changed = startRestartGroup.changed(permissions);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LifecycleEventObserver() { // from class: um.l
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                    m.f(Lifecycle.Event.this, permissions, lifecycleOwner, event2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) rememberedValue;
        Lifecycle lifecycle = ((LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        g0.o(lifecycle, "LocalLifecycleOwner.current.lifecycle");
        EffectsKt.DisposableEffect(lifecycle, lifecycleEventObserver, new c(lifecycle, lifecycleEventObserver), startRestartGroup, 72);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new d(permissions, event, i11, i12));
    }

    public static final void f(Lifecycle.Event event, List permissions, LifecycleOwner noName_0, Lifecycle.Event event2) {
        g0.p(permissions, "$permissions");
        g0.p(noName_0, "$noName_0");
        g0.p(event2, "event");
        if (event2 == event) {
            Iterator it = permissions.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (!fVar.d()) {
                    fVar.h();
                }
            }
        }
    }

    public static final boolean g(@m80.k Context context, @m80.k String permission) {
        g0.p(context, "<this>");
        g0.p(permission, "permission");
        return ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    @m80.k
    public static final Activity h(@m80.k Context context) {
        g0.p(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            g0.o(context, "context.baseContext");
        }
        throw new IllegalStateException("Permissions should be called in the context of an Activity");
    }

    public static final boolean i(@m80.k Activity activity, @m80.k String permission) {
        g0.p(activity, "<this>");
        g0.p(permission, "permission");
        return ActivityCompat.shouldShowRequestPermissionRationale(activity, permission);
    }
}
