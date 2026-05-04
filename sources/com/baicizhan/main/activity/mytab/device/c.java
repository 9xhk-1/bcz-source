package com.baicizhan.main.activity.mytab.device;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.baicizhan.main.activity.mytab.device.v;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMyDevices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyDevices.kt\ncom/baicizhan/main/activity/mytab/device/ComposableSingletons$MyDevicesKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,197:1\n46#2,7:198\n86#3,6:205\n1247#4,6:211\n1247#4,6:217\n85#5:223\n*S KotlinDebug\n*F\n+ 1 MyDevices.kt\ncom/baicizhan/main/activity/mytab/device/ComposableSingletons$MyDevicesKt\n*L\n170#1:198,7\n170#1:205,6\n171#1:211,6\n175#1:217,6\n171#1:223\n*E\n"})
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c f18615a = new c();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f18616b = ComposableLambdaKt.composableLambdaInstance(633172895, false, new x00.p() { // from class: com.baicizhan.main.activity.mytab.device.b
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 d11;
            d11 = c.d((Composer) obj, ((Integer) obj2).intValue());
            return d11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 d(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(633172895, i11, -1, "com.baicizhan.main.activity.mytab.device.ComposableSingletons$MyDevicesKt.lambda$633172895.<anonymous> (MyDevices.kt:169)");
            }
            composer.startReplaceableGroup(1890788296);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory createHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) MyDeviceVM.class, current, (String) null, createHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 36936, 0);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            final MyDeviceVM myDeviceVM = (MyDeviceVM) viewModel;
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = myDeviceVM.d();
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.activity.mytab.device.a
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 f11;
                        f11 = c.f(MyDeviceVM.this, (ie.b) obj);
                        return f11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.l lVar = (x00.l) rememberedValue2;
            v e11 = e(mutableState);
            v.b bVar = e11 instanceof v.b ? (v.b) e11 : null;
            if (bVar == null) {
                composer.startReplaceGroup(-642296833);
            } else {
                composer.startReplaceGroup(-642296832);
                u.n(bVar.d(), lVar, composer, 48);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final v e(MutableState<v> mutableState) {
        return mutableState.getValue();
    }

    public static final g2 f(MyDeviceVM myDeviceVM, ie.b device) {
        g0.p(device, "device");
        myDeviceVM.f(device);
        return g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> c() {
        return f18616b;
    }
}
