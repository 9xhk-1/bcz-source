package au;

import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f5485a = new AtomicInteger(1);

    public static int a() {
        AtomicInteger atomicInteger;
        int i11;
        int i12;
        do {
            atomicInteger = f5485a;
            i11 = atomicInteger.get();
            i12 = i11 + 1;
            if (i12 > 16777215) {
                i12 = 1;
            }
        } while (!atomicInteger.compareAndSet(i11, i12));
        return i11;
    }

    public static int b() {
        return View.generateViewId();
    }
}
