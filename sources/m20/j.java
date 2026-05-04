package m20;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nutfEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n37#2,2:74\n1#3:76\n*S KotlinDebug\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n*L\n55#1:74,2\n*E\n"})
/* loaded from: classes8.dex */
public final class j {
    @k
    public static final byte[] a(@k String[] strings) {
        g0.p(strings, "strings");
        int i11 = 0;
        for (String str : strings) {
            i11 += str.length();
        }
        byte[] bArr = new byte[i11];
        int i12 = 0;
        for (String str2 : strings) {
            int length = str2.length();
            int i13 = 0;
            while (i13 < length) {
                bArr[i12] = (byte) str2.charAt(i13);
                i13++;
                i12++;
            }
        }
        return bArr;
    }
}
