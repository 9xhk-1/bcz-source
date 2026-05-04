package p9;

import android.content.Context;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.lookup.Word;
import java.util.List;
import k9.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f80297a = 100;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:8:0x0007, B:10:0x0027, B:13:0x0036, B:16:0x003d, B:18:0x004b, B:20:0x0051, B:26:0x006c, B:27:0x006f, B:29:0x0075, B:30:0x007d, B:31:0x008c, B:33:0x0092, B:35:0x0136, B:37:0x0142, B:22:0x0066, B:43:0x0041), top: B:7:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:8:0x0007, B:10:0x0027, B:13:0x0036, B:16:0x003d, B:18:0x004b, B:20:0x0051, B:26:0x006c, B:27:0x006f, B:29:0x0075, B:30:0x007d, B:31:0x008c, B:33:0x0092, B:35:0x0136, B:37:0x0142, B:22:0x0066, B:43:0x0041), top: B:7:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:8:0x0007, B:10:0x0027, B:13:0x0036, B:16:0x003d, B:18:0x004b, B:20:0x0051, B:26:0x006c, B:27:0x006f, B:29:0x0075, B:30:0x007d, B:31:0x008c, B:33:0x0092, B:35:0x0136, B:37:0x0142, B:22:0x0066, B:43:0x0041), top: B:7:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[Catch: all -> 0x0030, LOOP:1: B:31:0x008c->B:33:0x0092, LOOP_END, TryCatch #0 {all -> 0x0030, blocks: (B:8:0x0007, B:10:0x0027, B:13:0x0036, B:16:0x003d, B:18:0x004b, B:20:0x0051, B:26:0x006c, B:27:0x006f, B:29:0x0075, B:30:0x007d, B:31:0x008c, B:33:0x0092, B:35:0x0136, B:37:0x0142, B:22:0x0066, B:43:0x0041), top: B:7:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0142 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:8:0x0007, B:10:0x0027, B:13:0x0036, B:16:0x003d, B:18:0x004b, B:20:0x0051, B:26:0x006c, B:27:0x006f, B:29:0x0075, B:30:0x007d, B:31:0x008c, B:33:0x0092, B:35:0x0136, B:37:0x0142, B:22:0x0066, B:43:0x0041), top: B:7:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void a(android.content.Context r11, com.baicizhan.client.business.lookup.Word r12) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.a.a(android.content.Context, com.baicizhan.client.business.lookup.Word):void");
    }

    public static synchronized void b(Context context) {
        synchronized (a.class) {
            context.getContentResolver().delete(a.r.f16287b, null, null);
        }
    }

    public static List<Word> c(Context context) {
        return k9.a.n(c.i(a.r.f16287b).c("time DESC").b(100).d(context), Word.class, Word.COLUMN_MAP);
    }
}
