package ca;

import a00.h0;
import a00.r0;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.managers.winningstreak.data.CurrentCount;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.online.user_study_api.WinStreakStatus;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import okhttp3.i;
import org.apache.thrift.TBase;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TIOStreamTransport;
import q30.k0;
import q9.y;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLocalWiningStreak.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalWiningStreak.kt\ncom/baicizhan/client/business/managers/winningstreak/data/LocalWiningStreak\n+ 2 thrift_utils.kt\ncom/baicizhan/client/business/util/Thrift_utilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n14#2,10:89\n28#2:99\n43#2,4:100\n29#2,11:104\n1#3:115\n1761#4,3:116\n*S KotlinDebug\n*F\n+ 1 LocalWiningStreak.kt\ncom/baicizhan/client/business/managers/winningstreak/data/LocalWiningStreak\n*L\n18#1:89,10\n22#1:99\n22#1:100,4\n22#1:104,11\n42#1:116,3\n*E\n"})
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final int f8443b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final nc.a f8444a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends bp.a<List<? extends e>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ca.b$b, reason: collision with other inner class name */
    public static final class C0142b extends bp.a<List<? extends e>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends bp.a<List<? extends e>> {
    }

    @Inject
    public b(@y @k nc.a store) {
        g0.p(store, "store");
        this.f8444a = store;
    }

    public static final boolean i(List list, e it) {
        g0.p(it, "it");
        return !list.contains(it);
    }

    public final void b(@k e date) {
        g0.p(date, "date");
        synchronized (this) {
            try {
                String string = this.f8444a.getString(ca.c.f8446b, i.f77289p);
                qb.c.i(ca.c.f8448d, string + " , add " + date, new Object[0]);
                List list = (List) BczJson.fromJson(string, new a().getType());
                if (list == null) {
                    list = h0.J();
                }
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((e) it.next()).e() == date.e()) {
                            break;
                        }
                    }
                }
                nc.a aVar = this.f8444a;
                String json = BczJson.toJson(r0.I4(list, a00.g0.l(date)));
                qb.c.i(ca.c.f8448d, "save " + json, new Object[0]);
                g2 g2Var = g2.f100423a;
                aVar.p(ca.c.f8446b, json);
                g2 g2Var2 = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        this.f8444a.r(ca.c.f8446b);
        this.f8444a.r(ca.c.f8445a);
        this.f8444a.r(ca.c.f8447c);
    }

    @k
    public final CurrentCount d() {
        Parcelable g11 = this.f8444a.g(ca.c.f8445a, CurrentCount.class, new CurrentCount(0, 0));
        g0.o(g11, "getParcelable(...)");
        return (CurrentCount) g11;
    }

    @k
    public final List<e> e() {
        String string = this.f8444a.getString(ca.c.f8446b, i.f77289p);
        g0.m(string);
        List<e> list = (List) BczJson.fromJson(string, new C0142b().getType());
        return list == null ? h0.J() : list;
    }

    @k
    public final nc.a f() {
        return this.f8444a;
    }

    @l
    public final WinStreakStatus g() {
        byte[] d11 = this.f8444a.d(ca.c.f8447c);
        Constructor declaredConstructor = WinStreakStatus.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        TBase tBase = (TBase) declaredConstructor.newInstance(null);
        Result.a aVar = Result.Companion;
        Object m6308constructorimpl = Result.m6308constructorimpl(tBase);
        try {
            tBase.read(new TBinaryProtocol(new TIOStreamTransport(new ByteArrayInputStream(d11))));
        } catch (Exception e11) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(e11));
            qb.c.c(KotlinExtKt.TAG, "", e11);
        }
        return (WinStreakStatus) (Result.m6314isFailureimpl(m6308constructorimpl) ? null : m6308constructorimpl);
    }

    public final void h(@k final List<e> dates) {
        g0.p(dates, "dates");
        synchronized (this) {
            try {
                String string = this.f8444a.getString(ca.c.f8446b, i.f77289p);
                qb.c.i(ca.c.f8448d, "LOCAL " + string, new Object[0]);
                qb.c.i(ca.c.f8448d, "TO BE REMOVED " + BczJson.toJson(dates), new Object[0]);
                List list = (List) BczJson.fromJson(string, new c().getType());
                if (list == null) {
                    list = h0.J();
                }
                List I3 = k0.I3(k0.P0(r0.E1(list), new x00.l() { // from class: ca.a
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        boolean i11;
                        i11 = b.i(dates, (e) obj);
                        return Boolean.valueOf(i11);
                    }
                }));
                nc.a aVar = this.f8444a;
                String json = BczJson.toJson(I3);
                qb.c.i(ca.c.f8448d, "remove result " + json, new Object[0]);
                g2 g2Var = g2.f100423a;
                aVar.p(ca.c.f8446b, json);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(@k CurrentCount currentCount) {
        g0.p(currentCount, "currentCount");
        this.f8444a.o(ca.c.f8445a, currentCount);
    }

    public final void k(@k WinStreakStatus win) {
        byte[] bArr;
        g0.p(win, "win");
        nc.a aVar = this.f8444a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            win.write(new TBinaryProtocol(new TIOStreamTransport(byteArrayOutputStream)));
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception e11) {
            qb.c.c(KotlinExtKt.TAG, "", e11);
            bArr = null;
        }
        aVar.k(ca.c.f8447c, bArr);
    }
}
