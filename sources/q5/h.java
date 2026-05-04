package q5;

import a00.h0;
import a00.i0;
import a00.k1;
import com.baicizhan.app.biz.game.model.IpAvatarState;
import g10.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {f.class})
@u0({"SMAP\nIpResourceRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IpResourceRepo.kt\ncom/baicizhan/app/biz/game/repo/ipavatar/IpResourceRepoImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1617#2,9:131\n1869#2:140\n1870#2:142\n1626#2:143\n1617#2,9:144\n1869#2:153\n1870#2:155\n1626#2:156\n1208#2,2:157\n1236#2,4:159\n1#3:141\n1#3:154\n*S KotlinDebug\n*F\n+ 1 IpResourceRepo.kt\ncom/baicizhan/app/biz/game/repo/ipavatar/IpResourceRepoImpl\n*L\n25#1:131,9\n25#1:140\n25#1:142\n25#1:143\n31#1:144,9\n31#1:153\n31#1:155\n31#1:156\n20#1:157,2\n20#1:159,4\n25#1:141\n31#1:154\n*E\n"})
/* loaded from: classes3.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f81766a = e0.c(new x00.a() { // from class: q5.g
        @Override // x00.a
        public final Object invoke() {
            Map g11;
            g11 = h.g();
            return g11;
        }
    });

    public static final Map g() {
        List list;
        list = i.f81767a;
        List list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(i0.d0(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(((h5.u) obj).i(), obj);
        }
        return linkedHashMap;
    }

    @Override // q5.f
    @l
    public Object a(@k IpAvatarState ipAvatarState, @k j00.c<? super List<h5.u>> cVar) {
        Map map;
        map = i.f81769c;
        List list = (List) map.get(ipAvatarState);
        if (list == null) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h5.u uVar = f().get((String) it.next());
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    @Override // q5.f
    @l
    public Object b(int i11, @k j00.c<? super List<h5.u>> cVar) {
        Map map;
        map = i.f81770d;
        List list = (List) map.get(l00.a.f(i11));
        if (list == null) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h5.u uVar = f().get((String) it.next());
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    @Override // q5.f
    @l
    public Object c(int i11, @k j00.c<? super List<h5.u>> cVar) {
        return a(IpAvatarState.Traveling, cVar);
    }

    @Override // q5.f
    @l
    public Object d(@k j00.c<? super List<h5.u>> cVar) {
        List list;
        list = i.f81767a;
        return list;
    }

    public final Map<String, h5.u> f() {
        return (Map) this.f81766a.getValue();
    }
}
