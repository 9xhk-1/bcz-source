package u5;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import k3.d1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import oa0.r;
import u5.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {b.class})
@u0({"SMAP\nPluginRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginRepo.kt\ncom/baicizhan/app/biz/game/repo/plugin/PluginRepoImpl\n*L\n1#1,157:1\n75#1:158\n75#1:159\n75#1:160\n*S KotlinDebug\n*F\n+ 1 PluginRepo.kt\ncom/baicizhan/app/biz/game/repo/plugin/PluginRepoImpl\n*L\n63#1:158\n67#1:159\n71#1:160\n*E\n"})
/* loaded from: classes3.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c7.e f91824a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<h10.d<?>, a> f91825b;

    public d(@k c7.e deviceRepo) {
        g0.p(deviceRepo, "deviceRepo");
        this.f91824a = deviceRepo;
        this.f91825b = new LinkedHashMap();
    }

    @Override // u5.b
    public void A(@k d1 plugin) {
        g0.p(plugin, "plugin");
        z6.b.j(z6.b.f101032b, e.f91826a, "unregister plugin: " + plugin, null, 4, null);
        if ((plugin instanceof d1.d) || (plugin instanceof d1.e)) {
            this.f91825b.remove(o0.d(a.c.class));
            return;
        }
        if ((plugin instanceof d1.a) || (plugin instanceof d1.b)) {
            this.f91825b.remove(o0.d(a.InterfaceC1223a.class));
        } else {
            if (!(plugin instanceof d1.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f91825b.remove(o0.d(a.b.class));
        }
    }

    @Override // u5.b
    @k
    public a.InterfaceC1223a a() {
        a aVar = this.f91825b.get(o0.d(a.InterfaceC1223a.class));
        if (!(aVar instanceof a.InterfaceC1223a)) {
            aVar = null;
        }
        a.InterfaceC1223a interfaceC1223a = (a.InterfaceC1223a) aVar;
        if (interfaceC1223a != null) {
            return interfaceC1223a;
        }
        throw new IllegalArgumentException("Plugin not registered");
    }

    @Override // u5.b
    @k
    public a.c b() {
        a aVar = this.f91825b.get(o0.d(a.c.class));
        if (!(aVar instanceof a.c)) {
            aVar = null;
        }
        a.c cVar = (a.c) aVar;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Plugin not registered");
    }

    @Override // u5.b
    @k
    public a.b c() {
        a aVar = this.f91825b.get(o0.d(a.b.class));
        if (!(aVar instanceof a.b)) {
            aVar = null;
        }
        a.b bVar = (a.b) aVar;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Plugin not registered");
    }

    public final /* synthetic */ <T extends a> T d() {
        Map<h10.d<?>, a> map = this.f91825b;
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        a aVar = map.get(o0.d(a.class));
        g0.y(2, ExifInterface.GPS_DIRECTION_TRUE);
        T t11 = (T) aVar;
        if (t11 != null) {
            return t11;
        }
        throw new IllegalArgumentException("Plugin not registered");
    }

    @Override // u5.b
    public void x(@k d1 plugin) {
        g0.p(plugin, "plugin");
        z6.b.j(z6.b.f101032b, e.f91826a, "register plugin: " + plugin, null, 4, null);
        if ((plugin instanceof d1.d) || (plugin instanceof d1.e)) {
            this.f91825b.put(o0.d(a.c.class), new g(plugin, this.f91824a));
            return;
        }
        if ((plugin instanceof d1.a) || (plugin instanceof d1.b)) {
            this.f91825b.put(o0.d(a.InterfaceC1223a.class), new c(plugin, this.f91824a));
        } else {
            if (!(plugin instanceof d1.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f91825b.put(o0.d(a.b.class), new f(plugin, this.f91824a));
        }
    }
}
