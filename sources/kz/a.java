package kz;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCharArraySequence.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharArraySequence.kt\nio/ktor/utils/io/core/internal/CharArraySequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* loaded from: classes8.dex */
public final class a implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final char[] f69099a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69100b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69101c;

    public a(@k char[] array, int i11, int i12) {
        g0.p(array, "array");
        this.f69099a = array;
        this.f69100b = i11;
        this.f69101c = i12;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i11) {
        return h(i11);
    }

    public final char h(int i11) {
        if (i11 < this.f69101c) {
            return this.f69099a[i11 + this.f69100b];
        }
        n(i11);
        throw new KotlinNothingValueException();
    }

    public final int j() {
        return this.f69101c;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.f69101c;
    }

    public final Void n(int i11) {
        throw new IndexOutOfBoundsException("String index out of bounds: " + i11 + " > " + this.f69101c);
    }

    @Override // java.lang.CharSequence
    @k
    public final CharSequence subSequence(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException(("startIndex shouldn't be negative: " + i11).toString());
        }
        int i13 = this.f69101c;
        if (i11 > i13) {
            throw new IllegalArgumentException(("startIndex is too large: " + i11 + " > " + this.f69101c).toString());
        }
        if (i11 + i12 > i13) {
            throw new IllegalArgumentException(("endIndex is too large: " + i12 + " > " + this.f69101c).toString());
        }
        if (i12 >= i11) {
            return new a(this.f69099a, this.f69100b + i11, i12 - i11);
        }
        throw new IllegalArgumentException(("endIndex should be greater or equal to startIndex: " + i11 + " > " + i12).toString());
    }
}
