package l6;

import a00.h0;
import com.baicizhan.app.biz.game.model.StudyMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import l3.i0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nExtractResourceUrlUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtractResourceUrlUC.kt\ncom/baicizhan/app/biz/game/uc/resource/ExtractResourceUrlUCKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n295#2,2:410\n1669#2,8:413\n1#3:412\n*S KotlinDebug\n*F\n+ 1 ExtractResourceUrlUC.kt\ncom/baicizhan/app/biz/game/uc/resource/ExtractResourceUrlUCKt\n*L\n183#1:410,2\n190#1:413,8\n*E\n"})
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f70249a = "file://";

    public static final List<i0.w> b(i0 i0Var, int i11) {
        i0.w wVar;
        Object obj;
        i0.w wVar2;
        Object obj2;
        Object obj3;
        int c11 = c(i11);
        Iterator<T> it = i0Var.A().iterator();
        while (true) {
            wVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((i0.p) obj).w() == c11) {
                break;
            }
        }
        i0.p pVar = (i0.p) obj;
        if (pVar == null) {
            return h0.J();
        }
        Iterator<T> it2 = pVar.y().iterator();
        while (true) {
            if (!it2.hasNext()) {
                wVar2 = null;
                break;
            }
            long longValue = ((Number) it2.next()).longValue();
            Iterator<T> it3 = i0Var.G().m0().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                i0.w wVar3 = (i0.w) obj3;
                if (wVar3.R() == longValue && wVar3.T().length() > 0) {
                    break;
                }
            }
            wVar2 = (i0.w) obj3;
            if (wVar2 != null) {
                break;
            }
        }
        Iterator<T> it4 = pVar.y().iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            long longValue2 = ((Number) it4.next()).longValue();
            Iterator<T> it5 = i0Var.G().m0().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it5.next();
                if (((i0.w) obj2).R() == longValue2) {
                    break;
                }
            }
            i0.w wVar4 = (i0.w) obj2;
            if (wVar4 != null) {
                wVar = wVar4;
                break;
            }
        }
        List S = h0.S(wVar2, wVar);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : S) {
            if (hashSet.add(Long.valueOf(((i0.w) obj4).R()))) {
                arrayList.add(obj4);
            }
        }
        return arrayList;
    }

    public static final int c(int i11) {
        if (i11 == StudyMode.Deep.getValue()) {
            return 3;
        }
        if (i11 == StudyMode.Context.getValue()) {
            return 4;
        }
        if (i11 == StudyMode.Rhythm.getValue()) {
            return 2;
        }
        return i11;
    }
}
