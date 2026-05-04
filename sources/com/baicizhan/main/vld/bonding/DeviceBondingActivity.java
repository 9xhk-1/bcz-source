package com.baicizhan.main.vld.bonding;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import c40.l2;
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.client.business.webview.sdk.NavigatorMgr;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.vld.bonding.DeviceBondingActivity;
import com.baicizhan.main.vld.model.WifiFreqType;
import com.baicizhan.platform.base.widget.p3;
import com.baicizhan.platform.base.widget.q3;
import com.jiongji.andriod.card.R;
import java.net.URLEncoder;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kc.d;
import kc.u;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nDeviceBondingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceBondingActivity.kt\ncom/baicizhan/main/vld/bonding/DeviceBondingActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1103:1\n1#2:1104\n1247#3,6:1105\n1247#3,6:1111\n1247#3,6:1117\n1247#3,6:1123\n1247#3,6:1129\n1247#3,6:1135\n1247#3,6:1141\n1247#3,6:1147\n1247#3,6:1153\n1247#3,6:1159\n1247#3,6:1165\n1247#3,6:1171\n1247#3,6:1177\n1247#3,6:1183\n1247#3,6:1189\n1869#4,2:1195\n64#5,5:1197\n64#5,5:1202\n*S KotlinDebug\n*F\n+ 1 DeviceBondingActivity.kt\ncom/baicizhan/main/vld/bonding/DeviceBondingActivity\n*L\n187#1:1105,6\n188#1:1111,6\n308#1:1117,6\n309#1:1123,6\n343#1:1129,6\n344#1:1135,6\n345#1:1141,6\n346#1:1147,6\n443#1:1153,6\n459#1:1159,6\n460#1:1165,6\n487#1:1171,6\n490#1:1177,6\n499#1:1183,6\n507#1:1189,6\n320#1:1195,2\n388#1:1197,5\n452#1:1202,5\n*E\n"})
/* loaded from: classes4.dex */
public final class DeviceBondingActivity extends ComposeBaseActivity {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final a f25171j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f25172k = 8;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f25173b = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.vld.bonding.z
        @Override // x00.a
        public final Object invoke() {
            WifiManager N1;
            N1 = DeviceBondingActivity.N1(DeviceBondingActivity.this);
            return N1;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f25174c = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.vld.bonding.a0
        @Override // x00.a
        public final Object invoke() {
            LocationManager s12;
            s12 = DeviceBondingActivity.s1(DeviceBondingActivity.this);
            return s12;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final yz.c0 f25175d = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.vld.bonding.b0
        @Override // x00.a
        public final Object invoke() {
            ki.f m12;
            m12 = DeviceBondingActivity.m1();
            return m12;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    public String f25176e;

    /* renamed from: f, reason: collision with root package name */
    public String f25177f;

    /* renamed from: g, reason: collision with root package name */
    public int f25178g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public c40.l2 f25179h;

    /* renamed from: i, reason: collision with root package name */
    public long f25180i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final Intent a(@m80.k Context context, @m80.k String url) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(url, "url");
            Intent intent = new Intent(context, (Class<?>) DeviceBondingActivity.class);
            intent.putExtra(DeviceBondingActivityKt.f25226a, url);
            return intent;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivity$onCreate$6$1$1", f = "DeviceBondingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25181a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<BTStatus> f25182b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DeviceBondingActivity f25183c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25184a;

            static {
                int[] iArr = new int[BTStatus.values().length];
                try {
                    iArr[BTStatus.FORBIDDEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BTStatus.CONNECT_FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BTStatus.CONNECT_TIMEOUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BTStatus.CONNECT_SUCCEEDED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[BTStatus.CONFIGURED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[BTStatus.CONFIGURE_FAILED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[BTStatus.CONFIGURE_TIMEOUT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[BTStatus.ERROR.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[BTStatus.CONFIGURE_SUCCEEDED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                f25184a = iArr;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivity$onCreate$6$1$1$requestBondingStatus$1", f = "DeviceBondingActivity.kt", i = {}, l = {224, R.styleable.Theme_drawable_syncview}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: com.baicizhan.main.vld.bonding.DeviceBondingActivity$b$b, reason: collision with other inner class name */
        public static final class C0325b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f25185a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f25186b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DeviceBondingActivity f25187c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ MutableState<BTStatus> f25188d;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivity$onCreate$6$1$1$requestBondingStatus$1$1", f = "DeviceBondingActivity.kt", i = {0, 0, 1, 1}, l = {R.styleable.Theme_drawable_tab_friends, 240}, m = "invokeSuspend", n = {"i", "$i$a$-repeat-DeviceBondingActivity$onCreate$6$1$1$requestBondingStatus$1$1$1", "i", "$i$a$-repeat-DeviceBondingActivity$onCreate$6$1$1$requestBondingStatus$1$1$1"}, s = {"I$2", "I$3", "I$2", "I$3"}, v = 1)
            @kotlin.jvm.internal.u0({"SMAP\nDeviceBondingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceBondingActivity.kt\ncom/baicizhan/main/vld/bonding/DeviceBondingActivity$onCreate$6$1$1$requestBondingStatus$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1103:1\n1#2:1104\n*E\n"})
            /* renamed from: com.baicizhan.main.vld.bonding.DeviceBondingActivity$b$b$a */
            public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f25189a;

                /* renamed from: b, reason: collision with root package name */
                public int f25190b;

                /* renamed from: c, reason: collision with root package name */
                public int f25191c;

                /* renamed from: d, reason: collision with root package name */
                public int f25192d;

                /* renamed from: e, reason: collision with root package name */
                public Object f25193e;

                /* renamed from: f, reason: collision with root package name */
                public Object f25194f;

                /* renamed from: g, reason: collision with root package name */
                public int f25195g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ DeviceBondingActivity f25196h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ MutableState<BTStatus> f25197i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(DeviceBondingActivity deviceBondingActivity, MutableState<BTStatus> mutableState, j00.c<? super a> cVar) {
                    super(2, cVar);
                    this.f25196h = deviceBondingActivity;
                    this.f25197i = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                    return new a(this.f25196h, this.f25197i, cVar);
                }

                @Override // x00.p
                public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                    return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0060  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0148 -> B:6:0x014b). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                    /*
                        Method dump skipped, instructions count: 344
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.vld.bonding.DeviceBondingActivity.b.C0325b.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0325b(long j11, DeviceBondingActivity deviceBondingActivity, MutableState<BTStatus> mutableState, j00.c<? super C0325b> cVar) {
                super(2, cVar);
                this.f25186b = j11;
                this.f25187c = deviceBondingActivity;
                this.f25188d = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new C0325b(this.f25186b, this.f25187c, this.f25188d, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((C0325b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
            
                if (c40.v3.c(60000, r10, r9) == r0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
            
                if (c40.a1.b(r7, r9) == r0) goto L20;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r9.f25185a
                    r2 = 1
                    r3 = 0
                    r5 = 0
                    r6 = 2
                    if (r1 == 0) goto L25
                    if (r1 == r2) goto L21
                    if (r1 != r6) goto L19
                    kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    goto L51
                L15:
                    r10 = move-exception
                    goto L7a
                L17:
                    r10 = move-exception
                    goto L66
                L19:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L21:
                    kotlin.e.n(r10)
                    goto L33
                L25:
                    kotlin.e.n(r10)
                    long r7 = r9.f25186b
                    r9.f25185a = r2
                    java.lang.Object r10 = c40.a1.b(r7, r9)
                    if (r10 != r0) goto L33
                    goto L50
                L33:
                    com.baicizhan.main.vld.bonding.DeviceBondingActivity r10 = r9.f25187c     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    com.baicizhan.main.vld.bonding.DeviceBondingActivity.k1(r10, r1)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    com.baicizhan.main.vld.bonding.DeviceBondingActivity$b$b$a r10 = new com.baicizhan.main.vld.bonding.DeviceBondingActivity$b$b$a     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    com.baicizhan.main.vld.bonding.DeviceBondingActivity r1 = r9.f25187c     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    androidx.compose.runtime.MutableState<com.baicizhan.main.vld.bonding.BTStatus> r2 = r9.f25188d     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    r10.<init>(r1, r2, r5)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    r9.f25185a = r6     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    r1 = 60000(0xea60, double:2.9644E-319)
                    java.lang.Object r10 = c40.v3.c(r1, r10, r9)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    if (r10 != r0) goto L51
                L50:
                    return r0
                L51:
                    androidx.compose.runtime.MutableState<com.baicizhan.main.vld.bonding.BTStatus> r10 = r9.f25188d     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    com.baicizhan.main.vld.bonding.BTStatus r0 = com.baicizhan.main.vld.bonding.BTStatus.DONE     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    if (r10 == r0) goto L60
                    com.baicizhan.main.vld.bonding.DeviceBondingActivity r10 = r9.f25187c     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                    com.baicizhan.main.vld.bonding.DeviceBondingActivity.b.r(r10, r5, r6, r5)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
                L60:
                    com.baicizhan.main.vld.bonding.DeviceBondingActivity r10 = r9.f25187c
                    com.baicizhan.main.vld.bonding.DeviceBondingActivity.k1(r10, r3)
                    goto L77
                L66:
                    java.lang.String r0 = "DeviceBondingActivity"
                    java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L15
                    java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L15
                    r1 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L15
                    qb.c.d(r0, r10, r1)     // Catch: java.lang.Throwable -> L15
                    goto L60
                L77:
                    yz.g2 r10 = yz.g2.f100423a
                    return r10
                L7a:
                    com.baicizhan.main.vld.bonding.DeviceBondingActivity r0 = r9.f25187c
                    com.baicizhan.main.vld.bonding.DeviceBondingActivity.k1(r0, r3)
                    throw r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.vld.bonding.DeviceBondingActivity.b.C0325b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MutableState<BTStatus> mutableState, DeviceBondingActivity deviceBondingActivity, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f25182b = mutableState;
            this.f25183c = deviceBondingActivity;
        }

        public static final yz.g2 C(DeviceBondingActivity deviceBondingActivity, View view) {
            deviceBondingActivity.finish();
            return yz.g2.f100423a;
        }

        public static final void D(DeviceBondingActivity deviceBondingActivity, MutableState<BTStatus> mutableState, long j11) {
            c40.l2 f11;
            if (deviceBondingActivity.f25179h != null) {
                return;
            }
            f11 = c40.k.f(LifecycleOwnerKt.getLifecycleScope(deviceBondingActivity), null, null, new C0325b(j11, deviceBondingActivity, mutableState, null), 3, null);
            deviceBondingActivity.f25179h = f11;
        }

        public static final void o(DeviceBondingActivity deviceBondingActivity) {
            c40.l2 l2Var = deviceBondingActivity.f25179h;
            if (l2Var != null) {
                l2.a.b(l2Var, null, 1, null);
            }
            deviceBondingActivity.f25179h = null;
            deviceBondingActivity.f25180i = 0L;
        }

        public static final void q(final DeviceBondingActivity deviceBondingActivity, final String str) {
            mc.a.j(deviceBondingActivity, null, null, new x00.l() { // from class: com.baicizhan.main.vld.bonding.s0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 u11;
                    u11 = DeviceBondingActivity.b.u(str, deviceBondingActivity, (u.a) obj);
                    return u11;
                }
            }, 3, null);
        }

        public static /* synthetic */ void r(DeviceBondingActivity deviceBondingActivity, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = "出错了，请重试";
            }
            q(deviceBondingActivity, str);
        }

        public static final yz.g2 u(String str, final DeviceBondingActivity deviceBondingActivity, u.a aVar) {
            aVar.M(str);
            aVar.b0(ButtonType.SINGLE_POSITIVE);
            d.a.J(aVar, null, null, new x00.l() { // from class: com.baicizhan.main.vld.bonding.q0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 w11;
                    w11 = DeviceBondingActivity.b.w(DeviceBondingActivity.this, (View) obj);
                    return w11;
                }
            }, 3, null);
            return yz.g2.f100423a;
        }

        public static final yz.g2 w(DeviceBondingActivity deviceBondingActivity, View view) {
            deviceBondingActivity.finish();
            return yz.g2.f100423a;
        }

        public static final yz.g2 z(final DeviceBondingActivity deviceBondingActivity, u.a aVar) {
            aVar.L(R.string.devices_scan_bluetooth_needed);
            aVar.b0(ButtonType.SINGLE_POSITIVE);
            d.a.J(aVar, null, null, new x00.l() { // from class: com.baicizhan.main.vld.bonding.r0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 C;
                    C = DeviceBondingActivity.b.C(DeviceBondingActivity.this, (View) obj);
                    return C;
                }
            }, 3, null);
            return yz.g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f25182b, this.f25183c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f25181a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.b(DeviceBondingActivityKt.f25230e, "status: " + this.f25182b.getValue(), new Object[0]);
            BTStatus value = this.f25182b.getValue();
            BTStatus bTStatus = BTStatus.CONNECTING;
            if (value.compareTo(BTStatus.CONNECT_SUCCEEDED) > 0 || value.compareTo(bTStatus) < 0) {
                BTStatus bTStatus2 = BTStatus.CONFIGURING;
                BTStatus bTStatus3 = BTStatus.CONFIGURE_TIMEOUT;
                if (value.compareTo(bTStatus3) > 0 || value.compareTo(bTStatus2) < 0) {
                    pair = new Pair(l00.a.a(false), "");
                } else {
                    if (this.f25183c.f25178g != 0 ? this.f25182b.getValue() != bTStatus2 : this.f25182b.getValue() == BTStatus.CONFIGURE_FAILED || this.f25182b.getValue() == bTStatus3) {
                        r4 = false;
                    }
                    Boolean a11 = l00.a.a(r4);
                    DeviceBondingActivity deviceBondingActivity = this.f25183c;
                    pair = new Pair(a11, deviceBondingActivity.getString(deviceBondingActivity.f25178g == 0 ? R.string.devices_bonding_loading_wifi_bonding : R.string.devices_bonding_loading_wifi_configuring));
                }
            } else {
                pair = new Pair(l00.a.a(this.f25182b.getValue() == bTStatus), this.f25183c.getString(R.string.devices_bonding_loading_bt_connecting));
            }
            DeviceBondingActivity deviceBondingActivity2 = this.f25183c;
            boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
            Object second = pair.getSecond();
            kotlin.jvm.internal.g0.o(second, "<get-second>(...)");
            LoadingDialogActivity.setLoading$default(deviceBondingActivity2, booleanValue, 0L, (String) second, 2, null);
            switch (a.f25184a[this.f25182b.getValue().ordinal()]) {
                case 1:
                    final DeviceBondingActivity deviceBondingActivity3 = this.f25183c;
                    mc.a.j(deviceBondingActivity3, null, null, new x00.l() { // from class: com.baicizhan.main.vld.bonding.p0
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            yz.g2 z11;
                            z11 = DeviceBondingActivity.b.z(DeviceBondingActivity.this, (u.a) obj2);
                            return z11;
                        }
                    }, 3, null);
                    break;
                case 2:
                case 3:
                    va.g.i("连接失败，请重试", 0);
                    this.f25183c.finish();
                    break;
                case 4:
                    va.g.i("连接成功，开始配网吧！", 0);
                    break;
                case 5:
                    D(this.f25183c, this.f25182b, DeviceBondingActivityKt.f25227b);
                    break;
                case 6:
                case 7:
                    o(this.f25183c);
                    break;
                case 8:
                    o(this.f25183c);
                    break;
                case 9:
                    if (this.f25183c.f25178g == 0 && this.f25183c.f25180i != 0 && SystemClock.elapsedRealtime() - this.f25183c.f25180i < 5000) {
                        qb.c.b(DeviceBondingActivityKt.f25230e, "start a quicker request...", new Object[0]);
                        o(this.f25183c);
                        D(this.f25183c, this.f25182b, 3000L);
                        break;
                    }
                    break;
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivity$onCreate$6$5$1", f = "DeviceBondingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25198a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<BTStatus> f25200c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<List<ki.a>> f25201d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivity$onCreate$6$5$1$2", f = "DeviceBondingActivity.kt", i = {}, l = {471}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f25202a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MutableState<List<ki.a>> f25203b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MutableState<List<ki.a>> mutableState, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f25203b = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f25203b, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object b11;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f25202a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    ki.f a11 = ki.h.a();
                    this.f25202a = 1;
                    b11 = a11.b(this);
                    if (b11 == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    b11 = ((Result) obj).m6317unboximpl();
                }
                MutableState<List<ki.a>> mutableState = this.f25203b;
                if (Result.m6315isSuccessimpl(b11)) {
                    List<ki.a> list = (List) b11;
                    if (!list.isEmpty()) {
                        mutableState.setValue(list);
                    }
                }
                ma.l.a(ma.t.f73012k, ma.a.L4);
                return yz.g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MutableState<BTStatus> mutableState, MutableState<List<ki.a>> mutableState2, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f25200c = mutableState;
            this.f25201d = mutableState2;
        }

        public static final yz.g2 j(MutableState mutableState, DeviceBondingActivity deviceBondingActivity, OnBackPressedCallback onBackPressedCallback) {
            if (mutableState.getValue() == BTStatus.DONE || (mutableState.getValue() == BTStatus.CONFIGURE_SUCCEEDED && deviceBondingActivity.f25178g == 1)) {
                Intent intent = new Intent();
                intent.putExtra(deviceBondingActivity.f25178g == 0 ? "deviceBound" : "deviceConfigured", true);
                yz.g2 g2Var = yz.g2.f100423a;
                deviceBondingActivity.setResult(-1, intent);
            }
            deviceBondingActivity.finish();
            return yz.g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return DeviceBondingActivity.this.new c(this.f25200c, this.f25201d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f25198a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            OnBackPressedDispatcher onBackPressedDispatcher = DeviceBondingActivity.this.getOnBackPressedDispatcher();
            final MutableState<BTStatus> mutableState = this.f25200c;
            final DeviceBondingActivity deviceBondingActivity = DeviceBondingActivity.this;
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new x00.l() { // from class: com.baicizhan.main.vld.bonding.t0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 j11;
                    j11 = DeviceBondingActivity.c.j(MutableState.this, deviceBondingActivity, (OnBackPressedCallback) obj2);
                    return j11;
                }
            }, 3, null);
            LifecycleOwnerKt.getLifecycleScope(DeviceBondingActivity.this).launchWhenCreated(new a(this.f25201d, null));
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivity$onCreate$6$7$1$1", f = "DeviceBondingActivity.kt", i = {1}, l = {492, 495}, m = "invokeSuspend", n = {"token"}, s = {"L$0"}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f25204a;

        /* renamed from: b, reason: collision with root package name */
        public int f25205b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f25206c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f25207d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f25208e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ DeviceBondingActivity f25209f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivity$onCreate$6$7$1$1$token$1", f = "DeviceBondingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super String>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f25210a;

            public a(j00.c<? super a> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super String> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f25210a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return URLEncoder.encode(q9.x.r().p().getToken(), "UTF-8");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h hVar, String str, String str2, DeviceBondingActivity deviceBondingActivity, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f25206c = hVar;
            this.f25207d = str;
            this.f25208e = str2;
            this.f25209f = deviceBondingActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f25206c, this.f25207d, this.f25208e, this.f25209f, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
        
            if (r4.N(r5, r6, r7, r8, r10) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        
            if (r11 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f25205b
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                java.lang.Object r0 = r10.f25204a
                java.lang.String r0 = (java.lang.String) r0
                kotlin.e.n(r11)
                goto L79
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                kotlin.e.n(r11)
                goto L38
            L23:
                kotlin.e.n(r11)
                c40.m0 r11 = c40.h1.c()
                com.baicizhan.main.vld.bonding.DeviceBondingActivity$d$a r1 = new com.baicizhan.main.vld.bonding.DeviceBondingActivity$d$a
                r1.<init>(r2)
                r10.f25205b = r4
                java.lang.Object r11 = c40.i.h(r11, r1, r10)
                if (r11 != r0) goto L38
                goto L78
            L38:
                java.lang.String r11 = (java.lang.String) r11
                com.baicizhan.main.vld.bonding.h r4 = r10.f25206c
                java.lang.String r5 = r10.f25207d
                java.lang.String r6 = r10.f25208e
                com.baicizhan.main.vld.bonding.DeviceBondingActivity r1 = r10.f25209f
                java.lang.String r1 = com.baicizhan.main.vld.bonding.DeviceBondingActivity.e1(r1)
                if (r1 != 0) goto L4e
                java.lang.String r1 = "deviceSerialNumber"
                kotlin.jvm.internal.g0.S(r1)
                goto L4f
            L4e:
                r2 = r1
            L4f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r11)
                java.lang.String r7 = "*"
                r1.append(r7)
                r1.append(r2)
                java.lang.String r7 = r1.toString()
                com.baicizhan.main.vld.bonding.DeviceBondingActivity r1 = r10.f25209f
                int r8 = com.baicizhan.main.vld.bonding.DeviceBondingActivity.c1(r1)
                java.lang.Object r11 = l00.k.a(r11)
                r10.f25204a = r11
                r10.f25205b = r3
                r9 = r10
                java.lang.Object r11 = r4.N(r5, r6, r7, r8, r9)
                if (r11 != r0) goto L79
            L78:
                return r0
            L79:
                java.lang.String r11 = "mine-common"
                java.lang.String r0 = "bind_connect_click"
                ma.l.a(r11, r0)
                yz.g2 r11 = yz.g2.f100423a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.vld.bonding.DeviceBondingActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivity$onCreate$6$promptForLocation$2$3$1", f = "DeviceBondingActivity.kt", i = {}, l = {435}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25211a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<kc.u> f25213c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<c40.l2> f25214d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MutableState<kc.u> mutableState, MutableState<c40.l2> mutableState2, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f25213c = mutableState;
            this.f25214d = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return DeviceBondingActivity.this.new e(this.f25213c, this.f25214d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25211a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f25211a = 1;
                if (c40.a1.b(20000L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            LoadingDialogActivity.setLoading$default(DeviceBondingActivity.this, false, 0L, null, 6, null);
            DeviceBondingActivity.F1(DeviceBondingActivity.this, this.f25213c, this.f25214d, true);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 DeviceBondingActivity.kt\ncom/baicizhan/main/vld/bonding/DeviceBondingActivity\n*L\n1#1,67:1\n389#2,3:68\n*E\n"})
    public static final class f implements DisposableEffectResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f25215a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DeviceBondingActivity f25216b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DeviceBondingActivity$onCreate$6$3$1$receiver$1 f25217c;

        public f(h hVar, DeviceBondingActivity deviceBondingActivity, DeviceBondingActivity$onCreate$6$3$1$receiver$1 deviceBondingActivity$onCreate$6$3$1$receiver$1) {
            this.f25215a = hVar;
            this.f25216b = deviceBondingActivity;
            this.f25217c = deviceBondingActivity$onCreate$6$3$1$receiver$1;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f25215a.b0();
            this.f25216b.unregisterReceiver(this.f25217c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 DeviceBondingActivity.kt\ncom/baicizhan/main/vld/bonding/DeviceBondingActivity\n*L\n1#1,67:1\n453#2,4:68\n*E\n"})
    public static final class g implements DisposableEffectResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ um.b f25218a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f25219b;

        public g(um.b bVar, h hVar) {
            this.f25218a = bVar;
            this.f25219b = hVar;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            if (this.f25218a.f()) {
                this.f25219b.M();
            }
        }
    }

    public static final yz.g2 A1(DeviceBondingActivity deviceBondingActivity) {
        deviceBondingActivity.onBackPressed();
        return yz.g2.f100423a;
    }

    public static final void B1(DeviceBondingActivity deviceBondingActivity, MutableState<Boolean> mutableState, SnapshotStateList<ki.l> snapshotStateList) {
        WifiFreqType J0;
        WifiFreqType J02;
        List<ScanResult> scanResults = deviceBondingActivity.p1().getScanResults();
        if (mutableState.getValue().booleanValue()) {
            mutableState.setValue(Boolean.FALSE);
        }
        if (scanResults.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        snapshotStateList.clear();
        kotlin.jvm.internal.g0.m(scanResults);
        for (ScanResult scanResult : scanResults) {
            String SSID = scanResult.SSID;
            kotlin.jvm.internal.g0.o(SSID, "SSID");
            if (SSID.length() != 0) {
                ki.l lVar = (ki.l) linkedHashMap.get(scanResult.SSID);
                if (lVar == null) {
                    String str = scanResult.SSID;
                    String SSID2 = scanResult.SSID;
                    kotlin.jvm.internal.g0.o(SSID2, "SSID");
                    J0 = DeviceBondingActivityKt.J0(null, scanResult.frequency);
                    linkedHashMap.put(str, new ki.l(SSID2, J0, scanResult.level));
                } else {
                    String str2 = scanResult.SSID;
                    String SSID3 = scanResult.SSID;
                    kotlin.jvm.internal.g0.o(SSID3, "SSID");
                    J02 = DeviceBondingActivityKt.J0(lVar.h(), scanResult.frequency);
                    linkedHashMap.put(str2, new ki.l(SSID3, J02, g10.u.u(scanResult.level, lVar.f())));
                }
            }
        }
        q30.m P0 = q30.k0.P0(a00.r0.E1(linkedHashMap.values()), new x00.l() { // from class: com.baicizhan.main.vld.bonding.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean C1;
                C1 = DeviceBondingActivity.C1((ki.l) obj);
                return Boolean.valueOf(C1);
            }
        });
        final x00.p pVar = new x00.p() { // from class: com.baicizhan.main.vld.bonding.e0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                int D1;
                D1 = DeviceBondingActivity.D1((ki.l) obj, (ki.l) obj2);
                return Integer.valueOf(D1);
            }
        };
        a00.m0.t0(snapshotStateList, q30.k0.q3(P0, new Comparator() { // from class: com.baicizhan.main.vld.bonding.f0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int E1;
                E1 = DeviceBondingActivity.E1(x00.p.this, obj, obj2);
                return E1;
            }
        }));
    }

    public static final boolean C1(ki.l it) {
        String I0;
        kotlin.jvm.internal.g0.p(it, "it");
        I0 = DeviceBondingActivityKt.I0(it);
        return !u30.k0.O3(I0);
    }

    public static final int D1(ki.l lVar, ki.l lVar2) {
        int f11;
        int f12;
        if (lVar.h() == lVar2.h()) {
            f11 = lVar2.f();
            f12 = lVar.f();
        } else {
            WifiFreqType h11 = lVar.h();
            WifiFreqType wifiFreqType = WifiFreqType.TYPE_5G;
            if (h11 == wifiFreqType) {
                return 1;
            }
            if (lVar2.h() == wifiFreqType) {
                return -1;
            }
            f11 = lVar2.f();
            f12 = lVar.f();
        }
        return f11 - f12;
    }

    public static final int E1(x00.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    public static final void F1(final DeviceBondingActivity deviceBondingActivity, final MutableState<kc.u> mutableState, final MutableState<c40.l2> mutableState2, final boolean z11) {
        mc.a.j(deviceBondingActivity, null, new x00.l() { // from class: com.baicizhan.main.vld.bonding.k0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 G1;
                G1 = DeviceBondingActivity.G1(MutableState.this, (kc.u) obj);
                return G1;
            }
        }, new x00.l() { // from class: com.baicizhan.main.vld.bonding.l0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 I1;
                I1 = DeviceBondingActivity.I1(z11, deviceBondingActivity, mutableState2, mutableState, (u.a) obj);
                return I1;
            }
        }, 1, null);
    }

    public static final yz.g2 G1(final MutableState mutableState, kc.u it) {
        kotlin.jvm.internal.g0.p(it, "it");
        it.B(new DialogInterface.OnDismissListener() { // from class: com.baicizhan.main.vld.bonding.v
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DeviceBondingActivity.H1(MutableState.this, dialogInterface);
            }
        });
        mutableState.setValue(it);
        return yz.g2.f100423a;
    }

    public static final void H1(MutableState mutableState, DialogInterface dialogInterface) {
        mutableState.setValue(null);
    }

    public static final yz.g2 I1(boolean z11, final DeviceBondingActivity deviceBondingActivity, final MutableState mutableState, final MutableState mutableState2, u.a prompt) {
        kotlin.jvm.internal.g0.p(prompt, "$this$prompt");
        prompt.V("请开启位置服务后重试");
        if (z11) {
            prompt.b0(ButtonType.SINGLE_POSITIVE);
        } else {
            d.a.s(prompt, null, new x00.l() { // from class: com.baicizhan.main.vld.bonding.h0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 K1;
                    K1 = DeviceBondingActivity.K1(DeviceBondingActivity.this, (View) obj);
                    return K1;
                }
            }, 1, null);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 J1(DeviceBondingActivity deviceBondingActivity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        deviceBondingActivity.finish();
        return yz.g2.f100423a;
    }

    public static final yz.g2 K1(DeviceBondingActivity deviceBondingActivity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        deviceBondingActivity.finish();
        return yz.g2.f100423a;
    }

    public static final yz.g2 L1(DeviceBondingActivity deviceBondingActivity, MutableState mutableState, MutableState mutableState2, View it) {
        c40.l2 f11;
        kotlin.jvm.internal.g0.p(it, "it");
        LoadingDialogActivity.setLoading$default(deviceBondingActivity, true, 0L, "等待开启", 2, null);
        f11 = c40.k.f(LifecycleOwnerKt.getLifecycleScope(deviceBondingActivity), null, null, deviceBondingActivity.new e(mutableState2, mutableState, null), 3, null);
        mutableState.setValue(f11);
        return yz.g2.f100423a;
    }

    public static final void M1(DeviceBondingActivity deviceBondingActivity, MutableState<Boolean> mutableState, SnapshotStateList<ki.l> snapshotStateList) {
        boolean startScan = deviceBondingActivity.p1().startScan();
        qb.c.b(DeviceBondingActivityKt.f25230e, "attempt to scan wifis: " + startScan, new Object[0]);
        if (!startScan) {
            B1(deviceBondingActivity, mutableState, snapshotStateList);
        } else {
            if (mutableState.getValue().booleanValue()) {
                return;
            }
            mutableState.setValue(Boolean.TRUE);
        }
    }

    public static final WifiManager N1(DeviceBondingActivity deviceBondingActivity) {
        Object systemService = deviceBondingActivity.getApplication().getSystemService("wifi");
        kotlin.jvm.internal.g0.n(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return (WifiManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ki.f m1() {
        return ki.h.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ki.f n1() {
        return (ki.f) this.f25175d.getValue();
    }

    @w00.o
    @m80.k
    public static final Intent r1(@m80.k Context context, @m80.k String str) {
        return f25171j.a(context, str);
    }

    public static final LocationManager s1(DeviceBondingActivity deviceBondingActivity) {
        Object systemService = deviceBondingActivity.getApplication().getSystemService(kc.u.S);
        kotlin.jvm.internal.g0.n(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return (LocationManager) systemService;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 t1(DeviceBondingActivity deviceBondingActivity, final h hVar, Composer composer, int i11) {
        final SnapshotStateList snapshotStateList;
        Object obj;
        final MutableState mutableState;
        final MutableState mutableState2;
        MutableState mutableState3;
        Object obj2;
        int i12;
        Object obj3;
        um.b bVar;
        final DeviceBondingActivity deviceBondingActivity2 = deviceBondingActivity;
        final h hVar2 = hVar;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-793793360, i11, -1, "com.baicizhan.main.vld.bonding.DeviceBondingActivity.onCreate.<anonymous> (DeviceBondingActivity.kt:186)");
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(BTStatus.NONE, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue;
            Object value = mutableState4.getValue();
            boolean changedInstance = composer.changedInstance(deviceBondingActivity2);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new b(mutableState4, deviceBondingActivity2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.LaunchedEffect(value, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue2, composer, 0);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt.mutableStateListOf();
                composer.updateRememberedValue(rememberedValue3);
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) rememberedValue3;
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState5 = (MutableState) rememberedValue4;
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(DeviceBondingActivityKt.N0(deviceBondingActivity2, deviceBondingActivity2.o1(), null, 4, null)), null, 2, null);
                composer.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState6 = (MutableState) rememberedValue5;
            Boolean bool = (Boolean) mutableState6.component1();
            final boolean booleanValue = bool.booleanValue();
            final x00.l component2 = mutableState6.component2();
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue6);
            }
            final MutableState mutableState7 = (MutableState) rememberedValue6;
            Object rememberedValue7 = composer.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue7);
            }
            final MutableState mutableState8 = (MutableState) rememberedValue7;
            boolean changedInstance2 = composer.changedInstance(hVar2) | composer.changedInstance(deviceBondingActivity2) | composer.changed(component2);
            Object rememberedValue8 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue8 == companion.getEmpty()) {
                snapshotStateList = snapshotStateList2;
                obj = new x00.l() { // from class: com.baicizhan.main.vld.bonding.m0
                    @Override // x00.l
                    public final Object invoke(Object obj4) {
                        DisposableEffectResult u12;
                        u12 = DeviceBondingActivity.u1(h.this, deviceBondingActivity2, mutableState4, mutableState8, mutableState7, component2, mutableState5, snapshotStateList, (DisposableEffectScope) obj4);
                        return u12;
                    }
                };
                mutableState = mutableState7;
                mutableState2 = mutableState5;
                mutableState3 = mutableState4;
                composer.updateRememberedValue(obj);
            } else {
                snapshotStateList = snapshotStateList2;
                mutableState2 = mutableState5;
                mutableState = mutableState7;
                obj = rememberedValue8;
                mutableState3 = mutableState4;
            }
            EffectsKt.DisposableEffect("", (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) obj, composer, 6);
            q3 q11 = p3.q(composer, 0);
            final um.b a11 = um.c.a(Build.VERSION.SDK_INT >= 31 ? a00.h0.Q("android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION") : a00.h0.Q("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), composer, 0);
            Boolean valueOf = Boolean.valueOf(a11.f());
            boolean changed = composer.changed(a11) | composer.changed(booleanValue) | composer.changedInstance(hVar2) | composer.changedInstance(deviceBondingActivity2);
            Object rememberedValue9 = composer.rememberedValue();
            if (changed || rememberedValue9 == companion.getEmpty()) {
                final SnapshotStateList snapshotStateList3 = snapshotStateList;
                i12 = 6;
                obj3 = "";
                obj2 = new x00.l() { // from class: com.baicizhan.main.vld.bonding.n0
                    @Override // x00.l
                    public final Object invoke(Object obj4) {
                        DisposableEffectResult w12;
                        w12 = DeviceBondingActivity.w1(um.b.this, booleanValue, hVar, deviceBondingActivity2, mutableState2, snapshotStateList3, mutableState, mutableState8, (DisposableEffectScope) obj4);
                        return w12;
                    }
                };
                bVar = a11;
                hVar2 = hVar;
                deviceBondingActivity2 = deviceBondingActivity2;
                snapshotStateList = snapshotStateList3;
                composer.updateRememberedValue(obj2);
            } else {
                obj3 = "";
                bVar = a11;
                obj2 = rememberedValue9;
                i12 = 6;
            }
            EffectsKt.DisposableEffect(valueOf, bool, (x00.l) obj2, composer, 0);
            Object rememberedValue10 = composer.rememberedValue();
            if (rememberedValue10 == companion.getEmpty()) {
                rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(a00.h0.J(), null, 2, null);
                composer.updateRememberedValue(rememberedValue10);
            }
            MutableState mutableState9 = (MutableState) rememberedValue10;
            boolean changedInstance3 = composer.changedInstance(deviceBondingActivity2);
            Object rememberedValue11 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue11 == companion.getEmpty()) {
                rememberedValue11 = deviceBondingActivity2.new c(mutableState3, mutableState9, null);
                composer.updateRememberedValue(rememberedValue11);
            }
            EffectsKt.LaunchedEffect(obj3, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue11, composer, i12);
            int i13 = deviceBondingActivity2.f25178g;
            BTStatus bTStatus = (BTStatus) mutableState3.getValue();
            boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
            List list = (List) mutableState9.getValue();
            boolean changedInstance4 = composer.changedInstance(deviceBondingActivity2);
            Object rememberedValue12 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue12 == companion.getEmpty()) {
                rememberedValue12 = new x00.a() { // from class: com.baicizhan.main.vld.bonding.o0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 x12;
                        x12 = DeviceBondingActivity.x1(DeviceBondingActivity.this, mutableState2, snapshotStateList);
                        return x12;
                    }
                };
                composer.updateRememberedValue(rememberedValue12);
            }
            x00.a aVar = (x00.a) rememberedValue12;
            boolean changedInstance5 = composer.changedInstance(deviceBondingActivity2) | composer.changedInstance(hVar2);
            Object rememberedValue13 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue13 == companion.getEmpty()) {
                rememberedValue13 = new x00.p() { // from class: com.baicizhan.main.vld.bonding.w
                    @Override // x00.p
                    public final Object invoke(Object obj4, Object obj5) {
                        yz.g2 y12;
                        y12 = DeviceBondingActivity.y1(DeviceBondingActivity.this, hVar2, (String) obj4, (String) obj5);
                        return y12;
                    }
                };
                composer.updateRememberedValue(rememberedValue13);
            }
            x00.p pVar = (x00.p) rememberedValue13;
            boolean changedInstance6 = composer.changedInstance(deviceBondingActivity2);
            Object rememberedValue14 = composer.rememberedValue();
            if (changedInstance6 || rememberedValue14 == companion.getEmpty()) {
                rememberedValue14 = new x00.a() { // from class: com.baicizhan.main.vld.bonding.x
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 z12;
                        z12 = DeviceBondingActivity.z1(DeviceBondingActivity.this);
                        return z12;
                    }
                };
                composer.updateRememberedValue(rememberedValue14);
            }
            x00.a aVar2 = (x00.a) rememberedValue14;
            boolean changedInstance7 = composer.changedInstance(deviceBondingActivity2);
            Object rememberedValue15 = composer.rememberedValue();
            if (changedInstance7 || rememberedValue15 == companion.getEmpty()) {
                rememberedValue15 = new x00.a() { // from class: com.baicizhan.main.vld.bonding.y
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 A1;
                        A1 = DeviceBondingActivity.A1(DeviceBondingActivity.this);
                        return A1;
                    }
                };
                composer.updateRememberedValue(rememberedValue15);
            }
            DeviceBondingActivityKt.D(bVar, q11, i13, bTStatus, booleanValue2, snapshotStateList, list, aVar, pVar, aVar2, (x00.a) rememberedValue15, composer, 196608, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.BroadcastReceiver, com.baicizhan.main.vld.bonding.DeviceBondingActivity$onCreate$6$3$1$receiver$1] */
    public static final DisposableEffectResult u1(h hVar, final DeviceBondingActivity deviceBondingActivity, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final x00.l lVar, final MutableState mutableState4, final SnapshotStateList snapshotStateList, DisposableEffectScope DisposableEffect) {
        kotlin.jvm.internal.g0.p(DisposableEffect, "$this$DisposableEffect");
        hVar.d0(new hj.a() { // from class: com.baicizhan.main.vld.bonding.c0
            @Override // hj.a
            public final void onResult(Object obj) {
                DeviceBondingActivity.v1(MutableState.this, (BTStatus) obj);
            }
        });
        ?? r22 = new BroadcastReceiver() { // from class: com.baicizhan.main.vld.bonding.DeviceBondingActivity$onCreate$6$3$1$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LocationManager o12;
                boolean M0;
                kotlin.jvm.internal.g0.p(context, "context");
                kotlin.jvm.internal.g0.p(intent, "intent");
                String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode != -511271086) {
                        if (hashCode == 1878357501 && action.equals("android.net.wifi.SCAN_RESULTS")) {
                            if (intent.getBooleanExtra("resultsUpdated", false)) {
                                DeviceBondingActivity.B1(DeviceBondingActivity.this, mutableState4, snapshotStateList);
                                return;
                            } else {
                                qb.c.q(DeviceBondingActivityKt.f25230e, "results failed", new Object[0]);
                                return;
                            }
                        }
                        return;
                    }
                    if (action.equals("android.location.MODE_CHANGED")) {
                        LoadingDialogActivity.setLoading$default(DeviceBondingActivity.this, false, 0L, null, 6, null);
                        c40.l2 value = mutableState2.getValue();
                        if (value != null) {
                            l2.a.b(value, null, 1, null);
                        }
                        mutableState2.setValue(null);
                        kc.u value2 = mutableState3.getValue();
                        if (value2 != null) {
                            value2.dismiss();
                        }
                        x00.l<Boolean, yz.g2> lVar2 = lVar;
                        DeviceBondingActivity deviceBondingActivity2 = DeviceBondingActivity.this;
                        o12 = deviceBondingActivity2.o1();
                        M0 = DeviceBondingActivityKt.M0(deviceBondingActivity2, o12, intent);
                        lVar2.invoke(Boolean.valueOf(M0));
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter("android.net.wifi.SCAN_RESULTS");
        intentFilter.addAction("android.location.MODE_CHANGED");
        yz.g2 g2Var = yz.g2.f100423a;
        ContextCompat.registerReceiver(deviceBondingActivity, r22, intentFilter, 4);
        return new f(hVar, deviceBondingActivity, r22);
    }

    public static final void v1(MutableState mutableState, BTStatus it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (mutableState.getValue() != BTStatus.DONE) {
            mutableState.setValue(it);
            return;
        }
        qb.c.q(DeviceBondingActivityKt.f25230e, "Already done, ignore " + it, new Object[0]);
    }

    public static final DisposableEffectResult w1(um.b bVar, boolean z11, h hVar, DeviceBondingActivity deviceBondingActivity, MutableState mutableState, SnapshotStateList snapshotStateList, MutableState mutableState2, MutableState mutableState3, DisposableEffectScope DisposableEffect) {
        kotlin.jvm.internal.g0.p(DisposableEffect, "$this$DisposableEffect");
        if (bVar.f()) {
            if (z11) {
                String str = deviceBondingActivity.f25176e;
                if (str == null) {
                    kotlin.jvm.internal.g0.S("deviceName");
                    str = null;
                }
                hVar.i0(str);
                M1(deviceBondingActivity, mutableState, snapshotStateList);
            } else {
                F1(deviceBondingActivity, mutableState2, mutableState3, false);
            }
        }
        return new g(bVar, hVar);
    }

    public static final yz.g2 x1(DeviceBondingActivity deviceBondingActivity, MutableState mutableState, SnapshotStateList snapshotStateList) {
        M1(deviceBondingActivity, mutableState, snapshotStateList);
        return yz.g2.f100423a;
    }

    public static final yz.g2 y1(DeviceBondingActivity deviceBondingActivity, h hVar, String name, String pwd) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(pwd, "pwd");
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(deviceBondingActivity), null, null, new d(hVar, name, pwd, deviceBondingActivity, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 z1(DeviceBondingActivity deviceBondingActivity) {
        ji.t1.a(deviceBondingActivity);
        Intent intent = new Intent();
        intent.putExtra(deviceBondingActivity.f25178g == 0 ? "deviceBound" : "deviceConfigured", true);
        intent.putExtra(NavigatorMgr.DATA_EXIT, true);
        yz.g2 g2Var = yz.g2.f100423a;
        deviceBondingActivity.setResult(-1, intent);
        deviceBondingActivity.finish();
        return g2Var;
    }

    public final LocationManager o1() {
        return (LocationManager) this.f25174c.getValue();
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        Integer p12;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(DeviceBondingActivityKt.f25226a);
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = null;
        }
        if (stringExtra == null) {
            q1();
            return;
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("blename");
        if (queryParameter == null || queryParameter.length() == 0) {
            queryParameter = null;
        }
        if (queryParameter == null) {
            q1();
            return;
        }
        this.f25176e = queryParameter;
        String queryParameter2 = Uri.parse(stringExtra).getQueryParameter("sn");
        if (queryParameter2 == null || queryParameter2.length() == 0) {
            queryParameter2 = null;
        }
        if (queryParameter2 == null) {
            q1();
            return;
        }
        this.f25177f = queryParameter2;
        String queryParameter3 = Uri.parse(stringExtra).getQueryParameter("m");
        if (queryParameter3 != null && (p12 = u30.e0.p1(queryParameter3)) != null) {
            this.f25178g = p12.intValue();
        }
        final h hVar = new h(this);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-793793360, true, new x00.p() { // from class: com.baicizhan.main.vld.bonding.j0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 t12;
                t12 = DeviceBondingActivity.t1(DeviceBondingActivity.this, hVar, (Composer) obj, ((Integer) obj2).intValue());
                return t12;
            }
        }), 1, null);
    }

    public final WifiManager p1() {
        return (WifiManager) this.f25173b.getValue();
    }

    public final void q1() {
        va.g.i("设备信息错误", 0);
        finish();
    }
}
