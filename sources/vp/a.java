package vp;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.m;
import hq.c;
import java.util.ArrayList;
import java.util.Map;
import kp.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final f[] f94252c = new f[0];

    public a(kp.b bVar) {
        super(bVar);
    }

    public f[] n(Map<DecodeHintType, ?> map) throws NotFoundException {
        hq.f[] r11 = new b(h(), map == null ? null : (m) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK)).r(map);
        if (r11.length == 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        ArrayList arrayList = new ArrayList();
        for (hq.f fVar : r11) {
            try {
                arrayList.add(j(fVar));
            } catch (ReaderException unused) {
            }
        }
        return arrayList.isEmpty() ? f94252c : (f[]) arrayList.toArray(new f[arrayList.size()]);
    }
}
