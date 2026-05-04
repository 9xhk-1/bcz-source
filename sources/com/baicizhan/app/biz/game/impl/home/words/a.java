package com.baicizhan.app.biz.game.impl.home.words;

import a00.i0;
import a00.r0;
import com.baicizhan.app.biz.base.BizInternalException;
import h8.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l3.e;
import l3.f;
import l3.g;
import l3.h;
import l3.i;
import l3.j;
import l3.s;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBuddyConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuddyConvert.kt\ncom/baicizhan/app/biz/game/impl/home/words/BuddyConvertKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,162:1\n1563#2:163\n1634#2,3:164\n1563#2:167\n1634#2,3:168\n1563#2:171\n1634#2,3:172\n1563#2:175\n1634#2,3:176\n1563#2:179\n1634#2,3:180\n*S KotlinDebug\n*F\n+ 1 BuddyConvert.kt\ncom/baicizhan/app/biz/game/impl/home/words/BuddyConvertKt\n*L\n93#1:163\n93#1:164,3\n94#1:167\n94#1:168,3\n95#1:171\n95#1:172,3\n158#1:175\n158#1:176,3\n159#1:179\n159#1:180,3\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    @k
    public static final l3.d a(@k h8.a aVar) {
        g0.p(aVar, "<this>");
        return new l3.d(aVar.f58851a, aVar.f58852b, aVar.f58853c, aVar.f58854d, aVar.f58855e, aVar.f58856f, aVar.f58857g);
    }

    @k
    public static final e b(@k h8.e eVar) {
        g0.p(eVar, "<this>");
        return new e(eVar.f58887a, eVar.f58888b, eVar.f58889c, eVar.f58890d, eVar.f58891e, eVar.f58892f, eVar.f58893g);
    }

    @k
    public static final f c(@k h8.f fVar) {
        g0.p(fVar, "<this>");
        return new f(fVar.f58903a, fVar.f58904b, fVar.f58905c, fVar.f58906d);
    }

    @k
    public static final g d(@k l lVar) {
        g0.p(lVar, "<this>");
        return new g(lVar.f58975a, lVar.f58976b, lVar.f58977c, lVar.f58978d, lVar.f58979e, lVar.f58980f);
    }

    @k
    public static final h e(@k h8.g gVar) {
        g0.p(gVar, "<this>");
        return new h(gVar.f58913a, gVar.f58914b, gVar.f58915c, gVar.f58916d, gVar.f58917e, gVar.f58918f);
    }

    @k
    public static final i f(@k h8.d dVar) {
        ArrayList arrayList;
        g0.p(dVar, "<this>");
        l lVar = dVar.f58871a;
        ArrayList arrayList2 = null;
        g d11 = lVar != null ? d(lVar) : null;
        h8.k kVar = dVar.f58872b;
        l3.k h11 = kVar != null ? h(kVar) : null;
        Boolean bool = dVar.f58873c;
        boolean z11 = dVar.f58874d;
        List<h8.i> list = dVar.f58875e;
        if (list != null) {
            List<h8.i> list2 = list;
            arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(i((h8.i) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<h8.a> list3 = dVar.f58876f;
        if (list3 != null) {
            List<h8.a> list4 = list3;
            arrayList2 = new ArrayList(i0.d0(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a((h8.a) it2.next()));
            }
        }
        return new i(d11, h11, bool, z11, arrayList, arrayList2);
    }

    @k
    public static final j g(@k h8.h hVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        g0.p(hVar, "<this>");
        int i11 = hVar.f58927a;
        int i12 = hVar.f58928b;
        int i13 = hVar.f58929c;
        int i14 = hVar.f58930d;
        int i15 = hVar.f58931e;
        List<h8.i> list = hVar.f58932f;
        ArrayList arrayList3 = null;
        if (list != null) {
            List<h8.i> list2 = list;
            arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(i((h8.i) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<h8.e> list3 = hVar.f58933g;
        if (list3 != null) {
            List<h8.e> list4 = list3;
            arrayList2 = new ArrayList(i0.d0(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(b((h8.e) it2.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<h8.a> list5 = hVar.f58934h;
        if (list5 != null) {
            List<h8.a> list6 = list5;
            arrayList3 = new ArrayList(i0.d0(list6, 10));
            Iterator<T> it3 = list6.iterator();
            while (it3.hasNext()) {
                arrayList3.add(a((h8.a) it3.next()));
            }
        }
        return new j(i11, i12, i13, i14, i15, arrayList, arrayList2, arrayList3);
    }

    @k
    public static final l3.k h(@k h8.k kVar) {
        g0.p(kVar, "<this>");
        return new l3.k(kVar.f58967a, kVar.f58968b, kVar.f58969c);
    }

    @k
    public static final l3.l i(@k h8.i iVar) {
        g0.p(iVar, "<this>");
        return new l3.l(iVar.f58945a, iVar.f58946b, iVar.f58947c, iVar.f58948d, iVar.f58949e);
    }

    @k
    public static final s j(@k h8.j jVar, int i11, @m80.l String str) {
        List<h8.a> list;
        h8.a aVar;
        List<h8.e> list2;
        h8.e eVar;
        List<h8.i> list3;
        h8.i iVar;
        h8.g gVar;
        g0.p(jVar, "<this>");
        List<h8.g> list4 = jVar.f58957a;
        if (list4 != null && (gVar = (h8.g) r0.L2(list4)) != null) {
            return new s.c(e(gVar), i11);
        }
        h8.h hVar = jVar.f58960d;
        if (hVar != null && (list3 = hVar.f58932f) != null && (iVar = (h8.i) r0.L2(list3)) != null) {
            return new s.d(i(iVar));
        }
        h8.h hVar2 = jVar.f58960d;
        if (hVar2 != null && (list2 = hVar2.f58933g) != null && (eVar = (h8.e) r0.L2(list2)) != null) {
            return new s.b(b(eVar));
        }
        h8.h hVar3 = jVar.f58960d;
        if (hVar3 == null || (list = hVar3.f58934h) == null || (aVar = (h8.a) r0.L2(list)) == null) {
            throw new BizInternalException("Travel reward is empty, server data error", null, 0, 6, null);
        }
        if (str != null) {
            return new s.a(a(aVar), str);
        }
        throw new IllegalArgumentException("actionResourceId must not be null when action reward exists");
    }
}
