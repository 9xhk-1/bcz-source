package ht;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f59778a;

    public a() {
        this(null);
    }

    public static a c(Bundle bundle) {
        return new a(bundle);
    }

    public a A(String str, ArrayList<? extends Parcelable> arrayList) {
        this.f59778a.putParcelableArrayList(str, arrayList);
        return this;
    }

    public a B(String str, Serializable serializable) {
        this.f59778a.putSerializable(str, serializable);
        return this;
    }

    public a C(String str, short s11) {
        this.f59778a.putShort(str, s11);
        return this;
    }

    public a D(String str, short[] sArr) {
        this.f59778a.putShortArray(str, sArr);
        return this;
    }

    @TargetApi(21)
    public a E(String str, Size size) {
        this.f59778a.putSize(str, size);
        return this;
    }

    @TargetApi(21)
    public a F(String str, SizeF sizeF) {
        this.f59778a.putSizeF(str, sizeF);
        return this;
    }

    public a G(String str, SparseArray<? extends Parcelable> sparseArray) {
        this.f59778a.putSparseParcelableArray(str, sparseArray);
        return this;
    }

    public a H(String str, String str2) {
        this.f59778a.putString(str, str2);
        return this;
    }

    public a I(String str, String[] strArr) {
        this.f59778a.putStringArray(str, strArr);
        return this;
    }

    public a J(String str, ArrayList<String> arrayList) {
        this.f59778a.putStringArrayList(str, arrayList);
        return this;
    }

    public Bundle a() {
        return this.f59778a;
    }

    public <T extends Fragment> T b(T t11) {
        t11.setArguments(a());
        return t11;
    }

    public a d(Bundle bundle) {
        this.f59778a.putAll(bundle);
        return this;
    }

    @TargetApi(18)
    public a e(String str, IBinder iBinder) {
        this.f59778a.putBinder(str, iBinder);
        return this;
    }

    public a f(String str, boolean z11) {
        this.f59778a.putBoolean(str, z11);
        return this;
    }

    public a g(String str, boolean[] zArr) {
        this.f59778a.putBooleanArray(str, zArr);
        return this;
    }

    public a h(String str, Bundle bundle) {
        this.f59778a.putBundle(str, bundle);
        return this;
    }

    public a i(String str, byte b11) {
        this.f59778a.putByte(str, b11);
        return this;
    }

    public a j(String str, byte[] bArr) {
        this.f59778a.putByteArray(str, bArr);
        return this;
    }

    public a k(String str, char c11) {
        this.f59778a.putChar(str, c11);
        return this;
    }

    public a l(String str, char[] cArr) {
        this.f59778a.putCharArray(str, cArr);
        return this;
    }

    public a m(String str, CharSequence charSequence) {
        this.f59778a.putCharSequence(str, charSequence);
        return this;
    }

    @TargetApi(8)
    public a n(String str, CharSequence[] charSequenceArr) {
        this.f59778a.putCharSequenceArray(str, charSequenceArr);
        return this;
    }

    @TargetApi(8)
    public a o(String str, ArrayList<CharSequence> arrayList) {
        this.f59778a.putCharSequenceArrayList(str, arrayList);
        return this;
    }

    public a p(String str, double d11) {
        this.f59778a.putDouble(str, d11);
        return this;
    }

    public a q(String str, double[] dArr) {
        this.f59778a.putDoubleArray(str, dArr);
        return this;
    }

    public a r(String str, float f11) {
        this.f59778a.putFloat(str, f11);
        return this;
    }

    public a s(String str, float[] fArr) {
        this.f59778a.putFloatArray(str, fArr);
        return this;
    }

    public a t(String str, int i11) {
        this.f59778a.putInt(str, i11);
        return this;
    }

    public a u(String str, int[] iArr) {
        this.f59778a.putIntArray(str, iArr);
        return this;
    }

    public a v(String str, ArrayList<Integer> arrayList) {
        this.f59778a.putIntegerArrayList(str, arrayList);
        return this;
    }

    public a w(String str, long j11) {
        this.f59778a.putLong(str, j11);
        return this;
    }

    public a x(String str, long[] jArr) {
        this.f59778a.putLongArray(str, jArr);
        return this;
    }

    public a y(String str, Parcelable parcelable) {
        this.f59778a.putParcelable(str, parcelable);
        return this;
    }

    public a z(String str, Parcelable[] parcelableArr) {
        this.f59778a.putParcelableArray(str, parcelableArr);
        return this;
    }

    public a(Bundle bundle) {
        this.f59778a = bundle == null ? new Bundle() : new Bundle(bundle);
    }
}
