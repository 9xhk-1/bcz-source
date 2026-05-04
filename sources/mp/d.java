package mp;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f73629a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b> f73630b;

    public d(a aVar) {
        this.f73629a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f73630b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    public final b a(int i11) {
        if (i11 >= this.f73630b.size()) {
            List<b> list = this.f73630b;
            b bVar = list.get(list.size() - 1);
            for (int size = this.f73630b.size(); size <= i11; size++) {
                a aVar = this.f73629a;
                bVar = bVar.i(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f73630b.add(bVar);
            }
        }
        return this.f73630b.get(i11);
    }

    public void b(int[] iArr, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i11;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b a11 = a(i11);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] e11 = new b(this.f73629a, iArr2).j(i11, 1).b(a11)[1].e();
        int length2 = i11 - e11.length;
        for (int i12 = 0; i12 < length2; i12++) {
            iArr[length + i12] = 0;
        }
        System.arraycopy(e11, 0, iArr, length + length2, e11.length);
    }
}
