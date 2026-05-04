package pz;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,163:1\n156#1,5:164\n*S KotlinDebug\n*F\n+ 1 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n149#1:164,5\n*E\n"})
/* loaded from: classes8.dex */
public final class i {
    @n(message = "Use useInstance instead", replaceWith = @w0(expression = "useInstance(block)", imports = {}))
    public static final <T, R> R a(@k h<T> hVar, @k l<? super T, ? extends R> block) {
        g0.p(hVar, "<this>");
        g0.p(block, "block");
        T U6 = hVar.U6();
        try {
            return block.invoke(U6);
        } finally {
            d0.d(1);
            hVar.b4(U6);
            d0.c(1);
        }
    }

    public static final <T, R> R b(@k h<T> hVar, @k l<? super T, ? extends R> block) {
        g0.p(hVar, "<this>");
        g0.p(block, "block");
        T U6 = hVar.U6();
        try {
            return block.invoke(U6);
        } finally {
            d0.d(1);
            hVar.b4(U6);
            d0.c(1);
        }
    }
}
