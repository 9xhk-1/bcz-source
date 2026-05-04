package com.baicizhan.main.vld;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import c40.r0;
import cn.hugo.android.scanner.CaptureActivity;
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.client.business.webview.sdk.NavigatorMgr;
import com.baicizhan.main.vld.DeviceManagementActivity;
import com.baicizhan.main.vld.model.VocabularyDeviceInfo;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import ji.m1;
import ki.f;
import ki.h;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import x00.l;
import x00.p;
import yg.i2;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDeviceManagementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManagementActivity.kt\ncom/baicizhan/main/vld/DeviceManagementActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,347:1\n1#2:348\n1247#3,6:349\n1247#3,6:355\n1247#3,6:361\n1247#3,6:367\n1247#3,6:373\n1247#3,6:379\n1247#3,6:385\n1247#3,6:391\n360#4,7:397\n64#5,5:404\n*S KotlinDebug\n*F\n+ 1 DeviceManagementActivity.kt\ncom/baicizhan/main/vld/DeviceManagementActivity\n*L\n94#1:349,6\n95#1:355,6\n112#1:361,6\n121#1:367,6\n124#1:373,6\n127#1:379,6\n131#1:385,6\n143#1:391,6\n105#1:397,7\n165#1:404,5\n*E\n"})
/* loaded from: classes4.dex */
public final class DeviceManagementActivity extends ComposeBaseActivity {

