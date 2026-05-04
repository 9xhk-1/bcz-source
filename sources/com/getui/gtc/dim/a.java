package com.getui.gtc.dim;

import android.text.TextUtils;
import com.getui.gtc.dim.DimRequest;
import com.getui.gtc.dim.b.c;
import com.getui.gtc.dim.b.d;
import com.getui.gtc.dim.b.e;
import com.getui.gtc.dim.b.g;
import com.getui.gtc.dim.b.h;
import com.getui.gtc.dim.e.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final c f29848a;

    /* renamed from: b, reason: collision with root package name */
    private final d f29849b;

    /* renamed from: c, reason: collision with root package name */
    private final g f29850c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f29851d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, List<String>> f29852e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, Boolean> f29853f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, Boolean> f29854g;

    /* renamed from: com.getui.gtc.dim.a$a, reason: collision with other inner class name */
    public static class C0350a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f29855a = new a(0);
    }

    private a() {
        this.f29851d = new ConcurrentHashMap();
        HashMap hashMap = new HashMap();
        this.f29852e = hashMap;
        this.f29853f = new HashMap();
        this.f29854g = new HashMap();
        this.f29848a = c.a();
        this.f29849b = d.a.f29885a;
        this.f29850c = g.d();
        hashMap.put("dim-2-1-21-4", Arrays.asList("dim-2-1-21-5", "dim-2-1-21-3", "dim-2-1-21-1", "dim-2-1-21-2"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0276, code lost:
    
        if (r1.equals("b2FpZF9ob25vcg==") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<java.lang.String> c(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.a.c(java.lang.String):java.util.List");
    }

    public final Object a(DimRequest dimRequest, boolean z11) {
        e a11;
        Object obj;
        if (dimRequest == null || TextUtils.isEmpty(dimRequest.getKey())) {
            return null;
        }
        b.a(dimRequest.toString());
        String key = dimRequest.getKey();
        boolean z12 = false;
        if (z11 && this.f29852e.containsKey(key)) {
            List<String> list = this.f29852e.get(dimRequest.getKey());
            if (list == null || list.size() <= 0) {
                b.b("dim not found subKeys for " + dimRequest.getKey());
            } else {
                for (String str : list) {
                    DimRequest build = new DimRequest.Builder(dimRequest).build();
                    build.setKey(str);
                    Object a12 = a(build, false);
                    if (com.getui.gtc.dim.e.c.a(a12)) {
                        return a12;
                    }
                }
            }
            return null;
        }
        synchronized (this.f29851d) {
            try {
                if (this.f29851d.get(key) == null) {
                    this.f29851d.put(key, new Object());
                }
            } finally {
            }
        }
        synchronized (this.f29851d.get(key)) {
            try {
                if (dimRequest.isSkipCache()) {
                    Boolean bool = this.f29854g.get(key);
                    if (bool == null) {
                        bool = this.f29854g.get("dim-2-2-0-1");
                    }
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    b.a("dim skip cache enable check for " + key + ", dycValue = " + bool + ", localValue = false, use " + booleanValue);
                    if (booleanValue) {
                        a11 = this.f29850c.a(dimRequest);
                        b.a(key + " skip cache call dim from " + a11.f29886a);
                        if (!com.getui.gtc.dim.e.c.a(a11.f29887b)) {
                            h a13 = this.f29848a.a(key);
                            if (a13 == null) {
                                a13 = d.a(key);
                            }
                            if (a13 != null && com.getui.gtc.dim.e.c.a(a13.f29919a) && (a(key) || !this.f29849b.a(a13, key))) {
                                this.f29848a.a(key, a13.f29919a, -1L);
                                d.a(key, a13.f29919a);
                                b.a(key + " update dim ram and storage result = " + a13.f29919a);
                                z12 = true;
                            }
                        }
                        String str2 = a11.f29886a;
                        if (!"none".equals(str2)) {
                            if (!z12) {
                                this.f29848a.a(key, a11.f29887b, -1L);
                                d.a(key, a11.f29887b);
                            }
                            b.a(key + " use dim " + str2 + " result = " + a11.f29887b);
                        }
                        obj = a11.f29887b;
                    }
                }
                h a14 = this.f29848a.a(key);
                if (a14 == null || this.f29849b.a(a14, key)) {
                    h a15 = d.a(key);
                    if (a15 == null || this.f29849b.a(a15, key)) {
                        a11 = this.f29850c.a(dimRequest);
                        b.a(key + " call dim from " + a11.f29886a);
                        if (!com.getui.gtc.dim.e.c.a(a11.f29887b) && a(key)) {
                            if (a14 != null && com.getui.gtc.dim.e.c.a(a14.f29919a)) {
                                this.f29848a.a(key, a14.f29919a, -1L);
                                d.a(key, a14.f29919a);
                                b.a(key + " use dim ram result for reserve = " + a14.f29919a);
                            } else if (a15 != null && com.getui.gtc.dim.e.c.a(a15.f29919a)) {
                                this.f29848a.a(key, a15.f29919a, -1L);
                                d.a(key, a15.f29919a);
                                b.a(key + " use dim storage result for reserve = " + a15.f29919a);
                            }
                        }
                        String str3 = a11.f29886a;
                        if (!"none".equals(str3)) {
                            this.f29848a.a(key, a11.f29887b, -1L);
                            d.a(key, a11.f29887b);
                            b.a(key + " use dim " + str3 + " result = " + a11.f29887b);
                        }
                        obj = a11.f29887b;
                    } else {
                        this.f29848a.a(key, a15.f29919a, a15.f29920b);
                        b.a(key + " use dim storage result = " + a15.f29919a);
                    }
                    obj = a15.f29919a;
                } else {
                    b.a(key + " use dim ram result = " + a14.f29919a);
                }
                obj = a14.f29919a;
            } finally {
            }
        }
        return obj;
    }

    public final Serializable b(String str, String str2) {
        try {
            switch (str.hashCode()) {
                case 378146557:
                    if (!str.equals("dim-2-3-10-1")) {
                        return null;
                    }
                    return this.f29850c.b(str, str2);
                case 378146558:
                    if (!str.equals("dim-2-3-10-2")) {
                        return null;
                    }
                    return this.f29849b.a(str, str2);
                case 378147518:
                    if (str.equals("dim-2-3-11-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 378147519:
                    if (str.equals("dim-2-3-11-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                case 378148479:
                    if (str.equals("dim-2-3-12-1")) {
                        return Boolean.valueOf(this.f29850c.a(str, str2));
                    }
                    return null;
                case 378149440:
                    if (str.equals("dim-2-3-13-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 378149441:
                    if (str.equals("dim-2-3-13-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                case 378150401:
                    if (str.equals("dim-2-3-14-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 378150402:
                    if (str.equals("dim-2-3-14-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                case 378151362:
                    if (str.equals("dim-2-3-15-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 378151363:
                    if (str.equals("dim-2-3-15-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                case 378152323:
                    if (str.equals("dim-2-3-16-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 378152324:
                    if (str.equals("dim-2-3-16-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                case 1674766171:
                    if (str.equals("dim-2-3-1-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 1674766172:
                    if (str.equals("dim-2-3-1-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                case 1674767132:
                    if (str.equals("dim-2-3-2-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 1674767133:
                    if (str.equals("dim-2-3-2-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                case 1674768093:
                    if (str.equals("dim-2-3-3-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 1674768094:
                    if (str.equals("dim-2-3-3-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                case 1674769054:
                    if (str.equals("dim-2-3-4-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 1674769055:
                    if (str.equals("dim-2-3-4-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                case 1674770015:
                    if (str.equals("dim-2-3-5-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 1674770016:
                    if (str.equals("dim-2-3-5-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                case 1674770976:
                    if (str.equals("dim-2-3-6-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 1674770977:
                    if (str.equals("dim-2-3-6-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                case 1674771937:
                    if (str.equals("dim-2-3-7-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 1674771938:
                    if (str.equals("dim-2-3-7-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                case 1674772898:
                    if (str.equals("dim-2-3-8-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 1674772899:
                    if (str.equals("dim-2-3-8-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                case 1674773859:
                    if (str.equals("dim-2-3-9-1")) {
                        return this.f29850c.b(str, str2);
                    }
                    return null;
                case 1674773860:
                    if (str.equals("dim-2-3-9-2")) {
                        return this.f29849b.a(str, str2);
                    }
                    return null;
                default:
                    return null;
            }
        } catch (Throwable th2) {
            b.b(th2);
            return null;
        }
    }

    public /* synthetic */ a(byte b11) {
        this();
    }

    private void a(String str, int i11) {
        this.f29853f.put(str, Boolean.valueOf(i11 != 0));
        b.a("dim use expired enable set: " + str + " : " + i11);
    }

    private void b(String str, int i11) {
        this.f29854g.put(str, Boolean.valueOf(i11 != 0));
        b.a("dim skip cache enable set: " + str + " : " + i11);
    }

    private void c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f29852e.put(str, arrayList);
        for (String str3 : str2.split(",")) {
            arrayList.add(str3.trim().toLowerCase());
        }
        b.a("dim complex policy set: " + str + " : " + str2);
    }

    private static boolean b(String str) {
        str.getClass();
        switch (str) {
            case "dim-2-1-1-1":
            case "dim-2-1-1-3":
            case "dim-2-1-1-4":
            case "dim-2-1-2-1":
            case "dim-2-1-2-3":
            case "dim-2-1-2-4":
            case "dim-2-1-3-1":
            case "dim-2-1-3-2":
            case "dim-2-1-4-1":
            case "dim-2-1-5-1":
            case "dim-2-1-6-1":
            case "dim-2-1-6-3":
            case "dim-2-1-6-4":
            case "dim-2-1-7-1":
            case "dim-2-1-8-1":
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01fc A[Catch: all -> 0x0235, TryCatch #12 {all -> 0x0235, blocks: (B:108:0x01f0, B:110:0x01fc, B:112:0x0202, B:114:0x020b, B:116:0x0213, B:117:0x0221, B:119:0x0227), top: B:107:0x01f0, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020b A[Catch: all -> 0x0235, TryCatch #12 {all -> 0x0235, blocks: (B:108:0x01f0, B:110:0x01fc, B:112:0x0202, B:114:0x020b, B:116:0x0213, B:117:0x0221, B:119:0x0227), top: B:107:0x01f0, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0249 A[Catch: all -> 0x028f, TryCatch #6 {all -> 0x028f, blocks: (B:125:0x023d, B:127:0x0249, B:129:0x024f, B:131:0x0258, B:133:0x0260, B:134:0x026c, B:136:0x026f, B:137:0x0273, B:139:0x0279), top: B:124:0x023d, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0258 A[Catch: all -> 0x028f, TryCatch #6 {all -> 0x028f, blocks: (B:125:0x023d, B:127:0x0249, B:129:0x024f, B:131:0x0258, B:133:0x0260, B:134:0x026c, B:136:0x026f, B:137:0x0273, B:139:0x0279), top: B:124:0x023d, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b2 A[Catch: all -> 0x02e9, TryCatch #4 {all -> 0x02e9, blocks: (B:148:0x02a6, B:150:0x02b2, B:152:0x02bb, B:154:0x02c3, B:155:0x02d7, B:157:0x02dd, B:160:0x02eb), top: B:147:0x02a6, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0306 A[Catch: all -> 0x0316, TryCatch #14 {all -> 0x0316, blocks: (B:164:0x02fa, B:166:0x0306, B:168:0x030c), top: B:163:0x02fa, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0326 A[Catch: all -> 0x0334, TryCatch #11 {all -> 0x0334, blocks: (B:171:0x031a, B:173:0x0326, B:175:0x032c), top: B:170:0x031a, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0344 A[Catch: all -> 0x0370, TryCatch #9 {all -> 0x0370, blocks: (B:178:0x0338, B:180:0x0344, B:182:0x034a, B:183:0x0352, B:185:0x0358, B:195:0x0368, B:188:0x0372, B:189:0x037c, B:191:0x0382), top: B:177:0x0338, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0358 A[Catch: all -> 0x0370, TryCatch #9 {all -> 0x0370, blocks: (B:178:0x0338, B:180:0x0344, B:182:0x034a, B:183:0x0352, B:185:0x0358, B:195:0x0368, B:188:0x0372, B:189:0x037c, B:191:0x0382), top: B:177:0x0338, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x039f A[Catch: all -> 0x03d6, TryCatch #13 {all -> 0x03d6, blocks: (B:199:0x0393, B:201:0x039f, B:203:0x03a8, B:205:0x03b0, B:206:0x03c4, B:208:0x03ca, B:211:0x03d8), top: B:198:0x0393, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03f3 A[Catch: all -> 0x0428, TryCatch #2 {all -> 0x0428, blocks: (B:215:0x03e7, B:217:0x03f3, B:219:0x03fc, B:221:0x0404, B:222:0x0418, B:224:0x041e, B:227:0x042a), top: B:214:0x03e7, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0443 A[Catch: all -> 0x0478, TryCatch #16 {all -> 0x0478, blocks: (B:231:0x0437, B:233:0x0443, B:235:0x044c, B:237:0x0454, B:238:0x0468, B:240:0x046e, B:243:0x047a), top: B:230:0x0437, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0493 A[Catch: all -> 0x04cc, TryCatch #5 {all -> 0x04cc, blocks: (B:247:0x0487, B:249:0x0493, B:251:0x0499, B:253:0x04a2, B:255:0x04aa, B:256:0x04b8, B:258:0x04be), top: B:246:0x0487, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04a2 A[Catch: all -> 0x04cc, TryCatch #5 {all -> 0x04cc, blocks: (B:247:0x0487, B:249:0x0493, B:251:0x0499, B:253:0x04a2, B:255:0x04aa, B:256:0x04b8, B:258:0x04be), top: B:246:0x0487, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04e0 A[Catch: all -> 0x04f0, TryCatch #8 {all -> 0x04f0, blocks: (B:264:0x04d4, B:266:0x04e0, B:268:0x04e6), top: B:263:0x04d4, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0500 A[Catch: all -> 0x0533, TryCatch #10 {all -> 0x0533, blocks: (B:271:0x04f4, B:273:0x0500, B:275:0x0509, B:277:0x0511, B:278:0x051f, B:280:0x0525, B:283:0x0535), top: B:270:0x04f4, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x054c A[Catch: all -> 0x055c, TryCatch #20 {all -> 0x055c, blocks: (B:287:0x0540, B:289:0x054c, B:291:0x0552), top: B:286:0x0540, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x056c A[Catch: all -> 0x05bc, TryCatch #19 {all -> 0x05bc, blocks: (B:294:0x0560, B:296:0x056c, B:298:0x0575, B:300:0x0583), top: B:293:0x0560, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05d0 A[Catch: all -> 0x0636, TryCatch #15 {all -> 0x0636, blocks: (B:26:0x005a, B:306:0x05c4, B:308:0x05d0, B:310:0x05d6, B:312:0x05df, B:314:0x05fb, B:315:0x0605, B:317:0x060b, B:319:0x0618, B:321:0x061b, B:322:0x061f, B:324:0x0625), top: B:25:0x005a, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013a A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:68:0x011b, B:70:0x0127, B:72:0x012d, B:74:0x013a, B:76:0x0147), top: B:67:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019d A[Catch: all -> 0x01c8, TryCatch #3 {all -> 0x01c8, blocks: (B:86:0x0191, B:88:0x019d, B:90:0x01a3, B:92:0x01ac, B:94:0x01b4, B:96:0x01c0, B:99:0x01ca, B:100:0x01d4, B:102:0x01da), top: B:85:0x0191, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ac A[Catch: all -> 0x01c8, TryCatch #3 {all -> 0x01c8, blocks: (B:86:0x0191, B:88:0x019d, B:90:0x01a3, B:92:0x01ac, B:94:0x01b4, B:96:0x01c0, B:99:0x01ca, B:100:0x01d4, B:102:0x01da), top: B:85:0x0191, outer: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.a.a(java.lang.String, java.lang.String):void");
    }

    private boolean a(String str) {
        Boolean bool = this.f29853f.get(str);
        if (bool == null) {
            bool = this.f29853f.get("dim-2-2-0-1");
        }
        boolean b11 = b(str);
        boolean booleanValue = bool != null ? bool.booleanValue() : b11;
        b.a("dim use expired enable check for " + str + ", dycValue = " + bool + ", localValue = " + b11 + ", use " + booleanValue);
        return booleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0142, code lost:
    
        if (r9.equals("dim-2-3-10-2") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c2, code lost:
    
        if (r9.equals("dim-2-3-10-1") != false) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0171 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:3:0x0005, B:4:0x0009, B:8:0x000e, B:11:0x0144, B:13:0x0171, B:15:0x0177, B:17:0x017d, B:20:0x001b, B:23:0x01c4, B:25:0x0025, B:28:0x002f, B:31:0x0039, B:34:0x0043, B:37:0x004d, B:40:0x0057, B:43:0x0061, B:46:0x006b, B:49:0x0075, B:52:0x007f, B:55:0x0089, B:58:0x0093, B:61:0x009d, B:64:0x00a7, B:67:0x00b1, B:70:0x00bb, B:73:0x00c5, B:76:0x00cf, B:79:0x00d9, B:82:0x00e2, B:85:0x00ec, B:88:0x00f5, B:91:0x00ff, B:94:0x0108, B:97:0x0112, B:99:0x011a, B:101:0x0129, B:104:0x0132, B:107:0x013c, B:109:0x01bc), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.a.a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
