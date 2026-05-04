package w;

import android.content.Intent;
import android.net.Uri;
import com.google.zxing.BarcodeFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import s.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final Collection<BarcodeFormat> f94437b;

    /* renamed from: c, reason: collision with root package name */
    public static final Collection<BarcodeFormat> f94438c;

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f94436a = Pattern.compile(",");

    /* renamed from: d, reason: collision with root package name */
    public static final Collection<BarcodeFormat> f94439d = EnumSet.of(BarcodeFormat.QR_CODE);

    /* renamed from: e, reason: collision with root package name */
    public static final Collection<BarcodeFormat> f94440e = EnumSet.of(BarcodeFormat.DATA_MATRIX);

    static {
        EnumSet of2 = EnumSet.of(BarcodeFormat.UPC_A, BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8, BarcodeFormat.RSS_14, BarcodeFormat.RSS_EXPANDED);
        f94437b = of2;
        EnumSet of3 = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
        f94438c = of3;
        of3.addAll(of2);
    }

    public static Collection<BarcodeFormat> a(Intent intent) {
        String stringExtra = intent.getStringExtra(n.c.f87039i);
        return c(stringExtra != null ? Arrays.asList(f94436a.split(stringExtra)) : null, intent.getStringExtra(n.c.f87032b));
    }

    public static Collection<BarcodeFormat> b(Uri inputUri) {
        List<String> queryParameters = inputUri.getQueryParameters(n.c.f87039i);
        if (queryParameters != null && queryParameters.size() == 1 && queryParameters.get(0) != null) {
            queryParameters = Arrays.asList(f94436a.split(queryParameters.get(0)));
        }
        return c(queryParameters, inputUri.getQueryParameter(n.c.f87032b));
    }

    public static Collection<BarcodeFormat> c(Iterable<String> scanFormats, String decodeMode) {
        if (scanFormats != null) {
            EnumSet noneOf = EnumSet.noneOf(BarcodeFormat.class);
            try {
                Iterator<String> it = scanFormats.iterator();
                while (it.hasNext()) {
                    noneOf.add(BarcodeFormat.valueOf(it.next()));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (decodeMode == null) {
            return null;
        }
        if (n.c.f87033c.equals(decodeMode)) {
            return f94437b;
        }
        if (n.c.f87035e.equals(decodeMode)) {
            return f94439d;
        }
        if (n.c.f87036f.equals(decodeMode)) {
            return f94440e;
        }
        if (n.c.f87034d.equals(decodeMode)) {
            return f94438c;
        }
        return null;
    }
}