    /* renamed from: c, reason: collision with root package name */
    public static final int f25159c = 8;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f25160b = e0.c(new x00.a() { // from class: ji.s0
        @Override // x00.a
        public final Object invoke() {
            ki.f U0;
            U0 = DeviceManagementActivity.U0();
            return U0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.main.vld.DeviceManagementActivity$onCreate$1$4$1", f = "DeviceManagementActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25161a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<VocabularyDeviceInfo> f25163c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f25164d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "com.baicizhan.main.vld.DeviceManagementActivity$onCreate$1$4$1$3", f = "DeviceManagementActivity.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: com.baicizhan.main.vld.DeviceManagementActivity$a$a, reason: collision with other inner class name */
        public static final class C0324a extends SuspendLambda implements l<j00.c<? super Result<? extends List<? extends VocabularyDeviceInfo>>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f25165a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceManagementActivity f25166b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0324a(DeviceManagementActivity deviceManagementActivity, j00.c<? super C0324a> cVar) {
                super(1, cVar);
                this.f25166b = deviceManagementActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new C0324a(this.f25166b, cVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(j00.c<? super Result<? extends List<VocabularyDeviceInfo>>> cVar) {
                return ((C0324a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a11;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f25165a;
                if (i11 == 0) {
                    e.n(obj);
                    f V0 = this.f25166b.V0();
                    this.f25165a = 1;
                    a11 = V0.a(this);
                    if (a11 == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                    a11 = ((Result) obj).m6317unboximpl();
                }
                return Result.m6307boximpl(a11);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends List<? extends VocabularyDeviceInfo>>> cVar) {
                return invoke2((j00.c<? super Result<? extends List<VocabularyDeviceInfo>>>) cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SnapshotStateList<VocabularyDeviceInfo> snapshotStateList, MutableState<Boolean> mutableState, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f25163c = snapshotStateList;
            this.f25164d = mutableState;
        }

        public static final g2 k(SnapshotStateList snapshotStateList, MutableState mutableState, List list) {
            snapshotStateList.clear();
            snapshotStateList.addAll(list);
            i2.Q(mutableState);
            return g2.f100423a;
        }

        public static final g2 m(MutableState mutableState, Throwable th2) {
            i2.P(mutableState, false, 1, null);
            return g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return DeviceManagementActivity.this.new a(this.f25163c, this.f25164d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f25161a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            DeviceManagementActivity deviceManagementActivity = DeviceManagementActivity.this;
            final SnapshotStateList<VocabularyDeviceInfo> snapshotStateList = this.f25163c;
            final MutableState<Boolean> mutableState = this.f25164d;
            l lVar = new l() { // from class: ji.w0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 k11;
                    k11 = DeviceManagementActivity.a.k(SnapshotStateList.this, mutableState, (List) obj2);
                    return k11;
                }
            };
            final MutableState<Boolean> mutableState2 = this.f25164d;
            i2.G(deviceManagementActivity, false, false, 0L, lVar, new l() { // from class: ji.x0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 m11;
                    m11 = DeviceManagementActivity.a.m(MutableState.this, (Throwable) obj2);
                    return m11;
                }
            }, new C0324a(DeviceManagementActivity.this, null), 7, null);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements DefaultLifecycleObserver {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f25168b;

        public b(MutableState<Integer> mutableState) {
            this.f25168b = mutableState;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onCreate(LifecycleOwner lifecycleOwner) {
            super.onCreate(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onDestroy(LifecycleOwner lifecycleOwner) {
            super.onDestroy(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onPause(LifecycleOwner lifecycleOwner) {
            super.onPause(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner owner) {
            Intent intent;
            g0.p(owner, "owner");
            super.onResume(owner);
            Intent intent2 = DeviceManagementActivity.this.getIntent();
            if ((intent2 == null || !intent2.getBooleanExtra("deviceBound", false)) && ((intent = DeviceManagementActivity.this.getIntent()) == null || !intent.getBooleanExtra("newIntent", false))) {
                return;
            }
            i2.J(this.f25168b);
            Intent intent3 = DeviceManagementActivity.this.getIntent();
            if (intent3 != null) {
                intent3.putExtra("deviceBound", false);
            }
            Intent intent4 = DeviceManagementActivity.this.getIntent();
            if (intent4 != null) {
                intent4.putExtra("newIntent", false);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStart(LifecycleOwner lifecycleOwner) {
            super.onStart(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStop(LifecycleOwner lifecycleOwner) {
            super.onStop(lifecycleOwner);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 DeviceManagementActivity.kt\ncom/baicizhan/main/vld/DeviceManagementActivity\n*L\n1#1,67:1\n166#2,2:68\n*E\n"})
    public static final class c implements DisposableEffectResult {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f25170b;

        public c(b bVar) {
            this.f25170b = bVar;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            DeviceManagementActivity.this.getLifecycle().removeObserver(this.f25170b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f U0() {
        return h.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f V0() {
        return (f) this.f25160b.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 W0(final DeviceManagementActivity deviceManagementActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(741191481, i11, -1, "com.baicizhan.main.vld.DeviceManagementActivity.onCreate.<anonymous> (DeviceManagementActivity.kt:91)");
            }
            final MutableState<Integer> L = i2.L(composer, 0);
            MutableState<Boolean> K = i2.K(composer, 0);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                composer.updateRememberedValue(rememberedValue);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new l() { // from class: ji.l0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 X0;
                        X0 = DeviceManagementActivity.X0(SnapshotStateList.this, (ActivityResult) obj);
                        return X0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (l) rememberedValue2, composer, 48);
            ActivityResultContracts.StartActivityForResult startActivityForResult2 = new ActivityResultContracts.StartActivityForResult();
            boolean changed = composer.changed(L);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new l() { // from class: ji.n0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 a12;
                        a12 = DeviceManagementActivity.a1(MutableState.this, (ActivityResult) obj);
                        return a12;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            final ManagedActivityResultLauncher rememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult2, (l) rememberedValue3, composer, 0);
            boolean changedInstance = composer.changedInstance(rememberLauncherForActivityResult2) | composer.changedInstance(deviceManagementActivity);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: ji.o0
                    @Override // x00.a
                    public final Object invoke() {
                        g2 b12;
                        b12 = DeviceManagementActivity.b1(ManagedActivityResultLauncher.this, deviceManagementActivity);
                        return b12;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            x00.a aVar = (x00.a) rememberedValue4;
            boolean changedInstance2 = composer.changedInstance(rememberLauncherForActivityResult) | composer.changedInstance(deviceManagementActivity);
            Object rememberedValue5 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new l() { // from class: ji.p0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 c12;
                        c12 = DeviceManagementActivity.c1(ManagedActivityResultLauncher.this, deviceManagementActivity, (VocabularyDeviceInfo) obj);
                        return c12;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            l lVar = (l) rememberedValue5;
            boolean changedInstance3 = composer.changedInstance(deviceManagementActivity);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new x00.a() { // from class: ji.q0
                    @Override // x00.a
                    public final Object invoke() {
                        g2 d12;
                        d12 = DeviceManagementActivity.d1(DeviceManagementActivity.this);
                        return d12;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            m1.t(L, K, snapshotStateList, aVar, lVar, (x00.a) rememberedValue6, composer, 384, 0);
            Integer value = L.getValue();
            boolean changedInstance4 = composer.changedInstance(deviceManagementActivity) | composer.changed(K);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = deviceManagementActivity.new a(snapshotStateList, K, null);
                composer.updateRememberedValue(rememberedValue7);
            }
            EffectsKt.LaunchedEffect(value, (p<? super r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue7, composer, 0);
            boolean changedInstance5 = composer.changedInstance(deviceManagementActivity) | composer.changed(L);
            Object rememberedValue8 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = new l() { // from class: ji.r0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        DisposableEffectResult e12;
                        e12 = DeviceManagementActivity.e1(DeviceManagementActivity.this, L, snapshotStateList, (DisposableEffectScope) obj);
                        return e12;
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            EffectsKt.DisposableEffect("", (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue8, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 X0(SnapshotStateList snapshotStateList, ActivityResult it) {
        Intent data;
        g0.p(it, "it");
        if (it.getResultCode() == -1 && (data = it.getData()) != null) {
            Long valueOf = Long.valueOf(data.getLongExtra("deviceId", -1L));
            if (valueOf.longValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                final long longValue = valueOf.longValue();
                final l lVar = new l() { // from class: ji.u0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        boolean Y0;
                        Y0 = DeviceManagementActivity.Y0(longValue, (VocabularyDeviceInfo) obj);
                        return Boolean.valueOf(Y0);
                    }
                };
                snapshotStateList.removeIf(new Predicate() { // from class: ji.v0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean Z0;
                        Z0 = DeviceManagementActivity.Z0(x00.l.this, obj);
                        return Z0;
                    }
                });
            } else {
                Serializable serializableExtra = data.getSerializableExtra("newDeviceInfo");
                VocabularyDeviceInfo vocabularyDeviceInfo = serializableExtra instanceof VocabularyDeviceInfo ? (VocabularyDeviceInfo) serializableExtra : null;
                if (vocabularyDeviceInfo != null) {
                    Iterator<T> it2 = snapshotStateList.iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        if (((VocabularyDeviceInfo) it2.next()).getDeviceId() == vocabularyDeviceInfo.getDeviceId()) {
                            break;
                        }
                        i11++;
                    }
                    Integer valueOf2 = Integer.valueOf(i11);
                    Integer num = valueOf2.intValue() != -1 ? valueOf2 : null;
                    if (num != null) {
                        int intValue = num.intValue();
                        snapshotStateList.remove(intValue);
                        snapshotStateList.add(intValue, vocabularyDeviceInfo);
                    }
                }
            }
        }
        return g2.f100423a;
    }

    public static final boolean Y0(long j11, VocabularyDeviceInfo i11) {
        g0.p(i11, "i");
        return i11.getDeviceId() == j11;
    }

    public static final boolean Z0(l lVar, Object obj) {
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    public static final g2 a1(MutableState mutableState, ActivityResult it) {
        Intent data;
        g0.p(it, "it");
        if (it.getResultCode() == -1 && (data = it.getData()) != null && data.getBooleanExtra("deviceBound", false)) {
            i2.J(mutableState);
        }
        return g2.f100423a;
    }

    public static final g2 b1(ManagedActivityResultLauncher managedActivityResultLauncher, DeviceManagementActivity deviceManagementActivity) {
        managedActivityResultLauncher.launch(new Intent(deviceManagementActivity, (Class<?>) CaptureActivity.class));
        return g2.f100423a;
    }

    public static final g2 c1(ManagedActivityResultLauncher managedActivityResultLauncher, DeviceManagementActivity deviceManagementActivity, VocabularyDeviceInfo it) {
        g0.p(it, "it");
        managedActivityResultLauncher.launch(DeviceDetailActivity.f25141c.a(deviceManagementActivity, it));
        return g2.f100423a;
    }

    public static final g2 d1(DeviceManagementActivity deviceManagementActivity) {
        deviceManagementActivity.onBackPressed();
        return g2.f100423a;
    }

    public static final DisposableEffectResult e1(final DeviceManagementActivity deviceManagementActivity, MutableState mutableState, final SnapshotStateList snapshotStateList, DisposableEffectScope DisposableEffect) {
        g0.p(DisposableEffect, "$this$DisposableEffect");
        b bVar = deviceManagementActivity.new b(mutableState);
        deviceManagementActivity.getLifecycle().addObserver(bVar);
        OnBackPressedDispatcherKt.addCallback$default(deviceManagementActivity.getOnBackPressedDispatcher(), null, false, new l() { // from class: ji.t0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f12;
                f12 = DeviceManagementActivity.f1(SnapshotStateList.this, deviceManagementActivity, (OnBackPressedCallback) obj);
                return f12;
            }
        }, 3, null);
        return deviceManagementActivity.new c(bVar);
    }

    public static final g2 f1(SnapshotStateList snapshotStateList, DeviceManagementActivity deviceManagementActivity, OnBackPressedCallback addCallback) {
        g0.p(addCallback, "$this$addCallback");
        if (snapshotStateList.isEmpty()) {
            Intent intent = new Intent();
            intent.putExtra(NavigatorMgr.DATA_EXIT, true);
            g2 g2Var = g2.f100423a;
            deviceManagementActivity.setResult(-1, intent);
        }
        deviceManagementActivity.finish();
        return g2.f100423a;
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(741191481, true, new p() { // from class: ji.m0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 W0;
                W0 = DeviceManagementActivity.W0(DeviceManagementActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                return W0;
            }
        }), 1, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@k Intent intent) {
        g0.p(intent, "intent");
        super.onNewIntent(intent);
        intent.putExtra("newIntent", true);
        setIntent(intent);
    }
}
