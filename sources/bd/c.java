package bd;

import com.baicizhan.learning_strategy.util.e;
import com.baicizhan.main.receiver.LearnOperationReceiver;
import com.google.android.material.timepicker.RadialViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends com.baicizhan.learning_strategy.util.d implements ad.c {
    public c(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // ad.c
    public int a() {
        return N("getReviewCount", 0, new Object[0]);
    }

    @Override // ad.c
    public void b(yc.b bVar) {
        R("cancelKill", null, bVar.U());
    }

    @Override // ad.c
    public yc.a c() {
        NativeObject Q = Q("getTodayRoadMap", null, new Object[0]);
        if (Q == null) {
            return null;
        }
        try {
            int doubleValue = (int) ((Double) Q.get("markedPosition", Q)).doubleValue();
            NativeArray nativeArray = (NativeArray) Q.get("list", Q);
            if (nativeArray == null) {
                return null;
            }
            int size = nativeArray.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(new yc.b((NativeObject) nativeArray.get(i11)));
            }
            yc.a aVar = new yc.a();
            aVar.d(doubleValue);
            aVar.c(arrayList);
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // ad.c
    public int d() {
        return N("getNewLearningCount", 0, new Object[0]);
    }

    @Override // ad.c
    public void e(yc.b bVar) {
        R(RadialViewGroup.f32580d, null, bVar.U());
    }

    @Override // ad.c
    public int f() {
        return N("getGeneralReviewCurrentCount", 0, new Object[0]);
    }

    @Override // ad.c
    public void g(yc.b bVar) {
        R("cancelSkip", null, bVar.U());
    }

    @Override // ad.c
    public boolean hasNext() {
        return L("hasNext", false, new Object[0]);
    }

    @Override // ad.c
    public List<Integer> i() {
        NativeArray P = P("getReviewedProblems", null, new Object[0]);
        if (P == null) {
            return null;
        }
        int size = P.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(Integer.valueOf((int) ((Double) P.get(i11)).doubleValue()));
        }
        return arrayList;
    }

    @Override // ad.c
    public int k() {
        return N("getGeneralReviewRound", 0, new Object[0]);
    }

    @Override // ad.c
    public void l(yc.b bVar) {
        R("userActionHint", null, bVar.U());
    }

    @Override // ad.c
    public yc.b m() {
        NativeObject Q = Q("getNextOne", null, new Object[0]);
        if (Q == null) {
            return null;
        }
        return new yc.b(Q);
    }

    @Override // ad.c
    public int o() {
        return N("getGeneralReviewTotalCount", 0, new Object[0]);
    }

    @Override // ad.c
    public yc.b p(yc.b bVar, long j11, Map<String, Object> map) {
        try {
            Context.enter();
            yc.b bVar2 = null;
            Scriptable nativeObject = map == null ? null : new NativeObject();
            if (nativeObject != null && map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    nativeObject.put(entry.getKey(), nativeObject, entry.getValue());
                }
            }
            NativeObject Q = Q("doneWrong", null, bVar.U(), Long.valueOf(j11), nativeObject);
            if (Q != null) {
                bVar2 = new yc.b(Q);
            }
            return bVar2;
        } finally {
            Context.exit();
        }
    }

    @Override // ad.c
    public yc.b r(yc.b bVar, long j11, Map<String, Object> map) {
        try {
            Context.enter();
            yc.b bVar2 = null;
            Scriptable nativeObject = map == null ? null : new NativeObject();
            if (nativeObject != null && map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    nativeObject.put(entry.getKey(), nativeObject, entry.getValue());
                }
            }
            NativeObject Q = Q("doneCorrect", null, bVar.U(), Long.valueOf(j11), nativeObject);
            if (Q != null) {
                bVar2 = new yc.b(Q);
            }
            return bVar2;
        } finally {
            Context.exit();
        }
    }

    @Override // ad.c
    public e<Integer, Integer> s() {
        try {
            Scriptable scriptable = (NativeObject) R("getNewLearningAndReviewCount", null, new Object[0]);
            return new e<>(Integer.valueOf((int) ((Double) scriptable.get("newLearningCount", scriptable)).doubleValue()), Integer.valueOf((int) ((Double) scriptable.get("reviewCount", scriptable)).doubleValue()));
        } catch (Exception e11) {
            e11.printStackTrace();
            return new e<>(0, 0);
        }
    }

    @Override // ad.c
    public void t(yc.b bVar) {
        R(LearnOperationReceiver.f24791b, null, bVar.U());
    }

    @Override // ad.c
    public List<yc.b> y(int i11, int i12) {
        NativeArray P = P("getNext", null, Integer.valueOf(i11), Integer.valueOf(i12));
        if (P == null) {
            return null;
        }
        int size = P.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(new yc.b((NativeObject) P.get(i13)));
        }
        return arrayList;
    }

    @Override // ad.c
    public yc.b z(yc.b bVar, long j11, Map<String, Object> map) {
        try {
            Context.enter();
            yc.b bVar2 = null;
            Scriptable nativeObject = map == null ? null : new NativeObject();
            if (nativeObject != null && map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    nativeObject.put(entry.getKey(), nativeObject, entry.getValue());
                }
            }
            NativeObject Q = Q("doneProblem", null, bVar.U(), Long.valueOf(j11), nativeObject);
            if (Q != null) {
                bVar2 = new yc.b(Q);
            }
            return bVar2;
        } finally {
            Context.exit();
        }
    }
}
