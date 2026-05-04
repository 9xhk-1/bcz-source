package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1583:1\n273#2,6:1584\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n*L\n1510#1:1584,6\n*E\n"})
/* loaded from: classes8.dex */
public final class w2 extends h40.b0 implements e2 {
    @m80.k
    public final String D(@m80.k String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("List{");
        sb2.append(str);
        sb2.append("}[");
        Object j11 = j();
        kotlin.jvm.internal.g0.n(j11, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        boolean z11 = true;
        for (h40.d0 d0Var = (h40.d0) j11; !kotlin.jvm.internal.g0.g(d0Var, this); d0Var = d0Var.k()) {
            if (d0Var instanceof q2) {
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append(org.junit.jupiter.api.j2.O);
                }
                sb2.append(d0Var);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // c40.e2
    public boolean isActive() {
        return true;
    }

    @Override // h40.d0
    @m80.k
    public String toString() {
        return super.toString();
    }

    @Override // c40.e2
    @m80.k
    public w2 a() {
        return this;
    }
}
