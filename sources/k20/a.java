package k20;

import a00.a0;
import a00.h0;
import a00.q;
import a00.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,101:1\n5343#2,7:102\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n*L\n73#1:102,7\n*E\n"})
/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C0751a f65157f = new C0751a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final int[] f65158a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65159b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65160c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65161d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Integer> f65162e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n1557#2:102\n1628#2,3:103\n37#3,2:106\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n*L\n97#1:102\n97#1:103,3\n98#1:106,2\n*E\n"})
    /* renamed from: k20.a$a, reason: collision with other inner class name */
    public static final class C0751a {
        public /* synthetic */ C0751a(v vVar) {
            this();
        }

        public C0751a() {
        }
    }

    public a(@k int... numbers) {
        List<Integer> J;
        g0.p(numbers, "numbers");
        this.f65158a = numbers;
        Integer ff2 = a0.ff(numbers, 0);
        this.f65159b = ff2 != null ? ff2.intValue() : -1;
        Integer ff3 = a0.ff(numbers, 1);
        this.f65160c = ff3 != null ? ff3.intValue() : -1;
        Integer ff4 = a0.ff(numbers, 2);
        this.f65161d = ff4 != null ? ff4.intValue() : -1;
        if (numbers.length <= 3) {
            J = h0.J();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            J = r0.a6(q.r(numbers).subList(3, numbers.length));
        }
        this.f65162e = J;
    }

    public final int a() {
        return this.f65159b;
    }

    public final int b() {
        return this.f65160c;
    }

    public final boolean c(int i11, int i12, int i13) {
        int i14 = this.f65159b;
        if (i14 > i11) {
            return true;
        }
        if (i14 < i11) {
            return false;
        }
        int i15 = this.f65160c;
        if (i15 > i12) {
            return true;
        }
        return i15 >= i12 && this.f65161d >= i13;
    }

    public final boolean d(@k a version) {
        g0.p(version, "version");
        return c(version.f65159b, version.f65160c, version.f65161d);
    }

    public final boolean e(int i11, int i12, int i13) {
        int i14 = this.f65159b;
        if (i14 < i11) {
            return true;
        }
        if (i14 > i11) {
            return false;
        }
        int i15 = this.f65160c;
        if (i15 < i12) {
            return true;
        }
        return i15 <= i12 && this.f65161d <= i13;
    }

    public boolean equals(@l Object obj) {
        if (obj == null || !g0.g(getClass(), obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f65159b == aVar.f65159b && this.f65160c == aVar.f65160c && this.f65161d == aVar.f65161d && g0.g(this.f65162e, aVar.f65162e);
    }

    public final boolean f(@k a ourVersion) {
        g0.p(ourVersion, "ourVersion");
        int i11 = this.f65159b;
        return i11 == 0 ? ourVersion.f65159b == 0 && this.f65160c == ourVersion.f65160c : i11 == ourVersion.f65159b && this.f65160c <= ourVersion.f65160c;
    }

    @k
    public final int[] g() {
        return this.f65158a;
    }

    public int hashCode() {
        int i11 = this.f65159b;
        int i12 = i11 + (i11 * 31) + this.f65160c;
        int i13 = i12 + (i12 * 31) + this.f65161d;
        return i13 + (i13 * 31) + this.f65162e.hashCode();
    }

    @k
    public String toString() {
        int[] g11 = g();
        ArrayList arrayList = new ArrayList();
        for (int i11 : g11) {
            if (i11 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList.isEmpty() ? "unknown" : r0.r3(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
