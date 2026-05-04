package j;

import j.t;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransacter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transacter.kt\napp/cash/sqldelight/BaseTransacterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,423:1\n1869#2,2:424\n1869#2,2:428\n37#3,2:426\n37#3,2:430\n*S KotlinDebug\n*F\n+ 1 Transacter.kt\napp/cash/sqldelight/BaseTransacterImpl\n*L\n270#1:424,2\n284#1:428,2\n280#1:426,2\n323#1:430,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final l.e f63063g;

    public c(@m80.k l.e driver) {
        g0.p(driver, "driver");
        this.f63063g = driver;
    }

    public static final g2 E(t.b bVar, String it) {
        g0.p(it, "it");
        bVar.m().add(it);
        return g2.f100423a;
    }

    public static final g2 F(Set set, String it) {
        g0.p(it, "it");
        set.add(it);
        return g2.f100423a;
    }

    @m80.k
    public final String B(int i11) {
        if (i11 == 0) {
            return "()";
        }
        StringBuilder sb2 = new StringBuilder((i11 * 2) + 1);
        sb2.append("(?");
        int i12 = i11 - 1;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(",?");
        }
        sb2.append(')');
        return sb2.toString();
    }

    @m80.k
    public final l.e C() {
        return this.f63063g;
    }

    public final void D(int i11, @m80.k x00.l<? super x00.l<? super String, g2>, g2> tableProvider) {
        g0.p(tableProvider, "tableProvider");
        final t.b A2 = this.f63063g.A2();
        if (A2 != null) {
            if (A2.p().add(Integer.valueOf(i11))) {
                tableProvider.invoke(new x00.l() { // from class: j.a
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 E;
                        E = c.E(t.b.this, (String) obj);
                        return E;
                    }
                });
            }
        } else {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            tableProvider.invoke(new x00.l() { // from class: j.b
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 F;
                    F = c.F(linkedHashSet, (String) obj);
                    return F;
                }
            });
            l.e eVar = this.f63063g;
            String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
            eVar.x7((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    public final <R> R G(@m80.k t.b transaction, @m80.l t.b bVar, @m80.l Throwable th2, @m80.l R r11) {
        g0.p(transaction, "transaction");
        boolean z11 = false;
        if (bVar != null) {
            if (transaction.q() && transaction.k()) {
                z11 = true;
            }
            bVar.s(z11);
            bVar.n().addAll(transaction.n());
            bVar.o().addAll(transaction.o());
            bVar.p().addAll(transaction.p());
            bVar.m().addAll(transaction.m());
        } else if (transaction.q() && transaction.k()) {
            if (!transaction.m().isEmpty()) {
                l.e eVar = this.f63063g;
                String[] strArr = (String[]) transaction.m().toArray(new String[0]);
                eVar.x7((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            transaction.m().clear();
            transaction.p().clear();
            Iterator<T> it = transaction.n().iterator();
            while (it.hasNext()) {
                ((x00.a) it.next()).invoke();
            }
            transaction.n().clear();
        } else {
            try {
                Iterator<T> it2 = transaction.o().iterator();
                while (it2.hasNext()) {
                    ((x00.a) it2.next()).invoke();
                }
                transaction.o().clear();
            } catch (Throwable th3) {
                if (th2 == null) {
                    throw th3;
                }
                throw new Throwable("Exception while rolling back from an exception.\nOriginal exception: " + th2 + "\nwith cause " + th2.getCause() + "\n\nRollback exception: " + th3, th3);
            }
        }
        if (bVar == null && (th2 instanceof l)) {
            return (R) ((l) th2).a();
        }
        if (th2 == null) {
            return r11;
        }
        throw th2;
    }
}
