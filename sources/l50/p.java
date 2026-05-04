package l50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/CharArrayPoolBatchSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* loaded from: classes8.dex */
public final class p extends o {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final p f70044c = new p();

    public final void c(@m80.k char[] array) {
        kotlin.jvm.internal.g0.p(array, "array");
        if (array.length == 16384) {
            a(array);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
    }

    @m80.k
    public final char[] d() {
        return super.b(16384);
    }
}
