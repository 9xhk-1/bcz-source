package bd;

import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends com.baicizhan.learning_strategy.util.d implements ad.a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: bd.a$a, reason: collision with other inner class name */
    public class C0117a implements Comparator<yc.b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f6757a;

        public C0117a(Map map) {
            this.f6757a = map;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(yc.b bVar, yc.b bVar2) {
            int k02 = bVar.k0() - bVar2.k0();
            return k02 != 0 ? k02 : ((Integer) this.f6757a.get(Integer.valueOf(bVar.e0()))).intValue() - ((Integer) this.f6757a.get(Integer.valueOf(bVar2.e0()))).intValue();
        }
    }

    public a(NativeObject nativeObject) {
        super(nativeObject);
    }

    public static NativeObject W(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        NativeObject nativeObject = new NativeObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            nativeObject.put(entry.getKey(), nativeObject, Z(entry.getValue()));
        }
        return nativeObject;
    }

    public static Object Z(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Scriptable a11 = com.baicizhan.learning_strategy.util.b.a(list.size());
            Iterator it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                a11.put(i11, a11, Z(it.next()));
                i11++;
            }
            return a11;
        }
        if (obj instanceof Map) {
            Scriptable nativeObject = new NativeObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object Z = Z(entry.getKey());
                Object Z2 = Z(entry.getValue());
                if (Z instanceof Integer) {
                    nativeObject.put(((Integer) Z).intValue(), nativeObject, Z2.toString());
                } else {
                    nativeObject.put(Z.toString(), nativeObject, Z2.toString());
                }
            }
            return nativeObject;
        }
        if (!(obj instanceof Set)) {
            return obj;
        }
        Scriptable nativeObject2 = new NativeObject();
        Iterator it2 = ((Set) obj).iterator();
        while (it2.hasNext()) {
            Object Z3 = Z(it2.next());
            if (Z3 instanceof Integer) {
                nativeObject2.put(((Integer) Z3).intValue(), nativeObject2, Z3.toString());
            } else {
                nativeObject2.put(Z3.toString(), nativeObject2, Z3.toString());
            }
        }
        return nativeObject2;
    }

    @Override // ad.a
    public void A(List<yc.b> list, Map<Integer, yc.b> map) {
        Y(list, map);
    }

    @Override // ad.a
    public void B(int i11, Map<String, Object> map) {
        T("setSequenceModeReviewOfSpell", Integer.valueOf(i11), W(map));
    }

    @Override // ad.a
    public void D(Map<String, Object> map) {
        T("setTypeModeLearning", W(map));
    }

    @Override // ad.a
    public boolean E() {
        return L("isInited", false, new Object[0]);
    }

    public void X(List<yc.b> list, Map<Integer, yc.b> map) {
        Scriptable a11 = com.baicizhan.learning_strategy.util.b.a(list.size());
        Iterator<yc.b> it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            a11.put(i11, a11, it.next().U());
            i11++;
        }
        long a12 = com.baicizhan.learning_strategy.util.a.a();
        Scriptable nativeObject = new NativeObject();
        Scriptable nativeObject2 = new NativeObject();
        if (map != null) {
            for (Map.Entry<Integer, yc.b> entry : map.entrySet()) {
                nativeObject.put(entry.getKey().intValue(), nativeObject, entry.getValue().U());
                yc.b value = entry.getValue();
                if (value.f0() >= a12 || value.r0()) {
                    nativeObject2.put(entry.getKey().intValue(), nativeObject2, entry.getValue().U());
                }
            }
        }
        T("init", a11, nativeObject, nativeObject2);
    }

    public void Y(List<yc.b> list, Map<Integer, yc.b> map) {
        Scriptable a11 = com.baicizhan.learning_strategy.util.b.a(list.size());
        HashMap hashMap = new HashMap();
        int i11 = 0;
        for (yc.b bVar : list) {
            hashMap.put(Integer.valueOf(bVar.e0()), Integer.valueOf(i11));
            a11.put(i11, a11, bVar.U());
            i11++;
        }
        long a12 = com.baicizhan.learning_strategy.util.a.a();
        Scriptable nativeObject = new NativeObject();
        Scriptable nativeObject2 = new NativeObject();
        if (map != null) {
            for (Map.Entry<Integer, yc.b> entry : map.entrySet()) {
                nativeObject.put(entry.getKey().intValue(), nativeObject, entry.getValue().U());
                yc.b value = entry.getValue();
                if (value.f0() >= a12 || value.r0()) {
                    nativeObject2.put(entry.getKey().intValue(), nativeObject2, entry.getValue().U());
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Integer.valueOf(TopicLearnRecord.SCORE_UNTOUCH), new ArrayList());
        for (int i12 = 0; i12 <= 9; i12++) {
            hashMap2.put(Integer.valueOf(i12), new ArrayList());
        }
        for (yc.b bVar2 : list) {
            yc.b bVar3 = map.get(Integer.valueOf(bVar2.e0()));
            if (bVar3 == null) {
                bVar2.D0(TopicLearnRecord.SCORE_UNTOUCH);
                bVar2.z0(TopicLearnRecord.SCORE_UNTOUCH);
            } else if (!bVar3.q0()) {
                bVar2 = bVar3;
            }
            int k02 = bVar2.k0();
            if (k02 != -1024 && k02 < 0) {
                k02 = 0;
            } else if (k02 > 9) {
                k02 = 9;
            }
            List list2 = (List) hashMap2.get(Integer.valueOf(k02));
            if (list2 == null) {
                list2 = new ArrayList();
                hashMap2.put(Integer.valueOf(k02), list2);
            }
            list2.add(bVar2);
        }
        Collections.sort((List) hashMap2.get(9), new C0117a(hashMap));
        Scriptable nativeObject3 = new NativeObject();
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            int intValue = ((Integer) entry2.getKey()).intValue();
            List list3 = (List) entry2.getValue();
            Scriptable a13 = com.baicizhan.learning_strategy.util.b.a(list3.size());
            Iterator it = list3.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                a13.put(i13, a13, ((yc.b) it.next()).U());
                i13++;
            }
            nativeObject3.put(intValue, nativeObject3, a13);
        }
        T("initWithBuckets", a11, nativeObject, nativeObject3, nativeObject2);
    }

    @Override // ad.a
    public void h(int i11, Map<String, Object> map) {
        T("setSequenceModeReviewMore", Integer.valueOf(i11), W(map));
    }

    @Override // ad.a
    public ad.d n() {
        NativeObject Q = Q("getTypeStrategy", null, new Object[0]);
        if (Q == null) {
            return null;
        }
        return new d(Q);
    }

    @Override // ad.a
    public void q(int i11, List<Integer> list, Map<String, Object> map) {
        T("setSequenceModeReviewList", Integer.valueOf(i11), Z(list), W(map));
    }

    @Override // ad.a
    public ad.c u() {
        NativeObject Q = Q("getSequenceStrategy", null, new Object[0]);
        if (Q == null) {
            return null;
        }
        return new c(Q);
    }

    @Override // ad.a
    public void v(int i11, Map<String, Object> map) {
        T("setSequenceModeMultiMedia", Integer.valueOf(i11), W(map));
    }

    @Override // ad.a
    public void w(int i11, Map<String, Object> map) {
        T("setSequenceModeNewAndReview", Integer.valueOf(i11), W(map));
    }

    @Override // ad.a
    public void x(Map<String, Object> map) {
        T("setTypeModeMultiMedia", W(map));
    }
}
