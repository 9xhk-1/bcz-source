package a7;

import com.baicizhan.biz.online.resource_api.WordBugType;
import java.util.HashMap;
import java.util.List;
import k3.f4;
import k3.q1;
import k3.r1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDataConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataConvert.kt\ncom/baicizhan/app/biz/lookup/DataConvertKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    @m80.k
    public static final WordBugType a(@m80.k r1 r1Var) {
        g0.p(r1Var, "<this>");
        if (g0.g(r1Var, r1.b.f65569b)) {
            return WordBugType.BASIC;
        }
        if (g0.g(r1Var, r1.j.f65577b)) {
            return WordBugType.VARIANT;
        }
        if (g0.g(r1Var, r1.f.f65573b)) {
            return WordBugType.SENTENCE;
        }
        if (g0.g(r1Var, r1.k.f65578b)) {
            return WordBugType.VIDEO;
        }
        if (g0.g(r1Var, r1.i.f65576b)) {
            return WordBugType.SYNONYM;
        }
        if (g0.g(r1Var, r1.a.f65568b)) {
            return WordBugType.ANTONYM;
        }
        if (g0.g(r1Var, r1.g.f65574b)) {
            return WordBugType.SHORT_PHRASE;
        }
        if (g0.g(r1Var, r1.e.f65572b)) {
            return WordBugType.ETYMA;
        }
        if (g0.g(r1Var, r1.c.f65570b)) {
            return WordBugType.DEFORMATION;
        }
        if (g0.g(r1Var, r1.d.f65571b)) {
            return WordBugType.EN_MEAN;
        }
        if (g0.g(r1Var, r1.h.f65575b)) {
            return WordBugType.SIMILAR;
        }
        throw new NoWhenBranchMatchedException();
    }

    @m80.k
    public static final q1 b(@m80.k t8.j jVar) {
        g0.p(jVar, "<this>");
        int i11 = jVar.f90091b;
        String str = jVar.f90090a;
        String str2 = jVar.f90092c;
        String str3 = jVar.f90093d;
        if (str3 == null) {
            str3 = "";
        }
        return new q1(i11, str, str2, str3);
    }

    @m80.k
    public static final f4 c(@m80.k t8.s sVar, boolean z11, @m80.k o7.c cdn) {
        g0.p(sVar, "<this>");
        g0.p(cdn, "cdn");
        t8.r rVar = sVar.f90242a;
        int i11 = rVar.f90224a;
        String str = rVar.f90225b;
        String d11 = d(sVar.f90243b);
        t8.r rVar2 = sVar.f90242a;
        String str2 = rVar2.f90226c;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        String str4 = rVar2.f90228e;
        return new f4(i11, str, d11, str3, str4 != null ? cdn.a(str4) : null, z11);
    }

    public static final String d(List<t8.f> list) {
        if (list.isEmpty()) {
            return "";
        }
        HashMap hashMap = new HashMap();
        for (t8.f fVar : list) {
            StringBuilder sb2 = (StringBuilder) hashMap.get(fVar.f90019c);
            if (sb2 != null) {
                sb2.append(fVar.f90020d);
            } else {
                sb2 = new StringBuilder(fVar.f90020d);
                hashMap.put(fVar.f90019c, sb2);
            }
            sb2.append("；");
        }
        for (StringBuilder sb3 : hashMap.values()) {
            g0.o(sb3.delete(sb3.length() - 1, sb3.length()), "delete(...)");
        }
        StringBuilder sb4 = new StringBuilder();
        for (t8.f fVar2 : list) {
            if (hashMap.containsKey(fVar2.f90019c)) {
                sb4.append(fVar2.f90019c);
                if (fVar2.f90019c.length() == 0) {
                    sb4.append(" ");
                }
                Object obj = hashMap.get(fVar2.f90019c);
                g0.m(obj);
                sb4.append((CharSequence) obj);
                sb4.append("\n");
                hashMap.remove(fVar2.f90019c);
            }
        }
        g0.o(sb4.deleteCharAt(sb4.length() - 1), "deleteCharAt(...)");
        String sb5 = sb4.toString();
        g0.o(sb5, "toString(...)");
        return sb5;
    }
}
