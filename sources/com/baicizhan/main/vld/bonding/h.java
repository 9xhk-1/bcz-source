package com.baicizhan.main.vld.bonding;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import c40.l2;
import com.baicizhan.main.vld.bonding.h;
import com.igexin.assist.sdk.AssistPushConsts;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@SuppressLint({"MissingPermission"})
@kotlin.jvm.internal.u0({"SMAP\nBluetoothConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothConnector.kt\ncom/baicizhan/main/vld/bonding/BluetoothConnector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,517:1\n1869#2,2:518\n1869#2,2:520\n1#3:522\n*S KotlinDebug\n*F\n+ 1 BluetoothConnector.kt\ncom/baicizhan/main/vld/bonding/BluetoothConnector\n*L\n334#1:518,2\n353#1:520,2\n*E\n"})
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public static final b f25305t = new b(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f25306u = 8;

    /* renamed from: v, reason: collision with root package name */
    public static final String f25307v = h.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final WeakReference<FragmentActivity> f25308a;

    /* renamed from: b, reason: collision with root package name */
    public final BluetoothManager f25309b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f25310c;

    /* renamed from: d, reason: collision with root package name */
    public ActivityResultLauncher<Intent> f25311d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public x00.l<? super Boolean, yz.g2> f25312e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public c40.l2 f25313f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public BluetoothGattCharacteristic f25314g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public BluetoothGattCharacteristic f25315h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public BluetoothGatt f25316i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25317j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public hj.a<BTStatus> f25318k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public BTStatus f25319l;

    /* renamed from: m, reason: collision with root package name */
    public int f25320m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    public d f25321n;

    /* renamed from: o, reason: collision with root package name */
    @m80.l
    public c f25322o;

    /* renamed from: p, reason: collision with root package name */
    @m80.l
    public n40.h f25323p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final n40.a f25324q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final Map<com.baicizhan.main.vld.bonding.a, Pair<Integer, byte[]>> f25325r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final Map<Byte, Map<Byte, byte[]>> f25326s;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.BluetoothConnector$1", f = "BluetoothConnector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25327a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        public static final void j(h hVar, ActivityResult activityResult) {
            x00.l lVar = hVar.f25312e;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(activityResult.getResultCode() == -1));
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return h.this.new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f25327a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            h hVar = h.this;
            Object obj2 = hVar.f25308a.get();
            ComponentActivity componentActivity = obj2 instanceof ComponentActivity ? (ComponentActivity) obj2 : null;
            if (componentActivity != null) {
                ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
                final h hVar2 = h.this;
                ActivityResultLauncher registerForActivityResult = componentActivity.registerForActivityResult(startActivityForResult, new ActivityResultCallback() { // from class: com.baicizhan.main.vld.bonding.g
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj3) {
                        h.a.j(h.this, (ActivityResult) obj3);
                    }
                });
                if (registerForActivityResult != null) {
                    hVar.f25311d = registerForActivityResult;
                    return yz.g2.f100423a;
                }
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nBluetoothConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothConnector.kt\ncom/baicizhan/main/vld/bonding/BluetoothConnector$DeviceBluetoothGattCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,517:1\n1#2:518\n*E\n"})
    public final class c extends BluetoothGattCallback {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.vld.bonding.BluetoothConnector$DeviceBluetoothGattCallback$onCharacteristicChanged$4$1", f = "BluetoothConnector.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f25330a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f25331b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BluetoothGatt f25332c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Pair<Integer, byte[]> f25333d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.baicizhan.main.vld.bonding.a f25334e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, BluetoothGatt bluetoothGatt, Pair<Integer, byte[]> pair, com.baicizhan.main.vld.bonding.a aVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f25331b = hVar;
                this.f25332c = bluetoothGatt;
                this.f25333d = pair;
                this.f25334e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f25331b, this.f25332c, this.f25333d, this.f25334e, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f25330a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    h hVar = this.f25331b;
                    BluetoothGatt bluetoothGatt = this.f25332c;
                    BluetoothGattCharacteristic bluetoothGattCharacteristic = hVar.f25314g;
                    kotlin.jvm.internal.g0.m(bluetoothGattCharacteristic);
                    byte[] second = this.f25333d.getSecond();
                    this.f25330a = 1;
                    if (hVar.k0(bluetoothGatt, bluetoothGattCharacteristic, second, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                Map map = this.f25331b.f25325r;
                com.baicizhan.main.vld.bonding.a aVar = this.f25334e;
                Pair<Integer, byte[]> pair = this.f25333d;
                map.put(aVar, Pair.copy$default(pair, l00.a.f(pair.getFirst().intValue() + 1), null, 2, null));
                qb.c.b(h.f25307v, "retry: " + this.f25334e, new Object[0]);
                h.g0(this.f25331b, BTStatus.CONFIGURE_TIMEOUT, 0L, 2, null);
                return yz.g2.f100423a;
            }
        }

        public c() {
        }

        public static final CharSequence b(byte b11) {
            kotlin.jvm.internal.w0 w0Var = kotlin.jvm.internal.w0.f67050a;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
            kotlin.jvm.internal.g0.o(format, "format(...)");
            Locale US = Locale.US;
            kotlin.jvm.internal.g0.o(US, "US");
            String upperCase = format.toUpperCase(US);
            kotlin.jvm.internal.g0.o(upperCase, "toUpperCase(...)");
            return upperCase;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(@m80.k BluetoothGatt gatt, @m80.k BluetoothGattCharacteristic characteristic) {
            byte[] bArr;
            com.baicizhan.main.vld.bonding.a aVar;
            LifecycleCoroutineScope lifecycleScope;
            Byte valueOf = Byte.valueOf(j.f25377b);
            kotlin.jvm.internal.g0.p(gatt, "gatt");
            kotlin.jvm.internal.g0.p(characteristic, "characteristic");
            super.onCharacteristicChanged(gatt, characteristic);
            String str = h.f25307v;
            byte[] value = characteristic.getValue();
            kotlin.jvm.internal.g0.o(value, "getValue(...)");
            List<Byte> n11 = a00.q.n(value);
            qb.c.b(str, "onCharacteristicChanged: " + a00.r0.r3(n11.subList(0, Math.min(n11.size(), 6)), " ", null, null, 0, null, new x00.l() { // from class: com.baicizhan.main.vld.bonding.i
                @Override // x00.l
                public final Object invoke(Object obj) {
                    CharSequence b11;
                    b11 = h.c.b(((Byte) obj).byteValue());
                    return b11;
                }
            }, 30, null), new Object[0]);
            byte R = h.this.R(characteristic);
            Byte valueOf2 = Byte.valueOf(j.f25376a);
            if (R != -96) {
                if (R != -80) {
                    qb.c.b(h.f25307v, "unexpected protocol: " + ((int) R), new Object[0]);
                    return;
                }
                byte S = h.this.S(characteristic);
                if (S != 1) {
                    if (S == 0) {
                        h.this.c0(BTStatus.CONFIGURE_FAILED);
                        return;
                    }
                    qb.c.d(h.f25307v, "unexpected result: " + ((int) h.this.S(characteristic)), new Object[0]);
                    return;
                }
                if (h.this.f25326s.get(valueOf) == null) {
                    h.this.f25326s.put(valueOf, new LinkedHashMap());
                }
                Object obj = h.this.f25326s.get(valueOf);
                kotlin.jvm.internal.g0.m(obj);
                Map map = (Map) obj;
                Byte valueOf3 = Byte.valueOf(h.this.T(characteristic));
                if (characteristic.getValue().length > 6) {
                    byte[] value2 = characteristic.getValue();
                    kotlin.jvm.internal.g0.o(value2, "getValue(...)");
                    bArr = a00.q.f1(value2, 6, Math.min(characteristic.getValue().length - 7, (int) characteristic.getValue()[5]) + 6);
                } else {
                    bArr = new byte[0];
                }
                map.put(valueOf3, bArr);
                h.this.L();
                return;
            }
            byte S2 = h.this.S(characteristic);
            if (S2 == 1 || S2 == 2) {
                if (h.this.f25326s.get(valueOf2) == null) {
                    h.this.f25326s.put(valueOf2, new LinkedHashMap());
                }
                Object obj2 = h.this.f25326s.get(valueOf2);
                kotlin.jvm.internal.g0.m(obj2);
                ((Map) obj2).put(Byte.valueOf(h.this.S(characteristic)), new byte[0]);
                h.this.L();
                return;
            }
            if (S2 != 0) {
                qb.c.d(h.f25307v, "unexpected result: " + ((int) h.this.S(characteristic)), new Object[0]);
                return;
            }
            byte T = h.this.T(characteristic);
            qb.c.b(h.f25307v, "data incomplete for " + ((int) T), new Object[0]);
            com.baicizhan.main.vld.bonding.a[] values = com.baicizhan.main.vld.bonding.a.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i11];
                if (aVar.c() == T) {
                    break;
                } else {
                    i11++;
                }
            }
            com.baicizhan.main.vld.bonding.a aVar2 = aVar;
            if (aVar2 != null) {
                h hVar = h.this;
                Pair pair = (Pair) hVar.f25325r.get(aVar2);
                if (pair == null) {
                    return;
                }
                qb.c.b(h.f25307v, "current retry: " + pair.getFirst(), new Object[0]);
                if (((Number) pair.getFirst()).intValue() >= 3) {
                    hVar.c0(BTStatus.ERROR);
                    return;
                }
                FragmentActivity fragmentActivity = (FragmentActivity) hVar.f25308a.get();
                if (fragmentActivity == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivity)) == null) {
                    return;
                }
                c40.k.f(lifecycleScope, null, null, new a(hVar, gatt, pair, aVar2, null), 3, null);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(@m80.l BluetoothGatt bluetoothGatt, @m80.l BluetoothGattCharacteristic bluetoothGattCharacteristic, int i11) {
            n40.h hVar;
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i11);
            qb.c.b(h.f25307v, "onCharacteristicWrite: " + i11, new Object[0]);
            if (i11 != 0 || (hVar = h.this.f25323p) == null) {
                return;
            }
            hVar.release();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(@m80.k BluetoothGatt gatt, int i11, int i12) {
            kotlin.jvm.internal.g0.p(gatt, "gatt");
            super.onConnectionStateChange(gatt, i11, i12);
            String address = gatt.getDevice().getAddress();
            qb.c.b(h.f25307v, "[" + h.this.f25319l + "] state changed: status = " + i11 + " newState = " + i12, new Object[0]);
            h.this.h0();
            if (i11 != 0) {
                if (h.this.f25319l == BTStatus.CONNECTING) {
                    h.this.c0(BTStatus.CONNECT_FAILED);
                    return;
                } else {
                    if (h.this.f25319l != BTStatus.CONFIGURING || h.this.V()) {
                        return;
                    }
                    h.this.c0(BTStatus.CONFIGURE_FAILED);
                    return;
                }
            }
            if (i12 == 0) {
                qb.c.b(h.f25307v, "successfully disconnected from " + address, new Object[0]);
                gatt.close();
                return;
            }
            if (i12 != 2) {
                return;
            }
            qb.c.b(h.f25307v, "successfully connected to " + address, new Object[0]);
            gatt.discoverServices();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(@m80.k BluetoothGatt gatt, int i11, int i12) {
            kotlin.jvm.internal.g0.p(gatt, "gatt");
            super.onMtuChanged(gatt, i11, i12);
            qb.c.b(h.f25307v, "mtu changed to " + i11 + ", success: " + (i12 == 0), new Object[0]);
            h.this.h0();
            h hVar = h.this;
            hVar.c0(hVar.e0() ? BTStatus.CONNECT_SUCCEEDED : BTStatus.CONNECT_FAILED);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(@m80.k BluetoothGatt gatt, int i11) {
            kotlin.jvm.internal.g0.p(gatt, "gatt");
            super.onServicesDiscovered(gatt, i11);
            h.this.Y(gatt);
            BluetoothGattService service = gatt.getService(UUID.fromString("0000ffff-0000-1000-8000-00805f9b34fb"));
            h.this.f25314g = service.getCharacteristic(UUID.fromString("0000ff01-0000-1000-8000-00805f9b34fb"));
            h.this.f25315h = service.getCharacteristic(UUID.fromString("0000ff02-0000-1000-8000-00805f9b34fb"));
            if (h.this.f25314g == null || h.this.f25315h == null) {
                h.this.c0(BTStatus.CONNECT_FAILED);
                return;
            }
            qb.c.b(h.f25307v, "start notification setting", new Object[0]);
            BluetoothGattCharacteristic bluetoothGattCharacteristic = h.this.f25315h;
            if (bluetoothGattCharacteristic != null) {
                h hVar = h.this;
                if (!gatt.setCharacteristicNotification(bluetoothGattCharacteristic, true)) {
                    qb.c.q(h.f25307v, "enabled failed", new Object[0]);
                    hVar.c0(BTStatus.CONNECT_FAILED);
                } else if (gatt.requestMtu(200)) {
                    qb.c.b(h.f25307v, "mtu request success", new Object[0]);
                    hVar.f0(BTStatus.CONNECT_FAILED, 5000L);
                } else {
                    qb.c.q(h.f25307v, "mtu request failed", new Object[0]);
                    hVar.c0(BTStatus.CONNECT_FAILED);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class d extends ScanCallback {
        public d() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i11) {
            super.onScanFailed(i11);
            qb.c.d(h.f25307v, "onScanFailed: " + i11, new Object[0]);
            h.this.h0();
            h.this.c0(BTStatus.CONNECT_FAILED);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i11, @m80.k ScanResult result) {
            kotlin.jvm.internal.g0.p(result, "result");
            super.onScanResult(i11, result);
            qb.c.b(h.f25307v, "onScanResult: " + result.getDevice().getAddress(), new Object[0]);
            if (h.this.f25317j) {
                qb.c.b(h.f25307v, "device connect already initialized!", new Object[0]);
                return;
            }
            BluetoothLeScanner bluetoothLeScanner = h.this.Q().getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this);
            }
            c cVar = h.this.new c();
            BluetoothDevice device = result.getDevice();
            FragmentActivity fragmentActivity = (FragmentActivity) h.this.f25308a.get();
            if (fragmentActivity == null) {
                qb.c.d(h.f25307v, "null activity for now!", new Object[0]);
                return;
            }
            BluetoothGatt connectGatt = device.connectGatt(fragmentActivity, false, cVar);
            h hVar = h.this;
            hVar.f25316i = connectGatt;
            hVar.f25322o = cVar;
            try {
                hVar.f25317j = connectGatt.connect();
            } catch (Exception e11) {
                qb.c.c(h.f25307v, "connect: ", e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.BluetoothConnector$checkRemoteStates$1", f = "BluetoothConnector.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {523, 527, 527}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-BluetoothConnector$checkRemoteStates$1$1", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-BluetoothConnector$checkRemoteStates$1$1"}, s = {"L$0", "I$0", "L$0", "I$0", "I$1", "L$0", "I$0", "I$1"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nBluetoothConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothConnector.kt\ncom/baicizhan/main/vld/bonding/BluetoothConnector$checkRemoteStates$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,517:1\n116#2,11:518\n*S KotlinDebug\n*F\n+ 1 BluetoothConnector.kt\ncom/baicizhan/main/vld/bonding/BluetoothConnector$checkRemoteStates$1\n*L\n317#1:518,11\n*E\n"})
    public static final class e extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f25336a;

        /* renamed from: b, reason: collision with root package name */
        public Object f25337b;

        /* renamed from: c, reason: collision with root package name */
        public int f25338c;

        /* renamed from: d, reason: collision with root package name */
        public int f25339d;

        /* renamed from: e, reason: collision with root package name */
        public int f25340e;

        public e(j00.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return h.this.new e(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ce A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001b, B:9:0x00f8, B:10:0x00fd, B:20:0x00c8, B:22:0x00ce, B:25:0x00d4, B:27:0x00da, B:31:0x00e2, B:41:0x0070, B:43:0x0078, B:46:0x0089, B:48:0x008f, B:50:0x0095, B:52:0x009e, B:55:0x00a4, B:57:0x00aa, B:61:0x00b2), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d4 A[Catch: all -> 0x0020, TRY_ENTER, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001b, B:9:0x00f8, B:10:0x00fd, B:20:0x00c8, B:22:0x00ce, B:25:0x00d4, B:27:0x00da, B:31:0x00e2, B:41:0x0070, B:43:0x0078, B:46:0x0089, B:48:0x008f, B:50:0x0095, B:52:0x009e, B:55:0x00a4, B:57:0x00aa, B:61:0x00b2), top: B:2:0x000b }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [n40.a] */
        /* JADX WARN: Type inference failed for: r1v11 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.vld.bonding.h.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.BluetoothConnector", f = "BluetoothConnector.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {501, 502, 504}, m = "configure", n = {"ssid", HintConstants.AUTOFILL_HINT_PASSWORD, "token", "mode", "ssid", HintConstants.AUTOFILL_HINT_PASSWORD, "token", "mode", "ssid", HintConstants.AUTOFILL_HINT_PASSWORD, "token", "concat", "mode"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f25342a;

        /* renamed from: b, reason: collision with root package name */
        public Object f25343b;

        /* renamed from: c, reason: collision with root package name */
        public Object f25344c;

        /* renamed from: d, reason: collision with root package name */
        public Object f25345d;

        /* renamed from: e, reason: collision with root package name */
        public int f25346e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f25347f;

        /* renamed from: h, reason: collision with root package name */
        public int f25349h;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f25347f = obj;
            this.f25349h |= Integer.MIN_VALUE;
            return h.this.N(null, null, null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.BluetoothConnector$startTimeoutWatch$1", f = "BluetoothConnector.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25350a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f25351b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f25352c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ BTStatus f25353d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j11, h hVar, BTStatus bTStatus, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f25351b = j11;
            this.f25352c = hVar;
            this.f25353d = bTStatus;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new g(this.f25351b, this.f25352c, this.f25353d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25350a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                long j11 = this.f25351b;
                this.f25350a = 1;
                if (c40.a1.b(j11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            this.f25352c.c0(this.f25353d);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.BluetoothConnector", f = "BluetoothConnector.kt", i = {0, 0, 0, 0, 0, 0}, l = {409}, m = "writeCharacteristic", n = {"bluetoothGatt", "characteristic", AssistPushConsts.MSG_TYPE_PAYLOAD, "gatt", "writeType", "$i$a$-let-BluetoothConnector$writeCharacteristic$4"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 1)
    /* renamed from: com.baicizhan.main.vld.bonding.h$h, reason: collision with other inner class name */
    public static final class C0326h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f25354a;

        /* renamed from: b, reason: collision with root package name */
        public Object f25355b;

        /* renamed from: c, reason: collision with root package name */
        public Object f25356c;

        /* renamed from: d, reason: collision with root package name */
        public Object f25357d;

        /* renamed from: e, reason: collision with root package name */
        public int f25358e;

        /* renamed from: f, reason: collision with root package name */
        public int f25359f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f25360g;

        /* renamed from: i, reason: collision with root package name */
        public int f25362i;

        public C0326h(j00.c<? super C0326h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f25360g = obj;
            this.f25362i |= Integer.MIN_VALUE;
            return h.this.k0(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.BluetoothConnector$writeCharacteristic$4$1", f = "BluetoothConnector.kt", i = {}, l = {410}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class i extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25363a;

        public i(j00.c<? super i> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return h.this.new i(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25363a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                n40.h hVar = h.this.f25323p;
                if (hVar == null) {
                    return null;
                }
                this.f25363a = 1;
                if (hVar.a(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    public h(@m80.k FragmentActivity activity) {
        kotlin.jvm.internal.g0.p(activity, "activity");
        this.f25308a = new WeakReference<>(activity);
        this.f25309b = (BluetoothManager) activity.getApplicationContext().getSystemService(BluetoothManager.class);
        this.f25310c = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.vld.bonding.e
            @Override // x00.a
            public final Object invoke() {
                BluetoothAdapter K;
                K = h.K(h.this);
                return K;
            }
        });
        this.f25319l = BTStatus.NONE;
        this.f25324q = n40.g.b(false, 1, null);
        this.f25325r = new LinkedHashMap();
        this.f25326s = new LinkedHashMap();
        LifecycleOwnerKt.getLifecycleScope(activity).launchWhenCreated(new a(null));
    }

    public static final BluetoothAdapter K(h hVar) {
        return hVar.f25309b.getAdapter();
    }

    public static final CharSequence Z(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String str;
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        if (bluetoothGattCharacteristic.getDescriptors().isEmpty()) {
            str = "";
        } else {
            List<BluetoothGattDescriptor> descriptors = bluetoothGattCharacteristic.getDescriptors();
            kotlin.jvm.internal.g0.o(descriptors, "getDescriptors(...)");
            str = "\n   Descriptors:\n" + a00.r0.r3(descriptors, "\n   #--", "   #--", null, 0, null, new x00.l() { // from class: com.baicizhan.main.vld.bonding.d
                @Override // x00.l
                public final Object invoke(Object obj) {
                    CharSequence a02;
                    a02 = h.a0((BluetoothGattDescriptor) obj);
                    return a02;
                }
            }, 28, null);
        }
        return uuid + str;
    }

    public static final CharSequence a0(BluetoothGattDescriptor bluetoothGattDescriptor) {
        String uuid = bluetoothGattDescriptor.getUuid().toString();
        kotlin.jvm.internal.g0.o(uuid, "toString(...)");
        return uuid;
    }

    public static /* synthetic */ void g0(h hVar, BTStatus bTStatus, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 30000;
        }
        hVar.f0(bTStatus, j11);
    }

    public static final yz.g2 j0(h hVar, String str, boolean z11) {
        if (z11) {
            hVar.O(str);
        } else {
            hVar.c0(BTStatus.FORBIDDEN);
        }
        return yz.g2.f100423a;
    }

    public static final CharSequence l0(byte b11) {
        kotlin.jvm.internal.w0 w0Var = kotlin.jvm.internal.w0.f67050a;
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
        kotlin.jvm.internal.g0.o(format, "format(...)");
        Locale US = Locale.US;
        kotlin.jvm.internal.g0.o(US, "US");
        String upperCase = format.toUpperCase(US);
        kotlin.jvm.internal.g0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public final void L() {
        LifecycleCoroutineScope lifecycleScope;
        FragmentActivity fragmentActivity = this.f25308a.get();
        if (fragmentActivity == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivity)) == null) {
            return;
        }
        c40.k.f(lifecycleScope, null, null, new e(null), 3, null);
    }

    public final void M() {
        BluetoothLeScanner bluetoothLeScanner;
        qb.c.b(f25307v, "closed", new Object[0]);
        d dVar = this.f25321n;
        if (dVar != null && (bluetoothLeScanner = Q().getBluetoothLeScanner()) != null) {
            bluetoothLeScanner.stopScan(dVar);
        }
        Q().cancelDiscovery();
        BluetoothGatt bluetoothGatt = this.f25316i;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
        BluetoothGatt bluetoothGatt2 = this.f25316i;
        if (bluetoothGatt2 != null) {
            bluetoothGatt2.close();
        }
        this.f25316i = null;
        this.f25322o = null;
        this.f25321n = null;
        this.f25326s.clear();
        this.f25325r.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0159, code lost:
    
        if (k0(r6, r10, r12, r3) != r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(@m80.k java.lang.String r17, @m80.k java.lang.String r18, @m80.k java.lang.String r19, int r20, @m80.k j00.c<? super yz.g2> r21) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.vld.bonding.h.N(java.lang.String, java.lang.String, java.lang.String, int, j00.c):java.lang.Object");
    }

    public final void O(String str) {
        BluetoothLeScanner bluetoothLeScanner = Q().getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            qb.c.q(f25307v, "scanner unavailable!", new Object[0]);
            return;
        }
        c0(BTStatus.CONNECTING);
        ScanFilter build = new ScanFilter.Builder().setDeviceName(str).build();
        ScanSettings build2 = new ScanSettings.Builder().setScanMode(2).build();
        this.f25321n = new d();
        bluetoothLeScanner.startScan(a00.g0.l(build), build2, this.f25321n);
        g0(this, BTStatus.CONNECT_TIMEOUT, 0L, 2, null);
    }

    public final boolean P(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i11) {
        return (bluetoothGattCharacteristic.getProperties() & i11) != 0;
    }

    public final BluetoothAdapter Q() {
        return (BluetoothAdapter) this.f25310c.getValue();
    }

    public final byte R(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return bluetoothGattCharacteristic.getValue()[0];
    }

    public final byte S(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return bluetoothGattCharacteristic.getValue()[1];
    }

    public final byte T(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return bluetoothGattCharacteristic.getValue()[2];
    }

    public final boolean U() {
        Map<Byte, byte[]> map = this.f25326s.get(Byte.valueOf(j.f25376a));
        return (map == null || map.get((byte) 1) == null || (map.get((byte) 2) == null && this.f25320m != 1)) ? false : true;
    }

    public final boolean V() {
        Map<Byte, byte[]> map = this.f25326s.get(Byte.valueOf(j.f25377b));
        return (map == null || map.get((byte) 1) == null || map.get((byte) 2) == null || map.get((byte) 3) == null) ? false : true;
    }

    public final boolean W(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return P(bluetoothGattCharacteristic, 8);
    }

    public final boolean X(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return P(bluetoothGattCharacteristic, 4);
    }

    public final void Y(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt.getServices().isEmpty()) {
            qb.c.i(f25307v, "No service and characteristic available, call discoverServices() first?", new Object[0]);
            return;
        }
        List<BluetoothGattService> services = bluetoothGatt.getServices();
        kotlin.jvm.internal.g0.o(services, "getServices(...)");
        for (BluetoothGattService bluetoothGattService : services) {
            List<BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
            kotlin.jvm.internal.g0.o(characteristics, "getCharacteristics(...)");
            String r32 = a00.r0.r3(characteristics, "\n|--", "|--", null, 0, null, new x00.l() { // from class: com.baicizhan.main.vld.bonding.c
                @Override // x00.l
                public final Object invoke(Object obj) {
                    CharSequence Z;
                    Z = h.Z((BluetoothGattCharacteristic) obj);
                    return Z;
                }
            }, 28, null);
            qb.c.i(f25307v, "\nService " + bluetoothGattService.getUuid() + "\nCharacteristics:\n" + r32, new Object[0]);
        }
    }

    public final void b0() {
        this.f25318k = null;
    }

    public final void c0(BTStatus bTStatus) {
        this.f25319l = bTStatus;
        hj.a<BTStatus> aVar = this.f25318k;
        if (aVar != null) {
            aVar.onResult(bTStatus);
        }
    }

    public final void d0(@m80.k hj.a<BTStatus> statusCallback) {
        kotlin.jvm.internal.g0.p(statusCallback, "statusCallback");
        this.f25318k = statusCallback;
    }

    public final boolean e0() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f25315h;
        if (bluetoothGattCharacteristic == null) {
            return true;
        }
        List<BluetoothGattDescriptor> descriptors = bluetoothGattCharacteristic.getDescriptors();
        kotlin.jvm.internal.g0.o(descriptors, "getDescriptors(...)");
        for (BluetoothGattDescriptor bluetoothGattDescriptor : descriptors) {
            bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            BluetoothGatt bluetoothGatt = this.f25316i;
            if (bluetoothGatt != null && !bluetoothGatt.writeDescriptor(bluetoothGattDescriptor)) {
                qb.c.q(f25307v, "write des failed: " + bluetoothGattDescriptor.getUuid(), new Object[0]);
                c0(BTStatus.CONNECT_FAILED);
                return false;
            }
        }
        return true;
    }

    public final void f0(BTStatus bTStatus, long j11) {
        h hVar;
        c40.l2 l2Var;
        LifecycleCoroutineScope lifecycleScope;
        String str = f25307v;
        qb.c.b(str, "start a timeout...", new Object[0]);
        h0();
        FragmentActivity fragmentActivity = this.f25308a.get();
        if (fragmentActivity == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivity)) == null) {
            hVar = this;
            l2Var = null;
        } else {
            g gVar = new g(j11, this, bTStatus, null);
            hVar = this;
            l2Var = c40.k.f(lifecycleScope, null, null, gVar, 3, null);
        }
        hVar.f25313f = l2Var;
        qb.c.b(str, "a timeout started", new Object[0]);
    }

    public final void h0() {
        qb.c.b(f25307v, "stop current timeout.", new Object[0]);
        c40.l2 l2Var = this.f25313f;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.f25313f = null;
    }

    public final void i0(@m80.k final String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        if (Q().isEnabled()) {
            O(name);
            return;
        }
        this.f25312e = new x00.l() { // from class: com.baicizhan.main.vld.bonding.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 j02;
                j02 = h.j0(h.this, name, ((Boolean) obj).booleanValue());
                return j02;
            }
        };
        ActivityResultLauncher<Intent> activityResultLauncher = this.f25311d;
        if (activityResultLauncher == null) {
            kotlin.jvm.internal.g0.S("switcher");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(1:(4:9|10|11|12)(2:25|26))(4:27|(1:29)(2:48|(1:50)(2:51|52))|30|(7:32|33|34|35|36|37|(1:39)(1:40))(2:46|47))|13|14|15|16))|53|6|(0)(0)|13|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00dd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(android.bluetooth.BluetoothGatt r21, android.bluetooth.BluetoothGattCharacteristic r22, byte[] r23, j00.c<? super yz.g2> r24) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.vld.bonding.h.k0(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattCharacteristic, byte[], j00.c):java.lang.Object");
    }
}
