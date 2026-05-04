package j20;

import a00.d1;
import a00.i0;
import a00.r0;
import g10.l;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends k20.a {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C0731a f63163g = new C0731a(null);

    /* renamed from: h, reason: collision with root package name */
    @g
    @k
    public static final a f63164h = new a(1, 0, 7);

    /* renamed from: i, reason: collision with root package name */
    @g
    @k
    public static final a f63165i = new a(new int[0]);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBuiltInsBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInsBinaryVersion.kt\norg/jetbrains/kotlin/metadata/builtins/BuiltInsBinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1557#2:41\n1628#2,3:42\n*S KotlinDebug\n*F\n+ 1 BuiltInsBinaryVersion.kt\norg/jetbrains/kotlin/metadata/builtins/BuiltInsBinaryVersion$Companion\n*L\n36#1:41\n36#1:42,3\n*E\n"})
    /* renamed from: j20.a$a, reason: collision with other inner class name */
    public static final class C0731a {
        public /* synthetic */ C0731a(v vVar) {
            this();
        }

        @k
        public final a a(@k InputStream stream) {
            g0.p(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            l lVar = new l(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(i0.d0(lVar, 10));
            Iterator<Integer> it = lVar.iterator();
            while (it.hasNext()) {
                ((d1) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] Z5 = r0.Z5(arrayList);
            return new a(Arrays.copyOf(Z5, Z5.length));
        }

        public C0731a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@k int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        g0.p(numbers, "numbers");
    }

    public boolean h() {
        return f(f63164h);
    }
}
