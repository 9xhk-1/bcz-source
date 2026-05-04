package p50;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final b<T> f79138a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final e<T, ?>[] f79139b;

    public c(@NonNull b<T> bVar, @NonNull e<T, ?>[] eVarArr) {
        this.f79138a = bVar;
        this.f79139b = eVarArr;
    }

    @NonNull
    public static <T> c<T> b(@NonNull b<T> bVar, @NonNull e<T, ?>[] eVarArr) {
        return new c<>(bVar, eVarArr);
    }

    @Override // p50.g
    public int a(int i11, @NonNull T t11) {
        Class<? extends e<T, ?>> a11 = this.f79138a.a(i11, t11);
        int i12 = 0;
        while (true) {
            e<T, ?>[] eVarArr = this.f79139b;
            if (i12 >= eVarArr.length) {
                throw new IndexOutOfBoundsException(String.format("%s is out of your registered binders'(%s) bounds.", a11.getName(), Arrays.toString(this.f79139b)));
            }
            if (eVarArr[i12].getClass().equals(a11)) {
                return i12;
            }
            i12++;
        }
    }
}
