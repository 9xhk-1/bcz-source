package sh;

import android.content.Context;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.UpdateZpkMd5;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.TopicKey;
import com.baicizhan.online.resource_api.ZpkMd5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public static final String f88690a = "TopicUpdateFlagMD5Loader";

    /* renamed from: b, reason: collision with root package name */
    public static final int f88691b = 3000;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r5 != r9) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r11) {
        /*
            q9.x r0 = q9.x.r()
            com.baicizhan.client.business.dataset.models.BookRecord r0 = r0.k()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "check book res version: "
            r1.append(r2)
            long r2 = r0.localBookResVer
            r1.append(r2)
            java.lang.String r2 = " - "
            r1.append(r2)
            long r2 = r0.remoteBookResVer
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "TopicUpdateFlagMD5Loader"
            qb.c.i(r4, r1, r3)
            q9.x r1 = q9.x.r()
            boolean r1 = r1.K()
            if (r1 == 0) goto L38
            goto L71
        L38:
            long r5 = r0.localBookResVer
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L4a
            long r9 = r0.remoteBookResVer
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 <= 0) goto L51
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 == 0) goto L51
        L4a:
            boolean r1 = b(r11)
            if (r1 == 0) goto L51
            goto L71
        L51:
            java.lang.String r1 = "<client> getTopicUpdateFlagsByBookId"
            java.lang.Object[] r3 = new java.lang.Object[r2]
            qb.c.b(r4, r1, r3)
            int r1 = r0.bookId
            java.util.Map r1 = i9.a.l(r11, r1)
            boolean r3 = xb.e.i(r1)
            if (r3 == 0) goto L72
            boolean r11 = b(r11)
            if (r11 != 0) goto L71
            java.lang.String r11 = "can not get updateInfos"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            qb.c.q(r4, r11, r0)
        L71:
            return
        L72:
            q9.x r2 = q9.x.r()
            r2.k0(r1)
            q9.x r1 = q9.x.r()
            int r0 = r0.bookId
            java.util.Set r11 = i9.a.i(r11, r0)
            r1.t0(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.u.a(android.content.Context):void");
    }

    public static boolean b(Context context) {
        try {
            ResourceService.Client client = (ResourceService.Client) com.baicizhan.client.business.thrift.c.b().c("/rpc/resource_api");
            BookRecord k11 = x.r().k();
            List<TopicKey> buildTopicKeyList = TopicIdMapingUtils.buildTopicKeyList(x.r().z(), x.r().l());
            qb.c.b(f88690a, "<server> get_zpk_md5s: " + buildTopicKeyList.size(), new Object[0]);
            ArrayList<ZpkMd5> arrayList = new ArrayList();
            int i11 = 0;
            int i12 = 0;
            while (i11 < buildTopicKeyList.size() && i12 < 150) {
                int i13 = 3000;
                if (buildTopicKeyList.size() - i11 < 3000) {
                    i13 = buildTopicKeyList.size() - i11;
                }
                qb.c.b(f88690a, "query [%d, %d]", Integer.valueOf(i11), Integer.valueOf(i13));
                int i14 = i13 + i11;
                arrayList.addAll(client.get_zpk_md5s(buildTopicKeyList.subList(i11, i14)));
                i12++;
                i11 = i14;
            }
            qb.c.b(f88690a, "thrift get_zpk_md5s " + arrayList.size(), new Object[0]);
            if (!xb.e.h(arrayList)) {
                k11.localBookResVer = k11.remoteBookResVer;
                i9.a.s(context, k11, "localBookResVer");
                HashMap hashMap = new HashMap(arrayList.size());
                HashSet hashSet = new HashSet();
                for (ZpkMd5 zpkMd5 : arrayList) {
                    hashMap.put(Integer.valueOf(zpkMd5.getTopic_key().getTopic_id()), new UpdateZpkMd5(zpkMd5.getZpk_md5(), zpkMd5.getZpk_version(), zpkMd5.getForce_update_zpk_version()));
                    if (zpkMd5.getForce_update() == 1) {
                        hashSet.add(Integer.valueOf(zpkMd5.getTopic_key().getTopic_id()));
                    }
                }
                i9.a.r(context, k11.bookId, hashMap);
                i9.a.o(context, k11.bookId, hashSet);
                x.r().k0(hashMap);
                x.r().t0(hashSet);
                return true;
            }
        } catch (Exception e11) {
            qb.c.c(f88690a, "", e11);
        }
        return false;
    }
}
