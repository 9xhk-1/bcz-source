package p30;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\naddToStdlib.kt\nKotlin\n*S Kotlin\n*F\n+ 1 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n20#1,2:393\n289#1,16:399\n327#1,13:415\n3829#2:395\n4344#2,2:396\n1#3:398\n*S KotlinDebug\n*F\n+ 1 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n66#1:393,2\n281#1:399,16\n343#1:415,13\n132#1:395\n132#1:396,2\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final ConcurrentHashMap<x00.a<?>, Object> f78855a = new ConcurrentHashMap<>();

    @k
    public static final Void a(@k String message) {
        g0.p(message, "message");
        throw new IllegalStateException(message.toString());
    }

    public static /* synthetic */ Void b(String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "should not be called";
        }
        return a(str);
    }
}
