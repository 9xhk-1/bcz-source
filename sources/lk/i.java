package lk;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class i implements a<int[]> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f71452a = "IntegerArrayPool";

    @Override // lk.a
    public int b() {
        return 4;
    }

    @Override // lk.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int a(int[] iArr) {
        return iArr.length;
    }

    @Override // lk.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i11) {
        return new int[i11];
    }

    @Override // lk.a
    public String getTag() {
        return f71452a;
    }
}
