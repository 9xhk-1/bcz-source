package ox;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.text.Regex;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDebug.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Debug.kt\nio/ktor/http/parsing/DebugKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1863#2,2:42\n1863#2,2:44\n*S KotlinDebug\n*F\n+ 1 Debug.kt\nio/ktor/http/parsing/DebugKt\n*L\n16#1:42,2\n20#1:44,2\n*E\n"})
/* loaded from: classes8.dex */
public final class d {
    public static final void a(@m80.k e eVar, int i11) {
        g0.p(eVar, "<this>");
        if (eVar instanceof u) {
            c(i11, "STRING[" + Regex.Companion.c(((u) eVar).c()) + l50.b.f69930l);
            return;
        }
        if (eVar instanceof r) {
            c(i11, "STRING[" + ((r) eVar).c() + l50.b.f69930l);
            return;
        }
        if (eVar instanceof j) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NAMED[");
            j jVar = (j) eVar;
            sb2.append(jVar.c());
            sb2.append(l50.b.f69930l);
            c(i11, sb2.toString());
            a(jVar.b(), i11 + 2);
            return;
        }
        if (eVar instanceof s) {
            c(i11, "SEQUENCE");
            Iterator<T> it = ((s) eVar).a().iterator();
            while (it.hasNext()) {
                a((e) it.next(), i11 + 2);
            }
            return;
        }
        if (eVar instanceof k) {
            c(i11, "OR");
            Iterator<T> it2 = ((k) eVar).a().iterator();
            while (it2.hasNext()) {
                a((e) it2.next(), i11 + 2);
            }
            return;
        }
        if (eVar instanceof i) {
            c(i11, "MAYBE");
            a(((i) eVar).b(), i11 + 2);
            return;
        }
        if (eVar instanceof h) {
            c(i11, "MANY");
            a(((h) eVar).b(), i11 + 2);
            return;
        }
        if (eVar instanceof b) {
            c(i11, "MANY_NOT_EMPTY");
            a(((b) eVar).b(), i11 + 2);
            return;
        }
        if (eVar instanceof a) {
            c(i11, "ANY_OF[" + Regex.Companion.c(((a) eVar).c()) + l50.b.f69930l);
            return;
        }
        if (!(eVar instanceof q)) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("RANGE[");
        q qVar = (q) eVar;
        sb3.append(qVar.c());
        sb3.append('-');
        sb3.append(qVar.d());
        sb3.append(l50.b.f69930l);
        c(i11, sb3.toString());
    }

    public static /* synthetic */ void b(e eVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        a(eVar, i11);
    }

    public static final void c(int i11, Object obj) {
        System.out.println((Object) (f0.v2(" ", i11) + (i11 / 2) + ": " + obj));
    }
}
