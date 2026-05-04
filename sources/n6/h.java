package n6;

import a00.a0;
import a00.l1;
import com.baicizhan.app.biz.game.model.StudyMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k3.t0;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGetWordsSettingUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetWordsSettingUC.kt\ncom/baicizhan/app/biz/game/uc/settings/GetWordsSettingUCKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n136#2,9:161\n216#2:170\n217#2:173\n145#2:174\n1#3:171\n1#3:172\n295#4,2:175\n295#4,2:177\n*S KotlinDebug\n*F\n+ 1 GetWordsSettingUC.kt\ncom/baicizhan/app/biz/game/uc/settings/GetWordsSettingUCKt\n*L\n72#1:161,9\n72#1:170\n72#1:173\n72#1:174\n72#1:172\n140#1:175,2\n146#1:177,2\n*E\n"})
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String[] f74514a = {k3.u0.f65628b, "disable"};

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String[] f74515b = {k3.u0.f65631e, k3.u0.f65630d};

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String[] f74516c = {"0", "1"};

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Integer[] f74517d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final Integer[] f74518e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f74519f = "GetWordsSettingUC";

    static {
        Integer valueOf = Integer.valueOf(StudyMode.Picture.getValue());
        Integer valueOf2 = Integer.valueOf(StudyMode.Deep.getValue());
        Integer valueOf3 = Integer.valueOf(StudyMode.Context.getValue());
        Integer valueOf4 = Integer.valueOf(StudyMode.Rhythm.getValue());
        StudyMode studyMode = StudyMode.Professional;
        Integer valueOf5 = Integer.valueOf(studyMode.getValue());
        StudyMode studyMode2 = StudyMode.MinorJapanese;
        Integer valueOf6 = Integer.valueOf(studyMode2.getValue());
        StudyMode studyMode3 = StudyMode.MinorFrance;
        Integer valueOf7 = Integer.valueOf(studyMode3.getValue());
        StudyMode studyMode4 = StudyMode.MinorSpanish;
        Integer valueOf8 = Integer.valueOf(studyMode4.getValue());
        StudyMode studyMode5 = StudyMode.MinorKorean;
        Integer valueOf9 = Integer.valueOf(studyMode5.getValue());
        StudyMode studyMode6 = StudyMode.CakeJapanese;
        Integer valueOf10 = Integer.valueOf(studyMode6.getValue());
        StudyMode studyMode7 = StudyMode.CakeKorean;
        Integer valueOf11 = Integer.valueOf(studyMode7.getValue());
        Integer valueOf12 = Integer.valueOf(StudyMode.Cake.getValue());
        StudyMode studyMode8 = StudyMode.MinorRussian;
        Integer valueOf13 = Integer.valueOf(studyMode8.getValue());
        StudyMode studyMode9 = StudyMode.MinorGerman;
        Integer valueOf14 = Integer.valueOf(studyMode9.getValue());
        StudyMode studyMode10 = StudyMode.MinorCantonese;
        f74517d = new Integer[]{valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, Integer.valueOf(studyMode10.getValue())};
        f74518e = new Integer[]{Integer.valueOf(studyMode.getValue()), Integer.valueOf(studyMode2.getValue()), Integer.valueOf(studyMode3.getValue()), Integer.valueOf(studyMode4.getValue()), Integer.valueOf(studyMode5.getValue()), Integer.valueOf(studyMode6.getValue()), Integer.valueOf(studyMode7.getValue()), Integer.valueOf(studyMode8.getValue()), Integer.valueOf(studyMode9.getValue()), Integer.valueOf(studyMode10.getValue())};
    }

    @m80.k
    public static final Integer[] d() {
        return f74517d;
    }

    public static final Object e(y5.a aVar, Map<String, String> map, String str, j00.c<? super g2> cVar) {
        if (g0.g(map.get("mode"), str) || a0.B8(f74518e, l00.a.f(Integer.parseInt(str)))) {
            return g2.f100423a;
        }
        Object b11 = aVar.b("mode", str, cVar);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    public static final Map<String, String> f(Map<String, String> map, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Pair a11 = value != null ? h1.a(key, value) : null;
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        Map J0 = l1.J0(l1.B0(arrayList));
        J0.put("mode", String.valueOf(g(list, (String) J0.get("mode"))));
        String[] strArr = f74514a;
        if (!a0.B8(strArr, J0.get(t0.f65610b))) {
            J0.put(t0.f65610b, k3.u0.f65628b);
        }
        if (!a0.B8(strArr, J0.get(t0.f65611c))) {
            J0.put(t0.f65611c, k3.u0.f65628b);
        }
        if (!a0.B8(strArr, J0.get(t0.f65612d))) {
            J0.put(t0.f65612d, k3.u0.f65628b);
        }
        if (!a0.B8(f74515b, J0.get(t0.f65613e))) {
            J0.put(t0.f65613e, k3.u0.f65630d);
        }
        if (!a0.B8(f74516c, J0.get("accent"))) {
            J0.put("accent", "1");
        }
        return l1.D0(J0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (a00.a0.B8(n6.h.f74517d, java.lang.Integer.valueOf(r1)) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int g(java.util.List<java.lang.Integer> r6, java.lang.String r7) {
        /*
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L7:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            r4 = r2
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Integer[] r5 = n6.h.f74518e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = a00.a0.B8(r5, r4)
            if (r4 == 0) goto L7
            goto L27
        L26:
            r2 = r3
        L27:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L30
            int r6 = r2.intValue()
            return r6
        L30:
            if (r7 == 0) goto L53
            java.lang.Integer r7 = u30.e0.p1(r7)
            if (r7 == 0) goto L53
            int r1 = r7.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r6 = r6.contains(r2)
            if (r6 == 0) goto L53
            java.lang.Integer[] r6 = n6.h.f74517d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r6 = a00.a0.B8(r6, r1)
            if (r6 == 0) goto L53
            goto L54
        L53:
            r7 = r3
        L54:
            if (r7 == 0) goto L5b
            int r6 = r7.intValue()
            return r6
        L5b:
            java.util.Iterator r6 = r0.iterator()
        L5f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L7d
            java.lang.Object r7 = r6.next()
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer[] r1 = n6.h.f74517d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = a00.a0.B8(r1, r0)
            if (r0 == 0) goto L5f
            r3 = r7
        L7d:
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L86
            int r6 = r3.intValue()
            return r6
        L86:
            com.baicizhan.app.biz.game.model.StudyMode r6 = com.baicizhan.app.biz.game.model.StudyMode.Picture
            int r6 = r6.getValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.h.g(java.util.List, java.lang.String):int");
    }
}
