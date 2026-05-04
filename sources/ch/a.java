package ch;

import com.baicizhan.client.business.dataset.models.UserRecord;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAdConst.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdConst.kt\ncom/baicizhan/main/module/AdConstKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,36:1\n13805#2,2:37\n*S KotlinDebug\n*F\n+ 1 AdConst.kt\ncom/baicizhan/main/module/AdConstKt\n*L\n26#1:37,2\n*E\n"})
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f8617a = "adModule";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f8618b = "bcz_kv_ad";

    /* renamed from: c, reason: collision with root package name */
    public static final int f8619c = 500000;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8620d = 432000000;

    @m80.k
    public static final String a(@m80.k String key, @m80.k String id2) {
        g0.p(key, "key");
        g0.p(id2, "id");
        UserRecord p11 = q9.x.r().p();
        return key + "_" + (p11 != null ? Integer.valueOf(p11.getUniqueId()) : null) + "_" + id2;
    }

    public static final void b(@m80.k nc.a aVar, @m80.k String key) {
        g0.p(aVar, "<this>");
        g0.p(key, "key");
        if (aVar.s() < 500000) {
            return;
        }
        qb.c.i(f8617a, "cleanAd " + key + " size = " + aVar.s(), new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        String[] a11 = aVar.a();
        g0.o(a11, "allKeys(...)");
        int length = a11.length;
        for (int i11 = 0; i11 < length; i11++) {
            String str = a11[i11];
            g0.m(str);
            if (f0.J2(str, key, false, 2, null) && currentTimeMillis - aVar.getLong(str, 0L) > yr.f.f100282b) {
                aVar.r(str);
            }
        }
        qb.c.i(f8617a, "cleanAd finish " + key + " size = " + aVar.s(), new Object[0]);
    }
}
