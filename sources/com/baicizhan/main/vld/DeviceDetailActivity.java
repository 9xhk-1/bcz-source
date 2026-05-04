package com.baicizhan.main.vld;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import c40.r0;
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.main.vld.DeviceDetailActivity;
import com.baicizhan.main.vld.model.VocabularyDeviceInfo;
import com.jiongji.andriod.card.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import ji.k0;
import kc.d;
import kc.u;
import ki.f;
import ki.h;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.p;
import yg.i2;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDeviceDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDetailActivity.kt\ncom/baicizhan/main/vld/DeviceDetailActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,324:1\n1247#2,6:325\n1247#2,6:331\n1247#2,6:337\n1247#2,6:343\n1247#2,6:349\n1247#2,6:355\n1247#2,6:361\n*S KotlinDebug\n*F\n+ 1 DeviceDetailActivity.kt\ncom/baicizhan/main/vld/DeviceDetailActivity\n*L\n68#1:325,6\n69#1:331,6\n70#1:337,6\n88#1:343,6\n99#1:349,6\n100#1:355,6\n118#1:361,6\n*E\n"})
/* loaded from: classes4.dex */
public final class DeviceDetailActivity extends ComposeBaseActivity {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f25141c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f25142d = 8;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f25143e = "device";

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f25144b = e0.c(new x00.a() { // from class: ji.p
        @Override // x00.a
        public final Object invoke() {
            ki.f T0;
            T0 = DeviceDetailActivity.T0();
            return T0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final Intent a(@k Context context, @k VocabularyDeviceInfo device) {
            g0.p(context, "context");
            g0.p(device, "device");
            Intent intent = new Intent(context, (Class<?>) DeviceDetailActivity.class);
            intent.putExtra("device", device);
            return intent;
        }

        public final void b(@k Context context, @k VocabularyDeviceInfo device) {
            g0.p(context, "context");
            g0.p(device, "device");
            context.startActivity(a(context, device));
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.DeviceDetailActivity$onCreate$1$1$1", f = "DeviceDetailActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nDeviceDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDetailActivity.kt\ncom/baicizhan/main/vld/DeviceDetailActivity$onCreate$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,324:1\n1#2:325\n*E\n"})
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25145a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f25147c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<VocabularyDeviceInfo> f25148d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ VocabularyDeviceInfo f25149e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.vld.DeviceDetailActivity$onCreate$1$1$1$3", f = "DeviceDetailActivity.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements l<j00.c<? super Result<? extends List<? extends VocabularyDeviceInfo>>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f25150a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceDetailActivity f25151b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceDetailActivity deviceDetailActivity, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f25151b = deviceDetailActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f25151b, cVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(j00.c<? super Result<? extends List<VocabularyDeviceInfo>>> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a11;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f25150a;
                if (i11 == 0) {
                    e.n(obj);
                    f U0 = this.f25151b.U0();
                    this.f25150a = 1;
                    a11 = U0.a(this);
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
        public b(MutableState<Boolean> mutableState, MutableState<VocabularyDeviceInfo> mutableState2, VocabularyDeviceInfo vocabularyDeviceInfo, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f25147c = mutableState;
            this.f25148d = mutableState2;
            this.f25149e = vocabularyDeviceInfo;
        }

        public static final g2 k(MutableState mutableState, DeviceDetailActivity deviceDetailActivity, MutableState mutableState2, OnBackPressedCallback onBackPressedCallback) {
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                Intent intent = new Intent();
                intent.putExtra("newDeviceInfo", (Serializable) mutableState2.getValue());
                g2 g2Var = g2.f100423a;
                deviceDetailActivity.setResult(-1, intent);
            }
            deviceDetailActivity.finish();
            return g2.f100423a;
        }

        public static final g2 m(MutableState mutableState, VocabularyDeviceInfo vocabularyDeviceInfo, List list) {
            Object obj;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                VocabularyDeviceInfo vocabularyDeviceInfo2 = (VocabularyDeviceInfo) obj;
                if (g0.g(vocabularyDeviceInfo2.getSerialNumber(), vocabularyDeviceInfo.getSerialNumber()) && vocabularyDeviceInfo2.getOnline() != vocabularyDeviceInfo.getOnline()) {
                    break;
                }
            }
            VocabularyDeviceInfo vocabularyDeviceInfo3 = (VocabularyDeviceInfo) obj;
            if (vocabularyDeviceInfo3 == null) {
                return g2.f100423a;
            }
            mutableState.setValue(VocabularyDeviceInfo.copy$default((VocabularyDeviceInfo) mutableState.getValue(), 0L, 0, null, null, null, null, null, vocabularyDeviceInfo3.getOnline(), 127, null));
            return g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return DeviceDetailActivity.this.new b(this.f25147c, this.f25148d, this.f25149e, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f25145a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            OnBackPressedDispatcher onBackPressedDispatcher = DeviceDetailActivity.this.getOnBackPressedDispatcher();
            final MutableState<Boolean> mutableState = this.f25147c;
            final DeviceDetailActivity deviceDetailActivity = DeviceDetailActivity.this;
            final MutableState<VocabularyDeviceInfo> mutableState2 = this.f25148d;
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new l() { // from class: ji.v
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 k11;
                    k11 = DeviceDetailActivity.b.k(MutableState.this, deviceDetailActivity, mutableState2, (OnBackPressedCallback) obj2);
                    return k11;
                }
            }, 3, null);
            DeviceDetailActivity deviceDetailActivity2 = DeviceDetailActivity.this;
            final MutableState<VocabularyDeviceInfo> mutableState3 = this.f25148d;
            final VocabularyDeviceInfo vocabularyDeviceInfo = this.f25149e;
            i2.G(deviceDetailActivity2, false, false, 0L, new l() { // from class: ji.w
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 m11;
                    m11 = DeviceDetailActivity.b.m(MutableState.this, vocabularyDeviceInfo, (List) obj2);
                    return m11;
                }
            }, null, new a(DeviceDetailActivity.this, null), 22, null);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.DeviceDetailActivity$onCreate$1$2$1$2", f = "DeviceDetailActivity.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements l<j00.c<? super Result<? extends g2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25152a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ VocabularyDeviceInfo f25154c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f25155d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(VocabularyDeviceInfo vocabularyDeviceInfo, String str, j00.c<? super c> cVar) {
            super(1, cVar);
            this.f25154c = vocabularyDeviceInfo;
            this.f25155d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return DeviceDetailActivity.this.new c(this.f25154c, this.f25155d, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<g2>> cVar) {
            return ((c) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object c11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25152a;
            if (i11 == 0) {
                e.n(obj);
                f U0 = DeviceDetailActivity.this.U0();
                long deviceId = this.f25154c.getDeviceId();
                int deviceType = this.f25154c.getDeviceType();
                String str = this.f25155d;
                this.f25152a = 1;
                c11 = U0.c(deviceId, deviceType, str, this);
                if (c11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
                c11 = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(c11);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends g2>> cVar) {
            return invoke2((j00.c<? super Result<g2>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.DeviceDetailActivity$onCreate$1$4$1$1$1$2", f = "DeviceDetailActivity.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements l<j00.c<? super Result<? extends g2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25156a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<VocabularyDeviceInfo> f25158c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MutableState<VocabularyDeviceInfo> mutableState, j00.c<? super d> cVar) {
            super(1, cVar);
            this.f25158c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return DeviceDetailActivity.this.new d(this.f25158c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<g2>> cVar) {
            return ((d) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25156a;
            if (i11 == 0) {
                e.n(obj);
                f U0 = DeviceDetailActivity.this.U0();
                long deviceId = this.f25158c.getValue().getDeviceId();
                int deviceType = this.f25158c.getValue().getDeviceType();
                this.f25156a = 1;
                d11 = U0.d(deviceId, deviceType, this);
                if (d11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
                d11 = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(d11);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends g2>> cVar) {
            return invoke2((j00.c<? super Result<g2>>) cVar);
        }
    }

    public static final f T0() {
        return h.a();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 V0(final DeviceDetailActivity deviceDetailActivity, final VocabularyDeviceInfo vocabularyDeviceInfo, Composer composer, int i11) {
        final MutableState mutableState;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1538640391, i11, -1, "com.baicizhan.main.vld.DeviceDetailActivity.onCreate.<anonymous> (DeviceDetailActivity.kt:67)");
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(vocabularyDeviceInfo, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue2;
            boolean changedInstance = composer.changedInstance(deviceDetailActivity) | composer.changed(vocabularyDeviceInfo);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                mutableState = mutableState2;
                b bVar = deviceDetailActivity.new b(mutableState3, mutableState, vocabularyDeviceInfo, null);
                composer.updateRememberedValue(bVar);
                rememberedValue3 = bVar;
            } else {
                mutableState = mutableState2;
            }
            EffectsKt.LaunchedEffect("", (p<? super r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue3, composer, 6);
            VocabularyDeviceInfo vocabularyDeviceInfo2 = (VocabularyDeviceInfo) mutableState.getValue();
            boolean changedInstance2 = composer.changedInstance(deviceDetailActivity) | composer.changed(vocabularyDeviceInfo);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new l() { // from class: ji.q
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 W0;
                        W0 = DeviceDetailActivity.W0(DeviceDetailActivity.this, mutableState, mutableState3, vocabularyDeviceInfo, (String) obj);
                        return W0;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            l lVar = (l) rememberedValue4;
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.a() { // from class: ji.r
                    @Override // x00.a
                    public final Object invoke() {
                        g2 Y0;
                        Y0 = DeviceDetailActivity.Y0();
                        return Y0;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            x00.a aVar = (x00.a) rememberedValue5;
            boolean changedInstance3 = composer.changedInstance(deviceDetailActivity);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new x00.a() { // from class: ji.s
                    @Override // x00.a
                    public final Object invoke() {
                        g2 Z0;
                        Z0 = DeviceDetailActivity.Z0(DeviceDetailActivity.this, mutableState);
                        return Z0;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            x00.a aVar2 = (x00.a) rememberedValue6;
            boolean changedInstance4 = composer.changedInstance(deviceDetailActivity);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = new x00.a() { // from class: ji.t
                    @Override // x00.a
                    public final Object invoke() {
                        g2 d12;
                        d12 = DeviceDetailActivity.d1(DeviceDetailActivity.this);
                        return d12;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            k0.n(vocabularyDeviceInfo2, lVar, aVar, aVar2, (x00.a) rememberedValue7, composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 W0(DeviceDetailActivity deviceDetailActivity, final MutableState mutableState, final MutableState mutableState2, VocabularyDeviceInfo vocabularyDeviceInfo, final String newName) {
        g0.p(newName, "newName");
        i2.C(deviceDetailActivity, false, false, 0L, new l() { // from class: ji.u
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 X0;
                X0 = DeviceDetailActivity.X0(MutableState.this, newName, mutableState2, (g2) obj);
                return X0;
            }
        }, null, deviceDetailActivity.new c(vocabularyDeviceInfo, newName, null), 23, null);
        return g2.f100423a;
    }

    public static final g2 X0(MutableState mutableState, String str, MutableState mutableState2, g2 it) {
        g0.p(it, "it");
        mutableState.setValue(VocabularyDeviceInfo.copy$default((VocabularyDeviceInfo) mutableState.getValue(), 0L, 0, str, null, null, null, null, false, R.styleable.Theme_drawable_wiki_sound, null));
        mutableState2.setValue(Boolean.TRUE);
        return g2.f100423a;
    }

    public static final g2 Y0() {
        return g2.f100423a;
    }

    public static final g2 Z0(final DeviceDetailActivity deviceDetailActivity, final MutableState mutableState) {
        mc.a.j(deviceDetailActivity, null, null, new l() { // from class: ji.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 a12;
                a12 = DeviceDetailActivity.a1(DeviceDetailActivity.this, mutableState, (u.a) obj);
                return a12;
            }
        }, 3, null);
        return g2.f100423a;
    }

    public static final g2 a1(final DeviceDetailActivity deviceDetailActivity, final MutableState mutableState, u.a prompt) {
        g0.p(prompt, "$this$prompt");
        prompt.L(R.string.devices_management_detail_dialog_remove_title);
        prompt.U(R.string.devices_management_detail_dialog_remove_message);
        d.a.J(prompt, null, null, new l() { // from class: ji.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b12;
                b12 = DeviceDetailActivity.b1(DeviceDetailActivity.this, mutableState, (View) obj);
                return b12;
            }
        }, 3, null);
        return g2.f100423a;
    }

    public static final g2 b1(final DeviceDetailActivity deviceDetailActivity, final MutableState mutableState, View it) {
        g0.p(it, "it");
        i2.C(deviceDetailActivity, false, false, 0L, new l() { // from class: ji.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 c12;
                c12 = DeviceDetailActivity.c1(DeviceDetailActivity.this, mutableState, (g2) obj);
                return c12;
            }
        }, null, deviceDetailActivity.new d(mutableState, null), 23, null);
        return g2.f100423a;
    }

    public static final g2 c1(DeviceDetailActivity deviceDetailActivity, MutableState mutableState, g2 it) {
        g0.p(it, "it");
        Intent intent = new Intent();
        intent.putExtra("deviceId", ((VocabularyDeviceInfo) mutableState.getValue()).getDeviceId());
        g2 g2Var = g2.f100423a;
        deviceDetailActivity.setResult(-1, intent);
        deviceDetailActivity.finish();
        return g2Var;
    }

    public static final g2 d1(DeviceDetailActivity deviceDetailActivity) {
        deviceDetailActivity.onBackPressed();
        return g2.f100423a;
    }

    public final f U0() {
        return (f) this.f25144b.getValue();
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("device") : null;
        final VocabularyDeviceInfo vocabularyDeviceInfo = serializableExtra instanceof VocabularyDeviceInfo ? (VocabularyDeviceInfo) serializableExtra : null;
        if (vocabularyDeviceInfo == null) {
            finish();
        } else {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1538640391, true, new p() { // from class: ji.l
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 V0;
                    V0 = DeviceDetailActivity.V0(DeviceDetailActivity.this, vocabularyDeviceInfo, (Composer) obj, ((Integer) obj2).intValue());
                    return V0;
                }
            }), 1, null);
        }
    }
}
